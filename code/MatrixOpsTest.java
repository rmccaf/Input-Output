import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.math.BigInteger;  
import java.lang.Long; 



public class MatrixOpsTest
{


	public static void main(String[] args)
	{
	
		//test numAddition
		File numAddFile = caseFile(1); 
		Scanner numAddScan = scanBuild(numAddFile);
		ArrayList<NumMatrix> numAddition = numMatrixCaseBuild(numAddScan,true);
		File numAddSolFile = solutionFile(1);
		Scanner numAddSolScan = scanBuild(numAddSolFile);  
		ArrayList<NumMatrix> numAdditionSol = numMatrixCaseBuild(numAddSolScan,true);
		if(numMatrixAdditionTest(numAddition,numAdditionSol))
			System.out.println("numAdditionTest() PASSED.");
		else
			System.out.println("numAdditionTest() FAILED.");			 
		
		
		//test numScalarMult
		File numScalMultFile = caseFile(2);
		Scanner numScalMultScan = scanBuild(numScalMultFile);
		ArrayList<NumMatrix> numScalMult = numMatrixCaseBuild(numScalMultScan,true);
		File numScalMultFileSol = solutionFile(2); 
		Scanner numScalMultSolScan = scanBuild(numScalMultFileSol);
		ArrayList<NumMatrix> numScalMultSol = numMatrixCaseBuild(numScalMultSolScan,true);
		if(numMatrixScalMultTest(numScalMult,numScalMultSol))
			System.out.println("numMatrixScalMultTest() PASSED."); 
		else
			System.out.println("numMatrixScalMultTest() FAILED."); 			  
		
		//test numMatrixMult
		File numMatMultFile = caseFile(3);
		Scanner numMatMultScan = scanBuild(numMatMultFile); 
		ArrayList<NumMatrix> numMatMul = numMatrixCaseBuild(numMatMultScan,true);
		File numMatMultSolFile = solutionFile(3);
		Scanner numMatMultSolScan = scanBuild(numMatMultSolFile);
		ArrayList<NumMatrix> numMatMulSol = numMatrixCaseBuild(numMatMultSolScan,true);
		if(numMatrixMultTest(numMatMul,numMatMulSol))
			System.out.println("numMatrixMultTest() PASSED."); 
		else 
			System.out.println("numMatrixMultTest() FAILED."); 
		
		
		File numSubFile = caseFile(4);
		Scanner numSubScan = scanBuild(numSubFile);
		ArrayList<NumMatrix> numSub = numMatrixCaseBuild(numSubScan,true);
		File numSubSolFile = solutionFile(4);
		Scanner numSubSolScan = scanBuild(numSubSolFile);
		ArrayList<NumMatrix> numSubSol = numMatrixCaseBuild(numSubSolScan,true);
		if(numMatrixSubTest(numSub,numSubSol))
			System.out.println("numMatrixSubTest() PASSED.");
		else
			System.out.println("numMatrixSubTest() FAILED.");     
	}//end main() 


	public static File caseFile(int caseNumber)
	{
	
		switch(caseNumber)
		{
		
			case 1: 
				return new File("./TestCases/MatrixOpsTests/AdditionCases.txt"); 
			case 2: 
				return new File("./TestCases/MatrixOpsTests/ScalarMultCases.txt");
			case 3:
				return new File("./TestCases/MatrixOpsTests/MultiplicationCases.txt"); 
			case 4: 
				return new File("./TestCases/MatrixOpsTests/SubtractionCases.txt");  
		
		}//end switch
	
	
		return (File) null; 
		
	}//end caseFile() 
	
	
	public static File solutionFile(int caseNumber)
	{
		
		switch(caseNumber)
		{
		
			case 1: 
				return new File("./TestCases/MatrixOpsTests/AdditionSol.txt"); 
			case 2: 
				return new File("./TestCases/MatrixOpsTests/ScalarMultSol.txt");
			case 3:
				return new File("./TestCases/MatrixOpsTests/MultiplicationSol.txt");
			case 4: 
				return new File("./TestCases/MatrixOpsTests/SubtractionSol.txt");
				   
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
	
	
	
	public static ArrayList<NumMatrix> numMatrixCaseBuild(Scanner scan, boolean caseType)
	{
	
		ArrayList<NumMatrix> caseList = new ArrayList<NumMatrix>(); 
		
		//scan the number of cases 
		int numberOfCases = scan.nextInt(); 
		
		//create a for loop to build the matricies 
		for(int i = 0 ; i < numberOfCases ; i++)
		{
			
			//scan number of rows 	
			int rowDimension = scan.nextInt(); 
			
			//scan number of columns 
			int colDimension = scan.nextInt(); 

			//create a local arrayList of Vectors 
			ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
			
			//create a for loop to build singular matrix 
			for(int j = 0 ; j < rowDimension ; j++)
			{
			
				//create a local arraylist for entries 
				ArrayList<NumEntry> entryList = new ArrayList<NumEntry>();
				
				//create a for loop to build the vectors 
				for(int k = 0 ; k < colDimension ; k++)
				{
									

					//scan for  numerator 
					long numerator = scan.nextLong(); 
							
					//scan for denominator 
					long denominator = scan.nextLong(); 
					
					//build an entry and add it to the list 
					entryList.add(new NumEntry(numerator,denominator)); 		
						
				}//end for 	

				//create a vector and add it to the vector list 				
				vectorList.add(new NumVector(entryList));		

			}//end for 

			//create a matrix and add it the the matrix list					
			caseList.add( new NumMatrix(vectorList,caseType)  );		
			
		}//end for 
 
		return caseList; 	
	}//end testCaseBuild() 
	 
	
	
	public static ArrayList<StringMatrix> stringMatrixCaseBuild(Scanner scan, boolean caseType)
	{
		
		ArrayList<StringMatrix> caseList = new ArrayList<StringMatrix>(); 
		
		//scan the number of cases 
		int numberOfCases = scan.nextInt(); 
		
		//create a for loop to build the matricies 
		for(int i = 0 ; i < numberOfCases ; i++)
		{
		
			//scan number of rows 	
			int rowDimension = scan.nextInt(); 
			
			//scan number of columns 
			int colDimension = scan.nextInt(); 

		
			//create a local arrayList of Vectors 
			ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
			
			//create a for loop to build singular matrix 
			for(int j = 0 ; j < rowDimension ; j++)
			{
			
				//create a local arraylist for entries 
				ArrayList<StringEntry> entryList = new ArrayList<StringEntry>();
				
				//create a for loop to build the vectors 
				for(int k = 0 ; k < colDimension ; k++)
				{
									
					Long longNum = scan.nextLong();
					Long longDen = scan.nextLong(); 
					
	 				
					//build an entry and add it to the list 
					entryList.add(new StringEntry(longNum.toString(),longDen.toString())); 		
					
				
				}//end for 	

				//create a vector and add it to the vector list 				
				vectorList.add(new StringVector(entryList));		
			
			}//end for 

			//create a matrix and add it the the matrix list					
			caseList.add( new StringMatrix(vectorList,caseType)  );		
			
		}//end for 
 
		return caseList;		
	}//end stringMatrixCaseBuild() 

	
	
	public static void debug(String testName, int caseNumber)
	{
	
		System.out.println("Test FAILED for method " + testName + " case numeber " + caseNumber); 
	
	}//end debug()

	
	
	public static boolean numMatrixAdditionTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
	
		boolean returnBoolean = false; 
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			Result localResult = MatrixOps.addition(testCases.get(i),testCases.get(i+1));
		
			if(!(localResult instanceof MatrixResult))
			{
			
				debug("numMatrixAddition",(j+1));
				return false; 
				
			}//end if 
		
			localResult = (MatrixResult)localResult; 
			NumMatrix localMatrix = (NumMatrix)localResult.getResult(); 
			
			if(!localMatrix.equal(solCases.get(j)))
			{
			
				debug("numMatrixAddition",(j+1));
				return false; 			
			
			}

			j++; 
			
		}//end for 
		
		
		if(!(MatrixOps.addition(testCases.get(6),testCases.get(7)) instanceof OverFlowResult))
			return false; 
			
		if(!(MatrixOps.addition(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 
			
		
		returnBoolean = true; 
		
		return returnBoolean; 
		
	
	}//end numMatrixAdditionTest()
	
	
	
	public static boolean numMatrixScalMultTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		for(int i = 0 ; i < 3 ; i++)
		{
		
			Result localResult = MatrixOps.scalarMultiplication(testCases.get(i).getEntry(1,1),testCases.get(i));
		
			if(!(localResult instanceof MatrixResult))
			{
				
				debug("numMatrixScalMult",(i+1));
				return false;  
				
			}//end if 
		
			localResult = (MatrixResult)localResult; 
			
			NumMatrix localMatrix = (NumMatrix)localResult.getResult(); 
			if(!localMatrix.equal(solCases.get(i)))
			{
			
				debug("numMatrixScalMult",(i+1));
				return false;  			
			
			}//end if 
		
		}//end for 
		
		
		if(!(MatrixOps.scalarMultiplication(testCases.get(3).getEntry(1,1),testCases.get(3)) instanceof OverFlowResult))
			return false; 
			
		if(!(MatrixOps.scalarMultiplication(testCases.get(4).getEntry(1,1),testCases.get(4)) instanceof OverFlowResult))
			return false; 		
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numMatrixScalMult() 
	
	
	
	public static boolean numMatrixMultTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
		boolean returnBoolean = false; 
		
		int j = 0; 
		
		//non-overflow cases
		for(int i = 0 ; i < 8 ; i += 2)
		{
			
			//get a result
			Result localResult = MatrixOps.matrixMultiplication(testCases.get(i),testCases.get(i+1));
			 
			//check if the correct instance is returned 
			if(!(localResult instanceof MatrixResult))
			{
				
				debug("numMatrixMultTest()",(j+1)); 
				return false; 
				
			}//end if 
			
			//cast the result 
			localResult = (MatrixResult)localResult; 
			
			//get a local matrix from result
			NumMatrix localMatrix = (NumMatrix)localResult.getResult(); 
			
			//check if the correct result is returned
			if(!localMatrix.equal(solCases.get(j)))
			{
				
				debug("numMatrixMultTest()",(j+1));
				return false; 
				
			}//end if 
			
			j++; 
		
		}//end for 
		
			
		//check if overflow 
		if(!(MatrixOps.matrixMultiplication(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 
	
		
		//check if overflow 
		if(!(MatrixOps.matrixMultiplication(testCases.get(10),testCases.get(11)) instanceof OverFlowResult))
			return false; 		
		
		//check if dimension mismatch 
		if(!(MatrixOps.matrixMultiplication(testCases.get(12),testCases.get(13)) instanceof DimensionMisMatchResult))
			return false; 		
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numMatrixMultTest() 
	
	
	public static boolean numMatrixSubTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
		boolean returnBoolean = false; 
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			//perform the subtraction operation 
			Result localResult = MatrixOps.subtraction(testCases.get(i),testCases.get(i+1));
			 
			//check if the correct instance 
			if(!(localResult instanceof MatrixResult))
			{
			
				debug("numMatrixSubTest()",(j+1)); 
				return false; 
				
			}//end if 
			
			//get the result as a matrix 
			localResult = (MatrixResult)localResult; 
			NumMatrix localMatrix = (NumMatrix)localResult.getResult(); 
			
			//check if the case is true 
			if(!localMatrix.equal(solCases.get(j)))
			{
			
				debug("numMatrixSubTest()",(j+1));
				return false; 
				
			}//end if 
			
			j++; 
			
		}//end for loop 
		
		
		if(!(MatrixOps.subtraction(testCases.get(6),testCases.get(7)) instanceof OverFlowResult))
			return false; 
			
		if(!(MatrixOps.subtraction(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 
			
		if(!(MatrixOps.subtraction(testCases.get(10),testCases.get(11)) instanceof DimensionMisMatchResult))
			return false; 						
			
			
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numMatrixSubTest() 
	

}//end MatrixOpsTest
