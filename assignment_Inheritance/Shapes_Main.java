package assignment_Inheritance;

class Shape
{
	int base;
	Shape(int base)
	{
		this.base=base;
	}
//	public void area()
//	{
//		System.out.print("Area is undefined");
//	}
//	public void perimeter()
//	{
//		System.out.print("Perimeter is undefined");
//	}
}
class Circle extends Shape
{
	Circle(int radius)
	{
		super(radius);
	}
	public void area()
	{
		System.out.println("Area of circle is "+(base*base*22)/7);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of circle is "+(2*base*22)/7);
	}
}
class Rectangle extends Shape
{
	int width;
	Rectangle(int length,int width)
	{
		super(length);
		this.width=width;
	}
	public void area()
	{
		System.out.println("Area of rectangle is "+(base*width));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle is "+2*(base+width));
	}
}
class Square extends Shape
{
	Square(int radius)
	{
		super(radius);
	}
	public void area()
	{
		System.out.println("Area of square is "+(base*base));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of square is "+(4*base));
	}
}
public class Shapes_Main {

	public static void main(String[] args) {
		Circle cir_obj=new Circle(4);
		cir_obj.area();
		cir_obj.perimeter();
		Rectangle rec_obj=new Rectangle(5,3);
		rec_obj.area();
		rec_obj.perimeter();
		Square sq_obj=new Square(4);
		sq_obj.area();
		sq_obj.perimeter();
	}

}
