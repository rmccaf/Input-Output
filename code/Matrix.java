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
	
	
	public Matrix(ArrayList<T2> vectorList,boolean vectorType)
	{
		
		if(vectorType)
		{
		
			for(int i = 0 ; i < vectorList.size() ; i++)
			{
			
				this.rowVectors.add(vectorList.get(i)); 
		
			}//end for  

			this.rowDimension = vectorList.size(); 
		
			rowsToColumns();
		
			this.colDimension = this.columnVectors.size(); 
		
		}//end if
		else
		{
			
			for(int i = 0 ; i < vectorList.size() ; i++)
				this.columnVectors.add(vectorList.get(i));
				
			this.colDimension = this.columnVectors.size();
			 
			colsToRows(); 
			
			this.rowDimension = this.rowVectors.size(); 
			
		}//end else 

				
	}//end constructor 



	public Matrix(Matrix<T1,T2,T3> otherMatrix)
	{
		
		this.rowDimension = otherMatrix.getRowDim(); 	
	
		for(int i = 1 ; i <= this.rowDimension ; i++)
		{
		
			this.rowVectors.add(otherMatrix.getRowVector(i)); 
		
		}//end for loop 
	
		this.colDimension = otherMatrix.getColDim(); 
	
		for(int i = 1 ; i <= this.colDimension ; i++)
		{
		
			this.columnVectors.add(otherMatrix.getColumnVector(i));
		
		}//end for loop 
		
	
	
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
	
	
	public void setMatrix(Matrix<T1,T2,T3> otherMatrix)
	{
	
		this.rowVectors.clear(); 
		
		this.rowDimension = otherMatrix.getRowDim(); 
		
		for(int i = 1 ; i <= this.rowDimension ; i++)
		{
			
			this.rowVectors.add(otherMatrix.getRowVector(i)); 
			
		}//end for
		
		this.colDimension = otherMatrix.getColDim(); 
		
		for(int i = 1 ; i <= this.colDimension ; i++)
		{
		
			this.columnVectors.add(otherMatrix.getRowVector(i));
		
		}//end for  
	
	
	}//setMatrix() 

	
	public abstract void rowsToColumns();

	

	public abstract void colsToRows();
  
	
	
	
	public T2 getRowVector(int index)
	{
	
		return this.rowVectors.get(index - 1); 
	
	}//end getRowVector() 
	
	
	public T2 getColumnVector(int index)
	{
	
		return this.columnVectors.get(index - 1);
		
	}//end setRowVector() 
 	
	
	public void setRowVector(int index, T2 newVector)
	{
	
		this.rowVectors.set(index-1,newVector); 
	
		//reset the columnVectors
	
	}//end setRowVector
	
	
	public void setColumnVector(int index, T2 newVector)
	{
		
		this.columnVectors.set(index - 1 , newVector); 
	
	}//end setColumnVector() 
	
	
	public abstract T3 getEntry(int rowIndex, int colIndex); 

	
	
	public abstract void setEntry(int rowIndex, int colIndex, T3 newEntry); 
	
	
	public boolean equal(Matrix other)
	{
	
		boolean returnBoolean = false; 
		
		if(this.rowDimension != other.rowDimension || this.colDimension != other.colDimension)
			return false; 
			
		
	
		for(int i = 1 ; i <= this.rowDimension ; i++)
		{
			
			if(getRowVector(i).equal(other.getRowVector(i)) == false)
			{
							
				return false; 
			
			}

			if(i == this.rowDimension)
				returnBoolean = true; 
			
		}//end for loop 
	
	
		return returnBoolean; 
		
	}//end equal() 


	public String toString()
	{
		String returnString = " ";  
	
		for(int i = 1 ; i <= this.rowDimension  ;i++)
		{
			
			returnString += getRowVector(i).toString() + "\n";
		
		}//end for 
	
		return returnString; 
	
	}//end toString() 
	
	

}//end Matrix class 
