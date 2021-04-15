import java.util.ArrayList; 

public class MatrixOps
{

	
	public static NumMatrix addition(NumMatrix matrixOne, NumMatrix matrixTwo)
	{


		if( matrixOne.getRowDim() != matrixTwo.getRowDim() || matrixOne.getColDim() != matrixTwo.getColDim() )
			return (NumMatrix) null; 
		
		int length = matrixOne.getRowDim(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int index = 1; index <= length ; index++)
		{
			
			NumVector result = VectorOps.addition(matrixOne.getRowVector(index),matrixTwo.getRowVector(index));
			
			if(result == null)
				return (NumMatrix) null; 
				
			vectorList.add(result); 
			
		}//end for 
		
	
	
		return new NumMatrix(vectorList,true); 
	
	}//end addition() 
	
	
	
	public static StringMatrix addition(StringMatrix matrixOne, StringMatrix matrixTwo)
	{
	
	
		if( matrixOne.getRowDim() != matrixTwo.getRowDim() || matrixOne.getColDim() != matrixTwo.getColDim() )
			return (StringMatrix) null; 	
	
		int length = matrixOne.getRowDim(); 
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			vectorList.add(VectorOps.addition(matrixOne.getRowVector(index),matrixTwo.getRowVector(index)));
		
		}//end for 
	 

		return new StringMatrix(vectorList,true);
		
	}//end stringMatrix
	
	
	
	public static NumMatrix scalarMultiplication(NumEntry entryOne, NumMatrix matrixOne)
	{
	
		int length = matrixOne.getRowDim(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			NumVector result = VectorOps.scalarMultiplication(entryOne, matrixOne.getRowVector(index)); 
			
			if(result == null)
				return (NumMatrix) null; 
		
			vectorList.add(result); 
		
		}//end for 
	
	
		return new NumMatrix(vectorList,true); 
	
	}//end scalarMultiplication 
	


	public static StringMatrix scalarMultiplication(StringEntry entryOne, StringMatrix matrixOne)
	{
		
		int length = matrixOne.getRowDim(); 
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			vectorList.add(VectorOps.scalarMultiplication(entryOne,matrixOne.getRowVector(index))); 
		
		}//end for 
		
		
		return new StringMatrix(vectorList,true);
	
	}//end scalarMultiplication() 


	
	public static NumMatrix matrixMultiplication(NumMatrix matrixOne, NumMatrix matrixTwo)
	{
	
		//check dimensions 
	
		//create arrayList of vectors
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		int rowLength = matrixOne.getRowDim(); 
		
		
		//iterate over the rows of matrix one 
		for(int rowIndex = 1; rowIndex <= rowLength ; rowIndex++)
		{
		
			//create an ArrayList of entries to store the dot product 
			ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
			
			int columnLength = matrixTwo.getColDim(); 
			
			//iterate over the columns of matrix two 
			for(int columnIndex = 1 ; columnIndex <= columnLength ; columnIndex++)
			{
			
				//get dot product of row and column 
				NumEntry dotResult = VectorOps.dotProduct(matrixOne.getRowVector(rowIndex),matrixTwo.getColumnVector(columnIndex)); 
				
				//check for overflow 			
				if(dotResult == null)
					return (NumMatrix) null; 
				
				entryList.add(dotResult); 
				
			}//end for 
	
			//create vector and add it to the list		
			vectorList.add(new NumVector(entryList)); 
		
		}//end for 
			
		//use the arraylist of vectors to create a matrix
		return new NumMatrix(vectorList,true); 
	
	}//end matrixMultiplication() 
	

	public static StringMatrix matrixMultiplication(StringMatrix matrixOne, StringMatrix matrixTwo)
	{
	
		//check dimensions 
	
		//create arrayList of vectors
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		int rowLength = matrixOne.getRowDim(); 
		
		
		//iterate over the rows of matrix one 
		for(int rowIndex = 1; rowIndex <= rowLength ; rowIndex++)
		{
		
			//create an ArrayList of entries to store the dot product 
			ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
			
			int columnLength = matrixTwo.getColDim(); 
			
			//iterate over the columns of matrix two 
			for(int columnIndex = 1 ; columnIndex <= columnLength ; columnIndex++)
			{
			
				//get dot product of row and column 
				StringEntry dotResult = VectorOps.dotProduct(matrixOne.getRowVector(rowIndex),matrixTwo.getColumnVector(columnIndex)); 
				
				//check for overflow 			
				if(dotResult == null)
					return (StringMatrix) null; 
				
				entryList.add(dotResult); 
				
			}//end for 
	
			//create vector and add it to the list		
			vectorList.add(new StringVector(entryList)); 
		
		}//end for 
			
		//use the arraylist of vectors to create a matrix
		return new StringMatrix(vectorList,true); 
	
	}//end matrixMultiplication()

}//end MatrixOps class
