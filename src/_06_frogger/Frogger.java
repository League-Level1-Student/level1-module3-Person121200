package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static int WIDTH = 600;
    static int HEIGHT = 400;
    int x = 300;
    int y = 350;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	Car car = new Car();
    	car.display();
    }


	@Override
    public void draw() {
    	background(66, 132, 245);
    	fill(66, 245, 87);
    	ellipse(x, y, 50, 50);
    	ifOutsideCanvas();
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	y-=25;
            }
            else if(keyCode == DOWN)
            {
            	y+=25;
            }
            else if(keyCode == RIGHT)
            {
                x+= 25;
            }
            else if(keyCode == LEFT)
            {
                x-= 25;
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
}
