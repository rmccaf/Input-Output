import java.util.ArrayList; 
public class NumMatrix extends Matrix<NumMatrix,NumVector,NumEntry>
{

	
	
	public NumMatrix(ArrayList<NumVector> vectorList,boolean type)
	{
	
		super(vectorList,type); 
	
	}//end constructor 
	
	
	public NumMatrix(NumMatrix newMatrix)
	{
	
		super(newMatrix);
	
	}//end constructor
	
	
	
	public NumMatrix getMatrix()
	{
		ArrayList<NumVector> vectorList = new ArrayList<NumVector>(); 
		for(int i = 1 ; i <= this.rowDimension ; i++)
		{
			
			ArrayList<NumEntry> entryList = new ArrayList<NumEntry>(); 
			
			for(int j = 1 ; j <= this.colDimension  ; j++)
			{
				
				entryList.add(new NumEntry(getEntry(i,j)));
			
			}//end for 
		
			vectorList.add(new NumVector(entryList)); 
		
		}
		 
		return new NumMatrix(vectorList,true);
		 
	}//end getMatrix()
	
	
	public NumEntry getEntry(int rowIndex, int columnIndex)
	{
	
		return getRowVector(rowIndex).getEntry(columnIndex);
	
	}//end getEntry() 
	
	
	
	public void setEntry(int rowIndex, int columnIndex, NumEntry newEntry)
	{
	
		//update the rowVector 
		getRowVector(rowIndex).setEntry(columnIndex,newEntry);
		
		//update the columnVector
		getColumnVector(columnIndex).setEntry(rowIndex,newEntry);

	
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
	
	
	public void rowsToColumns(ArrayList<NumVector> rows)
	{
	
		this.rowVectors = rows; 
		this.columnVectors.clear(); 
		rowsToColumns();
	
	}//end rowsToColumns
	
	public void colsToRows(ArrayList<NumVector> cols)
	{
	
		this.columnVectors = cols; 
		this.rowVectors.clear();
		colsToRows(); 
	
	}//end colsToRows() 	
	
	
	public StringMatrix changeToString()
	{
		
		
		ArrayList<StringVector> vectorList = new ArrayList<StringVector>(); 
	
		
		for(int i = 0 ; i < this.rowDimension ; i++)
		{
		
			vectorList.add(this.rowVectors.get(i).changeToString()); 		
				
		}//end for 
		
		return new StringMatrix(vectorList,true);
	
	}//end changeToString() 

}//end class 
