/*



*/


import java.lang.Math; 
import java.math.BigInteger; 

public class EntryOps
{
	  
	public static Result addition(NumEntry entryOne, NumEntry entryTwo)
	{
	
		//check for multiplication overflow				
		if(multOverflow(entryOne.getNum(),entryTwo.getDen()))
			return new OverFlowResult();

		if(multOverflow(entryOne.getDen(),entryTwo.getDen()))
			return new OverFlowResult(); 
		
		if(multOverflow(entryTwo.getNum(),entryOne.getDen()))
			return new OverFlowResult();
			
			
		//create common denominators
		long commonNumOne = entryOne.getNum() * entryTwo.getDen(); 
		long commonDen = entryOne.getDen() * entryTwo.getDen(); 
		long commonNumTwo = entryTwo.getNum() * entryOne.getDen(); 
		 
		
		//check for addition overflow
		if(addOverflow(commonNumOne,commonNumTwo))
			return new OverFlowResult(); 	
			
		//add result numerators 
		long numResult = commonNumOne + commonNumTwo; 
					
		
		//return result
		return new EntryResult(new NumEntry(numResult,commonDen)); 
		 
		
	}//end addition 
	
	
	
	public static EntryResult addition(StringEntry entryOne, StringEntry entryTwo)
	{
			
		BigInteger commonNum1 = entryOne.getNum().multiply(entryTwo.getDen()); 
		
		
		BigInteger commonNum2 = entryTwo.getNum().multiply(entryOne.getDen());
		
		
		BigInteger commonDen  = entryTwo.getDen().multiply(entryOne.getDen());
		
		return new EntryResult(new StringEntry(commonNum1.add(commonNum2).toString(),commonDen.toString()));  
	
	}//end addition
		
	
	
	public static Result subtraction(NumEntry entryOne, NumEntry entryTwo)
	{
	
	
		//check for multiplication overflow				
		if(multOverflow(entryOne.getNum(),entryTwo.getDen()))
			return new OverFlowResult();

		if(multOverflow(entryOne.getDen(),entryTwo.getDen()))
			return new OverFlowResult(); 
		
		if(multOverflow(entryTwo.getNum(),entryOne.getDen()))
			return new OverFlowResult();
			
			
		//create common denominators
		long commonNumOne = entryOne.getNum() * entryTwo.getDen(); 
		long commonDen = entryOne.getDen() * entryTwo.getDen(); 
		long commonNumTwo = entryTwo.getNum() * entryOne.getDen(); 
		if(multOverflow(commonNumTwo,-1))
			return new OverFlowResult(); 
		
		commonNumTwo *= -1; 
		
		//check for addition overflow
		if(addOverflow(commonNumOne,commonNumTwo))
			return new OverFlowResult(); 	
			
		//add result numerators 
		long numResult = commonNumOne + commonNumTwo; 
					
	
		//return result
		return new EntryResult(new NumEntry(numResult,commonDen)); 
		 	
		
	}//end subtraction() 
	

	public static EntryResult subtraction(StringEntry entryOne, StringEntry entryTwo)
	{
		
		StringEntry negEntryTwo = (StringEntry) multiplication(entryTwo,new StringEntry("-1","1")).getResult();
		
		return new EntryResult(addition(entryOne,negEntryTwo).getResult());
		
	}//end subtraction() 	
	

	public static Result multiplication(NumEntry entryOne, NumEntry entryTwo)
	{
	
		//check for multiplication over flow 
		if(multOverflow(entryOne.getNum() , entryTwo.getNum()) || multOverflow(entryOne.getDen(),entryTwo.getDen()))
			return new OverFlowResult(); 
			
		return new EntryResult (new NumEntry(entryOne.getNum() * entryTwo.getNum() , entryOne.getDen() * entryTwo.getDen() ) ) ; 	
		
	}//end multiplication 
		
	
	
	public static EntryResult multiplication(StringEntry entryOne, StringEntry entryTwo)
	{
	
		return new EntryResult(new StringEntry(entryOne.getNum().multiply(entryTwo.getNum()).toString(),entryOne.getDen().multiply(entryTwo.getDen()).toString())); 
	
	}//end multiplication() 
	
	
	
	public static Result division(NumEntry entryOne, NumEntry entryTwo)
	{
				
		//returns null if overflow by using multiplication 
		return multiplication(entryOne,new NumEntry(entryTwo.getDen(),entryTwo.getNum())); 
	
	}//end division() 
	
		
	public static Result division(StringEntry entryOne, StringEntry entryTwo)
	{
		
		if(entryTwo.getNum().equals(new BigInteger("0")))
			return new DivisionByZeroResult();
		
		return new EntryResult(multiplication(entryOne,new StringEntry(entryTwo.getDen().toString(),entryTwo.getNum().toString())).getResult());
		
	}//end division() 
	
	
		
	private static boolean addOverflow(long numOne, long numTwo)
	{
	
		boolean returnBoolean = false; 
		
		if(numOne > 0 && numTwo > 0)
		{
		
			if((numOne + numTwo ) <= 0)
				returnBoolean = true; 
		
		}
		else if(numOne < 0 && numTwo < 0)
		{
			
			if((numOne + numTwo) >= 0)
				returnBoolean = true; 
		
		}
		
		
		return returnBoolean; 
		
	}//end overFlow 



	private static boolean multOverflow(long numOne, long numTwo)
	{
		
		boolean returnBoolean = false; 
		
		if(numOne == 0 || numTwo == 0)
			return false; 
		
		//multiply the two numbers 
		long result = numOne * numTwo; 
		
		//divide and check result 
		result /= numTwo; 
		
		if(result != numOne)
			returnBoolean = true; 
		
		return returnBoolean; 
			
	}//end multOverFlow() 
	
	
	
	

}//end EntryOps
