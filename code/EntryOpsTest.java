import java.util.ArrayList; 
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException; 


public class EntryOpsTest
{

	public static void main(String[] args)
	{
		
		//check numAddition() 
		File numAdditionCaseFile = testFileBuilder(1);
		Scanner numAdditionScan = scanBuild(numAdditionCaseFile);
		ArrayList<NumEntry> numAdditionCases = caseBuild(numAdditionScan);
		File numAdditionSolFile = solFileBuilder(1);
		Scanner numAdditionSolScan = scanBuild(numAdditionSolFile);
		ArrayList<NumEntry> numAdditionSolutions = caseBuild(numAdditionSolScan);
		if(numAdditionTest(numAdditionCases,numAdditionSolutions))
			System.out.println("numAddition test PASSED."); 
		else
			System.out.println("numAddition test FAILED."); 
		
		
		File numMultiplicationFile = testFileBuilder(2);
		Scanner numMultScan = scanBuild(numMultiplicationFile);
		ArrayList<NumEntry> numMultCases = caseBuild(numMultScan);
		File numMultSolFile = solFileBuilder(2);
		Scanner numMultSolScan = scanBuild(numMultSolFile); 
		ArrayList<NumEntry> numMultSolCases = caseBuild(numMultSolScan);
		if(numMultiplicationTest(numMultCases,numMultSolCases))
			System.out.println("numMultiplication test PASSED.");
		else
			System.out.println("numMultiplication test FAILED.");			 
 		
 		 		
		File numSubFile = testFileBuilder(3);
		Scanner numSubScan = scanBuild(numSubFile);
		ArrayList<NumEntry> numSubCases = caseBuild(numSubScan);
		File numSubSolFile = solFileBuilder(3);
		Scanner numSubSolScan = scanBuild(numSubSolFile);
		ArrayList<NumEntry> numSubSol = caseBuild(numSubSolScan);
		if(numSubtractionTest(numSubCases,numSubSol))
			System.out.println("numSubtractionTest test PASSED.");
		else
			System.out.println("numSubtractionTest test FAILED.");
			
		File numDivFile = testFileBuilder(4);
		Scanner numDivScan = scanBuild(numDivFile);
		ArrayList<NumEntry> numDivCases = caseBuild(numDivScan);
		File numDivSolFile = solFileBuilder(4);
		Scanner numDivSolScan = scanBuild(numDivSolFile);
		ArrayList<NumEntry> numDivSol = caseBuild(numDivSolScan);  	
		if(numDivisionTest(numDivCases,numDivSol))
			System.out.println("numDivisionTest test PASSED.");	
		else
			System.out.println("numDivisionTest test FAILED.");
					
	}//end main() 


	
	public static File testFileBuilder(int caseNumber)
	{
	
		switch(caseNumber)
		{
			
			case 1: 
				return new File("./TestCases/EntryOpsTests/AdditionCases.txt");
			case 2:
				return new File("./TestCases/EntryOpsTests/MultiplicationCases.txt");
			case 3:
				return new File("./TestCases/EntryOpsTests/SubtractionCases.txt");
			case 4:
				return new File("./TestCases/EntryOpsTests/DivisionCases.txt"); 
			default:
				return (File) null; 
				
		}//end switch
	
	}//end fileBuilder() 
	
	
		
	public static File solFileBuilder(int caseNumber)
	{
	
		switch(caseNumber)
		{
			
			case 1: 
				return new File("./TestCases/EntryOpsTests/AdditionSol.txt");
			case 2:
				return new File("./TestCases/EntryOpsTests/MultiplicationSol.txt"); 
			case 3: 
				return new File("./TestCases/EntryOpsTests/SubtractionSol.txt");
			case 4:
				return new File("./TestCases/EntryOpsTests/DivisionSol.txt");
			default:
				return (File) null; 
				
		}//end switch
	
	}//end solFileBuilder() 
		
		
		
	public static Scanner scanBuild(File caseFile)
	{
	
		try
		{
			
			return new Scanner(caseFile); 	
			
		}
		catch(FileNotFoundException e)
		{
		
			System.out.println("There is no such file."); 
			
		}//end catch 
		
		return (Scanner) null;
		
	}//end scanbuild 
	
	
	
	public static ArrayList<NumEntry> caseBuild(Scanner scan)
	{
	
		int numberOfCases = scan.nextInt(); 
		
		ArrayList<NumEntry> cases = new ArrayList<NumEntry>(); 
		
		for(int i = 0 ; i < numberOfCases ; i++)
		{
		
			long numerator = scan.nextLong(); 
			long denominator = scan.nextLong(); 
			
			cases.add(new NumEntry(numerator,denominator)); 
		
		
		}//end for 
	
		return cases; 
	
	}//end caseBuild() 
	
	
	
	public static void debug(String testName, int caseNumber)
	{
	
		System.out.println("Test " + testName + " FAILED for case number " + caseNumber); 
	
	}//end debug() 
	
	
	public static boolean numAdditionTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 

		int j = 0; 
		
		for(int i  = 0 ; i < 6 ; i += 2 )
		{
			 
			if(!EntryOps.addition(testCases.get(i),testCases.get(i+1)).equal(solCases.get(j)))
			{
				debug("numAdditionTest()", (j+1)); 
				return false; 
			}//end if 
			
			j++; 
		
		}//end for 
		
		
		
		if(EntryOps.addition(testCases.get(6),testCases.get(7) ) != null)
			return false; 

		if(EntryOps.addition(testCases.get(8),testCases.get(9) ) != null)
			return false; 
		
		returnBoolean = true; 
		
		return returnBoolean; 	
	
	}//end numAdditionTest() 
	
	
	
	
	public static boolean numMultiplicationTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		
		for(int i = 0 ; i < 8 ; i += 2)
		{
		
			if(!EntryOps.multiplication(testCases.get(i),testCases.get(i+1)).equal(solCases.get(j)))
			{
			
				debug("numMultiplicationTest()", (j+1));
				return false;  
			
			}//end if 
			
			j++; 
			
		}//end for 
	

		
		 	
		if(EntryOps.multiplication(testCases.get(8),testCases.get(9)) != null)
			return false;
		
		if(EntryOps.multiplication(testCases.get(10),testCases.get(11)) != null)
			return false;
			
		
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numAdditionTest() 
	
	
	
	public static boolean numSubtractionTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			if(!EntryOps.subtraction(testCases.get(i),testCases.get(i+1)).equal(solCases.get(j)))
			{
				
				debug("numSubtractionTest()", (j+1));
				return false; 
			
			}//end if 
		
			j++; 
		
		}//end for 
	
		
		if(EntryOps.subtraction(testCases.get(6),testCases.get(7)) != null)
			return false; 
			
		if(EntryOps.subtraction(testCases.get(8),testCases.get(9)) != null)
			return false; 
			
		returnBoolean = true; 
		
		return returnBoolean; 
		
	}//end numSubtractionTest() 
	
	
	
	public static boolean numDivisionTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			if(!EntryOps.division(testCases.get(i),testCases.get(i+1)).equal(solCases.get(j)))
			{
			
				debug("numDivisionTest()",(j+1));
				return false; 
			}//end if 
		
			j++; 
		
		}//end for 
	
		if(EntryOps.division(testCases.get(6),testCases.get(7)) != null)
			return false; 
			
		if(EntryOps.division(testCases.get(8),testCases.get(9)) != null)
			return false; 
						
	
		returnBoolean = true; 
		
		return returnBoolean; 
		
		
	}//end numDivisionTest() 
	
	
	
}//end class 
