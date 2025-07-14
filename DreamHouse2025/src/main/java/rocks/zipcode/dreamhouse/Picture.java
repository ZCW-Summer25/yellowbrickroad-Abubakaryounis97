package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square background;
    private Square grass;
    private Square wall1;
    private Square wall2;
    private Square wall3;
    private Square line;
    private Square line2;
    private Triangle roof1;
    private Triangle roof2;
    private Square door;
    private Square window2;
    private Square window3;
    private Square car1;
  


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.moveHorizontal(-100);
        background.moveVertical(-50);
        background.changeSize(400,400);
        background.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-70);
        sun.changeSize(100);
        sun.makeVisible();


        grass = new Square();
        grass.changeColor("green");
        grass.moveVertical(250);
        grass.moveHorizontal(0);
        grass.changeSize(300,50);
        grass.makeVisible();

        
        wall1 = new Square();
        wall1.changeColor("white");
        wall1.moveVertical(150);
        wall1.moveHorizontal(0);
        wall1.changeSize(50,100);
        wall1.makeVisible();
        
         wall2 = new Square();
        wall2.changeColor("white");
        wall2.moveVertical(100);
        wall2.moveHorizontal(50);
        wall2.changeSize(100,150);
        wall2.makeVisible();

        wall3 = new Square();
        wall3.changeColor("white");
        wall3.moveVertical(150);
        wall3.moveHorizontal(150);
        wall3.changeSize(50,100);
        wall3.makeVisible();

         line = new Square();
        line.changeColor("black");
        line.moveVertical(100);
        line.moveHorizontal(50);
        line.changeSize(3,150);
        line.makeVisible();

        line2 = new Square();
        line2.changeColor("black");
        line2.moveVertical(100);
        line2.moveHorizontal(150);
        line2.changeSize(3,150);
        line2.makeVisible();


        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.changeColor("black");
        roof.moveHorizontal(100);
        roof.moveVertical(50);
        roof.makeVisible(); 

        roof1 = new Triangle();
        roof1.changeSize(25, 90);
        roof1.changeColor("red");
        roof1.moveHorizontal(15);
        roof1.moveVertical(125);
        roof1.makeVisible(); 

        roof2 = new Triangle();
        roof2.changeSize(25, 70);
        roof2.changeColor("red");
        roof2.moveHorizontal(175);
        roof2.moveVertical(125);
        roof2.makeVisible(); 

    
        window = new Square();
        window.changeSize(60, 60);
        window.changeColor("cyan");
        window.moveHorizontal(70);
        window.moveVertical(110);
        window.makeVisible();

        door = new Square();
        door.changeColor("gray");
        door.moveVertical(200);
        door.moveHorizontal(90);
        door.changeSize(25,50);
        door.makeVisible();

        window2 = new Square();
        window2.changeSize(30, 30);
        window2.changeColor("cyan");
        window2.moveHorizontal(5);
        window2.moveVertical(160);
        window2.makeVisible();


        window3 = new Square();
        window3.changeSize(30, 30);
        window3.changeColor("cyan");
        window3.moveHorizontal(160);
        window3.moveVertical(160);
        window3.makeVisible();

        car1 = new Square();
        car1.changeColor("orange");
        car1.moveVertical(230);
        car1.moveHorizontal(220);
        car1.changeSize(60,15);
        car1.makeVisible();

        car1 = new Square();
        car1.changeColor("orange");
        car1.moveVertical(220);
        car1.moveHorizontal(230);
        car1.changeSize(40,30);
        car1.makeVisible();


        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(235);
        sun.moveVertical(180);
        sun.changeSize(20);
        sun.makeVisible();
        
         sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(205);
        sun.moveVertical(180);
        sun.changeSize(20);
        sun.makeVisible();

        line2 = new Square(); // middle winodw beam
        line2.changeColor("black");
        line2.moveVertical(110);
        line2.moveHorizontal(100);
        line2.changeSize(3,60);
        line2.makeVisible();
        
        line2 = new Square(); // middle window beam
        line2.changeColor("black");
        line2.moveVertical(140);
        line2.moveHorizontal(70);
        line2.changeSize(60,3);
        line2.makeVisible();

        line2 = new Square(); // right side windows frame
        line2.changeColor("black");
        line2.moveVertical(110);
        line2.moveHorizontal(130);
        line2.changeSize(3,60);
        line2.makeVisible();
        
          line2 = new Square(); //left side frame
        line2.changeColor("black");
        line2.moveVertical(110);
        line2.moveHorizontal(70);
        line2.changeSize(3,60);
        line2.makeVisible();
        
        line2 = new Square(); // top frame
        line2.changeColor("black");
        line2.moveVertical(110);
        line2.moveHorizontal(70);
        line2.changeSize(60,3);
        line2.makeVisible();

        line2 = new Square(); // bottom frame
        line2.changeColor("black");
        line2.moveVertical(170);
        line2.moveHorizontal(70);
        line2.changeSize(63,3);
        line2.makeVisible();

         sun = new Circle(); // door knob
        sun.changeColor("black");
        sun.moveHorizontal(70);
        sun.moveVertical(165);
        sun.changeSize(5);
        sun.makeVisible();

        line2 = new Square(); // bottom frame small windows1
        line2.changeColor("black");
        line2.moveVertical(190);
        line2.moveHorizontal(4);
        line2.changeSize(32,3);
        line2.makeVisible();
        line2 = new Square(); // top frame small windows1
        line2.changeColor("black");
        line2.moveVertical(160);
        line2.moveHorizontal(4);
        line2.changeSize(32,3);
        line2.makeVisible();

         line2 = new Square(); // bottom frame small windows1
        line2.changeColor("black");
        line2.moveVertical(190);
        line2.moveHorizontal(159);
        line2.changeSize(32,3);
        line2.makeVisible();

         line2 = new Square(); // bottom frame small windows1
        line2.changeColor("black");
        line2.moveVertical(160);
        line2.moveHorizontal(159);
        line2.changeSize(32,3);
        line2.makeVisible();

        line2 = new Square(); // right frame small windows2
        line2.changeColor("black");
        line2.moveVertical(160);
        line2.moveHorizontal(159);
        line2.changeSize(3,32);
        line2.makeVisible();

        line2 = new Square(); // left frame small windows2
        line2.changeColor("black");
        line2.moveVertical(160);
        line2.moveHorizontal(189);
        line2.changeSize(3,32);
        line2.makeVisible();

        line2 = new Square(); // right frame small windows1
        line2.changeColor("black");
        line2.moveVertical(160);
        line2.moveHorizontal(4);
        line2.changeSize(3,32);
        line2.makeVisible();

        line2 = new Square(); // left frame small windows1
        line2.changeColor("black");
        line2.moveVertical(160);
        line2.moveHorizontal(34);
        line2.changeSize(3,32);
        line2.makeVisible();

         sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(105);
        sun.moveVertical(-40);
        sun.changeSize(40);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(125);
        sun.moveVertical(-45);
        sun.changeSize(50);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(145);
        sun.moveVertical(-35);
        sun.changeSize(40);
        sun.makeVisible();

    }
     

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
