/*

The purpose of the clss is to create a request object for 
an Operation. 

*/


public class EntryRequest<T extends NumEntry,M extends Memento<T>> extends Requestable
{
	
	
	M<T> memOne; 
	M<T> memTwo; 
 	
	public EntryRequest(M memOne,M memTwo)
	{
	
		this.memOne = memOne;
		this.memTwo = memTwo; 
	
	}//end EntryRequest
	
	
	
	public Result additionRequest(T entryOne, T entryTwo)
	{
		
		Result additionResult = EntryOps.addition(entryOne,entryTwo); 
		
		
		if(!additionResult instanceof EntryResult))
		{
			
			if(additionResult instanceof OverFlowResult )
			{
				
				additionResult = bigAddition(memOne.getMemento(),memTwo.getMemento()); 
				
				//return if okay
				if(additionResult instanceof EntryResult)
					return additionResult; 
					 
				//fallthough 	
			}	
			//else, return the result
			else
				return additionResult; 
		
		}//end if 
		
		
		return additionResult; 
		
		
	}//end addition()
	
	
	
	
	private static Result bigAddition(T entryOne, T entryTwo)
	{
		
		//convert entryOne and EntryTwo to Long objects 
		Long longArray[] = entryToLong(entryOne,entryTwo);
	
		//return reuslt
		return EntryOps.addition(new StringEntry(longArray[0].toString(),longArray[1].toString())
					,new StringEntry (longArray[2].toString(),longArray[3].toString() ) );
	
	}//end bigAddition() 

	
	
	private static Long[] entryToLong(T entryOne, T entryTwo)
	{
		
		//declare local long array 
		Long array[] = new [4]; 
		
		
		//change entryOne
		Long firstNumerator = new Long(entryOne.getNum()); 
		Long firstDenominator = new Long(entryOne.getNum());
		
		//store entryOne
		array[0] = firstNumerator; 
		array[1] = firstdenominator; 
		
		
		//change entryTwo 
		Long secondNumerator = new Long(entryTwo.getNum()); 
		Long secondDenominator = new Long(entryTwo.getNum());		
		
		//stor entryTwo
		array[2] = secondNumerator; 
 		array[3] = secondDenominator; 
 		
 		return array; 
		
		
	}//end entrytoLong() 
	
	


}//end class 
