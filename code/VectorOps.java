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
	
	
	
	public static NumEntry dotProduct(NumVector vectorOne, NumVector vectorTwo)
	{
	
		NumEntry addResult = new NumEntry(0,1); 
		int length = vectorOne.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			NumEntry multResult = EntryOps.multiplication(vectorOne.getEntry(index),vectorTwo.getEntry(index));
			if(multResult == null)
				return (NumEntry) null; 
			
			addResult = EntryOps.addition(addResult,multResult);
			if(addResult == null)
				return (NumEntry) null; 
			
		
		}//end for 
		
		return addResult; 
	
	}//end dotProduct() 
	
	

	public static StringEntry dotProduct(StringVector vectorOne, StringVector vectorTwo)
	{
	
		StringEntry addResult = new StringEntry("0","1"); 
		int length = vectorOne.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			StringEntry multResult = EntryOps.multiplication(vectorOne.getEntry(index),vectorTwo.getEntry(index));
			if(multResult == null)
				return (StringEntry) null; 
			
			addResult = EntryOps.addition(addResult,multResult);
			if(addResult == null)
				return (StringEntry) null; 
			
		
		}//end for 
		
		return addResult; 
	
	}//end dotProduct() 	
	
	
	
	public static NumVector crossProduct(NumVector vectorOne, NumVector vectorTwo)
	{
		
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		NumEntry result1 = EntryOps.multiplication( vectorOne.getEntry(2),vectorTwo.getEntry(3));
		if(result1 == null)
			return (NumVector) null; 
		
		NumEntry result12 = EntryOps.multiplication( vectorTwo.getEntry(2),vectorOne.getEntry(3) );
		if(result12 == null)
			return (NumVector) null;
			
		NumEntry listResult1 = EntryOps.addition(result1,result12);
		if(listResult1 == null)
			return (NumVector) null; 
	
		entryList.add(listResult1);
		
		
		NumEntry result2;
		result2 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(3));
		if(result2 == null)
			return (NumVector) null; 
		
		NumEntry result22 = EntryOps.multiplication(vectorTwo.getEntry(1),vectorOne.getEntry(3) );
		if(result22 == null)
			return (NumVector) null;
			
		NumEntry listResult2 = EntryOps.addition(result2,result22);
		if(listResult2 == null)
			return (NumVector) null; 		
		
		listResult2 = EntryOps.multiplication(listResult2, new NumEntry(-1,1));
		if(listResult2 == null)
			return (NumVector) null; 
			
		entryList.add(listResult2); 
		
	
		NumEntry result3;				
		result3 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(2));
		if(result2 == null)
			return (NumVector) null; 
		
		NumEntry result33 = EntryOps.multiplication(vectorTwo.getEntry(2),vectorOne.getEntry(1) );
		if(result33 == null)
			return (NumVector) null;
			
		NumEntry listResult3 = EntryOps.addition(result3,result33);
		if(listResult3 == null)
			return (NumVector) null; 		 
			
		entryList.add(listResult3);
		
		
		return new NumVector(entryList); 					
	
	
	}//end crossProduct() 
	
	
	
	public static StringVector crossProduct(StringVector vectorOne, StringVector vectorTwo)
	{
		
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
		
		StringEntry result1 = EntryOps.multiplication( vectorOne.getEntry(2),vectorTwo.getEntry(3));
		StringEntry result12 = EntryOps.multiplication( vectorTwo.getEntry(2),vectorOne.getEntry(3) );
		StringEntry listResult1 = EntryOps.addition(result1,result12);	
		entryList.add(listResult1);
		
		
		StringEntry result2 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(3));
		StringEntry result22 = EntryOps.multiplication(vectorTwo.getEntry(1),vectorOne.getEntry(3) );
		StringEntry listResult2 = EntryOps.addition(result2,result22);		
		listResult2 = EntryOps.multiplication(listResult2, new StringEntry("-1","1"));			
		entryList.add(listResult2); 
		
					
		StringEntry result3 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(2));
		StringEntry result33 = EntryOps.multiplication(vectorTwo.getEntry(2),vectorOne.getEntry(1) );
		StringEntry listResult3 = EntryOps.addition(result3,result33);
		entryList.add(listResult3);
		
		return new StringVector(entryList); 					
	
	}//end crossProduct() 
	
	
		
}//end VectorOps class 
