import java.awt.Rectangle;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;


public class Player extends Rectangle{
  private int dx,dy;
  public int x,y;


public Player(){}

public Player(int x,int y, int width,int height,int dx,int dy){
  setBounds(x,y,width,height);
  this.dx = dx;
  this.dy = dy;
  this.x = x;
  this.y = y;
}
 public void tick(){
   this.x += dx;
   this.y += dy;
 }


 public void paintComponent(Graphics g){
   g.setColor(Color.GREEN);
   g.fillRect(this.x, this.y,this.width,this.height);
   g.setColor(Color.BLUE);
 }
 public void setDx(int dx){
   this.dx = dx;
 }
 public void setDy(int dy){
   this.dy = dy;
 }
 public void setX(){
   this.x = 190;
 }
 public void setY(){
   this.y = 160;
 }
 public int getXx(){
   return this.x;
 }
 public int getYy(){
   return this.y;
 }
 // public int doNotGoAround(int dx,int dy){
 //   if (dx < 0 || dx > 400){
 //    dx = 0;
 //   }
 //   if (dy < 0 || dy > 400){
 //    dy = 0;
 //  }
 //  return dx;
 // }

}
