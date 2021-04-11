import java.util.ArrayList; 
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 



public class VectorOpsTest
{



	public static void main(String[] args)
	{
	

		
	}//end main() 



	public static File caseFile(int caseNumber)
	{
		
		switch(caseNumber)
		{
			
			case 1:
				return new File("./TestCases/VectorOpsTests/AdditionCases.txt"); 
		
		}//end switch
		
		
		return (File) null; 
	}//end caseFile() 	
	
	
	
	public static File solutionFile(int caseNumber)
	{
	
		switch(caseNumber)
		{
			
			case 1:
				return new File("./TestCases/VectorOpsTests/AdditionSol.txt"); 
		
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
	
	
	
	
	
	
}//end class 
