package lab8week8;

public abstract class TwoDShape extends Shape
{
	private String name;
	private String colour;
	
	public TwoDShape(String name, String colour) {
	super(name, colour);
  	{ 
  		this.name = name; 
  		this.colour = colour; 
  	} 
	}
  	public String toString()
  	{
  		return ("---\nShape Name = " + this.name + "\nShape colour = " + this.colour);
  	}
  	
  	public abstract double area();
}