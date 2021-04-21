public class EntryResult<T1 extends Entry> extends Result
{

	T1 result; 
	
	public EntryResult(T1 entryResult)
	{
		
		this.result = entryResult; 
		
	}//end constructor 
	
	
	public T1 getResult()
	{
	
		return this.result; 
	
	}//end getResult() 


}//end class
