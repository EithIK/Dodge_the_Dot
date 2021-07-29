  import java.awt.*;
  import java.awt.Graphics;

  import java.util.Random;
  public class Enemy{
    public int width,height,x,y,c;

    Random random = new Random();
    public Enemy(){}
    public Enemy(int x,int y,int width, int height){
      this.x = x;
      this.y = y;
      this.height = height;
      this.width = width;
    }
    // public int enemyRandomRight(){
    //   int rand = random.nextInt(400)+1;
    //   return this.y = rand;
    // }
    //
    // public int enemyRandomLeft(){
    //   int rand2 = random.nextInt(400)+1;
    //   return this.y = rand2;
    // }
    // public int enemyRandomUp(){
    //   int rand3 = random.nextInt(400)+1;
    //   return this.x = rand3;
    // }
    // public int enemyRandomDown(){
    //   int rand4 = random.nextInt(400)+1;
    //   return this.x = rand4;
    // }

    public void enemyGenerate(Graphics g){
      g.fillOval(this.x, this.y,this.width,this.height);
    }


    public void setXplus(){
      c+=(random.nextInt(10)+1);
      if(c % 10 == 0){
        x+=1;
      }
      if (x > 400){
        this.x = 0;
      }
      this.x = x;
    }

    public void setXminus(){
      c-=(random.nextInt(10)+1);
      if(c % 10 == 0){
        x-=1;
      }
      if (x < 0){
        this.x = 400;
      }
      this.x = x;
    }

    public void setYplus(){
      c+=(random.nextInt(10)+1);
      if(c % 10 == 0){
        x+=1;
      }
      if (x > 400){
        this.y = 0;
      }
      this.y = x;
    }
    public void setYminus(){
      c-=(random.nextInt(10)+1);
      if(c % 10 == 0){
        x-=1;
      }
      if (x < 0){
        this.y = 400;
      }
      this.y = x;
    }




    public int getXx(){
      return this.x;
    }
    public int getYy(){
      return this.y;
    }

  }
