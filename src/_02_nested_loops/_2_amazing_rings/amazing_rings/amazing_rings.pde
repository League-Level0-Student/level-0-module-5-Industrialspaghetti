
void setup() {
  size (400,400);
}

void draw() {
  
  
  int ringSize = 120;
  for (int i = 0; i < 6; i++) {
 noFill();
  ellipse( 200, 200, ringSize, ringSize);
  ringSize -= 20;
 noFill();
 ellipse( 400,200, ringSize, ringSize);
 ringSize -= 30;
  }
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
