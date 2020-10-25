int x =90;
int x2 = 320;
int speed = 5;
void setup() {
  size (400,400);
}

void draw() {
  
  background(#29FFAF);
  int ringSize = 120;
  if ( x == 400 || x == 0){
   speed =- speed;
    
  }
  for (int i = 0; i < 6; i++) {
    
 noFill();
  ellipse( x, 200, ringSize, ringSize);

 
 ellipse( x2,200, ringSize, ringSize);
 ringSize -= 20;
 
  }
  x += speed;
  x2 -= speed;
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
