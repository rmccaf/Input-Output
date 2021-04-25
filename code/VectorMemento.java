public class VectorMemento implements Memento<Vector>
{
	
	Vector copy; 
	
	public VectorMemento(Vector vector)
	{
	
		this.copy = vector.getVector(); 
	
	}//end constructor


	public Vector getMemento()
	{
	
		return this.copy; 
	
	}//end getMemento() 
	

}//end class 
