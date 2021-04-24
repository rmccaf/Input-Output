import java.util.ArrayList; 
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.math.BigInteger; 


public class VectorOpsTest
{



	public static void main(String[] args)
	{
	
		File numAdditionFile = caseFile(1);
		Scanner numAdditionScan = scanBuild(numAdditionFile);
		ArrayList<NumVector> numAddition = numVectorCaseBuild(numAdditionScan);
		File numAdditionSolFile = solutionFile(1);
		Scanner numAdditionSolScan = scanBuild(numAdditionSolFile);   
		ArrayList<NumVector> numAdditionSol = numVectorCaseBuild(numAdditionSolScan);
		if(numAdditionTest(numAddition,numAdditionSol))
			System.out.println("numAdditionTest() PASSED.");  
		else
			System.out.println("numAdditionTest() FAILED.");
		
		
		File numMultiplicationFile = caseFile(2);	
		Scanner numMultiplicationScan = scanBuild(numMultiplicationFile);
		ArrayList<NumVector> numMultiplication = numVectorCaseBuild(numMultiplicationScan);
		File numMultiplicationSolFile = solutionFile(2);
		Scanner numMultiplicationSolScan = scanBuild(numMultiplicationSolFile);
		ArrayList<NumVector> numMultiplicationSol = numVectorCaseBuild(numMultiplicationSolScan);
		if(numMultiplicationTest(numMultiplication,numMultiplicationSol))
			System.out.println("numMultiplicationTest() PASSED."); 
		else 
			System.out.println("numMultiplicationTest() FAILED.");
		
		
		
		File numSubtractionFile = caseFile(3);
		Scanner numSubtractionScan = scanBuild(numSubtractionFile);
		ArrayList<NumVector> numSubtraction = numVectorCaseBuild(numSubtractionScan);
		File numSubtractionSolFile = solutionFile(3);
		Scanner numSubtractionSolScan = scanBuild(numSubtractionSolFile);
		ArrayList<NumVector> numSubtractionSol = numVectorCaseBuild(numSubtractionSolScan);
		if(numSubtractionTest(numSubtraction,numSubtractionSol))
			System.out.println("numSubtractionTest() PASSED.");
		else
			System.out.println("numSubtractionTest() FAILED.");			    	
		
		
		File numDotProdFile = caseFile(4);
		Scanner numDotProdScan = scanBuild(numDotProdFile);
		ArrayList<NumVector> numDotProd = numVectorCaseBuild(numDotProdScan);
		File numDotProdSolFile = solutionFile(4);
		Scanner numDotProdSolScan = scanBuild(numDotProdSolFile);
		ArrayList<NumEntry> numDotProdSol = numEntryCaseBuild(numDotProdSolScan);
		if(numDotProductTest(numDotProd,numDotProdSol))  
			System.out.println("numDotProduct test PASSED.");
		else
			System.out.println("numDotProduct test FAILED.");			 
		
		
		File numCrossProdFile = caseFile(5);
		Scanner numCrossProdScan = scanBuild(numCrossProdFile);
		ArrayList<NumVector> numCrossProd = numVectorCaseBuild(numCrossProdScan);
		File numCrossProdSolFile = solutionFile(5);
		Scanner numCrossProdSolScan = scanBuild(numCrossProdSolFile);
		ArrayList<NumVector> numCrossProdSol = numVectorCaseBuild(numCrossProdSolScan);
		if(numCrossProductTest(numCrossProd,numCrossProdSol))
			System.out.println("numCrossProduct test PASSED."); 
		else
			System.out.println("numCrossProduct test FAILED.");
			
		
		File stringAdditionFile = caseFile(1);
		Scanner stringAdditionScan = scanBuild(stringAdditionFile);
		ArrayList<StringVector> stringAddition = stringVectorCaseBuild(stringAdditionScan);
		File stringAdditionSolFile = solutionFile(6);
		Scanner stringAdditionSolScan = scanBuild(stringAdditionSolFile);
		ArrayList<StringVector> stringAdditionSol = stringVectorSolBuild(stringAdditionSolScan);
		if(stringAdditionTest(stringAddition,stringAdditionSol))
			System.out.println("stringAdditionTest() PASSED."); 
		else     
			System.out.println("stringAdditionTest() FAILED."); 		 	
	}//end main() 



	public static File caseFile(int caseNumber)
	{
		
		switch(caseNumber)
		{
			
			case 1:
				return new File("./TestCases/VectorOpsTests/AdditionCases.txt"); 
			case 2: 
				return new File("./TestCases/VectorOpsTests/MultiplicationCases.txt");
			case 3:
				return new File("./TestCases/VectorOpsTests/SubtractionCases.txt");  
			case 4: 
				return new File("./TestCases/VectorOpsTests/DotProductCases.txt");
			case 5:
				return new File("./TestCases/VectorOpsTests/CrossProductCases.txt"); 
		}//end switch
		
		
		return (File) null; 
	}//end caseFile() 	
	
	
	
	public static File solutionFile(int caseNumber)
	{
	
		switch(caseNumber)
		{
			
			case 1:
				return new File("./TestCases/VectorOpsTests/AdditionSol.txt"); 
			case 2:
				return new File("./TestCases/VectorOpsTests/MultiplicationSol.txt"); 
			case 3:
				return new File("./TestCases/VectorOpsTests/SubtractionSol.txt"); 
			case 4: 
				return new File("./TestCases/VectorOpsTests/DotProductSol.txt"); 
			case 5: 
				return new File("./TestCases/VectorOpsTests/CrossProductSo.txt");
			case 6: 
				return new File("./TestCases/VectorOpsTests/BigAdditionSol.txt");
				  
		}//end switch		
		
		
		return (File) null; 
	}//end solutionFile() 
	
	
	public static Scanner scanBuild(File caseFile)
	{
	
	
		try
		{
			
			return new Scanner(caseFile);
		
		}
		catch(FileNotFoundException e)
		{
		
			System.out.println("You did not pass a valid file for scanBuild()"); 
		
		}
		
		return (Scanner) null; 
		
	}//end scanBuild() 
	
	
	
	
	public static ArrayList<NumVector> numVectorCaseBuild(Scanner scan)
	{
	
		//create an arraylist of vector 
		ArrayList<NumVector> localVectorList = new ArrayList<NumVector>();
		
		//scan for the number of cases 
		int caseNumber = scan.nextInt(); 

		
		//iterate until all vectors are built 
		for(int i = 0 ; i < caseNumber ; i++)
		{
		
			//create local arraylist of entries 
			ArrayList<NumEntry> localEntryList = new ArrayList<NumEntry>(); 	
			
			int vectorLen = scan.nextInt(); 

			//scan to build entries 
			for(int j = 0 ; j < vectorLen ; j++)
			{
			
				//scan for numerator and denominator 
				long numerator = scan.nextLong(); 
				long denominator = scan.nextLong(); 
								
				//create an entry and add it to the list 			
				localEntryList.add(new NumEntry(numerator,denominator)); 
				
			}//end for 
				
			//add entry list to a vector and add vector to the vector list 
			localVectorList.add(new NumVector(localEntryList)); 
		
		}//end for 

		//return the vector list
		return localVectorList; 
		
	}//end numVectorCaseBuild
	
	
	public static ArrayList<StringVector> stringVectorCaseBuild(Scanner scan)
	{
	
	
		//create an arraylist of vector 
		ArrayList<StringVector> localVectorList = new ArrayList<StringVector>();
		
		//scan for the number of cases 
		int caseNumber = scan.nextInt(); 

		//iterate until all vectors are built 
		for(int i = 0 ; i < caseNumber ; i++)
		{
		
			//create local arraylist of entries 
			ArrayList<StringEntry> localEntryList = new ArrayList<StringEntry>(); 	
			
			int vectorLen = scan.nextInt(); 

			//scan to build entries 
			for(int j = 0 ; j < vectorLen ; j++)
			{
			
				//scan for numerator and denominator 
				Long numerator = scan.nextLong(); 
				Long denominator = scan.nextLong(); 
								
				//create an entry and add it to the list 			
				localEntryList.add(new StringEntry(numerator.toString(),denominator.toString())); 
				
			}//end for 
				
			//add entry list to a vector and add vector to the vector list 
			localVectorList.add(new StringVector(localEntryList)); 
		
		}//end for 

		//return the vector list
		return localVectorList;
	
	}//end stringVectorCaseBuild() 
	
	public static ArrayList<StringVector> stringVectorSolBuild(Scanner scan)
	{
	
		//scan for the number of cases 
		int numberOfCases = scan.nextInt(); 
		
		//build local arraylist 
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		//create a for loop 
		for(int i = 0 ; i < numberOfCases ; i++)
		{
		
			//create a local arraylist to build a vector 
			ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
			
			//scan for the size of the vector 
			int vectorSize = scan.nextInt(); 
			
			//create a for loop to build the vector 
			for(int j = 0 ; j < vectorSize ; j++)
			{
			
				//scan numerator 
				BigInteger numerator = scan.nextBigInteger(); 
				
				//scan denominator 
				BigInteger denominator = scan.nextBigInteger(); 
				
				//build stringentry and add it to the list 			
				entryList.add(new StringEntry(numerator.toString(),denominator.toString())); 
			
			}//end for 
	
			//build a vector and add it to the list		
			vectorList.add(new StringVector(entryList)); 		
		
		}//end for 

			
		//return the list of vectors 
		return vectorList; 
		
	}//end stringVectorSolBuild() 
	
	
		
	public static ArrayList<NumEntry> numEntryCaseBuild(Scanner scan)
	{
		
		//create a local arraylist of numEntries 
		ArrayList<NumEntry> numList = new ArrayList<NumEntry>(); 
		
		//scan for the number of cases 
		int cases = scan.nextInt(); 
		
		//iterate to build the cases 
		for(int i = 0 ; i < cases; i++)
		{
			//scan for numerator and denominaotr 
			long numerator = scan.nextLong(); 
			long denominator = scan.nextLong(); 
			
			//add the entry to the list 		
			numList.add(new NumEntry(numerator,denominator)); 
		}//end for 

		return numList; 
			
	}//end numEntryCaseBuild() 
	
	
	
	public static ArrayList<StringEntry> stringEntryCasebuild(Scanner scan)
	{
	
		
		//create a local arraylist of numEntries 
		ArrayList<StringEntry> numList = new ArrayList<StringEntry>(); 
		
		//scan for the number of cases 
		int cases = scan.nextInt(); 
		
		//iterate to build the cases 
		for(int i = 0 ; i < cases; i++)
		{
			//scan for numerator and denominaotr 
			Long numerator = scan.nextLong(); 
			Long denominator = scan.nextLong(); 
			
			//add the entry to the list 		
			numList.add(new StringEntry(numerator.toString(),denominator.toString())); 
		}//end for 

		return numList; 
	
	}//end stringEntryCaseBuild() 
	
	
	
	
	public static void debug(String testName, int caseNumber)
	{
	
		System.out.println("Test FAILED for method " + testName + " case numeber " + caseNumber); 
	
	}//end debug()			
	
	
	
	public static boolean numAdditionTest(ArrayList<NumVector> testCases, ArrayList<NumVector> solutionCases)
	{
	
		boolean returnBoolean = false; 
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{

			Result vectorResult = VectorOps.addition(testCases.get(i),testCases.get(i+1));
			
			
			if(!(vectorResult instanceof VectorResult))
			{

				debug("numAddition()",(j+1)); 			
				return false; 			
			
			}//end if
			
			vectorResult = (VectorResult)vectorResult; 
			NumVector localResult = (NumVector)vectorResult.getResult(); 
			
			if(!(localResult.equal(solutionCases.get(j))))
			{
			
				debug("numAddition()",(j+1)); 			
				return false; 	
			
			}//end if 

				
			j++; 
			
		}//end for 
		
		
		if(!(VectorOps.addition(testCases.get(6),testCases.get(7)) instanceof OverFlowResult))
			return false; 

		if(!(VectorOps.addition(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 			
		
		
		returnBoolean = true; 
		
		
		return returnBoolean; 
	
	}//end numAddition() 
	
	
	public static boolean stringAdditionTest(ArrayList<StringVector> testCases, ArrayList<StringVector> solCases)
	{
	
		boolean returnBoolean = false; 
		
		int j = 0; 
		
		//test true cases 
		for(int i = 0 ; i < 10 ; i += 2)
		{
		
			Result localResult = VectorOps.addition(testCases.get(i),testCases.get(i+1));
			
			//check if correct instance 
			if(!(localResult instanceof VectorResult))
			{
				
				debug("stringAdditionTest()",(j+1)); 
				return false; 
				
			}//end if 	
			
			localResult = (VectorResult)localResult; 
			StringVector vectorResult = (StringVector)localResult.getResult(); 
			
			//check if value is correct 
			if(!(vectorResult.equal(solCases.get(j))))
			{
			
				debug("stringAdditionTest()",(j+1)); 
				return false; 				
			
			}//end if 
			
			j++; 
			
		}//end for 
		
		//test exception cases 
		if(!(VectorOps.addition(testCases.get(10),testCases.get(11)) instanceof DimensionMisMatchResult))
			return false; 
			
		
		returnBoolean = true; 
		
		return returnBoolean; 
		
	
	}//end stringAdditionTest() 
	
	
	public static boolean numMultiplicationTest(ArrayList<NumVector> testCases, ArrayList<NumVector> solutionCases)
	{
	
		boolean returnBoolean = false; 
		
		for(int i = 0 ; i < 3 ; i++)
		{
			
			Result vectorResult = VectorOps.scalarMultiplication(testCases.get(i).getEntry(1),testCases.get(i));

			if(!(vectorResult instanceof VectorResult))
			{
			
				debug("numMultiplicationTest()",(i+1));
				System.out.println("in type test"); 
				return false; 
			
			}//end if
		
			vectorResult = (VectorResult)vectorResult; 
			
			NumVector localResult = (NumVector)vectorResult.getResult(); 
			
			if(!(localResult.equal(solutionCases.get(i))))
			{
			
				debug("numMultiplicationTest()",(i+1));
				System.out.println("In comparision"); 
				return false; 			
			
			}//end if
		
		}//end for 
		
		
		if(!(VectorOps.scalarMultiplication(testCases.get(3).getEntry(1),testCases.get(3)) instanceof OverFlowResult))
			return false; 
			
			
		if( !(VectorOps.scalarMultiplication(testCases.get(4).getEntry(1),testCases.get(4)) instanceof OverFlowResult))
			return false; 
			
		returnBoolean = true; 
		
		return returnBoolean;
	
	}//end numMultiplicationTest() 
	
	
	
	public static boolean numSubtractionTest(ArrayList<NumVector> testCases, ArrayList<NumVector> solutionCases)
	{
	
		boolean returnBoolean = false; 
			
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
			
			Result vectorResult = VectorOps.subtraction(testCases.get(i),testCases.get(i+1)); 
			
			if(!(vectorResult instanceof VectorResult))
			{
				
				debug("numSubtractionTest()",(j+1)); 
				return false; 
				
			}//end if 
			
			vectorResult = (VectorResult) vectorResult; 
			NumVector localResult = (NumVector)vectorResult.getResult();
			if(!(localResult.equal(solutionCases.get(j))))
			{
			
				
				debug("numSubtractionTest()",(j+1)); 
				return false; 			
			
			}
			
			j++; 
		}//end for 

		if( !(VectorOps.subtraction(testCases.get(6),testCases.get(7)) instanceof OverFlowResult))
			return false; 


		if( !(VectorOps.subtraction(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 			
		
		
		returnBoolean = true; 
		
		return returnBoolean; 
		
	
	}//end numSubtractionTest() 
	
	
	
	public static boolean numDotProductTest(ArrayList<NumVector> testCases, ArrayList<NumEntry> solutionCases)
	{
	
		boolean returnBoolean; 
		
		
		int j = 0; 
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			Result vectorResult = VectorOps.dotProduct(testCases.get(i),testCases.get(i+1));
		
			if(!(vectorResult instanceof EntryResult))
			{
			
				debug("numDotProductTest()",(j+1));
				return false; 
				
			}//end if 
			
			vectorResult = (EntryResult) vectorResult; 
			
			NumEntry localResult = (NumEntry)vectorResult.getResult(); 
			
			if(!(localResult.equal(solutionCases.get(j))))
			{
			
			
				debug("numDotProductTest()",(j+1));
				return false; 			
			
			}
			
			j++; 
		}//end for 
		

		if(!(VectorOps.dotProduct(testCases.get(6),testCases.get(7)) instanceof OverFlowResult))
			return false; 

		if(!(VectorOps.dotProduct(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 
			
		if(!(VectorOps.dotProduct(testCases.get(10),testCases.get(11)) instanceof OverFlowResult))
			return false; 
			
					
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numDotProductTest() 
	
	
	
	public static boolean numCrossProductTest(ArrayList<NumVector> testCases, ArrayList<NumVector> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
			
			Result vectorResult = VectorOps.crossProduct(testCases.get(i),testCases.get(i+1)); 
			
			if( !(vectorResult instanceof VectorResult) )	
			{

				debug("numCrossProductTest()",(j+1)); 	
				
				return false; 
				
			}//end if 

			vectorResult = (VectorResult) vectorResult; 
			
			NumVector localVector = (NumVector)vectorResult.getResult();

			if(!(localVector.equal(solCases.get(j))))
			{
			
				debug("numCrossProductTest()",(j+1)); 	
				
				return false; 
			
			}//end if 
			
			
			j++; 
			
		}//end for 
		
		
		if(!(VectorOps.crossProduct(testCases.get(7),testCases.get(8)) instanceof OverFlowResult))
			return false; 
			
		if(!(VectorOps.crossProduct(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 		
		
		
		returnBoolean = true; 
		
		return returnBoolean;
	
	}//end numCrossProductTest() 
	
	
	
	
}//end class 
