import java.util.ArrayList; 

public class MatrixOps
{

	public static NumMatrix addition(NumMatrix matrixOne, NumMatrix matrixTwo)
	{


	
		int rowDim = matrixOne.getRowDim(); 
		
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		
		for(int index = 1 ; index <= rowDim ; index++)
		{
			
			vectorList.add(VectorOps.addition(matrixOne.getRowVector(index),matrixTwo.getRowVector(index))); 
		
		}//end for 
	

	
		return new NumMatrix(vectorList); 
	
	}//end addition() 
	
	
	
	public static StringMatrix addition(StringMatrix matrixOne, StringMatrix matrixTwo)
	{
	
		int rowDim = matrixOne.getRowDim(); 
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		
		for(int index = 1 ;  index <= rowDim ; index++)
		{
		
			vectorList.add(VectorOps.addition(matrixOne.getRowVector(index),matrixTwo.getRowVector(index))); 		
			
		}//end for 
	
	
		return new StringMatrix(vectorList); 
	
	}//end stringMatrix
	

}//end MatrixOps class
