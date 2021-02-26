import java.util.ArrayList; 


public class MatrixTest
{

	
	public static void main(String[] args)
	{
	
		if(refTest())
			System.out.println("refTest() PASSED");
	
	
		opsTest(); 
		
	}//end main() 



	public static boolean refTest()
	{
	
		
		NumEntry numberEntry = new NumEntry(0,0);
		NumEntry numberEntryTwo = new NumEntry(2,3);
		
		
		ArrayList<NumEntry> entryListTwo = new ArrayList<NumEntry>(); 
		entryListTwo.add(numberEntryTwo); 
		entryListTwo.add(numberEntryTwo); 
		entryListTwo.add(numberEntryTwo); 
		NumVector numberVectorTwo = new NumVector(entryListTwo); 	
							 
		 
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		entryList.add(numberEntry); 			
		entryList.add(numberEntry); 			
		entryList.add(numberEntry); 			
		
		NumVector numberVector = new NumVector(entryList);
		
		ArrayList<NumVector> numVectorList = new ArrayList<NumVector>(); 
		
		numVectorList.add(numberVector);
		numVectorList.add(numberVector);		
		numVectorList.add(numberVector);
		

		NumMatrix numberMatrix = new NumMatrix(numVectorList);
		 
		NumMatrix numberMatrixTwo = numberMatrix.getMatrix();
		numberMatrixTwo.setRowVector(1,numberVectorTwo);
		
		
		if(numberMatrix.getRowVector(1).getEntry(1).getNum() != 2 )
			return true; 
			
		return false; 
		
		 
			 
		
	}//end refTest() 
	
	
	
	public static void opsTest()
	{
	
	
		NumEntry numberEntry = new NumEntry(0,0);
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		entryList.add(numberEntry); 			
		entryList.add(numberEntry); 			
		entryList.add(numberEntry); 			
		
		NumVector numberVector = new NumVector(entryList);
		
		ArrayList<NumVector> numVectorList = new ArrayList<NumVector>(); 
		
		numVectorList.add(numberVector);
		numVectorList.add(numberVector);		
		numVectorList.add(numberVector);
		
		
		NumMatrix numberMatrix = new NumMatrix(numVectorList); 
		
		MatrixOps.addition(numberMatrix,numberMatrix); 	
	
	
	}//end opsTest()


}//end MatrixTest class 
