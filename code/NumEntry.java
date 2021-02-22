public class NumEntry extends Entry<NumEntry>
{
	
	long num,den; 


	public NumEntry(long num, long den)
	{
		
		//select for division by zero 
		
		this.num = num; 
		this.den = den; 
	
		//lowest terms
	
	}//end constructor

	
	public NumEntry(NumEntry entry)
	{
	
	
		this.num = entry.getNum(); 
		this.den = entry.getDen(); 
		
	
	}//end NumEntry
	
	public long getNum()
	{
		
		return this.num; 
	
	}//end getNum()


	public long getDen()
	{
		
		return this.den; 
		
	}//end getDen() 


	public NumEntry getObj()
	{

		return new NumEntry(this.num,this.den); 
		
	}
		
	
	public void setObj(NumEntry other)
	{

		this.num = other.num; 
		this.den = other.den; 
	
	}
	
		

	public String toString()
	{

		return this.num + "/" + this.den; 
	
	}//end toString() 



	public boolean equal(NumEntry other)
	{
		if(other.num == this.num && other.den == this.den)
		{
			
			return true; 
		
		}
		
		return false; 
	
	}//end equal()

}//end class 
