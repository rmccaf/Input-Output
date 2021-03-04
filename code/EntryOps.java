/*



*/


import java.lang.Math; 

public class EntryOps
{


	public static NumEntry addition(NumEntry addOne, NumEntry addTwo)
	{
	
		//put the fractions into common terms 
		long commonNumOne = addOne.getNum() * addTwo.getDen();  
		
		long commonNumTwo = addTwo.getNum() * addOne.getDen(); 
		
		long commonDen = addTwo.getDen() * addOne.getDen();
		
		//add the numerators 
		long returnNum = commonNumOne + commonNumTwo; 
		
		//return entry 		
		return new NumEntry(returnNum,commonDen); 
	
	}//end addition()
	
	
	
	
	public static StringEntry addition(StringEntry addOne, StringEntry addTwo)
	{
	

		
		
		return addOne; 
		
	}//end addition() 
	



	public static NumEntry subtraction(NumEntry subOne, NumEntry subTwo)
	{
		
		//put the fractions into common terms
		long commonNumOne = subOne.getNum() * subTwo.getDen();  
		
		long commonNumTwo = subTwo.getNum() * subOne.getDen(); 
		
		long commonDen = subTwo.getDen() * subOne.getDen(); 
		
		long returnNum = commonNumOne - commonNumTwo;
		
	
		return new NumEntry(returnNum,commonDen); 
	
	}//end subtraction()
	
	
	
	public static StringEntry subtraction(StringEntry subOne, StringEntry subTwo)
	{
	
		return subOne; 
	
	}//end subtraction() 
	
	
	
	public static NumEntry multiplication(NumEntry mulOne,NumEntry mulTwo)
	{
		
		//check for zero case 
		
		
		//multiply numerators and denominators 
		return new NumEntry(mulOne.getNum() * mulTwo.getNum() , mulTwo.getDen() * mulTwo.getDen()); 
	
	}//end multiplication() 
	
	
	
	
	public static StringEntry multiplication(StringEntry mulOne, StringEntry mulTwo)
	{
		
		return mulOne; 
	
	}//end multiplication() 
	
	
	
	public static NumEntry division(NumEntry divOne, NumEntry divTwo)
	{
		
		//check for division by zero case
		
		//multiply numerators and denominators
		return new NumEntry(divOne.getNum() * divTwo.getDen(),divTwo.getNum() * divOne.getDen()); 
	
	}//end division() 
	
	
	
	public static StringEntry division(StringEntry divOne, StringEntry divTwo)
	{
	
		return divOne; 

	
	}//end division() 
	
		

}//end EntryOps
