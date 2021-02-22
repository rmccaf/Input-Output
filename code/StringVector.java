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
		
		this.entryList = newVector.entryList; 
		this.length = this.entryList.size(); 
	
	}//end setVector() 



}//end StringVector class 
