public class EntryOpsTest
{

	public static void main(String[] args)
	{
		
		//check numAddition() 
				
		
		
	}//end main() 


	
	public static File testFileBuilder(int caseNumber)
	{
	
		switch(caseNumber)
		{
			
			case 1: 
				return new File("./TestCases/EntryOpsTests/AdditionCases.txt");
		
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
	
	
	
	public static boolean numAdditionTest(ArrayList<NumEntry> testCases, ArrayList<NumEntry> solCases)
	{
	
		boolean returnBoolean = false; 
		
		
		return returnBoolean; 	
	
	}//end numAdditionTest() 
	
	
	
	
}//end class 
