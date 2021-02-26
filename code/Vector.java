/*

The main question here for this class is what is it expected that 
all Vector classes can do, but also what they can do as a result 
of the Entry class.  All vectors will be able to get an entry at a
position, set an entry at a position, check a vector for equality,
give a string representation of a vector, return a copy of itself, 
and set itself given a vector.  

Which are abstract:
	getVector()
	setVector()
	

Which are concrete:
	getEntry()  
	setEntry()
	equal()
	toString() 
	Vector()
	

*/

import java.util.ArrayList; 
public abstract class Vector<T1 extends Vector, T2 extends Entry>
{


	ArrayList<T2> entryList = new ArrayList<T2>();
	int length; 
	
	public Vector(ArrayList<T2> entryList)
	{
	
		
		for(int i = 0 ; i < entryList.size() ; i++)
		{
		
			this.entryList.add(entryList.get(i)); 
		
		}//end for 
		this.length = this.entryList.size(); 	
	
	}//end Vector 
	
	
	
	public Vector(Vector<T1,T2> newVector)
	{
	
		for(int i = 0 ; i <  newVector.vectorLength() ; i++)
		{
			
			this.entryList.add(newVector.entryList.get(i)); 
			
		}//end for 
		
		this.length = this.entryList.size(); 
		 
		
	}//end Vector() 
	

	public abstract T1 getVector(); 
	
	public abstract void setVector(T1 newVector); 
	
	
	public T2 getEntry(int index)
	{
	
		return this.entryList.get(index-1);
	
	}//end getEntry() 
	
	
	public void setEntry(int index, T2 entry)
	{
	
		entryList.set(index-1,entry); 
		
	}//end setEntry() 


	public String toString()
	{
	
		int vectorLength = this.length; 
		
		String returnString = " "; 
		
		for(int index = 0 ; index < vectorLength ; index++)
		{
		
			returnString += entryList.get(index).toString() + ", ";
		
		
		}//end for 
	
	
		return returnString; 
	
	}//end toString() 

	public int vectorLength()
	{
	
		return this.length; 
		
	}//end vectorLength() 
	
	

	public boolean equal(T1 otherVector)
	{
	
		boolean returnBoolean = false; 
	
		if(otherVector.length != this.length)	
			return false; 
			
		int vectorLength = this.length; 
		
		ArrayList<T2> localList = otherVector.entryList; 
		 
		
		for(int index = 0 ; index < vectorLength ; index++)
		{
			
			if(!this.entryList.get(index).equal(localList.get(index)))
				return false; 
			else if(index == vectorLength -1)
				returnBoolean = true; 
		
		}//end for 
		
		return returnBoolean; 
		
	}//end equal()
	
	
	 
}//end Vector class 
