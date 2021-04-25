/*

The purpose of this class is to test that when a memento object is recovered 
that it is no longer connected to the original instance of the object.  To 
test this behavior I will be createing an instance of each of the matrix 
object types, along with their components and making sure that a change in 
one is not reflected in the other. 

*/

import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.ArrayList; 
import java.math.BigInteger; 
import java.util.Scanner; 

public class MementoTest
{

	public static void main(String[] args)
	{
		
		//test EntryMemento 					
		File numEntryFile = caseBuild(1);
		Scanner numEntryScan = scanBuild(numEntryFile);
		NumEntry numEntry = numEntryBuild(numEntryScan); 
		File stringEntryFile = caseBuild(1);
		Scanner stringEntryScan = scanBuild(stringEntryFile);
		StringEntry stringEntry = stringEntryBuild(stringEntryScan);   
		if(entryInstanceTest(numEntry,stringEntry))
			System.out.println("entryInstanceTest() PASSED.");  
		
		//test VectorMemento
		File numVectorFile = caseBuild(2);
		Scanner numVectorScan = scanBuild(numVectorFile);
		NumVector numVector = numVectorBuild(numVectorScan);
		File stringVectorFile = caseBuild(2);
		Scanner stringVectorScan = scanBuild(stringVectorFile);
		StringVector stringVector = stringVectorBuild(stringVectorScan);
		if(vectorInstanceTest(numVector,stringVector))
			System.out.println("vectorInstanceTest() PASSED.");
			
		//test MatrixMemento
		File numMatrixFile = caseBuild(3);
		Scanner numMatrixScan = scanBuild(numMatrixFile);
		NumMatrix numMatrix = numMatrixBuild(numMatrixScan);     		
		File stringMatrixFile = caseBuild(3);
		Scanner stringMatrixScan = scanBuild(stringMatrixFile);
		StringMatrix stringMatrix = stringMatrixBuild(stringMatrixScan);
		if(matrixInstanceTest(numMatrix,stringMatrix))
			System.out.println("matrixInstanceTest() PASSED.");
			    
	}//end main

	
	public static boolean entryInstanceTest(NumEntry entry1, StringEntry entry2)
	{
	
		boolean returnBoolean = false; 
		
		
		EntryMemento numMem = new EntryMemento(entry1);
		entry1.setNum(2);
		 
		
		if(entry1.equal((NumEntry)numMem.getMemento()))
		{
			
			System.out.println("entryInstanceTest() FAILED.");
			return false; 
			
		}//end if   
		
		EntryMemento stringMem = new EntryMemento(entry2);
		entry2.setNum(new BigInteger("2")); 
		
 
		if(entry2.equal((StringEntry)stringMem.getMemento()))
		{
						
			System.out.println("entryInstanceTest() FAILED.");
			return false;	

		}//end if 
			
		
		returnBoolean = true; 
	
		return returnBoolean; 
	
	}//end entryInstanceTest() 

	
	public static boolean vectorInstanceTest(NumVector vector1, StringVector vector2)
	{
		
		boolean returnBoolean = false; 
		
		//change an entry within the vector			
		VectorMemento numMem = new VectorMemento(vector1);
		
		vector1.setEntry(2,new NumEntry(5,1)); 
 

		if(vector1.equal((NumVector)numMem.getMemento()))
		{
			
			System.out.println("vectorInstanceTest() FAILED.");
			return false; 		
		
		} 
		
		VectorMemento stringMem = new VectorMemento(vector2); 
		vector2.setEntry(2,new StringEntry("5","1"));
		
			
		
		if(vector2.equal((StringVector)stringMem.getMemento()))
		{
		
			System.out.println("vectorInstanceTest() FAILED.");
			return false;  
		
		}//end if 
		
		returnBoolean = true; 
		
		return returnBoolean; 
	
	}//end vectorInstanceTest() 
	
	
	public static boolean matrixInstanceTest(NumMatrix matrix1, StringMatrix matrix2)
	{
		boolean returnBoolean = false; 
		
		MatrixMemento numMem = new MatrixMemento(matrix1);
		
		matrix1.setEntry(2,2,new NumEntry(10,1));
		
		if(matrix1.equal(numMem.getMemento()))
		{
 
			System.out.println("matrixInstanceTest() FAILED.");
			return false; 
				
		}//end if 
		
		MatrixMemento stringMem = new MatrixMemento(matrix2); 
		matrix2.setEntry(2,2,new StringEntry("19","1")); 
		
		if(matrix2.equal(stringMem.getMemento()))
		{
  
			System.out.println("matrixInstanceTest() FAILED.");
			return false;  
			
		}
		
		returnBoolean = true; 
		
		return returnBoolean; 		
			
	}//end matrixInstanceTest()

	

	public static File caseBuild(int caseNumber)
	{
		
		switch(caseNumber)
		{
		
			case 1: 
				return new File("./TestCases/DesignPatterns/EntryMemento.txt");
			case 2: 
				return new File("./TestCases/DesignPatterns/VectorMemento.txt");
			case 3: 
				return new File("./TestCases/DesignPatterns/MatrixMemento.txt");
			   
		
		}//end switch
	
		return (File)null; 
	
	}//end casesBuild() 
	
	
	public static Scanner scanBuild(File fileName)
	{
	
		try
		{
			
			return new Scanner(fileName);
		
		}
		catch(FileNotFoundException e)
		{
		
			System.out.println("There is no such file"); 
		
		}	
		
		return (Scanner)null; 
	
	}//end scanBuild()
		
	
	public static NumEntry numEntryBuild(Scanner scan)
	{
	
		return new NumEntry((scan.nextLong()),scan.nextLong()); 
	
	}//end entryBuild() 
	
	
	public static NumVector numVectorBuild(Scanner scan)
	{
		
		int vectorLength = scan.nextInt(); 
		
		ArrayList<NumEntry> entryList = new ArrayList(); 
		
		for(int i = 0 ; i < vectorLength ; i++)
		{
		
			entryList.add(new NumEntry((scan.nextLong()),scan.nextLong())); 
		
		}//end for 
	
	
		return new NumVector(entryList);
		 
	}//end vectorBuild() 
	
	
	public static NumMatrix numMatrixBuild(Scanner scan)
	{
		
		int rowDimension = scan.nextInt(); 
		int columnDimension = scan.nextInt(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int i  = 0 ; i < rowDimension ; i++)
		{
		
			ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
			for(int j = 0 ; j < columnDimension ; j++)
			{
			
				entryList.add(new NumEntry((scan.nextLong()),scan.nextLong())); 
			
			}//end for 
		
			vectorList.add(new NumVector(entryList)); 
		}//end for 
	
		
		return new NumMatrix(vectorList,true);		
		
	}//end matrixBuild() 




	public static StringEntry stringEntryBuild(Scanner scan)
	{
	
		return new StringEntry((scan.nextBigInteger().toString()),scan.nextBigInteger().toString()); 
	
	}//end entryBuild() 
	
	
	public static StringVector stringVectorBuild(Scanner scan)
	{
		
		int vectorLength = scan.nextInt();
		
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
		for(int i = 0 ; i < vectorLength ; i++)
		{
		
			entryList.add(stringEntryBuild(scan));
		
		}//end for 
		
		return new StringVector(entryList);
	
	}//end vectorBuild() 
	
	
	public static StringMatrix stringMatrixBuild(Scanner scan)
	{
	
		int rowDimension = scan.nextInt(); 
		
		int columnDimension = scan.nextInt(); 
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		for(int i = 0 ; i < rowDimension ; i++)
		{
		
			ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
			for(int j = 0 ; j < columnDimension ;j++)
			{
			
				entryList.add(stringEntryBuild(scan)); 
				
			}//end for
		
			vectorList.add(new StringVector(entryList)); 
		
		}//end for 
	
		return new StringMatrix(vectorList,true);
	
	}//end matrixBuild()	
		

}//end class 
