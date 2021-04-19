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
		
		
	}//end main() 


	public static File caseFile(int caseNumber)
	{
	
		switch(caseNumber)
		{
		
			case 1: 
				return new File("./TestCases/MatrixOpsTests/AdditionCases.txt"); 
			case 2: 
				return new File("./TestCases/MatrixOpsTests/ScalarMultCases.txt"); 
		
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
		
			if(!MatrixOps.addition(testCases.get(i),testCases.get(i+1)).equal(solCases.get(j)))
			{
			
				debug("numMatrixAddition",(j+1));
				return false; 
				
			}//end if 
		
			j++; 
			
		}//end for 
		
		
		if(MatrixOps.addition(testCases.get(6),testCases.get(7)) != null)
			return false; 
			
		if(MatrixOps.addition(testCases.get(8),testCases.get(9)) != null)
			return false; 
			
		
		returnBoolean = true; 
		
		return returnBoolean; 
		
	
	}//end numMatrixAdditionTest()
	
	
	
	public static boolean numMatrixScalMultTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		for(int i = 0 ; i < 3 ; i++)
		{
		
			if(!MatrixOps.scalarMultiplication(testCases.get(i).getEntry(1,1),testCases.get(i)).equal(solCases.get(i)))
			{
				
				debug("numMatrixScalMult",(i+1));
				return false;  
				
			}//end if 
		
		}//end for 
		
		
		if(MatrixOps.scalarMultiplication(testCases.get(3).getEntry(1,1),testCases.get(3)) != null)
			return false; 
			
		if(MatrixOps.scalarMultiplication(testCases.get(4).getEntry(1,1),testCases.get(4)) != null)
			return false; 		
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numMatrixScalMult() 
	
	

}//end MatrixOpsTest
