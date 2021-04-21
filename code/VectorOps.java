import java.util.ArrayList; 

public class VectorOps
{


	
	public static Result addition(NumVector vectorOne, NumVector vectorTwo)
	{
		
		//make sure vectors are of the correct length
		if(vectorOne.vectorLength() != vectorTwo.vectorLength())
			return new DimensionMisMatchResult(); 
		
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		int length = vectorOne.vectorLength(); 
			
		for(int index = 1 ; index <= length  ; index++)
		{
			
			Result result = EntryOps.addition(vectorOne.getEntry(index),vectorTwo.getEntry(index)); 
			if(!(result instanceof EntryResult))
				return result;
				 
			result = (EntryResult)result; 	
			entryList.add((NumEntry)result.getResult()); 
			
		}//end for 
	
		return new VectorResult(new NumVector(entryList)); 
	
	}//end addition() 	

	
	
	public static Result addition(StringVector vectorOne, StringVector vectorTwo)
	{
		
		//make sure vectors are of the correct length
		if(vectorOne.vectorLength() != vectorTwo.vectorLength())
			return new DimensionMisMatchResult(); 
		
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 

		int length = vectorOne.vectorLength(); 
	
		for(int index = 1 ; index <= length  ; index++)
		{
			
			Result result = EntryOps.addition(vectorOne.getEntry(index),vectorTwo.getEntry(index)); 
			if(!(result instanceof EntryResult))
				return result; 
				
			result = (EntryResult)result; 
			entryList.add((StringEntry)result.getResult()); 
			
		}//end for 
	
		return new VectorResult(new StringVector(entryList)); 
	
	}//end addition()
	
	
	
	public static Result scalarMultiplication(NumEntry entry, NumVector vector)
	{
	
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>();
		
		int length = vector.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			Result result = EntryOps.multiplication(vector.getEntry(index),entry); 
		
			if(!(result instanceof EntryResult))
				return result; 
			
			result = (EntryResult)result; 
			
			entryList.add((NumEntry)result.getResult());
		
		}//end for 
		
		return new VectorResult( new NumVector(entryList));
		 
	}//end scalarMultiplication() 
	
	
	
	public static Result scalarMultiplication(StringEntry entry, StringVector vector)
	{
	
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>();
		
		int length = vector.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			Result result = EntryOps.multiplication(vector.getEntry(index),entry); 
		
			if(!(result instanceof EntryResult))
				return result; 
			
			result = (EntryResult)result; 
				
			entryList.add((StringEntry)result.getResult());
		
		}//end for 
		
		return new VectorResult(new StringVector(entryList));
		 
	}//end scalarMultiplication() 

	
	
	public static Result subtraction(NumVector vectorOne, NumVector vectorTwo)
	{
		
		Result result = scalarMultiplication(new NumEntry(-1,1), vectorTwo);
		
		if(!(result instanceof VectorResult))
			return result; 
		
		result = (VectorResult)result; 
			 
		result = addition(vectorOne,(NumVector)result.getResult());
		
		if(!(result instanceof EntryResult))
			return result; 
			
		return result; 		
		
	}//end subtraction() 
	
	
	
	public static Result subtraction(StringVector vectorOne, StringVector vectorTwo)
	{
		
		Result result = scalarMultiplication(new StringEntry("-1","1"), vectorTwo);
		
		if(!(result instanceof VectorResult))
			return result; 
			 
		result = addition(vectorOne,(StringVector)result.getResult());
		
		if(!(result instanceof VectorResult))
			return result; 
			
		return result; 		
		
	}//end subtraction()
	
	
	
	public static Result dotProduct(NumVector vectorOne, NumVector vectorTwo)
	{
	
		Result addResult = (Result) new EntryResult(new NumEntry(0,1)); 
		int length = vectorOne.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			Result multResult = EntryOps.multiplication(vectorOne.getEntry(index),vectorTwo.getEntry(index));
			if(!(multResult instanceof EntryResult))
				return multResult; 
			
			multResult = (EntryResult)multResult; 
			
			addResult = EntryOps.addition((NumEntry)addResult.getResult(),(NumEntry)multResult.getResult());
			
			if(!(addResult instanceof EntryResult))
				return addResult; 
			
		}//end for 
		
		return addResult; 
	
	}//end dotProduct() 
	
	

	public static Result dotProduct(StringVector vectorOne, StringVector vectorTwo)
	{
	
		Result addResult = (Result)new EntryResult(new StringEntry("0","1")); 
		int length = vectorOne.vectorLength(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
		
			Result multResult = EntryOps.multiplication(vectorOne.getEntry(index),vectorTwo.getEntry(index));
			if(!(multResult instanceof EntryResult))
				return multResult; 
			
			multResult = (EntryResult)multResult; 
			
			addResult = EntryOps.addition((StringEntry)addResult.getResult(),(StringEntry)multResult.getResult());
			if(!(addResult instanceof EntryResult))
				return addResult; 
			
		
		}//end for 
		
		return addResult; 
	
	}//end dotProduct() 	
	
	
	
	public static Result crossProduct(NumVector vectorOne, NumVector vectorTwo)
	{
		
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		Result result1 = EntryOps.multiplication( vectorOne.getEntry(2),vectorTwo.getEntry(3));
		if(!(result1 instanceof EntryResult))
			return result1; 
		
		Result result12 = EntryOps.multiplication( vectorTwo.getEntry(2),vectorOne.getEntry(3) );
		if(!(result12 instanceof EntryResult))
			return result12; 
			
		Result listResult1 = EntryOps.subtraction((NumEntry)result1.getResult(),(NumEntry)result12.getResult());
		if(!(listResult1 instanceof EntryResult) )
			return listResult1; 
	
		entryList.add((NumEntry)listResult1.getResult());
		
		
		Result result2;
		result2 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(3));
		if(!(result2 instanceof EntryResult))
			return result2; 
		
		Result result22 = EntryOps.multiplication(vectorTwo.getEntry(1),vectorOne.getEntry(3) );
		if(!(result22 instanceof EntryResult))
			return result22;
			
		Result listResult2 = EntryOps.subtraction((NumEntry)result2.getResult(),(NumEntry)result22.getResult());
		if(!(listResult2 instanceof EntryResult))
			return listResult2; 
				
		listResult2 = EntryOps.multiplication((NumEntry)listResult2.getResult(), new NumEntry(-1,1));
		if(!(listResult2 instanceof EntryResult))
			return listResult2; 
			
		entryList.add((NumEntry)listResult2.getResult()); 
		
	
		Result result3;				
		result3 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(2));
		if(!(result3 instanceof EntryResult))
			return result3; 
		
		Result result33 = EntryOps.multiplication(vectorTwo.getEntry(1),vectorOne.getEntry(2) );
		if(!(result33 instanceof EntryResult))
			return result33;
			
		Result listResult3 = EntryOps.subtraction((NumEntry)result3.getResult(),(NumEntry)result33.getResult());
		if(!(listResult3 instanceof EntryResult))
			return listResult3; 		 
			
		entryList.add((NumEntry)listResult3.getResult());
		
		
		return new VectorResult(new NumVector(entryList)); 					
	
	
	}//end crossProduct() 
	
	
	
	public static Result crossProduct(StringVector vectorOne, StringVector vectorTwo)
	{
		
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
		
		Result result1 = EntryOps.multiplication( vectorOne.getEntry(2),vectorTwo.getEntry(3));
		Result result12 = EntryOps.multiplication( vectorTwo.getEntry(2),vectorOne.getEntry(3) );
		Result listResult1 = EntryOps.subtraction((StringEntry)result1.getResult(),(StringEntry)result12.getResult());	
		entryList.add((StringEntry)listResult1.getResult());
		
		
		Result result2 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(3));
		Result result22 = EntryOps.multiplication(vectorTwo.getEntry(1),vectorOne.getEntry(3) );
		Result listResult2 = EntryOps.subtraction((StringEntry)result2.getResult(),(StringEntry)result22.getResult());		
		listResult2 = EntryOps.multiplication((StringEntry)listResult2.getResult(), new StringEntry("-1","1"));			
		entryList.add((StringEntry)listResult2.getResult()); 
		
					
		Result result3 = EntryOps.multiplication(vectorOne.getEntry(1),vectorTwo.getEntry(2));
		Result result33 = EntryOps.multiplication(vectorTwo.getEntry(2),vectorOne.getEntry(1) );
		Result listResult3 = EntryOps.subtraction((StringEntry)result3.getResult(),(StringEntry)result33.getResult());
		entryList.add((StringEntry)listResult3.getResult());
		
		return new VectorResult( new StringVector(entryList)); 					
	
	}//end crossProduct() 
	
	
		
}//end VectorOps class 
