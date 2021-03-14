/*


The purpose of this class is to ensure that our classes work when they must 
interact with their operations as well as test certain properties of the 
objects themselves.  That is, that we have options for passing by reference 
and passing by value.


*/
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.math.BigInteger; 

public class EntryTest
{


	public static void main(String[] args)
	{

		ArrayList<NumEntry> numberEntList = new ArrayList<NumEntry>();  
		//testNumber Entries
 		//build test cases and test equal() method 
 		Scanner scan = testType(1);
 		numberEntList = buildNumTest(scan); 
 		if(checkNumEquals(numberEntList))
 			System.out.println("Test for numEntry equal() PASSED"); 
 		else
 		 	System.out.println("Test for numEntry equal() FAILED.");
		numberEntList.clear(); 
		
		
		//check getters  
		scan = testType(2);
		numberEntList = buildNumTest(scan); 
		if(checkNumGet(numberEntList))
			System.out.println("Test for numEntry get() PASSED.");
		else
			System.out.println("Test for numEntry get() FAILED.");
		numberEntList.clear(); 
		
		
		//check setters
		scan = testType(3);
		numberEntList = buildNumTest(scan); 
		if(checkNumSet(numberEntList))
			System.out.println("Test for numEntry set() PASSED.");
		else
			System.out.println("Test for numEntry set() FAILED.");
	
				
		
		
		
		ArrayList<StringEntry> stringEntList = new ArrayList<StringEntry>(); 
		
		//test StringEntries
		//test eqaul method
		scan = testType(1); 
		stringEntList = buildStringTest(scan);
		if(checkStringEquals(stringEntList))
			System.out.println("Test for stringEntry equal() PASSED."); 
		else
			System.out.println("Test for stringEntry equal() FAILED."); 
		stringEntList.clear(); 
		
		//test getters
		scan = testType(2);
		stringEntList = buildStringTest(scan);
		if(checkStringGet(stringEntList))
			System.out.println("Test for stringEntry get() PASSED");
		else   
			System.out.println("Test for stringEntry get() FAILED");
		stringEntList.clear(); 
				
		//test setters 
		scan = testType(3);
		stringEntList = buildStringTest(scan);
		if(checkStringSet(stringEntList)) 
			System.out.println("Test for stringEntry set() PASSED");
		else
			System.out.println("Test for stringEntry set() FAILED"); 
			
		 
		
	}//end main() 

		
	public static Scanner testType(int caseNumber)
	{
		
		try
		{
			Scanner scan; 
			switch(caseNumber)
			{
			
				case 1:
					File equalFile = new File("./TestCases/EntryTests/equals.txt");
					scan = new Scanner(equalFile);
					return scan;
					 
				case 2:
					File getFile = new File("./TestCases/EntryTests/get.txt");
					scan = new Scanner(getFile);
					return scan;
					  
				case 3:
					File setFile = new File("./TestCases/EntryTests/set.txt");
					scan = new Scanner(setFile);
					return scan;
					   
				default: 
					System.out.println("No such case"); 
			}//end switch
		
		}//end try 
		catch(FileNotFoundException e)
		{
		
			System.out.println("File not found "); 
		
		}//end catch 	
	
		return (Scanner) null; 
		
	}//end testCases() 
	 
	
	public static ArrayList<NumEntry> buildNumTest(Scanner scan)
	{
		
		//create a local arraylist
		ArrayList<NumEntry> localList = new ArrayList<NumEntry>(); 
		
		//number of cases 
		long numberOfCases = scan.nextLong(); 
		
		//create a new NumEntry and add it to the list
		for(;numberOfCases > 0; numberOfCases--)
			localList.add(new NumEntry((scan.nextLong()),scan.nextLong()));
			
		//return the list
		return localList; 
		
	}//end buildTest()
	

	public static ArrayList<StringEntry> buildStringTest(Scanner scan)
	{
		
		//create local arraylist
		ArrayList<StringEntry> localList = new ArrayList<StringEntry>(); 
		
		//number of cases 
		long numberOfCases = scan.nextLong(); 
		
		//create a new StringEntry and add it to the list
		for(;numberOfCases > 0; numberOfCases--)
		{
		
			Long num = scan.nextLong();
			Long den = scan.nextLong(); 
		
			localList.add(new StringEntry( num.toString() , den.toString() ) );		
		
		}//end for loop 

		
		//return the list 
		return localList; 
		
	}//end buildStringTest() 


	public static boolean checkNumEquals(ArrayList<NumEntry> testCases)
	{
	
		boolean returnBoolean = false; 
		
		int size = testCases.size(); 
		
		for(int index = 0 ; index < size; index += 2)
		{
		
			NumEntry case1 = testCases.get(index);
			NumEntry case2 = testCases.get(index + 1);

			if(index != 2)
			{
			
				if(!case1.equal(case2))
				{
				
					debug("equal()",(index + 1));
					System.out.println(case1.toString()); 
					System.out.println(case2.toString()); 
					break; 
							
				}//end if 
				
				if(index == size - 2)
				{
					
					returnBoolean = true; 
					
				}//end if 
						
			}
			else if(index == 2)
			{
				if(case1.equal(case2))
				{
					debug("equal()", 2);
					break;  
				 
				}//end if 

			}//end if 
		
		}//end for loop 
			
		return returnBoolean;
	
	}//end checkEquals()
	
	
	public static boolean checkStringEquals(ArrayList<StringEntry> testCases)
	{
	
		boolean returnBoolean = false; 
		
		int size = testCases.size(); 
		
		for(int index = 0 ; index < size; index += 2)
		{
		
			StringEntry case1 = testCases.get(index);
			StringEntry case2 = testCases.get(index + 1);

			if(index != 2)
			{
			
				if(!case1.equal(case2))
				{
				
					debug("equal()",(index + 1));
					System.out.println(case1.toString()); 
					System.out.println(case2.toString()); 
					break; 
							
				}//end if 
				
				if(index == size - 2)
				{
					
					returnBoolean = true; 
					
				}//end if 
						
			}
			else if(index == 2)
			{
				if(case1.equal(case2))
				{
					debug("equal()", 2);
					break;  
				 
				}//end if 

			}//end if 
		
		}//end for loop 
			
		return returnBoolean;	
	
	}//end checkStringEqual() 
	
	
	public static boolean checkNumGet(ArrayList<NumEntry> testCases)
	{
		 
		
		if(testCases.get(0).getNum() == 2 && testCases.get(0).getDen() == 3)
		{
			return true; 
		
		}//end if 
		else
		{
			
			return false; 
		
		}//end 
		
	}//end checkGet() 
	
	
	public static boolean checkStringGet(ArrayList<StringEntry> testCases)
	{
	
		if(testCases.get(0).equal(new StringEntry("2","3")))
			return true;
		else 
			return false; 	
		
	
	}//end checkStringGet() 
	
	
	public static boolean checkNumSet(ArrayList<NumEntry> testCases)
	{
			
		//create an entry
		NumEntry entry = new NumEntry(1,2);
		
		//change values and see if it matches list cases 
		entry.setNum(2);
		entry.setDen(3);
		if(!testCases.get(0).equal(entry))
		{
			
			debug("checkSet()",1);
			return false;  
			
		}
		
		entry.setNum(-1);
		entry.setDen(-3);
		if(!testCases.get(1).equal(entry))
		{
						
			debug("checkSet()",2);
			return false; 
		
		}//end if 
		
		entry.setNum(-1);
		entry.setDen(3); 
		
		if(!testCases.get(2).equal(entry))
		{
						
			debug("checkSet()",3);
			return false; 
		
		}//end if 		
		
		entry.setNum(1);
		entry.setDen(-3);
		if(!testCases.get(3).equal(entry))
		{
						
			debug("checkSet()",4);
			return false; 
		
		}//end if 
		
		return true; 
	
	}//end checkSet() 
		
		
	public static boolean checkStringSet(ArrayList<StringEntry> testCases)
	{
	
		//create an entry
		StringEntry entry = new StringEntry("1","2");
		
		//change values and see if it matches list cases 
		entry.setNum(new BigInteger("2"));
		entry.setDen(new BigInteger("3"));
		if(!testCases.get(0).equal(entry))
		{
			
			debug("checkSet()",1);
			return false;  
			
		}
		
		entry.setNum(new BigInteger("-1"));
		entry.setDen(new BigInteger("-3"));
		if(!testCases.get(1).equal(entry))
		{
						
			debug("checkSet()",2);
			return false; 
		
		}//end if 
		
		entry.setNum(new BigInteger("-1"));
		entry.setDen(new BigInteger("3")); 
		
		if(!testCases.get(2).equal(entry))
		{
						
			debug("checkSet()",3);
			return false; 
		
		}//end if 		
		
		entry.setNum(new BigInteger("1"));
		entry.setDen(new BigInteger("-3"));
		if(!testCases.get(3).equal(entry))
		{
						
			debug("checkSet()",4);
			return false; 
		
		}//end if 
		
		return true; 
		
	
	}//end checkStringSet() 
	
	
	public static void printPreview(ArrayList<NumEntry> testCases)
	{
	
		int size = testCases.size(); 
		
		for(int index = 0 ; index < size ; index++)
		{
		
			System.out.println(testCases.get(index).toString());
			
		}//end for 
	
	
	}//end printPreview() 
		
	
	public static void debug(String testName, int caseNumber)
	{
	
		System.out.println("Test " + testName + " case number " + caseNumber + " FAILED."); 
		
	
	}//end debug() 	


}//end EntryTest class 
