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
		ArrayList<NumMatrix> testCases = numTestCaseBuild(rowToColCaseScan);
		
		//test columns to rows 
		
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
				return new File("./TestCases/MatrixTests/rowsToColsSol.txt"); 

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
	
	
	
	public static ArrayList<NumMatrix> numTestCaseBuild(Scanner scan)
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
			caseList.add(new NumMatrix(vectorList));		
			
		}//end for 
 
		return caseList; 
	
	}//end testCaseBuild() 
	 
	
	

}//end MatrixTest class 
