package entities;

public class Course extends Base{
	private String courseName;
	private double price;
	private String instructore;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double Price) {
		this.price = price;
	}
	public String getInstructore() {
		return instructore;
	}
	public void setIntructore(String instructore) {
		this.instructore = instructore;
	}
	
}
