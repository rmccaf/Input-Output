/*



*/


import java.lang.Math; 

public class EntryOps extends AbsEntryOps<NumEntry>
{


	public NumEntry addition(NumEntry entryOne, NumEntry entryTwo)
	{
		
	
		long numOne = entryOne.getNum() * entryTwo.getDen(); 
		long denOne = entryOne.getDen() * entryTwo.getDen(); 
		
		return new NumEntry(numOne + entryTwo.getNum(), denOne);		
	
	
	}//end addition 
	
	
	public StringEntry adddition(StringEntry entryOne, StringEntry entryTwo)
	{
	
		return entryOne; 
	
	}//end addition
		

}//end EntryOps
