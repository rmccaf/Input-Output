/*

The same problem applies here as it does in the case of the 
StringVector class we have several kinds of of abstract methods 
which must be implemented and which ones do not since we 
have them in the concrete form of Entry classes.  

*/

import java.util.ArrayList; 

public class NumVector extends Vector<NumVector,NumEntry>
{


	public NumVector(ArrayList<NumEntry> entryList)
	{
		
		super(entryList); 
		
	}//end constructor
	
	
	public NumVector getVector()
	{
	
		return new NumVector(this.entryList); 
	
	}//end getVector() 
	
	
	public void setVector(NumVector newVector)
	{
	
		int vectorLength = newVector.length; 
		
		this.entryList.clear(); 
		
		for(int index = 0 ; index < vectorLength ; index++)
		{
		
			this.entryList.add(newVector.entryList.get(index)); 
		
		}//end for  
	
		this.length = vectorLength; 
	
	}//end setVector 
		
	
	public StringVector changeToString()
	{
	
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
		for(int i = 0 ; i < this.vectorLength() ; i++)
		{
		
			entryList.add(this.entryList.get(i).changeToString()); 
		
		}//end for
	
		
		return new StringVector(entryList); 
	
	}//end changeToString() 

}//end NumVector class
