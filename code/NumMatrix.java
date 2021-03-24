import java.util.ArrayList; 
public class NumMatrix extends Matrix<NumMatrix,NumVector,NumEntry>
{

	
	
	public NumMatrix(ArrayList<NumVector> rowVectorList)
	{
	
		super(rowVectorList); 
	
	}//end constructor 
	
	
	public NumMatrix(NumMatrix newMatrix)
	{
	
		super(newMatrix);
	
	}//end constructor
	
	
	
	public NumMatrix getMatrix()
	{

		return new NumMatrix(this.rowVectors); 
	
	}//end getMatrix()
	
	
	public NumEntry getEntry(int rowIndex, int columnIndex)
	{
	
		return getRowVector(rowIndex).getEntry(columnIndex);
	
	}//end getEntry() 
	
	
	
	public void setEntry(int rowIndex, int columnIndex, NumEntry newEntry)
	{
	
	
	
	}//end setEntry() 
	
	
	public void rowsToColumns()
	{
		
		int columnDimension = this.rowVectors.get(0).vectorLength(); 
		
		//iterate over the vector columns 
		for(int i = 1  ; i <= columnDimension ; i++)
		{
			ArrayList<NumEntry> localNumList = new ArrayList<NumEntry>(); 
		
			//iterate over the vector rows		
			for(int j = 1 ; j <= this.rowDimension ; j++)
			{
				
				localNumList.add(getRowVector(j).getEntry(i)); 
			
			}//end for 
			
			this.columnVectors.add(new NumVector(localNumList)); 
			
		}//end for

	
	}//end rowsToColumns() 
	
	
	
	public void colsToRows()
	{
	
		int localRowDim = this.columnVectors.get(0).vectorLength(); 


		for(int i = 1 ; i <= localRowDim ; i++)
		{
			
			ArrayList<NumEntry> localNumList = new ArrayList<NumEntry>(); 
		
			for(int j = 1 ; j <= this.colDimension ; j++)
			{
			
				localNumList.add(getColumnVector(j).getEntry(i)); 
			
			}//end for 
		
			this.rowVectors.add(new NumVector(localNumList)); 
		
		}//end for 
	
	}//end columnsToRows() 
	

}//end class 
