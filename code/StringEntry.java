public class StringEntry extends Entry<StringEntry>
{

	String num, den; 


	public StringEntry(String num, String den)
	{
	
		this.num = num; 
		this.den = den; 
	
	}//end StringEntry 


	public StringEntry getObj()
	{
		
		return new StringEntry(this.num,this.den);
	
	}//end getObj() 
	
	
	public void setObj(StringEntry newEntry)
	{
		
		this.num = newEntry.num; 
		this.den = newEntry.den; 
	
	}//end setObj


	

	public String toString()
	{
	
		return "Yes"; 
		
	
	}//end toString() 
	
	

	public boolean equal(StringEntry other)
	{
	
		return true; 
	
	}//end equal() 

}//end StringEntry class 
