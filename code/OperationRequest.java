/*

The purpose of the class is to make a request to the various ops 
involved in making a calculation.  The idea is that the request
acts as server to the UI client interface.  The job of the 
program is to report errors, and to report back it will have to 
request a mememto of the object and repeat the calculation.  

*/


public class OperationRequest<M extends Memento,T1 extends Entry,T2 extends Vector,T3 extends Matrix>
{

	T3 matrixOne; 
	T3 matrixTwo; 
	T2 vectorOne; 
	T2 vectorTwo; 
	T1 entryOne; 
	T1 entryTwo; 
	M memOne; 
	M memTwo; 
	
	
	
	
	/*
	
	
	*/
	private M createEntryMem(T1 entry)
	{
	
		return new EntryMemento(entry); 
	
	}//end 

	
	
	private M ereateVectorMem(T2 vector)
	{
	
		return new VectorMemento(vector); 	
	
	}//end createVectorMem() 
	
	
	
	
	
	
	
	

}//end class
