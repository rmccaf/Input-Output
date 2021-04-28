public class VectorResult<T2 extends Vector> extends Result<Vector>
{

	T2 result; 
	
	
	public VectorResult(T2 vector)
	{
	
		this.result = vector; 
	
	}
		
	public T2 getResult()
	{
	
		return this.result; 
	
	}//end getResult() 
	
	

	
	
}//end class
