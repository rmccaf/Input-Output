import java.util.ArrayList; 

public class VectorOps
{

	
	public static NumVector addition(NumVector vectorOne, NumVector vectorTwo)
	{
		
		//make sure vectors are of the correct length
		if(vectorOne.vectorLength() != vectorTwo.vectorLength())
			return (NumVector) null; 
		
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		int length = vectorOne.vectorLength(); 
			
		for(int index = 1 ; index <= length  ; index++)
		{
			
			NumEntry result = EntryOps.addition(vectorOne.getEntry(index),vectorTwo.getEntry(index)); 
			if(result == null)
				return (NumVector) null; 
				
			entryList.add(result); 
			
		}//end for 
	
		return new NumVector(entryList); 
	
	}//end addition() 	

	
	public static StringVector addition(StringVector vectorOne, StringVector vectorTwo)
	{
		
		//make sure vectors are of the correct length
		if(vectorOne.vectorLength() != vectorTwo.vectorLength())
			return (StringVector) null; 
		
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 

		int length = vectorOne.vectorLength(); 
	
		for(int index = 1 ; index <= length  ; index++)
		{
			
			StringEntry result = EntryOps.addition(vectorOne.getEntry(index),vectorTwo.getEntry(index)); 
			if(result == null)
				return (StringVector) null; 
				
			entryList.add(result); 
			
		}//end for 
	
		return new StringVector(entryList); 
	
	}//end addition()
	
	
	
	public static NumVector scalarMultiplication(NumEntry entry, NumVector vector)
	{
	
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>();
		
		int length = vector.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			NumEntry result = EntryOps.multiplication(vector.getEntry(index),entry); 
		
			if(result == null)
				return (NumVector) null; 
				
			entryList.add(result);
		
		}//end for 
		
		return new NumVector(entryList);
		 
	}//end scalarMultiplication() 
	
	
	
	public static StringVector scalarMultiplication(StringEntry entry, StringVector vector)
	{
	
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>();
		
		int length = vector.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			StringEntry result = EntryOps.multiplication(vector.getEntry(index),entry); 
		
			if(result == null)
				return (StringVector) null; 
				
			entryList.add(result);
		
		}//end for 
		
		return new StringVector(entryList);
		 
	}//end scalarMultiplication() 

	
	
	public static NumVector subtraction(NumVector vectorOne, NumVector vectorTwo)
	{
		
		NumVector result = scalarMultiplication(new NumEntry(-1,1), vectorTwo);
		
		if(result == null)
			return (NumVector) null; 
			 
		
		result = addition(vectorOne,result);
		
		if(result == null)
			return (NumVector) null; 
			
		return result; 		
		
	}//end subtraction() 
	
	
	
	public static StringVector subtraction(StringVector vectorOne, StringVector vectorTwo)
	{
		
		StringVector result = scalarMultiplication(new StringEntry("-1","1"), vectorTwo);
		
		if(result == null)
			return (StringVector) null; 
			 
		
		result = addition(vectorOne,result);
		
		if(result == null)
			return (StringVector) null; 
			
		return result; 		
		
	}//end subtraction()
	
	
		
}//end VectorOps class 
