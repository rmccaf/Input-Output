import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.math.BigInteger;  
import java.lang.Long; 
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
		File getEntryFile = caseFile(8);
		Scanner getEntryScan = scanBuild(getEntryFile);
		ArrayList<NumMatrix> getEntryCases = numMatrixCaseBuild(getEntryScan,true);
		File getEntrySolFile = solutionFile(8);
		Scanner getEntrySolScan = scanBuild(getEntrySolFile);
		ArrayList<NumEntry> getEntrySol = numEntryCaseBuild(getEntrySolScan);
		if(numGetEntryTest(getEntryCases,getEntrySol))
			System.out.println("test for numGetEntryTest() PASSED.");
		else
			System.out.println("test for numGetEntryTest() FAILED.");			      
		
		
		//test setEntry
		File setEntryFile = caseFile(9);
		Scanner setEntryScan = scanBuild(setEntryFile);
		ArrayList<NumMatrix> setEntry = numMatrixCaseBuild(setEntryScan,true);
		File setEntrySolFile = solutionFile(9);
		Scanner setEntrySolScan = scanBuild(setEntrySolFile);
		ArrayList<NumEntry> setEntrySol = numEntryCaseBuild(setEntrySolScan);
		if(numSetEntryTest(setEntry,setEntrySol))
			System.out.println("test for numSetEntryTest() PASSED.");
		else
			System.out.println("test for numSetEntryTest() FAILED.");			    
	
	
		//STRINGMATRIX TESTS
		//test rows to columns 
		File stringRowToColCaseFile = caseFile(1);
		Scanner stringRowToColCaseScan = scanBuild(stringRowToColCaseFile); 
		ArrayList<StringMatrix> stringRowToColCases = stringMatrixCaseBuild(stringRowToColCaseScan,true);
		File stringRowToColSolFile = solutionFile(1); 
		Scanner stringRowToColSolScan = scanBuild(stringRowToColSolFile); 
		ArrayList<StringVector> stringRowToColSolCases = stringVectorCaseBuild(stringRowToColSolScan); 
		if(stringRowsToColsTest(stringRowToColCases,stringRowToColSolCases))
			System.out.println("Test for stringRowsToColsTest() PASSED.");
		else
			System.out.println("Test for stringRowsToColsTest() FAILED."); 
		
		
		//test columns to rows
		File stringColToRowCaseFile = caseFile(2);
		Scanner stringColToRowCaseScan = scanBuild(stringColToRowCaseFile);
		ArrayList<StringMatrix> stringColToRowCases = stringMatrixCaseBuild(stringColToRowCaseScan,false);
		File stringColToRowSolFile = solutionFile(2);
		Scanner stringColToRowScan = scanBuild(stringColToRowSolFile);
		ArrayList<StringVector> stringColToRowSol = stringVectorCaseBuild(stringColToRowScan);      
		if(stringColToRowTest(stringColToRowCases,stringColToRowSol))
			System.out.println("Test for stringColToRowTest() PASSED.");
		else
			System.out.println("Test for stringColToRowTest() FAILED.");
		
		//test equal 
		File stringEqualCaseFile = caseFile(3);
		Scanner stringEqualScan = scanBuild(stringEqualCaseFile);
		ArrayList<StringMatrix> stringEqualCases = stringMatrixCaseBuild(stringEqualScan,true);
		File stringEqualSolFile = solutionFile(3);
		Scanner stringEqualSolScan = scanBuild(stringEqualSolFile);
		ArrayList<StringMatrix> stringEqualSol = stringMatrixCaseBuild(stringEqualSolScan,true);
		if(stringEqualTest(stringEqualCases,stringEqualSol))
			System.out.println("Test for stringEqualTest() PASSED.");
		else
			System.out.println("Test for stringEqualTest() FAILED.");			    
		
		//test getRowVector
		File stringGetRowFile = caseFile(4);
		Scanner stringGetRowScan = scanBuild(stringGetRowFile);
		ArrayList<StringMatrix> stringGetRowCases = stringMatrixCaseBuild(stringGetRowScan,true);
		File stringGetRowSolFile = solutionFile(4);
		Scanner stringGetRowScanSol = scanBuild(stringGetRowSolFile);
		ArrayList<StringVector> stringGetRowSol = stringVectorCaseBuild(stringGetRowScanSol);
		if(stringGetRowTest(stringGetRowCases,stringGetRowSol))
			System.out.println("Test for stringGetRowTest() PASSED.");
		else
			System.out.println("Test for stringGetRowTest() FAILED.");
			
			
		//test getColVector
		File stringGetColFile = caseFile(5);
		Scanner stringGetColScan = scanBuild(stringGetColFile);
		ArrayList<StringMatrix> stringGetColCase = stringMatrixCaseBuild(stringGetColScan,true);
		File stringGetColSolFile = solutionFile(5);
		Scanner stringGetColSolScan = scanBuild(stringGetColSolFile);
		ArrayList<StringVector> stringGetColSol = stringVectorCaseBuild(stringGetColSolScan);
		if(stringGetColTest(stringGetColCase,stringGetColSol))
			System.out.println("Test for stringGetColTest() PASSED."); 
		else
			System.out.println("Test for stringGetColTest() FAILED.");
			
		//test setColVector 
		File stringSetColFile = caseFile(6);
		Scanner stringSetColScan = scanBuild(stringSetColFile); 
		ArrayList<StringMatrix> stringSetCol = stringMatrixCaseBuild(stringSetColScan,true);
		File stringSetColSolFile = solutionFile(6);
		Scanner stringSetColSolScan = scanBuild(stringSetColSolFile);
		ArrayList<StringMatrix> stringSetColSol = stringMatrixCaseBuild(stringSetColSolScan,true);
		if(stringSetColTest(stringSetCol,stringSetColSol))
			System.out.println("Test for stringSetColTest() PASSED.");  
		else
			System.out.println("Test for stringSetColTest() FAILED.");  
		
		//test setRowVector
		File stringSetRowFile = caseFile(7);
		Scanner stringSetRowScan = scanBuild(stringSetRowFile);
		ArrayList<StringMatrix> stringSetRow = stringMatrixCaseBuild(stringSetRowScan,true);
		File stringSetRowSolFile = solutionFile(7);
		Scanner stringSetRowSolScan = scanBuild(stringSetRowSolFile);
		ArrayList<StringMatrix> stringSetRowSol = stringMatrixCaseBuild(stringSetRowSolScan,true);
		if(stringSetRowTest(stringSetRow,stringSetRowSol))
			System.out.println("Test for stringSetRowTest() PASSED.");  
		else     	
			System.out.println("Test for stringSetRowTest() FAILED.");
			
		//test getEntry
		File stringGetEntryFile = caseFile(8);
		Scanner stringGetEntryScan = scanBuild(stringGetEntryFile);
		ArrayList<StringMatrix> stringGetEntry = stringMatrixCaseBuild(stringGetEntryScan,true);
		File stringGetEntrySolFile = solutionFile(8);
		Scanner stringGetEntrySolScan = scanBuild(stringGetEntrySolFile);
		ArrayList<StringEntry> stringGetEntrySol = stringEntryCasebuild(stringGetEntrySolScan);
		if(stringGetEntryTest(stringGetEntry,stringGetEntrySol))   	
			System.out.println("Test for stringGetEntryTest() PASSED."); 
		else
			System.out.println("Test for stringGetEntryTest() FAILED."); 
		
		//test setEntry 
		File stringSetEntryFile = caseFile(9);
		Scanner stringSetEntryScan = scanBuild(stringSetEntryFile);
		ArrayList<StringMatrix> stringSetEntry = stringMatrixCaseBuild(stringSetEntryScan,true);  
		File stringSetEntrySolFile = solutionFile(9);
		Scanner stringSetEntrySolScan = scanBuild(stringSetEntrySolFile);
		ArrayList<StringEntry> stringSetEntrySol = stringEntryCasebuild(stringSetEntrySolScan); 
		if(stringSetEntryTest(stringSetEntry,stringSetEntrySol))
			System.out.println("Test for stringSetEntryTest() PASSED."); 
		else
			System.out.println("Test for stringSetEntryTest() FAILED."); 
		
				
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
				return new File("./TestCases/MatrixTests/getEntryCases.txt");
			case 9:
				return new File("./TestCases/MatrixTests/setEntryCases.txt"); 
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
				return new File("./TestCases/MatrixTests/getEntrySol.txt"); 
			case 9:
				return new File("./TestCases/MatrixTests/setEntrySol.txt");
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
	
	
	public static boolean stringRowsToColsTest(ArrayList<StringMatrix> matrixCases , ArrayList<StringVector> vectorCases)
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
	
	}//end stringRowsToColTest() 
	
	
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
	
	
	public static boolean stringColToRowTest(ArrayList<StringMatrix> matrixCases, ArrayList<StringVector> vectorCases)
	{
	
		int caseNum = matrixCases.size(); 
		boolean returnBoolean = false; 		
	
	
		//TRUE CASES 
		for(int i = 0 ; i < 3 ; i++)
		{
		
			if(!matrixCases.get(i).getRowVector(i+1).equal(vectorCases.get(i)))
			{
			
				debug("stringColsToRowsTest()",(i+1));
				return false; 
			
			}//end if 
		
		}//end for 
		
		//FALSE CASES 
		for(int i = 3 ; i < 6; i++)
		{
		
			if(matrixCases.get(i).getRowVector(i+1).equal(vectorCases.get(i)))
			{
			
				debug("stringColsToRowsTest()",(i+1));
				return false; 	 
			
			}//end if 
			
			if(i == 5)
			{
			
				returnBoolean = true; 		
		
			}//end if 
			
		
		}//end for 
		
		return returnBoolean; 
	
	
	}//end stringColToRowTest() 
	
		
	
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
	
	
	public static boolean stringEqualTest(ArrayList<StringMatrix> testCases, ArrayList<StringMatrix> solCases)
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
	
	}//end stringEqualTest() 
	
	
	
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
	
	
	
	public static boolean stringGetRowTest(ArrayList<StringMatrix> testCases, ArrayList<StringVector> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		for(int i = 0 ; i < 3 ; i++)
		{
			
			if(!testCases.get(i).getRowVector(i+1).equal(solCases.get(i)))
			{
				
				debug("stringGetRowTest()",(i+1)); 			
				return false; 			
			
			}

			
		}//end for 
		
		
		for(int i = 3 ; i < 6 ; i++)
		{
		
			if(testCases.get(i).getRowVector(i+1).equal(solCases.get(i)))
			{
				
				debug("stringGetRowTest()",(i+1)); 
				return false; 
			
			}//end if 
			if(i == 5)
			{
			
				returnBoolean = true; 
			
			}//end if 
		
		}//end for 
		
		return returnBoolean; 	
	
	}//end stringGetRowTest() 
	
	
	
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
	
	
	
	
	public static boolean stringGetColTest(ArrayList<StringMatrix> testCases, ArrayList<StringVector> solCases)
	{
	
	
		boolean returnBoolean = false; 
			
		for(int i = 0 ; i < 3 ; i++)
		{
			
			if(!testCases.get(i).getColumnVector(i+1).equal(solCases.get(i)))
			{
				
				debug("stringGetColTest()",(i+1)); 			
				return false; 			
			
			}

			
		}//end for 
		
		
		for(int i = 3 ; i < 6 ; i++)
		{

			if(testCases.get(i).getColumnVector(i+1).equal(solCases.get(i)))
			{
				
				debug("numGetColTest()",(i+1)); 
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
	
	
	public static boolean stringSetColTest(ArrayList<StringMatrix> testCases, ArrayList<StringMatrix> solCases)
	{
	
		
		boolean returnBoolean = false; 
		
		
		for(int i = 1 ; i < 4 ; i++)
		{
			
			StringMatrix testMatrix = new StringMatrix(testCases.get(i-1));
			
			testMatrix.setColumnVector(i,testMatrix.getColumnVector(i+1)); 
			
				 
			if(!testMatrix.equal(solCases.get(i-1)))	
			{
 
				debug("stringSetColTest()",i);
				return false; 
			
			} 
			
	
			
			
		}//end for 
		
		
		for(int i = 4 ; i < 7 ; i++)
		{
		
			testCases.get(i-1).setColumnVector((i),testCases.get(i-1).getColumnVector(i+1));	
			
			if(testCases.get(i-1).equal(solCases.get(i-1)))
			{
				debug("stringSetColTest()",(i+1));
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
	

	
	public static boolean stringSetRowTest(ArrayList<StringMatrix> testCases, ArrayList<StringMatrix> solCases)
	{
	
		boolean returnBoolean = false; 
			
		//TRUE CASES 
		for(int i = 1 ; i < 4 ; i++)
		{
			StringMatrix testMatrix = testCases.get(i-1);
			
			testMatrix.setRowVector(i,testCases.get(i-1).getRowVector(i+1));   
				
			if(!testMatrix.equal(solCases.get(i-1)))
			{
				debug("stringSetRowTest()",i); 
				return false; 
			}	
		}//end for 
		
		//FALSE CASES
		for(int i = 4 ; i < 7 ; i++)
		{
			
			StringMatrix testMatrix = testCases.get(i-1);			

			
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
	
	
	
	
	
	public static boolean numGetEntryTest(ArrayList<NumMatrix> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		
		//TRUE CASES 
		for(int i = 1 ; i < 4 ; i++)
		{
			
			if(!testCases.get(i - 1).getEntry(1,i).equal(solCases.get(i-1)))
			{

				debug("numGetEntryTest()" , i); 
			
				return false; 			
			
			}


		}//end for 
		
		//FALSE CASES 
		for(int i = 4 ; i < 7 ; i++)
		{
		
			if(testCases.get(i-1).getEntry(1,i).equal(solCases.get(i-1)))
			{

				debug("numGetEntryTest()",i); 			
				return false; 			
			
			}//end if

		
		
			if(i == 6)
				returnBoolean = true; 
				
		}//end for 
		
		
		return returnBoolean; 
		
	
	}//end numGetEntryTest
	

	
	public static boolean stringGetEntryTest(ArrayList<StringMatrix> testCases, ArrayList<StringEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		
		//TRUE CASES 
		for(int i = 1 ; i < 4 ; i++)
		{
			
			if(!testCases.get(i - 1).getEntry(1,i).equal(solCases.get(i-1)))
			{

				debug("stringGetEntryTest()" , i); 
			
				return false; 			
			
			}


		}//end for 
		
		//FALSE CASES 
		for(int i = 4 ; i < 7 ; i++)
		{
		
			if(testCases.get(i-1).getEntry(1,i).equal(solCases.get(i-1)))
			{

				debug("stringGetEntryTest()",i); 			
				return false; 			
			
			}//end if

		
		
			if(i == 6)
				returnBoolean = true; 
				
		}//end for 
		
		
		return returnBoolean; 
		
	
	}//end numGetEntryTest

	
	
	
	public static boolean numSetEntryTest(ArrayList<NumMatrix> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
			
		
		for(int i = 1 ; i < 4 ; i++)
		{
		
			NumMatrix testMatrix = testCases.get(i-1);
			testMatrix.setEntry(i,2,solCases.get(i-1));  
	
			if(!testMatrix.getEntry(i,2).equal(solCases.get(i-1)))
			{
				
				debug("numSetEntryTest()",i);
				return false; 
				
			}//end if 
		
	
		}//end for 
	
		for(int i = 4 ; i < 7 ; i++)
		{
		
			NumMatrix testMatrix = testCases.get(i-1);
			 
			testMatrix.setEntry(i,2,new NumEntry(0 , 1));
			
			if(testMatrix.getEntry(i,2).equal(solCases.get(i-1)))
			{
			
				debug("numSetEntryTest()",i);
				return false;
			
			}//end if 	
		
			if(i == 6)
				returnBoolean = true; 
		
		}//end for 
	
		return returnBoolean;
	
	}//end numSetEntryTest() 
	
	
	public static boolean stringSetEntryTest(ArrayList<StringMatrix> testCases, ArrayList<StringEntry> solCases)
	{
	
		boolean returnBoolean = false; 
			
		
		for(int i = 1 ; i < 4 ; i++)
		{
		
			StringMatrix testMatrix = testCases.get(i-1);
			testMatrix.setEntry(i,2,solCases.get(i-1));  
	
			if(!testMatrix.getEntry(i,2).equal(solCases.get(i-1)))
			{
				
				debug("stringSetEntryTest()",i);
				return false; 
				
			}//end if 
		
	
		}//end for 
	
		for(int i = 4 ; i < 7 ; i++)
		{
		
			StringMatrix testMatrix = testCases.get(i-1);
			 
			testMatrix.setEntry(i,2,new StringEntry("0","1"));
			
			if(testMatrix.getEntry(i,2).equal(solCases.get(i-1)))
			{
			
				debug("stringSetEntryTest()",i);
				return false;
			
			}//end if 	
		
			if(i == 6)
				returnBoolean = true; 
		
		}//end for 
	
		return returnBoolean;
	
	}//end numSetEntryTest() 
	
}//end MatrixTest class 
