/*

Similar to our other cases we are going to have certain methods which will be 
abstract and others which will be concrete and rely on the concrete implementations
of the Vector and Entry abstract classes.  



getMatrix()
setMatrix()

getRowVector()
getColumnVector()
setRowVector()
setColumnVector() 
equal()
toString() 

*/

import java.util.ArrayList; 

public abstract class Matrix<T1 extends Matrix, T2 extends Vector, T3 extends Entry>
{
	
	
	ArrayList<T2> rowVectors = new ArrayList<T2>(); 
	ArrayList<T2> columnVectors = new ArrayList<T2>(); 
	int rowDimension; 
	int colDimension; 
	
	
	public Matrix(ArrayList<T2> rowVectorList)
	{
		
		
		
		for(int i = 0 ; i < rowVectorList.size() ; i++)
		{
			
			this.rowVectors.add(rowVectorList.get(i)); 
		
		}//end for  
		
		this.rowDimension = rowVectors.size(); 
		
		//rowsToColumns(this.rowVectors);
		
		//this.colDimension = this.columnVectors.size(); 
				
	}//end constructor 

	public int getRowDim()
	{
	
		return this.rowDimension; 
	
	}//end getRowDim()
	
	
	public int getColDim()
	{
		
		return this.colDimension; 
	
	}//end getColDim() 
	
	

	public abstract T1 getMatrix();
	
	
	public abstract void setMatrix(T1 otherMatrix); 	
	
	
	public abstract void rowsToColumns(ArrayList<T2> rowVectorList );

	
	
	public T2 getRowVector(int index)
	{
	
		return this.rowVectors.get(index-1);
		
	}//end getRowVector() 
	
	
	
	public T2 getColumnVector(int index)
	{
	
		return columnVectors.get(index-1); 
		
	}//end getColumnVector() 
	
	
	
	public void setRowVector(int index, T2 newVector)
	{
	
		rowVectors.set(index-1,newVector); 
	
		//reset the columnVectors
	
	}//end setRowVector
	
	
	
	public boolean equal(Matrix other)
	{
	
		boolean returnBoolean = false; 
	
		for(int i = 0 ; i < this.rowDimension ; i++)
		{
			
			if(!this.rowVectors.get(i).equals(other.rowVectors.get(i)))
				return false; 
			if(i == this.rowDimension -1)
				returnBoolean = true; 
			
		}//end for loop 
	
	
		return returnBoolean; 
		
	}//end equal() 




}//end Matrix class 
