import java.util.ArrayList; 
import java.io.FileNotFoundException; 
import java.io.File; 
import java.util.Scanner;
import java.lang.Long; 

public class VectorTest
{

	public static void main(String[] args)
	{
	
		ArrayList<NumVector> numVecCases = new ArrayList<NumVector>(); 
		ArrayList<NumVector> numSolCases = new ArrayList<NumVector>(); 
		ArrayList<StringVector> stringVecSol = new ArrayList<StringVector>(); 
		ArrayList<StringVector> stringVecCases = new ArrayList<StringVector>(); 		
		
				
		//test NumVector 		
		//build testcases
		//build solutioncases
		//check method 
		//print result
		
		
		//VECTOR EQUALITY TEST
		File equalFile = testFileMaker(1);
		Scanner equalScan = scanBuild(equalFile); 
		numVecCases = numCaseBuilder(equalScan);
		equalFile = solFileMaker(1);
		equalScan = scanBuild(equalFile); 
		numSolCases = numCaseBuilder(equalScan);	
		if(numVecEqual(numVecCases,numSolCases))
			System.out.println("Number Vector equal() test PASSED."); 
		else
			System.out.println("Number Vector equal() test FAILED"); 
		
		
		//VECTOR GET TEST
		File getFile = testFileMaker(2);
		Scanner getScan = scanBuild(getFile);
		numVecCases = numCaseBuilder(getScan);
		getFile = solFileMaker(2);
		getScan = scanBuild(getFile);
		numSolCases = numCaseBuilder(getScan);
		if(numGetVector(numVecCases,numSolCases))
			System.out.println("Number Vector getVector() test PASSED");
		else
			System.out.println("Number Vector getVector() test FAILED.");  
		
		
		//VECTOR SET TEST
		File setFile = testFileMaker(3);
		Scanner setScan = scanBuild(setFile);
		numVecCases = numCaseBuilder(setScan);
		setFile = solFileMaker(3); 
		setScan = scanBuild(setFile);
		numSolCases = numCaseBuilder(setScan);
		if(numSetVector(numVecCases,numSolCases))
			System.out.println("Number Vector setVector() test PASSED");
		else
			System.out.println("Number Vector setVector() test FAILED."); 
			
			
		//VECTOR ENTRY GET TEST 
		File entryGetFile = testFileMaker(4);
		Scanner entryGetScan = scanBuild(entryGetFile);
		numVecCases = numCaseBuilder(entryGetScan);
		if(numGetEntry(numVecCases))
			System.out.println("getEntry() test PASSED.");
		else 
			System.out.println("getEntry() test FAILED.");  
		  
		
		//VECTOR ENTRY SET TEST 
		File entrySetFile = testFileMaker(5);
		Scanner entrySetScan = scanBuild(entrySetFile);
		numVecCases = numCaseBuilder(entrySetScan);
		if(numSetEntry(numVecCases))
			System.out.println("setEntry() test PASSED.");
		else
			System.out.println("setEntry() test FAILED.");
		
		

		//TEST STRING CASES
		
		//TEST STRING EQUAL 
		File stringEqualFile = testFileMaker(1);
		Scanner stringEqualScan = scanBuild(stringEqualFile);
		stringVecCases = stringCaseBuilder(stringEqualScan);
		stringEqualFile = solFileMaker(1);
		stringEqualScan = scanBuild(stringEqualFile);
		stringVecSol = stringCaseBuilder(stringEqualScan);
		if(stringVecEqual(stringVecCases,stringVecSol))
			System.out.println("String Vector equal() test PASSED."); 
		else
			System.out.println("String Vector equal() test FAILED."); 
		
		//TEST STRING VECTOR GET
		File stringGetFile = testFileMaker(2);
		Scanner stringGetScan = scanBuild(stringGetFile);
		stringVecCases = stringCaseBuilder(stringGetScan);
		stringGetFile = solFileMaker(2);
		stringGetScan = scanBuild(stringGetFile);
		stringVecSol = stringCaseBuilder(stringGetScan);
		if(stringGetVector(stringVecCases,stringVecSol))
			System.out.println("String Vector getVector() test PASSED.");
		else
			System.out.println("String Vector getVector() test FAILED.");
			
		 
		 //TEST STRING VECTOR SET 
		 File stringSetFile = testFileMaker(3);
		 Scanner stringSetScan = scanBuild(stringSetFile);
		 stringVecCases = stringCaseBuilder(stringSetScan);
		 stringSetFile = solFileMaker(3);
		 stringSetScan = scanBuild(stringSetFile);
		 stringVecSol = stringCaseBuilder(stringSetScan);
		 if(stringSetVector(stringVecCases,stringVecSol))
		 	System.out.println("String Vector setVector() test PASSED."); 
		 else
		 	System.out.println("String Vector setVector() test FAILED.");      
		
		//TEST STRING VECTOR ENTRY GET 
		File stringGetEnt = testFileMaker(4);
		Scanner stringGetEntScan = scanBuild(stringGetEnt);
		stringVecCases = stringCaseBuilder(stringGetEntScan);
		if(stringGetEntry(stringVecCases))
			System.out.println("String Vector getVectorEntry() test PASSED."); 
		else 
			System.out.println("String Vector getVectorEntry() test FAILED."); 
		
		
		File stringSetEnt = testFileMaker(5);
		Scanner stringSetEntScan = scanBuild(stringSetEnt);
		stringVecCases = stringCaseBuilder(stringSetEntScan);
		if(stringSetEntry(stringVecCases))
			System.out.println("String Vector setVectorEntry() test PASSED."); 
		else
			System.out.println("String Vector setVectorEntry() test FAILED.");   
	
	}//end main() 
	
	
	public static File testFileMaker(int caseNumber)
	{
		
			
		//create a file object based on the case type 
		switch(caseNumber)
		{
		
			case 1:	
					return new File("./TestCases/VectorTests/VectorEqualCases.txt");
			case 2:
					return new File("./TestCases/VectorTests/VectorGetCases.txt");
			case 3:
					return new File("./TestCases/VectorTests/VectorSetCases.txt"); 
			case 4:
					return new File("./TestCases/VectorTests/VectorEntryGet.txt"); 
			case 5:
					return new File("./TestCases/VectorTests/VectorEntrySet.txt");
			default:
				System.out.println("Invalid testFileMaker case."); 
				
			
		}//end switch 
		
		System.out.println("Null file returned from case builder."); 
		
		return (File) null; 
	
	}//end fileMaker() 
	
	
	
	public static File solFileMaker(int caseNumber)
	{
	
		switch(caseNumber)
		{
		
		
			case 1:
	
				return new File("./TestCases/VectorTests/VectorEqualSolutions.txt");
			case 2:
				return new File("./TestCases/VectorTests/VectorGetSolutions.txt"); 
			case 3:
				return new File("./TestCases/VectorTests/VectorSetSolutions.txt");
			default:
				System.out.println("Invalid solFileMaker case."); 
		
		}//end switch 
		
	
		return (File) null; 
	
	}//end solFileMaker() 
	
	
	public static Scanner scanBuild(File caseFile)
	{
		try
		{
			return new Scanner(caseFile); 
		}
		catch(FileNotFoundException e)
		{
		
			System.out.println("Invalid file in path.");
		
		}//end 
	
	
		return (Scanner) null; 
		
	}//end scanBuild() 		

	
	
	public static ArrayList<NumVector> numCaseBuilder(Scanner scan)
	{
	
		ArrayList<NumVector> localList = new ArrayList<NumVector>(); 
		
		//read the number of cases
		int caseNumber = scan.nextInt(); 
		
		//loop to build vectors
		for(int index = 0  ; index < caseNumber ; index++)
		{
			
			ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
			
			int vectorSize = scan.nextInt(); 
			
			for(int j = 0 ; j < vectorSize ; j++)
			{
				
				//scan numerator, denominator
				long numerator = scan.nextLong(); 
				long denominator = scan.nextLong(); 
				 			
				//build entry added to list 
				entryList.add(new NumEntry(numerator,denominator));
				 
			}//end for 
			
			localList.add(new NumVector(entryList));
			
		}//end for 
		
		
		return localList; 
	
	
	}//end numCaseBuilder() 
	
	
	
	public static ArrayList<StringVector> stringCaseBuilder(Scanner scan)
	{
	
		ArrayList<StringVector> localList = new ArrayList<StringVector>(); 
		
		//read the number of cases
		int caseNumber = scan.nextInt(); 
		
		for(int index = 0 ; index < caseNumber ; index++)
		{
			
			ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
			
			int vectorSize = scan.nextInt(); 
			
			for(int j = 0 ; j < vectorSize ;j++)
			{
				
				Long numerator = new Long(scan.nextLong());  
				Long denominator = new Long(scan.nextLong()); 
				
				
				entryList.add(new StringEntry(numerator.toString(),denominator.toString()));
				 
			}//end for 
		
			localList.add(new StringVector(entryList)); 
			
		}//end for 
		
		
		return localList; 
	
	}//end stringCaseBuilder() 
	
	
	
	public static void debug(String methodName, int caseNumber)
	{
	
		System.out.println("Case number " + caseNumber + "FAILED from method " + methodName); 
	
	}//end debug() 
	
	
	
	public static boolean numVecEqual(ArrayList<NumVector> testCases, ArrayList<NumVector> solutionCases)
	{
		
		int caseSize = testCases.size(); 
		boolean returnBoolean = false; 
		
		
		//test true cases
		for(int index = 0 ; index < 4 ; index++)
		{
		
			if(!testCases.get(index).equal(solutionCases.get(index)))
			{
			
				debug("numVecEqual()",(index +1)); 
				return false; 
				
			}//end if 
		
		}//end for 
		
		//test false cases
		for(int index = 4 ; index < caseSize ; index++)
		{
		
			if(testCases.get(index).equal(solutionCases.get(index)))
			{
			
				debug("numVecEqual()",(index + 1)); 
				return false; 
			
			}//end if 
			if(index == caseSize - 1)
			{
			
				returnBoolean = true; 
			
			}
		
		}//end for 
			
		return returnBoolean;
	
	}//end numVecEqual()
	
	
	
	public static boolean stringVecEqual(ArrayList<StringVector> testCases, ArrayList<StringVector> solutionCases)
	{
		
		int caseSize = testCases.size(); 
		boolean returnBoolean = false; 
		
		
		//test true cases
		for(int index = 0 ; index < 4 ; index++)
		{
		
			if(!testCases.get(index).equal(solutionCases.get(index)))
			{
			
				debug("numVecEqual()",(index +1)); 
				return false; 
				
			}//end if 
		
		}//end for 
		
		//test false cases
		for(int index = 4 ; index < caseSize ; index++)
		{
		
			if(testCases.get(index).equal(solutionCases.get(index)))
			{
			
				debug("numVecEqual()",(index + 1)); 
				return false; 
			
			}//end if 
			if(index == caseSize - 1)
			{
			
				returnBoolean = true; 
			
			}
		
		}//end for 
			
		return returnBoolean;	
		
	}//end stringVecEqual() 
	
	
	
	
	public static boolean numGetVector(ArrayList<NumVector> testCases, ArrayList<NumVector> solutionCases)
 	{
		int caseSize = testCases.size(); 
		boolean returnBoolean = false; 
		
		
		//test true cases
		for(int index = 0 ; index < 4 ; index++)
		{
		
			if(!testCases.get(index).getVector().equal(solutionCases.get(index)))
			{
			
				debug("numGetVector()",(index +1)); 
				return false; 
				
			}//end if 
		
		}//end for 
		
		//test false cases
		for(int index = 4 ; index < caseSize ; index++)
		{
		
			if(testCases.get(index).getVector().equal(solutionCases.get(index)))
			{
			
				debug("numGetVector()",(index + 1)); 
				return false; 
			
			}//end if 
			if(index == caseSize - 1)
			{
			
				returnBoolean = true; 
			
			}
		
		}//end for 
			
		return returnBoolean;

	
	}//end numGetVector() 
	
	
	
	public static boolean stringGetVector(ArrayList<StringVector> testCases, ArrayList<StringVector> solutionCases)
	{
		int caseSize = testCases.size(); 
		boolean returnBoolean = false; 
		
		
		//test true cases
		for(int index = 0 ; index < 4 ; index++)
		{
		
			if(!testCases.get(index).getVector().equal(solutionCases.get(index)))
			{
			
				debug("stringGetVector()",(index +1)); 
				return false; 
				
			}//end if 
		
		}//end for 
		
		//test false cases
		for(int index = 4 ; index < caseSize ; index++)
		{
		
			if(testCases.get(index).getVector().equal(solutionCases.get(index)))
			{
			
				debug("stringGetVector()",(index + 1)); 
				return false; 
			
			}//end if 
			if(index == caseSize - 1)
			{
			
				returnBoolean = true; 
			
			}
		
		}//end for 
			
		return returnBoolean;	
	
	}//end stringGetVector() 
	
	
	public static boolean numSetVector(ArrayList<NumVector> testCases, ArrayList<NumVector> solutionCases)
	{
	
		
		boolean returnBoolean = false; 
		
		//get the length of the test cases
		int length = testCases.size();  
		int otherDex = 0; 
		
		for(int index = 0 ; index < 6 ; index += 2)
		{
		
			//transform the vector
			testCases.get(index).setVector(testCases.get(index + 1)); 
			
			//compare the vectors 
			if(!testCases.get(index).equal(solutionCases.get(otherDex)))
			{
			
				debug("numSetVector()", (otherDex + 1));
				return false; 
			
			}//end if 
		
			otherDex++; 
					
		}//end for loop 
		
		for(int index = 6 ; index < length ; index += 2)
		{
		
			testCases.get(index).setVector(testCases.get(index + 1));		
		
			if(testCases.get(index).equal(solutionCases.get(otherDex)))
			{
			
				debug("numSetVector()",(otherDex + 1));
				return false; 
				
			}//end if 
			
			if(index == length - 2)
			{
				returnBoolean = true; 
			
			}//end if 
		
			otherDex++; 
		
		}//end for loop 	
	
		return returnBoolean; 
		
	}//end numSetVector() 
	
	
	
	public static boolean stringSetVector(ArrayList<StringVector> testCases, ArrayList<StringVector> solutionCases)
	{
	
	
		boolean returnBoolean = false; 
		
		//get the length of the test cases
		int length = testCases.size();  
		int otherDex = 0; 
		
		for(int index = 0 ; index < 6 ; index += 2)
		{
		
			//transform the vector
			testCases.get(index).setVector(testCases.get(index + 1)); 
			
			//compare the vectors 
			if(!testCases.get(index).equal(solutionCases.get(otherDex)))
			{
			
				debug("numSetVector()", (otherDex + 1));
				return false; 
			
			}//end if 
		
			otherDex++; 
					
		}//end for loop 
		
		for(int index = 6 ; index < length ; index += 2)
		{
		
			testCases.get(index).setVector(testCases.get(index + 1));

			if(testCases.get(index).equal(solutionCases.get(otherDex)))
			{
			
				debug("numSetVector()",(otherDex + 1));
				return false; 
				
			}//end if 
			
			if(index == length-2)
			{
				returnBoolean = true; 
			
			}//end if 
		
			otherDex++; 
		
		}//end for loop 	
	
		return returnBoolean;
		
	}//end stringSetVector() 
	
	
	
	public static boolean numGetEntry(ArrayList<NumVector> testCases)
	{
		
		//TRUE CASES
		if(!testCases.get(0).getEntry(1).equal(new NumEntry(1,2)))
		{
			debug("numGetEntry()",1); 
			return false; 
			
		}//end if 
		
		if(!testCases.get(1).getEntry(3).equal(new NumEntry(3,1)))
		{
			debug("numGetEntry()",2); 
			return false; 
			
		}//end if 
		
		if(!testCases.get(2).getEntry(2).equal(new NumEntry(2,1)))
		{
			debug("numGetEntry()",3); 
			return false; 
			
		}//end if 
		
		if(!testCases.get(3).getEntry(2).equal(new NumEntry(2,3)))
		{
			debug("numGetEntry()",4); 
			return false; 
			
		}//end if 
		
		//FALSE CASES
		if(testCases.get(4).getEntry(3).equal(new NumEntry(0,1)))
		{
			debug("numGetEntry()",5); 
			return false; 
			
		}//end if 				
		
		if(testCases.get(5).getEntry(1).equal(new NumEntry(0,1)))
		{
			debug("numGetEntry()",6); 
			return false; 
			
		}//end if 
		return true; 
	
	}//end numGetEntry()
	
	
	public static boolean stringGetEntry(ArrayList<StringVector> testCases)
	{
			//TRUE CASES
		if(!testCases.get(0).getEntry(1).equal(new StringEntry("1","2")))
		{
			debug("stringGetEntry()",1); 
			return false; 
			
		}//end if 
		
		if(!testCases.get(1).getEntry(3).equal(new StringEntry("3","1")))
		{
			debug("stringGetEntry()",2); 
			return false; 
			
		}//end if 
		
		if(!testCases.get(2).getEntry(2).equal(new StringEntry("2","1")))
		{
			debug("stringGetEntry()",3); 
			return false; 
			
		}//end if 
		
		if(!testCases.get(3).getEntry(2).equal(new StringEntry("2","3")))
		{
			debug("stringGetEntry()",4); 
			return false; 
			
		}//end if 
		
		//FALSE CASES
		if(testCases.get(4).getEntry(3).equal(new StringEntry("0","1")))
		{
			debug("stringGetEntry()",5); 
			return false; 
			
		}//end if 				
		
		if(testCases.get(5).getEntry(1).equal(new StringEntry("0","1")))
		{
			debug("stringGetEntry()",6); 
			return false; 
			
		}//end if 

		return true; 

		
	}//end stringGetEntry() 
	
	
	
	public static boolean numSetEntry(ArrayList<NumVector> testCases)
	{
	
		//set an entry value at a location 
		//test the case
		testCases.get(0).setEntry(1,new NumEntry(2,3)); 
		testCases.get(1).setEntry(3,new NumEntry(1,4)); 
		testCases.get(2).setEntry(2,new NumEntry(1,2)); 
		testCases.get(3).setEntry(5,new NumEntry(3,1)); 
		testCases.get(4).setEntry(2,new NumEntry(1,1)); 
		testCases.get(5).setEntry(3,new NumEntry(1,1));
		 
		//TRUE CASES
		if(!testCases.get(0).getEntry(1).equal(new NumEntry( 2 , 3 )))
		{
			debug("numSetEntry()",1);
			return false; 
		
		}
		if(!testCases.get(1).getEntry(3).equal(new NumEntry( 1 , 4 )))
		{
			
			debug("numSetEntry()",2);
			return false;
		
		}
		if(!testCases.get(2).getEntry(2).equal(new NumEntry( 1 , 2 )))
		{

			debug("numSetEntry()",3);
			return false;			
		
		}
		if(!testCases.get(3).getEntry(5).equal(new NumEntry( 3 , 1 )))
		{
			
			debug("numSetEntry()",4);
			return false;
	
		}		
		//FALSE CASES
		if(testCases.get(4).getEntry(2).equal(new NumEntry( 2 , 1 )))
		{

			debug("numSetEntry()",5);
			return false;			
		
		}
		if(testCases.get(5).getEntry(3).equal(new NumEntry( 1 , 2 )))
		{

			debug("numSetEntry()",6);
			return false;			
		
		}				
		return true; 
	}//end numSetEntry()
	
	
	
	public static boolean stringSetEntry(ArrayList<StringVector> testCases)
	{
	
		//set an entry value at a location 
		//test the case
		testCases.get(0).setEntry(1,new StringEntry("2","3")); 
		testCases.get(1).setEntry(3,new StringEntry("1","4")); 
		testCases.get(2).setEntry(2,new StringEntry("1","2")); 
		testCases.get(3).setEntry(5,new StringEntry("3","1")); 
		testCases.get(4).setEntry(2,new StringEntry("1","1")); 
		testCases.get(5).setEntry(3,new StringEntry("1","1"));
		 
		//TRUE CASES
		if(!testCases.get(0).getEntry(1).equal(new StringEntry( "2" , "3" )))
		{
			debug("stringSetEntry()",1);
			return false; 
		
		}
		if(!testCases.get(1).getEntry(3).equal(new StringEntry( "1" , "4" )))
		{
			
			debug("stringSetEntry()",2);
			return false;
		
		}
		if(!testCases.get(2).getEntry(2).equal(new StringEntry( "1" , "2" )))
		{

			debug("stringSetEntry()",3);
			return false;			
		
		}
		if(!testCases.get(3).getEntry(5).equal(new StringEntry( "3" , "1" )))
		{
			
			debug("stringSetEntry()",4);
			return false;
	
		}		
		//FALSE CASES
		if(testCases.get(4).getEntry(2).equal(new StringEntry( "2" , "1" )))
		{

			debug("stringSetEntry()",5);
			return false;			
		
		}
		if(testCases.get(5).getEntry(3).equal(new StringEntry( "1" , "2" )))
		{

			debug("stringSetEntry()",6);
			return false;			
		
		}				
		return true; 	
		
	
	}//end stringSetEntry() 
	
}//end VectorTest
