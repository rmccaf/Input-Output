public class EntryOpRequest implements Request<NumEntry,EntryMemento>
{
		
	
	
	public Result addition(NumEntry operandOne, NumEntry operandTwo)
	{
		
		
		//create memento object
		EntryMemento mem1 = createMemento(operandOne);
		EntryMemento mem2 = createMemento(operandTwo);
		  
		//do numAddition first
		Result result = EntryOps.addition(operandOne, operandTwo); 
		
		//check if result is overflow case 
		if(result instanceof OverFlowResult)
			return EntryOps.addition(((NumEntry)mem1.getMemento()).changeToString(),((NumEntry)mem2.getMemento()).changeToString());
			
		return result; 
	}//end addition()
	
	
	
	public  Result subtraction(NumEntry operandOne,NumEntry operandTwo)
	{
	
		//create memento object
		EntryMemento mem1 = createMemento(operandOne);
		EntryMemento mem2 = createMemento(operandTwo);
		  
		//do numAddition first
		Result result  = EntryOps.subtraction(operandOne, operandTwo); 
		
		//check if result is overflow case 
		if(result instanceof OverFlowResult)
			return EntryOps.subtraction(((NumEntry)mem1.getMemento()).changeToString(),((NumEntry)mem2.getMemento()).changeToString());
		
		return result; 
	}//end subtraction()
	
	
	
	public  Result multiplication(NumEntry operandOne,NumEntry operandTwo)
	{
	
		//create memento object
		EntryMemento mem1 = createMemento(operandOne);
		EntryMemento mem2 = createMemento(operandTwo);
		  
		//do numAddition first
		Result result = EntryOps.multiplication(operandOne, operandTwo); 
		
		//check if result is overflow case 
		if(result instanceof OverFlowResult)
			return EntryOps.multiplication(((NumEntry)mem1.getMemento()).changeToString(),((NumEntry)mem2.getMemento()).changeToString());
		
		return result; 
	}//end multiplication()
	
	
	
	public  Result division(NumEntry operandOne,NumEntry operandTwo)
	{

		//create memento object
		EntryMemento mem1 = createMemento(operandOne);
		EntryMemento mem2 = createMemento(operandTwo);
		  
		//do numAddition first
		Result result = EntryOps.division(operandOne, operandTwo); 
		
		//check if result is overflow case 
		if(result instanceof OverFlowResult)
			return EntryOps.division(((NumEntry)mem1.getMemento()).changeToString(),((NumEntry)mem2.getMemento()).changeToString());	
		
		return result; 
	}//end division() 
	
	
	public EntryMemento createMemento(NumEntry entry)
	{
		
		return new EntryMemento(entry); 
		
	}//end getMemento

}//end class 
