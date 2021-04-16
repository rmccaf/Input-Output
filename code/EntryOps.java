/*



*/


import java.lang.Math; 
import java.math.BigInteger; 

public class EntryOps
{


	public static NumEntry addition(NumEntry entryOne, NumEntry entryTwo)
	{
	
		//check for multiplication overflow				
		if(multOverflow(entryOne.getNum(),entryTwo.getDen()))
			return (NumEntry) null;

		if(multOverflow(entryOne.getDen(),entryTwo.getDen()))
			return (NumEntry) null; 
		
		if(multOverflow(entryTwo.getNum(),entryOne.getDen()))
			return (NumEntry) null;
			
			
		//create common denominators
		long commonNumOne = entryOne.getNum() * entryTwo.getDen(); 
		long commonDen = entryOne.getDen() * entryTwo.getDen(); 
		long commonNumTwo = entryTwo.getNum() * entryOne.getDen(); 
		 
		
		//check for addition overflow
		if(addOverflow(commonNumOne,commonNumTwo))
			return (NumEntry) null; 	
			
		//add result numerators 
		long numResult = commonNumOne + commonNumTwo; 
					
		
		//return result
		return new NumEntry(numResult,commonDen); 
		 
		
	}//end addition 
	
	
	
	public static StringEntry addition(StringEntry entryOne, StringEntry entryTwo)
	{
			
		BigInteger commonNum1 = entryOne.getNum().multiply(entryTwo.getDen()); 
		
		
		BigInteger commonNum2 = entryTwo.getNum().multiply(entryOne.getDen());
		
		
		BigInteger commonDen  = entryTwo.getDen().multiply(entryOne.getDen());
		
		return new StringEntry(commonNum1.add(commonNum2).toString(),commonDen.toString());  
	
	}//end addition
		
	
	
	public static NumEntry subtraction(NumEntry entryOne, NumEntry entryTwo)
	{
	
		//negate entry two checking for overflow 
		NumEntry negEntryTwo = multiplication(entryTwo,new NumEntry(-1,1));
		
		if(negEntryTwo == null)		
			return (NumEntry) null; 
			
		//send to addition checking for overflow 
		NumEntry result = addition(entryOne,negEntryTwo);
		
		if(result == null)
			return (NumEntry) null; 
		 
		//return result
		return result; 
		
	}//end subtraction() 
	

	public static StringEntry subtraction(StringEntry entryOne, StringEntry entryTwo)
	{
		
		StringEntry negEntryTwo = multiplication(entryTwo,new StringEntry("-1","1"));
		
		return addition(entryOne,negEntryTwo);
		
	}//end subtraction() 	
	

	public static NumEntry multiplication(NumEntry entryOne, NumEntry entryTwo)
	{
	
		//check for multiplication over flow 
		if(multOverflow(entryOne.getNum() , entryTwo.getNum()) || multOverflow(entryOne.getDen(),entryTwo.getDen()))
			return (NumEntry) null; 
			
		return new NumEntry(entryOne.getNum() * entryTwo.getNum() , entryOne.getDen() * entryTwo.getDen() ); 	
		
	}//end multiplication 
		
	
	
	public static StringEntry multiplication(StringEntry entryOne, StringEntry entryTwo)
	{
	
		return new StringEntry(entryOne.getNum().multiply(entryTwo.getNum()).toString(),entryOne.getDen().multiply(entryTwo.getDen()).toString()); 
	
	}//end multiplication() 
	
	
	
	public static NumEntry division(NumEntry entryOne, NumEntry entryTwo)
	{
				
		//returns null if overflow by using multiplication 
		return multiplication(entryOne,new NumEntry(entryTwo.getDen(),entryTwo.getNum())); 
	
	}//end division() 
	
		
	public static StringEntry division(StringEntry entryOne, StringEntry entryTwo)
	{
		
		return multiplication(entryOne,new StringEntry(entryTwo.getDen().toString(),entryTwo.getNum().toString()));
		
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
