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
		testCases = numMatrixCaseBuild(colToRowCaseScan,false);
		File colToRowSolFile = solutionFile(2);
		Scanner colToRowSolScan = scanBuild(colToRowSolFile);
		solCases = numVectorCaseBuild(colToRowSolScan);
		if(numColsToRowsTest(testCases,solCases))     
			System.out.println("Test for numColsToRowsTest() PASSED.");
		else 
			System.out.println("Test for numColsToRowsTest() FAILED.");  
		
		//test equal
		File equalCaseFile = caseFile(3);
		Scanner equalScan = scanBuild(equalCaseFile);
		ArrayList<NumMatrix> equalTestCases = numMatrixCaseBuild(equalScan,true);
		File equalSolFile = solutionFile(3);
		Scanner equalSolScan = scanBuild(equalSolFile);
		ArrayList<NumMatrix> equalSolCases = numMatrixCaseBuild(equalSolScan,true);
		if(numEqualTest(equalTestCases,equalSolCases))
			System.out.println("Test for numEqualTest() PASSED.");      
		else
			System.out.println("Test for numEqualTest() FAILED.");
		
		//test  getRowVector
		File getRowCaseFile = caseFile(4);
		Scanner getRowScan = scanBuild(getRowCaseFile);
		ArrayList<NumMatrix> getRowCases = numMatrixCaseBuild(getRowScan,true);
		File getRowSol = solutionFile(4); 
		Scanner getRowSolScan = scanBuild(getRowSol);
		ArrayList<NumVector> getRowSolCases = numVectorCaseBuild(getRowSolScan);
		if(numGetRowTest(getRowCases,getRowSolCases))
			System.out.println("Test for numGetRowTest() PASSED.");
		else
			System.out.println("Test for numGetRowTest() FAILED.");  
		 
		 
		//test getColVector 
		File getColCaseFile = caseFile(5);
		Scanner getColScan = scanBuild(getColCaseFile);
		ArrayList<NumMatrix> getColCases = numMatrixCaseBuild(getColScan,true);
		File getColSolFile = solutionFile(5);
		Scanner getColSolScan = scanBuild(getColSolFile);
		ArrayList<NumVector> getColSolCases = numVectorCaseBuild(getColSolScan);
		if(numGetColTest(getColCases,getColSolCases))
			System.out.println("Test for numGetColTest() PASSED.");
		else
			System.out.println("Test for numGetColTest() FAILED");     
		
		//test setColVector
		File setColVectorFile = caseFile(6);
		Scanner setColVectorScan = scanBuild(setColVectorFile);
		ArrayList<NumMatrix> setColVecCases = numMatrixCaseBuild(setColVectorScan,true); 
		File setColVectorSolFile = solutionFile(6);
		Scanner setColVectorSolScan = scanBuild(setColVectorSolFile);
		ArrayList<NumMatrix> setColVecSol = numMatrixCaseBuild(setColVectorSolScan,true);
		if(numSetColTest(setColVecCases,setColVecSol))
			System.out.println("test for numSetColTest() PASSED."); 
		else     
			System.out.println("test for numSetColTest() FAILED."); 		
		
		
		//test setRowVector
		File setRowVectorFile = caseFile(7);
		Scanner setRowVectorScan = scanBuild(setRowVectorFile);
		ArrayList<NumMatrix> setRowVectorCases = numMatrixCaseBuild(setRowVectorScan,true);
		File setRowVectorSolFile = solutionFile(7);
		Scanner setRowVectorSolScan = scanBuild(setRowVectorSolFile);
		ArrayList<NumMatrix> setRowVectorSolCases = numMatrixCaseBuild(setRowVectorSolScan,true);
		if(numSetRowTest(setRowVectorCases,setRowVectorSolCases))
			System.out.println("test for numSetRowTest() PASSED.");
		else
			System.out.println("test for numSetRowTest() FAILED.");			     
		
		//test getEntry
		
		//test setEntry
	
	
	
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
				return new File("./TestCases/MatrixTests/colToRowCases.txt");
			case 3:
				return new File("./TestCases/MatrixTests/equalCases.txt"); 
			case 4:
				return new File("./TestCases/MatrixTests/getRowVectorCases.txt");
			case 5:
				return new File("./TestCases/MatrixTests/getColVectorCases.txt"); 
			case 6:
				return new File("./TestCases/MatrixTests/setColVectorCases.txt"); 
			case 7:
				return new File("./TestCases/MatrixTests/setRowVectorCases.txt");
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
				return new File("./TestCases/MatrixTests/colToRowSol.txt"); 
			case 3:
				return new File("./TestCases/MatrixTests/equalSol.txt"); 
			case 4:
				return new File("./TestCases/MatrixTests/getRowVectorSol.txt"); 
			case 5:
				return new File("./TestCases/MatrixTests/getColVectorSol.txt"); 
			case 6:
				return new File("./TestCases/MatrixTests/setColVectorSol.txt");
			case 7:
				return new File("./TestCases/MatrixTests/setRowVectorSol.txt"); 
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
	
	
		int caseNum = matrixCases.size(); 
		boolean returnBoolean = false; 		
	
	
		//TRUE CASES 
		for(int i = 0 ; i < 3 ; i++)
		{
		
			if(!matrixCases.get(i).getRowVector(i+1).equal(vectorCases.get(i)))
			{
			
				debug("numColsToRowsTest()",(i+1));
				return false; 
			
			}//end if 
		
		}//end for 
		
		//FALSE CASES 
		for(int i = 3 ; i < 6; i++)
		{
		
			if(matrixCases.get(i).getRowVector(i+1).equal(vectorCases.get(i)))
			{
			
				debug("numColsToRowsTest()",(i+1));
				return false; 	 
			
			}//end if 
			
			if(i == 5)
			{
			
				returnBoolean = true; 		
		
			}//end if 
			
		
		}//end for 
		
		return returnBoolean; 
	
	
	
	}//end numColsToRowsTest() 
	
	
	
	public static boolean numEqualTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
	
		boolean returnBoolean = false; 
	
		//TRUE CASES 
		//iterate over the cases
		for(int i = 0 ; i < 3 ; i++)
		{

			//if false return false 	
			if(!testCases.get(i).equal(solCases.get(i)))
			{
				
				debug("numEqualTest()",(i+1)); 
				return false; 	
			
			}//end if 
			
			
		}//end for 
	
		//FALSE CASES 
		//iterate over the cases 
		for(int i = 3 ; i < 9 ; i++)
		{
		
			//if true return false 
			if(testCases.get(i).equal(solCases.get(i)))
			{
				debug("numEqualTest()",(i+1));
				return false; 
			
			}//end if 
			
			
			if(i == 8)
				returnBoolean = true; 	
				
		}//end for 
		
		
		return returnBoolean; 
		
	}//end numEqualTest() 
	
	
	
	
	public static boolean numGetRowTest(ArrayList<NumMatrix> testCases , ArrayList<NumVector> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		for(int i = 0 ; i < 3 ; i++)
		{
			
			if(!testCases.get(i).getRowVector(i+1).equal(solCases.get(i)))
			{
				
				debug("numGetRowTest()",(i+1)); 			
				return false; 			
			
			}

			
		}//end for 
		
		
		for(int i = 3 ; i < 6 ; i++)
		{
		
			if(testCases.get(i).getRowVector(i+1).equal(solCases.get(i)))
			{
				
				debug("numGetRowTest()",(i+1)); 
				return false; 
			
			}//end if 
			if(i == 5)
			{
			
				returnBoolean = true; 
			
			}//end if 
		
		}//end for 
		
		return returnBoolean; 
	
	
	}//end numGetRowTest() 
	
	
	
	public static boolean numGetColTest(ArrayList<NumMatrix> testCases, ArrayList<NumVector> solCases)
	{
	
	
		boolean returnBoolean = false; 
		

	
			
		for(int i = 0 ; i < 3 ; i++)
		{
			
			if(!testCases.get(i).getColumnVector(i+1).equal(solCases.get(i)))
			{
				
				debug("numGetRowTest()",(i+1)); 			
				return false; 			
			
			}

			
		}//end for 
		
		
		for(int i = 3 ; i < 6 ; i++)
		{

			if(testCases.get(i).getColumnVector(i+1).equal(solCases.get(i)))
			{
				
				debug("numGetRowTest()",(i+1)); 
				return false; 
			
			}//end if 
			if(i == 5)
			{
			
				returnBoolean = true; 
			
			}//end if 
		
		}//end for 
		
		return returnBoolean; 
	
	
	}//end numGetColTest() 
	
	
	
	public static boolean numSetColTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
		
		boolean returnBoolean = false; 
		
		
		for(int i = 1 ; i < 4 ; i++)
		{
			
			Matrix testMatrix = new NumMatrix(testCases.get(i-1));
			
			testMatrix.setColumnVector(i,testMatrix.getColumnVector(i+1)); 
			
				 
			if(!testMatrix.equal(solCases.get(i-1)))	
			{
 
				debug("numbSetColTest()",i);
				return false; 
			
			} 
			
	
			
			
		}//end for 
		
		
		for(int i = 4 ; i < 7 ; i++)
		{
		
			testCases.get(i-1).setColumnVector((i),testCases.get(i-1).getColumnVector(i+1));	
			
			if(testCases.get(i-1).equal(solCases.get(i-1)))
			{
				debug("numbSetColTest()",(i+1));
				return false; 
			
			}//end if 
			
			if(i == 6)
				returnBoolean = true; 
				
		}//end for 
		
		
		
		return returnBoolean; 
		
	
	}//end numSetColTest() 
	
	
	
	public static boolean numSetRowTest(ArrayList<NumMatrix> testCases, ArrayList<NumMatrix> solCases)
	{
	
		boolean returnBoolean = false; 
	
		
		//TRUE CASES 
		for(int i = 1 ; i < 4 ; i++)
		{
			NumMatrix testMatrix = testCases.get(i-1);
			
			testMatrix.setRowVector(i,testCases.get(i-1).getRowVector(i+1));   
				
			if(!testMatrix.equal(solCases.get(i-1)))
			{
				debug("numSetRowTest()",i); 
				return false; 
			}	
		}//end for 
		
		//FALSE CASES
		for(int i = 4 ; i < 7 ; i++)
		{
			
			NumMatrix testMatrix = testCases.get(i-1);			

			
			testMatrix.setRowVector(i,testCases.get(i-1).getRowVector(i+1));   
			

			

			if(testMatrix.equal(solCases.get(i-1)))
			{

				debug("numSetRowTest()",i); 			
				return false; 						
			
			}

			
			
			//switch the returnBoolean when at the end 
			if(i == 6)
				returnBoolean = true;	
		
		}//end for 
		
		
		return returnBoolean; 
		
	}//end numSetRowTest()
	
	
	
}//end MatrixTest class 
