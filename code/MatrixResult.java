public class MatrixResult<T3 extends Matrix> extends Result
{

	T3 result; 
	
	public MatrixResult(T3 matrixResult)
	{
		
		this.result = matrixResult; 
	
	}//end constructor 
	
	
	public T3 getResult()
	{
	
		return this.result; 
		
	}//end getResult() 


	
	
	
}//end class 
