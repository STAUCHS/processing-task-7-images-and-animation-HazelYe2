import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgGooglyEyes;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
    // load googly eyes
    imgGooglyEyes = loadImage ("googlyeyes.png");
  }

  public void draw() {
    // draw googly eyes
    image (imgGooglyEyes, 0, 0);
  }

}