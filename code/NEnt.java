public class NEnt extends AbsEntry<Integer>
{


	Integer num; 
	
	Integer den; 
	
	
	
	public NEnt(Integer num, Integer den)
	{
	
	
		//check if denominator is zero
	
		super(num,den); 
		this.num = num; 
		this.den = den; 
		
		//put into lowest terms
				
	}//end constructor



	public NEnt getNEnt()
	{

		return new NEnt(this.num,this.den); 
	
	}//end getNEntry() 	



	public Integer getNum()
	{
	

		return this.num; 
	
	}//end getNum() 
	
	

	public Integer getDen()
	{

		return this.den; 
	
	}//end getDen() 
	
	public void setEnt(NEnt otherEntry)
	{
	
		this.num = otherEntry.num;
		this.den = otherEntry.den; 
	
	
	}//end setEnt()
	

	public void setNum(Integer num)
	{
		

		this.num = num; 
	
	}//end setNum() 
	
	

	public void setDen(Integer den)
	{
	

		this.den = den; 
	
	}//end setDen()
	
	

	public String toString()
	{
		
		String nEntry = this.num + ("/") + this.den; 
		
		return nEntry; 
	
	}//end toString()  




	public boolean equalEnt(NEnt other)
	{
		
		if(other.num != this.num || other.den != this.den)
		{
		
			return false; 
				
		}
			
		return true; 
		
	}//end equals() 

}//end NEnt class 
