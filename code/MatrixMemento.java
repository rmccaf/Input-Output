public class MatrixMemento implements Memento<Matrix>
{

	Matrix copy; 
	
	
	public MatrixMemento(Matrix matrix)
	{
	
		this.copy = matrix.getMatrix(); 
	
	}//end constructor


	public Matrix getMemento()
	{
	
		return this.copy; 
	
	}//end getMemento() 

}//end class 
