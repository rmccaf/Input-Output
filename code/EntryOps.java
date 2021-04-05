/*



*/


import java.lang.Math; 

public class EntryOps extends AbsEntryOps<NumEntry>
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
		if(addOverFlow(commonNumOne,commonNumTwo))
			return (NumEntry) null; 	
			
		//add result numerators 
		long numResult = commonNumOne + commonNumTwo; 
					
		
		//return result
		return new NumEntry(numResult,commonDen); 
		 
		
	}//end addition 
	
	
	public static StringEntry adddition(StringEntry entryOne, StringEntry entryTwo)
	{
	
		return entryOne; 
	
	}//end addition
		
		
		
	public static boolean addOverFlow(long numOne, long numTwo)
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



	public static boolean multOverFlow(long numOne, long numTwo)
	{
		
		boolean returnBoolean = false; 
		
		//multiply the two numbers 
		long result = numOne * numTwo; 
		
		//divide and check result 
		result /= numTwo; 
		
		if(result != numOne)
			returnBoolean = true; 
		
		return returnBoolean; 
			
	}//end multOverFlow() 
	
	

}//end EntryOps
