package _06_frogger;
import processing.core.PApplet;

public class Car extends PApplet{
	int xpos = 0;
	int ypos = 0;
	int carSize = 0;
	int carSpeed = 0;
	
	public Car() {
		this.xpos = xpos;
		this.ypos = ypos;
		this.carSize = carSize;
		this.carSpeed = carSpeed;
	}
	
	public void display() {
	    fill(0, 255, 0);
	    rect(xpos , ypos,  carSize, 50);
	  }


}
