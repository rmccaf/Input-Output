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
		this.entryList = newVector.entryList; 
		this.length = this.entryList.size(); 
	
	}//end setVector 
		
	
	

}//end NumVector class
