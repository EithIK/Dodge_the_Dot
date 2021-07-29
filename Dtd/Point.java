import java.awt.*;
import java.awt.Graphics;

import java.util.Random;
public class Point{
  public int x,y;


  Random random = new Random();
  public Point(){}
  public Point(int x,int y){
    this.x = x;
    this.y = y;
  }
  public int pointRandomX(){
    int rand = random.nextInt(400)+1;
    return this.x = rand;
  }

  public int pointRandomY(){
    int rand2 = random.nextInt(400)+1;
    return this.y = rand2;
  }

  public int getXx(){
    return this.x;
  }
  public int getYy(){
    return this.y;
  }

}
