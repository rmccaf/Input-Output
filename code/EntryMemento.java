public class EntryMemento<T extends Entry>
{
	
	T copy; 
	
	public EntryMemento(T entry)
	{
	
		this.copy = entry.getObj(); 
	
	}//end constuctor 



	public T getMemento()
	{
	
		return this.copy; 	
	
	}//end getMemento() 



}//end class 
