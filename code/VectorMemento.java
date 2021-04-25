public class VectorMemento<T extends Vector>
{
	
	T copy; 
	
	public VectorMemento(T vector)
	{
	
		this.copy = vector.getVector(); 
	
	}//end constructor


	public T getMemento()
	{
	
		return this.copy; 
	
	}//end getMemento() 
	

}//end class 
