import java.util.ArrayList; 
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException; 
import java.math.BigInteger; 


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
		
		
		File stringAddFile = testFileBuilder(1);
		Scanner stringAddScan = scanBuild(stringAddFile);
		ArrayList<StringEntry> stringAddition =  stringCaseBuild(stringAddScan);
		File stringAddSol = solFileBuilder(5);
		Scanner stringAddSolScan = scanBuild(stringAddSol);
		ArrayList<StringEntry> stringAdditionSol = stringCaseBuild(stringAddSolScan);   
		if(stringAdditionTest(stringAddition,stringAdditionSol))
			System.out.println("stringAddition test PASSED."); 
		else		
			System.out.println("stringAddition test FAILED."); 
			
			
		File stringMultFile = testFileBuilder(2);
		Scanner stringMultScan = scanBuild(stringMultFile);
		ArrayList<StringEntry> stringMult = stringCaseBuild(stringMultScan);
		File stringMultSolFile = solFileBuilder(6);
		Scanner stringMultSolScan = scanBuild(stringMultSolFile);
		ArrayList<StringEntry> stringMultSol = stringCaseBuild(stringMultSolScan); 
		if(stringMultiplicationTest(stringMult,stringMultSol))
			System.out.println("stringMultiplication test PASSED.");
		else
			System.out.println("stringMultipliaction test FAILED.");
			
		
		
		File stringSubFile = testFileBuilder(3);
		Scanner stringSubScan = scanBuild(stringSubFile);
		ArrayList<StringEntry> stringSub = stringCaseBuild(stringSubScan);
		File stringSubSolFile = solFileBuilder(7);
		Scanner stringSubSolScan = scanBuild(stringSubSolFile);
		ArrayList<StringEntry> stringSubSol = stringCaseBuild(stringSubSolScan);
		if(stringSubtractionTest(stringSub,stringSubSol))
			System.out.println("stringSubtractionTest() PASSED.");
		else
			System.out.println("stringSubtractionTest() FAILED.");  
		
		
		File stringDivisionFile = testFileBuilder(5);
		Scanner stringDivisionScan = scanBuild(stringDivisionFile);
		ArrayList<StringEntry> stringDivision = stringCaseBuild(stringDivisionScan);
		File stringDivisionSolFile = solFileBuilder(8);
		Scanner stringDivSolScan = scanBuild(stringDivisionSolFile);
		ArrayList<StringEntry> stringDivSol = stringCaseBuild(stringDivSolScan);
		if(stringDivisionTest(stringDivision,stringDivSol))
			System.out.println("stringDivisionTest() PASSED");
		else
			System.out.println("stringDivisionTest() FAILED.");
			
			     	    	      
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
			case 5: 
				return new File("./TestCases/EntryOpsTests/BigDivisionCases.txt"); 
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
			case 5: 
				return new File("./TestCases/EntryOpsTests/BigAdditionSol.txt");
			case 6:
				return new File("./TestCases/EntryOpsTests/BigMultiplicationSol.txt");
			case 7: 
				return new File("./TestCases/EntryOpsTests/BigSubtractionSol.txt");
			case 8: 
				return new File("./TestCases/EntryOpsTests/BigDivisionSol.txt");  				 
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
	
	
	public static ArrayList<StringEntry> stringCaseBuild(Scanner scan)
	{
		
		int numberOfCases = scan.nextInt(); 
		
		ArrayList<StringEntry> cases = new ArrayList<StringEntry>(); 
		
		for(int i  = 0 ; i < numberOfCases ; i++)
		{
		
			BigInteger numerator = scan.nextBigInteger(); 
			
			BigInteger denominator = scan.nextBigInteger(); 
			
			cases.add(new StringEntry(numerator.toString(),denominator.toString()));
		
		}//end for 
	
		return cases; 
	}//end stringCaseBuild() 
	
	
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
			//check if is an instance of a EntryResult 
			if(!(EntryOps.addition(testCases.get(i),testCases.get(i+1)) instanceof EntryResult))
			{
				debug("numAdditionTest()", (j+1)); 
				return false; 
				
			}//end if 
			
			EntryResult result = (EntryResult) EntryOps.addition(testCases.get(i),testCases.get(i+1)); 
			
			if(!(result.getResult().equal(solCases.get(j))))
			{
			
				debug("numAdditionTest()",(j+1)); 
				return false; 
			}//end if 
			
			j++; 
		
		}//end for 
		
		
		
		if(!(EntryOps.addition(testCases.get(6),testCases.get(7) ) instanceof OverFlowResult))
			return false; 

		if(!(EntryOps.addition(testCases.get(8),testCases.get(9) ) instanceof OverFlowResult))
			return false; 
		
		returnBoolean = true; 
		
		return returnBoolean; 	
	
	}//end numAdditionTest() 
	
	
	public static boolean stringAdditionTest(ArrayList<StringEntry> testCases, ArrayList<StringEntry> solCases)
	{
	
		boolean returnBoolean = false; 

		int j = 0; 
		
		for(int i  = 0 ; i < 10 ; i += 2 )
		{
			 
			if(!(((StringEntry)EntryOps.addition(testCases.get(i),testCases.get(i+1)).getResult()).equal(solCases.get(j))))
			{
				System.out.println(EntryOps.addition(testCases.get(i),testCases.get(i+1)).toString()); 
				debug("stringAdditionTest()", (j+1)); 
				return false; 
			}//end if 
			
			j++; 
		
		}//end for 		
	
		returnBoolean = true; 
		
		return returnBoolean; 	
	
	}//end numAdditionTest() 
	
	
	public static boolean numMultiplicationTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		
		for(int i = 0 ; i < 8 ; i += 2)
		{
		
			if(!(EntryOps.multiplication(testCases.get(i),testCases.get(i+1)) instanceof EntryResult))
			{
			
				debug("numMultiplicationTest()", (j+1));
				return false;  
			
			}//end if 
			
			
			EntryResult result = (EntryResult) EntryOps.multiplication(testCases.get(i),testCases.get(i+1)); 
			
			if(!result.getResult().equal(solCases.get(j)))
			{
				
				debug("numMultiplicationTest()", (j+1));
				return false;  

			}
			j++; 
			
		}//end for 
	

		
		 	
		if(!(EntryOps.multiplication(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false;
		
		if(!(EntryOps.multiplication(testCases.get(10),testCases.get(11)) instanceof OverFlowResult ))
			return false;
			
		
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end numAdditionTest() 
	
	
	public static boolean stringMultiplicationTest(ArrayList<StringEntry> testCases, ArrayList<StringEntry> solCases)
	{
	
		boolean returnBoolean = false;
		
		int length = testCases.size(); 
		
		int j = 0; 
		
		for(int i = 0 ; i < length ; i += 2)
		{
		
			if(!(((StringEntry)EntryOps.multiplication(testCases.get(i),testCases.get(i+1)).getResult()).equal(solCases.get(j))))
			{
			
				debug("stringMultiplicationTest()", (j+1));
				return false;  
			
			}//end if 
			
			j++; 
			
		}//end for 
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end stringMultiplicationTest() 
	
	
	
	public static boolean numSubtractionTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			if(!(EntryOps.subtraction(testCases.get(i),testCases.get(i+1)) instanceof EntryResult ))
			{
				
				debug("numSubtractionTest()", (j+1));
				return false; 
			
			}//end if 
		
			EntryResult result = (EntryResult) EntryOps.subtraction(testCases.get(i),testCases.get(i+1)); 
		
			if(!result.getResult().equal(solCases.get(j)))
			{
			
				debug("numSubtractionTest()", (j+1));
				return false; 			
			
			}//end if
			
			j++; 
		
		}//end for 
	
		
		if(!(EntryOps.subtraction(testCases.get(6),testCases.get(7)) instanceof OverFlowResult ))
			return false; 
			
		if(!(EntryOps.subtraction(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 
			
		returnBoolean = true; 
		
		return returnBoolean; 
		
	}//end numSubtractionTest() 
	
	
	
	public static boolean stringSubtractionTest(ArrayList<StringEntry> testCases, ArrayList<StringEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		int j = 0; 
		
		int length = solCases.size(); 
		
		for(int i = 0 ; j < length ; i += 2)
		{
			
			Result localResult = EntryOps.subtraction(testCases.get(i),testCases.get(i+1));
			
			if(!(localResult instanceof EntryResult))
			{
				
				debug("stringSubtractionTest()", (j+1));
				return false;  	
				
			} 
			
			localResult = (EntryResult)localResult; 
			
			StringEntry localEntry = (StringEntry)localResult.getResult();
			
			if(!localEntry.equal(solCases.get(j)))
			{
			
				debug("stringSubtractionTest()",(j+1));
				return false;  
			
			}//end if 
		
			j++; 
		
		}//end for 	
		
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end stringSubtractionTest() 
	
	
	
	public static boolean numDivisionTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		for(int i = 0 ; i < 6 ; i += 2)
		{
		
			if(!(EntryOps.division(testCases.get(i),testCases.get(i+1)) instanceof EntryResult))
			{
			
				debug("numDivisionTest()",(j+1));
				return false; 
			}//end if 
		
			EntryResult result = (EntryResult) EntryOps.division(testCases.get(i),testCases.get(i+1));
		
			if(!result.getResult().equal(solCases.get(j)))
			{
			
				debug("numDivisionTest()",(j+1));
				return false; 		
			
			}
		
			j++; 
		
		}//end for 
	
		if( !(EntryOps.division(testCases.get(6),testCases.get(7)) instanceof OverFlowResult))
			return false; 
			
		if(!(EntryOps.division(testCases.get(8),testCases.get(9)) instanceof OverFlowResult))
			return false; 
						
	
		returnBoolean = true; 
		
		return returnBoolean; 
		
		
	}//end numDivisionTest() 
	
	
	
	public static boolean stringDivisionTest(ArrayList<StringEntry> testCases, ArrayList<StringEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		int j = 0; 
		
		//check true cases
		for(int i = 0 ; i < 14; i += 2)
		{
		
			Result localResult = EntryOps.division(testCases.get(i),testCases.get(i+1));
		
			//check instance 
			if(!(localResult instanceof EntryResult))
			{
			
				debug("stringDivisionTest()",(j+1)); 
				return false; 
			
			}//end if 	
			
			StringEntry localEntry = (StringEntry)localResult.getResult(); 
				
				
			//check the result
			if(!localEntry.equal(solCases.get(j)))
			{
			
				debug("stringDivisionTest()",(j+1)); 
				return false; 			
			
			}//end if 
		
			j++; 
			
		}//end for 
		
		
		Result divZeroCase = EntryOps.division(testCases.get(14), testCases.get(15) ); 
		
		if(!( divZeroCase instanceof DivisionByZeroResult))
			return false; 
		
				
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end strintDivisionTest() 
	
}//end class 
