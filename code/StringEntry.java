import java.math.BigInteger;


public class StringEntry extends Entry<StringEntry>
{

	BigInteger num, den; 


	public StringEntry(String num, String den)
	{
		
		
		this.num = new BigInteger(num);
		this.den = new BigInteger(den);
		
		//check for division by zero case
		if(BigInteger.ZERO.equals(new BigInteger(den)))
		{
			
			throw new IllegalArgumentException("The denominator is zero check input"); 
		
		}//end if
		
	
		//make sure numerator is negative if the number is negative
		if(BigInteger.ZERO.compareTo(this.num) > 0 && BigInteger.ZERO.compareTo(this.den) > 0)
		{
			
			//set as positive
			this.num.negate();
			this.den.negate(); 
		
		}//end if
		else if(BigInteger.ZERO.compareTo(this.num) < 0 && BigInteger.ZERO.compareTo(this.den) > 0)
		{
		
			//set to positive
			this.num.negate(); 
			this.den.negate(); 
			
		}//end else if
				
		//put into lowest terms
		BigInteger gcd = this.num.gcd(this.den);
		
		//set the num and den
		this.num = this.num.divide(gcd);
		this.den = this.den.divide(gcd);
		
	}//end StringEntry 


	public StringEntry(StringEntry entry)
	{
	
		this.num = entry.getNum(); 
		
		this.den = entry.getDen(); 
		
	
	}//end StringEntry 


	public StringEntry getObj()
	{
		
		return new StringEntry(this.num.toString(),this.den.toString());
	
	}//end getObj() 
	

	public BigInteger getNum()
	{
	
		return new BigInteger(this.num.toString());   
		
	
	}//end getNum() 
	
	
	
	public BigInteger getDen()
	{
	
		return new BigInteger(this.den.toString()); 
	
	}//end getDen()
	
	
	public void setObj(StringEntry newEntry)
	{
		
		this.num = newEntry.num; 
		this.den = newEntry.den; 
	
	}//end setObj

	
	public void setNum(BigInteger num)
	{
		
		this.num = num; 
	
	}//end setNum()
	
	
	public void setDen(BigInteger den)
	{
		
		this.den = den; 
	
	}//end setDen()
	

	public String toString()
	{
	
		return this.num.toString() + "/" + this.den.toString(); 
		
	
	}//end toString() 
	
	

	public boolean equal(StringEntry other)
	{
	
		if(other.getNum().equals(this.num) && other.getDen().equals(this.den))
			return true;
		
	
		return false; 
	
	}//end equal() 


}//end StringEntry class 
