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
	
	}//end caseFile() 	
	
	
	
	public static File solutionFile(int caseNumber)
	{
	
		switch(caseNumber)
		{
			
			case 1:
				return new File("./TestCases/VectorOpsTests/AdditionSol.txt"); 
		
		}//end switch		
	
	}//end solutionFile() 
	
	
	public static Scanner scanBuild(File caseFile)
	{
	
		try
		{
		
			return new Scanner(caseFile);
		
		}
		catch(FileNotFoundException e)
		{
		
		
		
		}//end try/catch
	
	}//end scanBuild() 
	
	
	
	public static ArrayList<NumVector> numVectorCaseBuild(Scanner scan)
	{
	
	
	
	}//end numVectorCaseBuild() 
	
	
	public static ArrayList<StringVector> stringVectorCaseBuild(Scanner scan)
	{
	
	
	
	}//end stringVectorCasebuild() 
	
	
	
	public static ArrayList<NumEntry> numEntryCaseBuild(Scanner scan)
	{
	
	
	
	}//end numEntryCaseBuild() 
	
	
	
	public static ArrayList<StringEntry> stringEntryCaseBuild(Scanner scan)
	{
	
	
	
	}//end stringEntryCaseBuild()()
	
	
	
	
}//end class 
