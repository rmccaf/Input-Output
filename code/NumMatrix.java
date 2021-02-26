import java.util.ArrayList; 
public class NumMatrix extends Matrix<NumMatrix,NumVector,NumEntry>
{

	
	
	public NumMatrix(ArrayList<NumVector> rowVectorList)
	{
	
		super(rowVectorList); 
	
	}//end constructor 
	
	
	public NumMatrix getMatrix()
	{

		return new NumMatrix(this.rowVectors); 
	
	}//end getMatrix()
	
	public void rowsToColumns(ArrayList<NumVector> rowVectorList)
	{
		columnVectors.clear(); 
		
		//iterate through the first column 
		for(int j = 0 ; j < rowDimension ; j++)
		{
			ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 			
			
			for(int i = 0 ; i <= rowVectors.get(i).vectorLength()  ; i++)
			{
				entryList.add(rowVectors.get(i).getEntry(j+1)); 
			}//end for 
			
		columnVectors.set( j,new NumVector(entryList) );
			
	}//end for 
	
	}//end rowsToColumns() 
	 	
	public void setMatrix(NumMatrix other)
	{
	
		for(int i = 0 ; i < other.rowDimension ; i++)
		{
			this.rowVectors.set(i,other.rowVectors.get(i)); 
		
		}//end for loop
		
		this.rowDimension = other.rowVectors.size(); 
		
		//call the set col vectors method 
	
	}//end setMatrix() 
	

}//end class 
