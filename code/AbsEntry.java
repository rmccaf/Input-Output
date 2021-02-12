public abstract class AbsEntry<T>
{


	T num; 
	T den; 
	
	
	public AbsEntry(T num, T den)
	{
	
		this.num = num; 
		
		this.den = den; 
	
	}//end Constructor
	

	public abstract AbsEntry getEnt();
	
	public abstract T getNum();
		
	public abstract T getDen();
	
	public abstract  void setEnt(AbsEntry entry);
	
	public abstract void setNum(T num);

	public abstract  void setDen(T den); 
		
	public abstract String toString();
	
	public abstract boolean equalEnt(AbsEntry entry);
	

}//end abstract class Entry
