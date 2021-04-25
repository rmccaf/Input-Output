import java.util.ArrayList; 


public class StringMatrix extends Matrix<StringMatrix,StringVector,StringEntry>
{





	public StringMatrix(ArrayList<StringVector> vectors,boolean type)
	{
			
		super(vectors,type);

		
	}//end constructor
	
	
	
	public StringMatrix(StringMatrix newMatrix)
	{
	
		super(newMatrix);
	
	}//end constructor
	
		
	public StringMatrix getMatrix()
	{
 
 		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
		for(int i = 1 ; i <= this.rowDimension ; i++)
		{
			
			ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
			
			for(int j = 1 ; j <= this.colDimension  ; j++)
			{
				
				entryList.add(new StringEntry(getEntry(i,j)));
			
			}//end for 
		
			vectorList.add(new StringVector(entryList)); 
		
		}
		 
		return new StringMatrix(vectorList,true);
	
	}//end getMatrix() 
	
	public void setEntry(int rowIndex, int columnIndex,StringEntry newEntry)
	{
		//update the rowVector 
		getRowVector(rowIndex).setEntry(columnIndex,newEntry);
		
		//update the columnVector
		getColumnVector(columnIndex).setEntry(rowIndex,newEntry);
		
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


	public void rowsToColumns(ArrayList<StringVector> rows)
	{
	
		this.rowVectors = rows; 
		this.columnVectors.clear(); 
		rowsToColumns();
	
	}//end rowsToColumns
	
	
	public void colsToRows(ArrayList<StringVector> cols)
	{
	
		this.columnVectors = cols; 
		this.rowVectors.clear();
		colsToRows(); 
	
	}//end colsToRows() 	
	

}//end StringMatrix class 



