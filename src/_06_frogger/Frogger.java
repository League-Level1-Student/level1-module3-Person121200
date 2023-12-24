package _06_frogger;

import javax.swing.JOptionPane;

import _06_frogger.Frogger.Car;
import processing.core.PApplet;
import processing.core.PImage;


public class Frogger extends PApplet {
	PImage back;
	PImage carLeft;
	PImage carRight;
	PImage frog;
    static int WIDTH = 844;
    static int HEIGHT = 600;
    int x = 300;
    int y = 500 ;
    int score = 0;
    Car car;
    Car car1;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	int xpos = 450;
    	int carSize = 160;
    	int carSpeed = 7;
    	car = new Car(xpos, 150, carSize, carSpeed);
    	car1 = new Car(xpos, 300, carSize, carSpeed+3);
        back = loadImage("/Users/league/git/level1-module3-Person121200/src/_06_frogger/froggerBackground.png");
        carLeft = loadImage("/Users/league/git/level1-module3-Person121200/src/_06_frogger/carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("/Users/league/git/level1-module3-Person121200/src/_06_frogger/carRight.png");
        carRight.resize(160,100);
        frog = loadImage("/Users/league/git/level1-module3-Person121200/src/_06_frogger/frog.png");
        frog.resize(75,75);
    }


	@Override
    public void draw() {
    	fill(66, 245, 87);
        background(back);
        image (frog, x, y);
    	ifOutsideCanvas();
    	car.display();
    	car.speed();
    	car.carOutside();
    	car.getX();
    	car1.display();
    	car1.speed();
    	car1.carOutside();
    	car1.getY();
    	intersects(car);
    	intersects(car1);
    	if (intersects(car) == true || (intersects(car1) == true)) {
    		y = 500;
    		x = 300;
    		score =0;
    		JOptionPane.showMessageDialog(null, "YOU LOST!!!");
    		JOptionPane.showMessageDialog(null, "Click ok to play again.");
    		
    	}
    	fill(255, 255, 255);
	    rect(5 , 5,  75, 25);
	    fill(0, 0, 0);
	    text("Score: "+score, 15, 20);
	    textSize(10);
	    
	    
    	}
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	y-=40;
            }
            else if(keyCode == DOWN)
            {
            	y+=30;
            }
            else if(keyCode == RIGHT)
            {
                x+= 30;
            }
            else if(keyCode == LEFT)
            {
                x-= 30;
            }
        }
    }
    
    public void ifOutsideCanvas() {
    	if (x <= -25) {
    		x = 300;
    	}
    	else if (x >= WIDTH) {
    		x = WIDTH/2;
    	}
    	else if (y <= 0) {
    		y = HEIGHT-100;
    		score += 1;
    	}
    	else if (y >= HEIGHT-50) {
    		y = HEIGHT-100;
    	}
    }
    
	boolean intersects(Car car) {
		 if ((y > car.getY() && y < car.getY()+50) &&
		                (x > car.getX() && x < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }
	}
	

    
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    
    class Car{
    	int xpos;
    	int ypos;
    	int carSize;
    	int carSpeed;
    	
    	public Car(int xpos, int ypos, int carSize, int carSpeed) {
    		this.xpos = xpos;
    		this.ypos = ypos;
    		this.carSize = carSize;
    		this.carSpeed = carSpeed;
    	}
    	
    	void display() {
    	    fill(0, 255, 0);
            image (carLeft,xpos, ypos);

    	  }
    	
    	void speed() {
    		xpos -= carSpeed;
    	}
    	
    	void carOutside() {
    		if(xpos <= -20) {
    			 xpos = WIDTH;
    		}
    	}
    	
    	int getX() {
    		return xpos;
    	}
    	
    	int getY() {
    		return ypos;
    	}
    	
    	int getSize() {
    		return carSize;
    	}
    	
}


}










