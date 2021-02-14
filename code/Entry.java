/*

The purpose of the class is to act as an abstract superclass for all Entry Subtypes 
specifically NumEntry and StringEntry. We need to consider what it is that all of our 
entries must be able to do.  They will all need a toString() method an equalEntry() 
method.  The problem is that 

*/


public abstract class Entry<T extends Entry>
{

	
	public abstract T getObj();
	
	public abstract void setObj(T obj);
	
	public abstract String toString();
	
	public abstract boolean equal(T other);


}//end Entry class 
