public class MatrixMemento<T extends Matrix>
{

	T copy; 
	
	
	public MatrixMemento(T matrix)
	{
	
		this.copy = matrix.getMatrix(); 
	
	}//end constructor

	
	public T getMemento()
	{
	
		return this.copy; 
	
	}//end getMemento() 

}//end class 
