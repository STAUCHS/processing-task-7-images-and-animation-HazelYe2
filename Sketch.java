import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

    PImage imgBackground;
    PImage imgGooglyEyes;

    // x and y coordinate for the googly eyes
    float angle = 0;
    float centerX = 150;
    float centerY = 150;
    float radius = 100;

    // googly eyes speed variables
    float fltXSpeed = 6;
    float fltYSpeed = 6;

    // initiate the variables for the circle
    float fltCircleX = 200;
    float fltCircleY = 100;
    float fltCircleXSpeed = 5;
    float fltCircleYSpeed = 5;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    // load background
    imgBackground = loadImage("background.jpeg");
    // load googly eyes
    imgGooglyEyes = loadImage("googlyeyes.png");
    // resize googly eyes
    imgGooglyEyes.resize(200, 200);
    imgGooglyEyes.resize(imgGooglyEyes.width/4, imgGooglyEyes.height/4);
  }

  public void draw() {
    // draw background
    image(imgBackground, 0, 0);

    // calculate the position of the googly eyes along a circular path
    float x = centerX + cos(angle) * radius;
    float y = centerY + sin(angle) * radius;

    // draw googly eyes to move (animate)
    image(imgGooglyEyes, x, y);
    angle += 0.05;

    // draw the circle
    ellipse(fltCircleX, fltCircleY, 40, 40);
    fltCircleX = fltCircleX + fltCircleXSpeed;
    fltCircleY = fltCircleY + fltCircleYSpeed;
  
    // bounce off left and right
    if (fltCircleX < 0 || fltCircleX > width) {
      fltCircleXSpeed = fltCircleXSpeed * -1;
    }
  
    // bounce off top and bottom
    if (fltCircleY < 0 || fltCircleY > height) {
      fltCircleYSpeed = fltCircleYSpeed * -1;
    }
  }
}