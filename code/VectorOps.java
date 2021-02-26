import java.util.ArrayList; 

public class VectorOps
{

	public static NumVector addition(NumVector vectorOne, NumVector vectorTwo)
	{
	
		int length = vectorOne.vectorLength(); 
		
		ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
		
		for(int index = 1 ; index <= length ; index++)
		{
			
			entryList.add(EntryOps.addition(vectorOne.getEntry(index),vectorTwo.getEntry(index)));
		
		}//end for 
	
	
		return new NumVector(entryList); 
	
	}//end addition 

	
	public static StringVector addition(StringVector vectorOne, StringVector vectorTwo)
	{
	
		int length = vectorOne.vectorLength(); 
		
		ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
		for(int index = 1 ; index <= length  ; index++)
		{
		
			entryList.add(EntryOps.addition(vectorOne.getEntry(index),vectorTwo.getEntry(index))); 	
		
		}//end for loop 
	
	
		return new StringVector(entryList); 
	
	}//end addition() 

}//end VectorOps class 
