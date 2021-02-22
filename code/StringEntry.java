public class StringEntry extends Entry<StringEntry>
{

	String num, den; 


	public StringEntry(String num, String den)
	{
	
		this.num = num; 
		this.den = den; 
	
	}//end StringEntry 


	public StringEntry(StringEntry entry)
	{
	
		this.num = entry.getNum(); 
		
		this.den = entry.getDen(); 
		
	
	}//end StringEntry 


	public StringEntry getObj()
	{
		
		return new StringEntry(this.num,this.den);
	
	}//end getObj() 
	

	public String getNum()
	{
	
		return this.num; 
		
	
	}//end getNum() 
	
	
	
	public String getDen()
	{
	
		return this.den; 
	
	}//end getDen()
	
	
	public void setObj(StringEntry newEntry)
	{
		
		this.num = newEntry.num; 
		this.den = newEntry.den; 
	
	}//end setObj

	
	public void setNum(String num)
	{
		
		this.num = num; 
	
	}//end setNum()
	
	
	public void setDen(String den)
	{
		
		this.den = den; 
	
	}//end setDen()
	

	public String toString()
	{
	
		return this.num + "/" + this.den; 
		
	
	}//end toString() 
	
	

	public boolean equal(StringEntry other)
	{
	
		if(other.num.equals(this.num) && other.num.equals(this.den))
			return true;
		
	
		return false; 
	
	}//end equal() 

}//end StringEntry class 
