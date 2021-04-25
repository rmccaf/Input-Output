public class MatrixOpRequest implements Request<NumMatrix,MatrixMemento>
{

	public Result addition(NumMatrix operandOne, NumMatrix operandTwo)
	{
		
		MatrixMemento mem1 = new MatrixMemento(operandOne);
		MatrixMemento mem2 = new MatrixMemento(operandTwo);
					
		Result localResult = MatrixOps.addition(operandOne,operandTwo);
	
		if(localResult instanceof OverFlowResult)
			return MatrixOps.addition(((NumMatrix)mem1.getMemento()).changeToString(),((NumMatrix)mem2.getMemento()).changeToString()); 
	
		return localResult; 
		
	}//end addition() 
	

	public Result subtraction(NumMatrix operandOne, NumMatrix operandTwo)
	{
		
		MatrixMemento mem1 = new MatrixMemento(operandOne);
		MatrixMemento mem2 = new MatrixMemento(operandTwo);
					
		Result localResult = MatrixOps.addition(operandOne,operandTwo);
	
		if(localResult instanceof OverFlowResult)
			return MatrixOps.subtraction(((NumMatrix)mem1.getMemento()).changeToString(),((NumMatrix)mem2.getMemento()).changeToString()); 
	
		return localResult; 
		
	}//end subtraction()
	
	
	public Result matrixMultiplication(NumMatrix operandOne, NumMatrix operandTwo)
	{
		
		MatrixMemento mem1 = new MatrixMemento(operandOne);
		MatrixMemento mem2 = new MatrixMemento(operandTwo);
					
		Result localResult = MatrixOps.matrixMultiplication(operandOne,operandTwo);
	
		if(localResult instanceof OverFlowResult)
			return MatrixOps.matrixMultiplication(((NumMatrix)mem1.getMemento()).changeToString(),((NumMatrix)mem2.getMemento()).changeToString()); 
	
		return localResult; 
		
	}//end addition() 	
	 	

	public Result scalarMultiplication(NumEntry operandOne, NumMatrix operandTwo)
	{
		
		EntryMemento mem1 = new EntryMemento(operandOne);
		MatrixMemento mem2 = new MatrixMemento(operandTwo);
					
		Result localResult = MatrixOps.scalarMultiplication(operandOne,operandTwo);
	
		if(localResult instanceof OverFlowResult)
			return MatrixOps.scalarMultiplication(((NumEntry)mem1.getMemento()).changeToString(),((NumMatrix)mem2.getMemento()).changeToString()); 
	
		return localResult; 
		
	}//end addition() 

	
	public MatrixMemento createMemento(NumMatrix matrix)
	{
		
		return new MatrixMemento(matrix); 
	
	}//end createMemento() 



	public EntryMemento createMemento(NumEntry entry)
	{
		
		return new EntryMemento(entry); 
	
	}//end createMemento()  
}//end class
