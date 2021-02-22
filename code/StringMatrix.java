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
	
	
	
	public StringMatrix getMatrix()
	{
		
		return new StringMatrix(this.rowVectors); 
	
	}//end getMatrix() 
	
	
	public void rowsToColumns(ArrayList<StringVector> rowVectors)
	{
		
		columnVectors.clear(); 
		
		//iterate through the first column 
		for(int j = 0 ; j < rowDimension ; j++)
		{
		
			ArrayList<StringEntry> entryList = new ArrayList<StringEntry>(); 
		
			for(int i = 0 ; i <= this.rowVectors.get(i).vectorLength()  ; i++)
			{
						
				entryList.add(rowVectors.get(i).getEntry(j+1)); 
			
			}//end for 
			
			columnVectors.set( j,new StringVector(entryList) );
			
		}//end for 		
	
	}//end rowsToColumns

	public void setMatrix(StringMatrix other)
	{
	
		for(int i = 0 ; i < other.rowDimension ; i++)
		{
			
			this.rowVectors.set(i,other.rowVectors.get(i)); 
			
		}//end for
		
		this.rowDimension = this.rowVectors.size(); 
		
		//build columns
		
	}//end setMatrix() 



}//end StringMatrix class 



