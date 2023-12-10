package _06_frogger;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class Frogger extends PApplet {
	
	boolean intersects(Car car) {
		 if ((y > car.getY() && y < car.getY()+50) &&
		                (x > car.getX() && x < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }
		 
		 
    static int WIDTH = 600;
    static int HEIGHT = 400;
    int x = 300;
    int y = 350;
    Car car;
    Car car1;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	int xpos = 450;
    	int carSize = 100;
    	int carSpeed = 7;
    	car = new Car(xpos, 50, carSize, carSpeed);
    	car1 = new Car(xpos, 200, carSize, carSpeed+3);
    }


	@Override
    public void draw() {
    	background(66, 132, 245);
    	fill(66, 245, 87);
    	ellipse(x, y, 50, 50);
    	ifOutsideCanvas();
    	car.display();
    	car.speed();
    	car.carOutside();
    	car.getX();
    	car1.display();
    	car1.speed();
    	car1.carOutside();
    	car1.getY();
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
    	else if (x >= 625) {
    		x = 300;
    	}
    	else if (y <= 0) {
    		y = 350;
    	}
    	else if (y >= 425) {
    		y = 350;
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
    	    rect(xpos , ypos,  carSize, 50);
    	  }
    	
    	void speed() {
    		xpos -= carSpeed;
    	}
    	
    	void carOutside() {
    		if(xpos <= -20) {
    			 xpos = 450;
    		}
    	}
    	
    	void getX() {
    		
    	}
    	
    	void getY() {
    		
    	}
    	
    	void getSize() {
    		
    	}

    }

}









