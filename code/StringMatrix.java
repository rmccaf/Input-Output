import java.util.ArrayList; 


public class StringMatrix extends Matrix<StringMatrix,StringVector,StringEntry>
{

	ArrayList<StringVector> rowVectors; 
	ArrayList<StringVector> colVectors; 
	int rowDimension; 
	int colDimension; 




	public StringMatrix(ArrayList<StringVector> rowVectors)
	{
			
		super(rowVectors);

		
	}//end constructor
	
	
	
	public StringMatrix(StringMatrix newMatrix)
	{
	
		super(newMatrix);
	
	}//end constructor
	
		
	public StringMatrix getMatrix()
	{
		
		return new StringMatrix(this.rowVectors); 
	
	}//end getMatrix() 
	
	public void setEntry(int rowIndex, int columnIndex,StringEntry newEntry)
	{
	
		getRowVector(rowIndex).setEntry(columnIndex,newEntry);
	
	}//end setEntry
	
	
	
	public StringEntry getEntry(int rowIndex,int columnIndex)
	{
	
		return new StringEntry (getRowVector(rowIndex).getEntry(columnIndex)); 
	
	}//end getEntry() 
	
	
	public void colsToRows()
	{
	
	
		int localRowDim = this.columnVectors.get(0).vectorLength(); 


		for(int i = 1 ; i <= localRowDim ; i++)
		{
			
			ArrayList<StringEntry> localNumList = new ArrayList<StringEntry>(); 
		
			for(int j = 1 ; j <= this.colDimension ; j++)
			{
			
				localNumList.add(getColumnVector(j).getEntry(i)); 
			
			}//end for 
		
			this.rowVectors.add(new StringVector(localNumList)); 
		
		}//end for 	
	
	}//end colsToRows
	
	
	public void rowsToColumns()
	{
	
		int columnDimension = this.rowVectors.get(0).vectorLength(); 
		
		//iterate over the vector columns 
		for(int i = 1  ; i <= columnDimension ; i++)
		{
			ArrayList<StringEntry> localNumList = new ArrayList<StringEntry>(); 
		
			//iterate over the vector rows		
			for(int j = 1 ; j <= this.rowDimension ; j++)
			{
				
				localNumList.add(getRowVector(j).getEntry(i)); 
			
			}//end for 
			
			this.columnVectors.add(new StringVector(localNumList)); 
			
		}//end for
	
	
	}//end rowsToCols()


}//end StringMatrix class 



