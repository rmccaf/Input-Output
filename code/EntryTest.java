/*


The purpose of this class is to ensure that our classes work when they must 
interact with their operations as well as test certain properties of the 
objects themselves.  That is, that we have options for passing by reference 
and passing by value.


*/


public class EntryTest
{


	public static void main(String[] args)
	{
	
		//run test for references
		if(referenceTest())
			System.out.println("referenceTest() PASSED."); 
		
		//run value test 
		
		//run test for calling ops
		operationsTest(); 
	
	}//end main() 
	
	
	//referenceTest 
	public static boolean referenceTest()
	{
	
		boolean returnValue = true; 
		
		//create entry values
		NumEntry numberEntry = new NumEntry(0,0);
		
		NumEntry entryToChange = numberEntry.getObj(); 
		
		
		entryToChange.setNum(2);
		entryToChange.setDen(3);
		
		//check the value of numberentry making sure it is still  0 0 
		if(numberEntry.getNum() != 0 && numberEntry.getDen() != 0)
			return false;
			
		//check the value of the entry to change make sure it is 2/3 
		if(entryToChange.getNum() != 2 && entryToChange.getDen() != 3)  
			return false; 
		
		
		//test string Entry
		
		
		
		
		return returnValue; 
			
	}//end reference test() 
	
	
	//calling operations test
	public static boolean operationsTest()
	{
		
		//test number entry 
		EntryOps.addition(new NumEntry(2,3) , new NumEntry(2,3) );
		
		
		//test string entry
		EntryOps.addition(new StringEntry("2","3"),new StringEntry("2","3")); 
		return true; 
	
	}//end operationsTest()


}//end EntryTest class 
