import java.util.ArrayList; 

public class MatrixOps
{

	
	public static Result addition(NumMatrix matrixOne, NumMatrix matrixTwo)
	{


		if( matrixOne.getRowDim() != matrixTwo.getRowDim() || matrixOne.getColDim() != matrixTwo.getColDim() )
			return new DimensionMisMatchResult(); 
		
		int length = matrixOne.getRowDim(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int index = 1; index <= length ; index++)
		{
			
			Result result = VectorOps.addition(matrixOne.getRowVector(index),matrixTwo.getRowVector(index));
			
			if(!(result instanceof VectorResult))
				return result; 
				
			result = (VectorResult)result; 
			
			vectorList.add((NumVector)result.getResult()); 
			
		}//end for 
		
	
	
		return new MatrixResult(new NumMatrix(vectorList,true)); 
	
	}//end addition() 
	
	
	
	public static Result addition(StringMatrix matrixOne, StringMatrix matrixTwo)
	{
	
	
		if( matrixOne.getRowDim() != matrixTwo.getRowDim() || matrixOne.getColDim() != matrixTwo.getColDim() )
			return new DimensionMisMatchResult(); 	
	
		int length = matrixOne.getRowDim(); 
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
			
			Result result = VectorOps.addition(matrixOne.getRowVector(index),matrixTwo.getRowVector(index)); 
			
			if(!(result instanceof VectorResult))
				return result; 
			
			result = (VectorResult)result; 
			
			vectorList.add((StringVector)result.getResult());
		
		}//end for 
	 

		return new MatrixResult(new StringMatrix(vectorList,true));
		
	}//end stringMatrix
	
	
	
	public static Result scalarMultiplication(NumEntry entryOne, NumMatrix matrixOne)
	{
	
		int length = matrixOne.getRowDim(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			Result result = VectorOps.scalarMultiplication(entryOne, matrixOne.getRowVector(index)); 
			
			if(!(result instanceof VectorResult))
				return result; 

			result = (VectorResult)result; 

			vectorList.add((NumVector)result.getResult()); 
		
		}//end for 
	
	
		return new MatrixResult(new NumMatrix(vectorList,true)); 
	
	}//end scalarMultiplication 
	


	public static Result scalarMultiplication(StringEntry entryOne, StringMatrix matrixOne)
	{
		
		int length = matrixOne.getRowDim(); 
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
			
			Result result = VectorOps.scalarMultiplication(entryOne,matrixOne.getRowVector(index)); 
			
			
			if(!(result instanceof VectorResult))
				return result; 
			
			result = (VectorResult)result; 	
			
			vectorList.add((StringVector)result.getResult()); 
		
		}//end for 
		
		
		return new MatrixResult( new StringMatrix(vectorList,true));
	
	}//end scalarMultiplication() 


	
	public static Result matrixMultiplication(NumMatrix matrixOne, NumMatrix matrixTwo)
	{
	
		//check dimensions 
		if(matrixOne.getRowDim() != matrixTwo.getColDim())
			return new DimensionMisMatchResult(); 
			
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
				Result dotResult = VectorOps.dotProduct(matrixOne.getRowVector(rowIndex),matrixTwo.getColumnVector(columnIndex)); 
				
				//check for overflow 			
				if(!(dotResult instanceof EntryResult))
					return dotResult; 
				
				dotResult = (EntryResult)dotResult; 
				
				entryList.add((NumEntry)dotResult.getResult()); 
				
			}//end for 
	
			//create vector and add it to the list		
			vectorList.add(new NumVector(entryList)); 
		
		}//end for 
			
		//use the arraylist of vectors to create a matrix
		return new MatrixResult (new NumMatrix(vectorList,true)); 
	
	}//end matrixMultiplication() 
	

	public static Result matrixMultiplication(StringMatrix matrixOne, StringMatrix matrixTwo)
	{
	
		//check dimensions 
		if(matrixOne.getRowDim() != matrixTwo.getColDim())
			return new DimensionMisMatchResult(); 
			
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
				Result dotResult = VectorOps.dotProduct(matrixOne.getRowVector(rowIndex),matrixTwo.getColumnVector(columnIndex)); 
				
				if(!(dotResult instanceof EntryResult))
					return dotResult; 
				
				dotResult = (EntryResult)dotResult; 
				
				entryList.add((StringEntry)dotResult.getResult()); 
				
			}//end for 
	
			//create vector and add it to the list		
			vectorList.add(new StringVector(entryList)); 
		
		}//end for 
			
		//use the arraylist of vectors to create a matrix
		return new MatrixResult(new StringMatrix(vectorList,true)); 
	
	}//end matrixMultiplication()

}//end MatrixOps class
