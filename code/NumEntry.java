import java.lang.Math; 

import java.math.BigInteger; 


public class NumEntry extends Entry<NumEntry>
{
	
	long num,den; 


	public NumEntry(long num, long den)
	{
		
		//select for division by zero 
		if(den == 0)
		{
		
			throw new IllegalArgumentException("The Denominator is zero check input");
		
		
		}//end if 
		
		//check for double negatives and put negatives in the numerator
		if(den < 0 && num < 0)
		{
			
			den *= -1;
			num *= -1;  
				
			
		}//end if 
		else if(den < 0 && num > 0)
		{
			
			num *= -1; 
			den *= -1; 	
		
		}//end else if 
		
		//find lowest terms
		BigInteger numerator = new BigInteger(Long.toString(num));
		BigInteger denominator = new BigInteger(Long.toString(den)); 
		BigInteger gcd = numerator.gcd(denominator); 
		numerator.divide(gcd);
		denominator.divide(gcd);
		
		//set global variables
		this.num = numerator.longValue(); 
		this.den = denominator.longValue(); 
		  
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
	
	
	public void setNum(long num)
	{
		
		this.num = num; 
	
	}//end setNum() 
	
	
	public void setDen(long den)
	{
		
		this.den = den; 
	
	}//end setDen() 
		

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
