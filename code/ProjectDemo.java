/*

The goal of this program is to function as a demo for the 
design pattern used to detect and correct for cases of 
integer overflow when performing arithmatic calculations. 


*/

import java.io.File; 
import java.util.ArrayList; 
import java.io.FileNotFoundException;
import java.util.Scanner;  


public class ProjectDemo
{

	public static void main(String[] args)
	{
	
		//test entry calculations  
		entryTest(); 
		System.out.println("**************************");
		
		//test vector calculations 
		vectorTest(); 
		System.out.println("**************************");
		
		//test matrix calculations 
		matrixTest(); 
		System.out.println("**************************");
	
	}//end main


	
	public static File caseBuild(int caseNumber)
	{
	
		switch(caseNumber)
		{
		
			case 1:
				return new File("./TestCases/DemoCases/EntryCases.txt");
			case 2:
				return new File("./TestCases/DemoCases/VectorCases.txt");
			case 3: 
				return new File("./TestCases/DemoCases/MatrixCases.txt");  
			
		
		}//end switch
	
		return (File)null; 
	
	}//end caseBuild() 
	

	
	public static Scanner scanBuild(File fileObj)
	{
		
		try
		{
		
			return new Scanner(fileObj);
		
		}
		catch(FileNotFoundException e)
		{
			
			System.out.println("You passed a bad file object."); 
		
		}//end try/catch
	
		return (Scanner)null; 
		
	}//end scanBuild()

	
	public static void entryTest()
	{
	
		//build file 
		File entryFile = caseBuild(1);
		 
		//bulid scanner 
		Scanner entryScan = scanBuild(entryFile);
		 
		//build case
		NumEntry numEntry = buildEntry(entryScan);
		 
		//run demo 
		entryDemo(numEntry); 		
	
	}//end entryTest() 
	
	
	public static void vectorTest()
	{
	
		File vectorFile = caseBuild(2);
		
		Scanner vectorScan = scanBuild(vectorFile);
		
		NumVector numVector = buildVector(vectorScan);
		
		vectorDemo(numVector); 
	
	}//end vectorTest()
	
	
	public static void matrixTest()
	{
	
		File matrixFile = caseBuild(3);
		
		Scanner matrixScan = scanBuild(matrixFile); 
		
		NumMatrix numMatrix = buildMatrix(matrixScan);
	
		matrixDemo(numMatrix);
		 
	}//end matrixTest() 
	

	public static NumEntry buildEntry(Scanner scan)
	{
	
		return new NumEntry((scan.nextLong()),scan.nextLong()); 
	
	}//end buildEntry() 
	

	
	public static NumVector buildVector(Scanner scan)
	{
		
		int vectorLength = scan.nextInt(); 
	
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
			
		for(int i = 0 ; i < vectorLength ; i++)
		{
			
			long numerator = scan.nextLong(); 
			long denominator = scan.nextLong(); 
			
			entryList.add(new NumEntry(numerator,denominator));
			 
		}//end for 
	
		return new NumVector(entryList); 
	
	}//end buildVector
	

	
	public static NumMatrix buildMatrix(Scanner scan)
	{
	
		int rowDim = scan.nextInt(); 
		int colDim = scan.nextInt(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int i = 0 ; i < rowDim ; i++)
		{
		
			ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
			
			for(int j = 0 ; j < colDim ; j++)
			{
			
				entryList.add(buildEntry(scan)); 
			
			}//end for 
		
			vectorList.add(new NumVector(entryList));
		
		}
	
		return new NumMatrix(vectorList,true);
		
	}//end buildMatrix() 


	
	public static void entryDemo(NumEntry entry)
	{
		System.out.println("Addition Demo Result"); 
		//build a request class
		EntryOpRequest addEntryDemo = new EntryOpRequest(); 
		
		NumEntry entry2 = entry.getObj(); 
		
		Result opResult = addEntryDemo.addition(entry,entry2);
		
		if(opResult instanceof EntryResult)
		{
			opResult = (EntryResult)opResult; 
			
			Entry entryResult = (Entry)opResult.getResult(); 
			
			if( entryResult instanceof StringEntry )
			{
				
				System.out.println(entryResult.toString()); 
			
			}//end if 
			

		
		}//end if 
		
		System.out.println();
		
		//test multiplication 
		System.out.println("Multiplication Demo Result");
		
		EntryOpRequest multEntryDemo = new EntryOpRequest(); 
		
		NumEntry multEntry2 = entry.getObj(); 
		
		Result multOpResult = multEntryDemo.multiplication(entry,multEntry2);
		
		if(multOpResult instanceof EntryResult)
		{
			multOpResult = (EntryResult)multOpResult; 
			
			Entry multResult = (Entry)multOpResult.getResult(); 
			
			if(multResult instanceof StringEntry)
			{
				
				System.out.println(multResult.toString()); 
			
			}//end if 
			

			
		}//end if  
		
		
		
		
	}//end entryDemo() 
	

	
	public static void vectorDemo(NumVector vector)
	{
		System.out.println("Vector Addition Result"); 
		//build a request class
		VectorOpRequest addVectorDemo = new VectorOpRequest(); 
		
		NumVector vector2 = vector.getVector(); 
		
		Result opResult = addVectorDemo.addition(vector,vector2);
		
		if(opResult instanceof VectorResult)
		{
			opResult = (VectorResult)opResult; 
			
			Vector vectorResult = (Vector)opResult.getResult(); 
			
			if( vectorResult instanceof StringVector )
			{
				
				System.out.println(vectorResult.toString()); 
			
			}//end if 
			

		
		}//end if 	
		System.out.println();
		System.out.println("Vector Multiplication Result"); 
		//scalar multiplication
		VectorOpRequest multVectorDemo = new VectorOpRequest();
		
		NumEntry multEntry = new NumEntry(2,1);
		
		Result scalMulResult = multVectorDemo.scalarMultiplication(multEntry,vector);
		
		if(scalMulResult instanceof VectorResult)
		{
			
			scalMulResult = (VectorResult)scalMulResult; 
			
			Vector scalMulVector = (Vector)scalMulResult.getResult(); 
			
			if(scalMulVector instanceof StringVector)
			{
			
				System.out.println(scalMulVector.toString()); 
				
			}//end if 
			
			
			
		}//end if    
		
		
	}//vectorDemo() 
	
	
	
	public static void matrixDemo(NumMatrix matrix)
	{
		
		System.out.println("Matrix Addition Demo"); 
		//build a request class
		MatrixOpRequest addMatrixDemo = new MatrixOpRequest(); 
		
		NumMatrix matrix2 = matrix.getMatrix(); 
		
		Result opResult = addMatrixDemo.addition(matrix,matrix2);
		
		//add Matricies
		if(opResult instanceof MatrixResult)
		{
			opResult = (MatrixResult)opResult; 
			
			Matrix matrixResult = (Matrix)opResult.getResult(); 
			
			if( matrixResult instanceof StringMatrix )
			{
				
				System.out.println(matrixResult.toString()); 
			
			}//end if 
			

		
		}//end if 	
	

		//matrix scalar multiplication 
		System.out.println();
		System.out.println("Matrix Scalar Multiplication Demo"); 
				
		NumEntry scalMultEntry = new NumEntry(2,1);
		
		MatrixOpRequest scalMultRequest = new MatrixOpRequest(); 
		
		Result scalMultResult = scalMultRequest.scalarMultiplication(scalMultEntry,matrix);
		 
		if(scalMultResult instanceof MatrixResult)
		{
		
			scalMultResult =(MatrixResult)scalMultResult; 
			Matrix scalMultMatrix = (Matrix)scalMultResult.getResult(); 
			if(scalMultMatrix instanceof StringMatrix)
			{
			
				System.out.println(scalMultMatrix.toString()); 
			
			}//end if 
		
		}//end if
		 
		
		//matrix multiplication 
		System.out.println(); 
		System.out.println("Matrix Multiplication Demo");
		
		MatrixOpRequest matrixMultRequest = new MatrixOpRequest(); 
		
		Result matrixMultResult = matrixMultRequest.matrixMultiplication(matrix,matrix);
		
		if(matrixMultResult instanceof MatrixResult)
		{
		
			matrixMultResult = (MatrixResult)matrixMultResult; 
			Matrix matrixMult = (Matrix)matrixMultResult.getResult();
			if(matrixMult instanceof StringMatrix)
			{
				
				System.out.println(matrixMult.toString()); 
			
			}//end if 
		
		}//end if 
		
		  
	}//end matrixDemo() 
	


}//end class 
