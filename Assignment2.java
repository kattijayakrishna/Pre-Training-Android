abstract class Shape
{
	protected String color;
	protected boolean filled;

	public Shape()
	{}
	
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}

	public String getColor()
	{
		return this.color;
	}

	public void setColor(String color)
	{
		this.color=color;
	}

	public boolean isFilled()
	{
		return this.filled;
	}

	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
}

class Circle extends Shape
{
	protected double radius;

	public Circle()
	{
		super();
	}

	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}

	public Circle(double radius,String color, boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}

	public double getRadius()
	{
		return this.radius;
	}

	public void setRadius()
	{
		this.radius=radius;
	}

	public double getArea()
	{
		return 3.14 * this.radius * this.radius ;
	}	

	public double getPerimeter()
	{
		return 2 * 3.14 * this.radius;
	}

	public String toString()
	{
		if(this.isFilled())
		    return "Circle with radius" + this.radius + " is filled with " + this.color + "color" ;
		else
		    return "Circle with radius" + this.radius + " is not filled with any color" ;
	}
}

class Rectangle extends Shape
{
	protected double width;
	protected double length;
	
	public Rectangle()
	{
	    super();
	}
	
	public Rectangle(double width,double length)
	{
	    super();
	    this.width=width;
	    this.length=length;
	}
	
	public Rectangle(double width,double length,String color, boolean filled)
	{
	    super(color,filled);
	    this.width=width;
	    this.length=length;
	}
	
	public double getWidth()
	{
		return this.width;
	}

	public void setWidth(double width)
	{
		this.width=width;
	}
	
		public double getLength()
	{
		return this.length;
	}

	public void setLength(double length)
	{
		this.length=length;
	}
	
	public double getArea()
	{
	    return this.length * this.width ;
	}
	
	public double getPerimeter()
	{
	    return 2 * ( this.length + this.width ) ;
	}
	
	public String toString()
	{
		if(this.isFilled())
		    return "Rectangle with length " + this.length + "and width " + this.width + " is filled with " + this.color + "color" ;
		else
		    return "Rectangle with length " + this.length + "and width " + this.width + " is not filled with any color" ;
	}
}

class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    
    public Square(double side)
    {
        super(side,side);
    }
    
    public Square(double side,String color,boolean filled)
    {
        super(side,side,color,filled);
    }
    
    public double getSide()
    {
        return this.width;
    }
    
    public void setSide(double side)
    {
        this.width=this.length=side;
    }
    
    public void setWidth(double side)
    {
        this.width=this.length=side;
    }
    
    public void setLength(double side)
    {
        this.width=this.length=side;
    }
    
	public String toString()
	{
		if(this.isFilled())
		    return "Square with a Side " + this.length + " is filled with " + this.color + "color" ;
		else
		    return "Square with a Side " + this.length + " is not filled with " + this.color + "color" ;
	}    
}