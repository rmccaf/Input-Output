public class VectorOpRequest implements Request<NumVector,VectorMemento>
{

	
	
	public  Result addition(NumVector operandOne, NumVector operandTwo)
	{
	
		VectorMemento mem1 = new VectorMemento(operandOne);
		VectorMemento mem2 = new VectorMemento(operandTwo);
		
		Result result = VectorOps.addition(operandOne,operandTwo);
		
		if(result instanceof OverFlowResult) 
			return VectorOps.addition(((NumVector)mem1.getMemento()).changeToString(),((NumVector)mem2.getMemento()).changeToString());
	
		return result; 
	}
	
	
	public  Result subtraction(NumVector operandOne, NumVector operandTwo)
	{
	
		VectorMemento mem1 = new VectorMemento(operandOne);
		VectorMemento mem2 = new VectorMemento(operandTwo);
		
		Result result = VectorOps.subtraction(operandOne,operandTwo);
		
		if(result instanceof OverFlowResult) 
			return VectorOps.subtraction(((NumVector)mem1.getMemento()).changeToString(),((NumVector)mem2.getMemento()).changeToString());
	
		return result; 
	}
	
	
	
	public  Result scalarMultiplication(NumEntry operandOne, NumVector operandTwo)
	{
		
		EntryMemento mem1 = new EntryMemento(operandOne);
		VectorMemento mem2 = new VectorMemento(operandTwo);
		
		Result result = VectorOps.scalarMultiplication(operandOne,operandTwo);
		
		if(result instanceof OverFlowResult) 
			return VectorOps.scalarMultiplication(((NumEntry)mem1.getMemento()).changeToString(),((NumVector)mem2.getMemento()).changeToString());

		return result; 
	}
	
	
	public  Result dotProduct(NumVector operandOne, NumVector operandTwo)
	{
	
		VectorMemento mem1 = new VectorMemento(operandOne);
		VectorMemento mem2 = new VectorMemento(operandTwo);
		
		Result result = VectorOps.dotProduct(operandOne,operandTwo);
		
		if(result instanceof OverFlowResult) 
			return VectorOps.dotProduct(((NumVector)mem1.getMemento()).changeToString(),((NumVector)mem2.getMemento()).changeToString());
		
		return result; 
		
	}//end dotProduct() 
	
	
	
	public  Result crossProduct(NumVector operandOne, NumVector operandTwo)
	{
	
		VectorMemento mem1 = new VectorMemento(operandOne);
		VectorMemento mem2 = new VectorMemento(operandTwo);
		
		Result result = VectorOps.crossProduct(operandOne,operandTwo);
		
		if(result instanceof OverFlowResult) 
			return VectorOps.crossProduct(((NumVector)mem1.getMemento()).changeToString(),((NumVector)mem2.getMemento()).changeToString());	
		
		return result; 
	
	}
	
	
	public VectorMemento createMemento(NumVector vector)
	{
		
		return new VectorMemento(vector); 
		
	}
	
	public EntryMemento createMemento(NumEntry entry)
	{
	
		return new EntryMemento(entry); 
	
	}//end createMemento() 

}//end request
