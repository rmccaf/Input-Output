import java.util.ArrayList; 

public class StringVector extends Vector<StringVector,StringEntry>
{


	public StringVector(ArrayList<StringEntry> entryList)
	{
	
		super(entryList); 
	
	}//end constructor 
	
	
	
	public StringVector getVector()
	{
	
		return new StringVector(this.entryList);
	
	}//end getVector


	public void setVector(StringVector newVector)
	{
		
		int vectorLength = newVector.length; 
		
		this.entryList.clear(); 
		
		for(int index = 0 ; index < vectorLength ; index++)
		{
		
			this.entryList.add(newVector.entryList.get(index));
		
		}//end for 
		
		
		this.length = vectorLength; 
		
	}//end setVector() 



}//end StringVector class 
