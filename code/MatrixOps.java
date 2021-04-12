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


	

}//end MatrixOps class
