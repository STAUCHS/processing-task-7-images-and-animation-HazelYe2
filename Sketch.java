import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgGooglyEyes;

  // x and y coordinate for the googly eyes
  float fltGooglyEyesX = random(1, 50);
  float fltGooglyEyesY = random(50, 100);

  // googly eyes speed variables
  float fltXSpeed = random(1, 5);
  float fltYSpeed = random(1, 5);

  // define colours
  int black = color(0);
  int white = color(255);
  int magenta = color(255, 0, 255);

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
    // load googly eyes
    imgGooglyEyes = loadImage ("googlyeyes.png");
    // resize googly eyes
    imgGooglyEyes.resize(100, 100);
    imgGooglyEyes.resize(imgGooglyEyes.width/4, imgGooglyEyes.height/4);
  }

  public void draw() {
    background(black);

    // draw googly eyes to move (animate)
    image (imgGooglyEyes, fltGooglyEyesX, fltGooglyEyesY);

    fltGooglyEyesX += fltXSpeed;
    fltGooglyEyesY += fltYSpeed;

    if (fltGooglyEyesX > width - imgGooglyEyes.width || fltGooglyEyesX < 0) {
      fltXSpeed *= -1;
    }

    if (fltGooglyEyesY > height - imgGooglyEyes.height || fltGooglyEyesY < 0) {
      fltYSpeed *= -1;
    }
  }
}