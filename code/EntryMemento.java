public class EntryMemento implements Memento<Entry>
{
	
	Entry copy; 
	
	public EntryMemento(Entry entry)
	{
	
		this.copy = entry.getObj(); 
	
	}//end constuctor 



	public Entry getMemento()
	{
	
		return this.copy; 	
	
	}//end getMemento() 



}//end class 
