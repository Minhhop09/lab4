public class Circle {
	private double radio;
	private String color;
	
	public Circle() {
		super();
	}

	public Circle(double radio, String color) {
		super();
		this.radio = radio;
		this.color = color;
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public double getArea(){
        return 3.14159265358979*this.radio*this.radio;
    }
    
	@Override
    public void toString() {
		String toString = "Color: " + this.color + "Radio: " + this.radio;
        System.out.println(toString);
		
    }
}

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
	}

	public Cylinder(double radio, String color, double height) {
		super(radio, color, height);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}	

    public double getVolume(){
        return this.getArea()*this.height;
    }
}


