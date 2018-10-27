/*
 * Cell.java is a representation of every block on the grid for path finding.
 * This cell stores the position, calculations (f,g,h), parents, and determine
 * equalities to other cells.
 */

//Done.
public class Cell
{
	private int x;
	private int y;
	private int g;
	private int h;
	private int f;
	private Cell parent;
	
	//Getters
	public Cell(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
		
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getG()
	{
		return g;
	}
	public int getH()
	{
		return h;
	}
	public int getF()
	{
		return f;
	}
	
	public Cell getCell()
	{
		return parent;
	}
	
	//Setter
	public void setX(int newX)
	{
		this.x = newX;
	}
	
	public void getY(int newY)
	{
		this.y = newY;
	}
	
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void getG(int newG)
	{
		this.g = newG;
	}
	public void setG(int g)
	{
		this.g = g;
	}
	public void getH(int newH)
	{
		this.h = newH;
	}
	public void getF(int newF)
	{
		this.f = newF;
	}
	public void setF(int f)
	{
		this.f = f;
	}
	public void setH(int h)
	{
		this.h = h;
	}
	public Cell getParent()
	{
		return parent;
	}
	public void setParent(Cell parent)
	{
		this.parent = parent;
	}
	
	public void getCell(Cell newCell)
	{
		this.parent = newCell;
	}
	
	
	
	//Cell checker
	public static boolean isEqual(Cell left, Cell right)
	{
		return(left.getX() == right.getX() && left.getY() == right.getY())? true:false;
	}
}