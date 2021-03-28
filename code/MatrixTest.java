import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 

	/*
	
	TEST FORMAT 
	
	build the test cases 
	build the solution cases
	call the test 
	print the result
	
	*/


public class MatrixTest
{


	
	public static void main(String[] args)
	{
	

	
		//NUMMATRIX TESTS 		
		//test rows to columns 
		File rowToColCaseFile = caseFile(1);
		Scanner rowToColCaseScan = scanBuild(rowToColCaseFile); 
		ArrayList<NumMatrix> testCases = numMatrixCaseBuild(rowToColCaseScan,true);
		File rowToColSolFile = solutionFile(1); 
		Scanner rowToColSolScan = scanBuild(rowToColSolFile); 
		ArrayList<NumVector> solCases = numVectorCaseBuild(rowToColSolScan); 
		if(numRowsToColsTest(testCases,solCases))
			System.out.println("Test for numRowsToColsTest() PASSED.");
		else
			System.out.println("Test for numRowsToColsTest() FAILED."); 
		
		//test columns to rows 
		File colToRowCaseFile = caseFile(2);
		Scanner colToRowCaseScan = scanBuild(colToRowCaseFile); 
		testCases = numMatrixCaseBuild(colRoRowCaseScan);
		File colToRowSolFile = solutionFile(2);
		Scanner colToRowSolScan = scanBuild(colToRowSolFile);
		solCases = numVectorCaseBuild(colToRowSolScan);
		if(numColsToRowsTest(testCases,solCases))     
			System.out.println("Test for numColsToRowsTest() PASSED.");
		else 
			System.out.println("Test for numColsToRowsTest() FAILED.");  
		//test equal
		
		//test  getRowVector
		
		//test getColVector 
		
		//test setRowVector
		
		
	
		//STRINGMATRIX TESTS
		//test rows to columns 
		
		//test columns to rows 
		
		//test equal 
		
		//test getRowVector
		
		//test getColVector
		
		//test setRowVector 
		
		
		
	}//end main() 



	public static File caseFile(int caseNumber)
	{

		switch(caseNumber)
		{
		
			case 1:
				return new File("./TestCases/MatrixTests/rowToColsCases.txt");
				
			case 2: 

			case 3:

			case 4:

			case 5:

			case 6:

			case 7:

			case 8:

			case 9:

			default:
				System.out.println("You did not choose a valid test case for caseFile()"); 
		
		
		}//end switch
		
		
		return (File) null; 
	}//end caseFile() 
	

	
	public static File solutionFile(int caseNumber)
	{
		
		

		
		switch(caseNumber)
		{
		
			case 1:
				return new File("./TestCases/MatrixTests/rowToColsSol.txt"); 

			case 2: 

			case 3:

			case 4:

			case 5:

			case 6:

			case 7:

			case 8:

			case 9:

			default:
				System.out.println("You did not choose a valid test case for solutionFile()"); 
		
		
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
			
			
		//return the list
	
	}//end numEntryCaseBuild() 


	
	public static void debug(String testName, int caseNumber)
	{
	
		System.out.println("Test FAILED for method " + testName + " case numeber " + caseNumber); 
	
	}//end debug()
	
	
	
	public static boolean numRowsToColsTest(ArrayList<NumMatrix> matrixCases , ArrayList<NumVector> vectorCases)
	{
	
		int caseNum = matrixCases.size(); 
		
		boolean returnBoolean = false; 
		
		//test true cases
		for(int i = 0 ; i < 2 ; i++)
		{
		
		
			if(!matrixCases.get(i).getColumnVector(i+1).equal(vectorCases.get(i)))
			{

				//debug output 
				debug("numRowsToColsTest()", (i+1));			
				return false; 				
			
			}

	
		}//end for 
	
	
		//test false cases
		for(int i = 2 ; i < caseNum ; i++)
		{
		
			if(matrixCases.get(i).getColumnVector(i + 1).equal(vectorCases.get(i)))
			{
				//debug output 
				debug("numRowsToColsTest()" ,(i + 1));		
				return false; 			
			
			}//end for 


			if(i == caseNum - 1)
				returnBoolean = true; 
		
		}//end for 
			
	
		return returnBoolean; 
	
	}//end rowsToColsTest() 
	
	
	public static boolean numColsToRowsTest(ArrayList<NumMatrix> matrixCases, ArrayList<NumVector> vectorCases)
	{
	
	
		return false; 
	
	}//end numColsToRowsTest() 
	
}//end MatrixTest class 
