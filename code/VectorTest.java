import java.util.ArrayList; 

public class VectorTest
{

	public static void main(String[] args)
	{
	
		//check references 
		if(refTest());
			System.out.println("refTest() PASSED."); 
		//check for ops
		opsTest(); 
	
	}//end main() 
	
	
	
	public static boolean refTest()
	{
	
		boolean returnBool = false; 
		
		//create a NumVector of zeros 
		ArrayList<NumEntry> numEntryList = new ArrayList<NumEntry>(); 
		
		NumEntry numberEntry = new NumEntry(0,0);
		
		numEntryList.add(numberEntry);  
		numEntryList.add(numberEntry);  
		numEntryList.add(numberEntry);  
		
		NumVector numberVector = new NumVector(numEntryList);
		
		NumVector newNumVector = numberVector.getVector(); 
		
		newNumVector.setEntry(1,new NumEntry(2,3));
		
		if(numberVector.getEntry(1).getDen() != 2)
			returnBool = true; 
						 			
	
		return returnBool; 	
	
	}//end refTest() 
	
	
	
	public static void opsTest()
	{
	
	
		ArrayList<NumEntry> numEntryList = new ArrayList<NumEntry>(); 
		
		NumEntry numberEntry = new NumEntry(0,0);
		
		numEntryList.add(numberEntry);  
		numEntryList.add(numberEntry);  
		numEntryList.add(numberEntry);  
		
		NumVector numberVector = new NumVector(numEntryList);
		
		NumVector newNumVector = numberVector.getVector(); 
		
		newNumVector.setEntry(1,new NumEntry(2,3));		
		
		
		VectorOps.addition(numberVector,newNumVector); 
	
	}//end opsTest() 
	
	
	

}//end VectorTest
