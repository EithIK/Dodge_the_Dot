import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Point;
import java.util.Random;
import java.lang.Math;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Screen extends JPanel implements ActionListener,KeyListener{
  public int x,y;
  public static ArrayList<Point> points = new ArrayList<Point>();
  public static int screen = 1;
  public static int score = 0;
  public static int highscore = 0;
  public int speed = 0;
  Timer t = new Timer(10,this);
  Player p = new Player(190,160,10,10,0,0);
  Random random = new Random();

  Enemy enemy = new Enemy(0,30,10,10);//Right
  Enemy enemy2 = new Enemy(400,70,10,10);//Left
  Enemy enemy3 = new Enemy(0,110,10,10);//Right
  Enemy enemy4 = new Enemy(400,150,10,10);//Left
  Enemy enemy5 = new Enemy(0,190,10,10);//Right
  Enemy enemy6 = new Enemy(400,230,10,10);//Left
  Enemy enemy7 = new Enemy(0,270,10,10);//Right
  Enemy enemy8 = new Enemy(400,310,10,10);//Left
  Enemy enemy9 = new Enemy(0,350,10,10);//Right
  Enemy enemy10 = new Enemy(400,390,10,10);//Left
  public static boolean tr = true;



  public Screen(){
    points.add(new Point(200,200));
    addKeyListener(this);
    setFocusable(true);

    t.start();
  }

  public void actionPerformed(ActionEvent arg0){
    p.tick();
    repaint();
  }

  public void paint(Graphics g){
    if (screen == 1){
      g.setColor(Color.red);
      g.fillOval(0,0,100,100);
      g.setColor(Color.green);
      g.fillOval(320,320,50,50);
      g.setColor(Color.blue);
      g.fillRect(30,300,120,120);
      g.setColor(Color.yellow);
      g.fillOval(300,30,150,150);
      g.setColor(Color.yellow);
      g.drawString("D O D G E _ T H E _ D O T",125,160);
      g.setColor(Color.white);
      g.drawString("P R E S S _ 'E N T E R' _ T O _ P L A Y _ G A M E",60,190);
      g.setColor(Color.white);
      repaint();
    }
    else if(screen == 2){
      if(tr){
      g.clearRect(0,0,getWidth(),getHeight());
      p.paintComponent(g);

      enemy.setXplus();
      enemy2.setXminus();
      enemy3.setXplus();
      enemy4.setXminus();
      enemy5.setXplus();
      enemy6.setXminus();
      enemy7.setXplus();
      enemy8.setXminus();
      enemy9.setXplus();
      enemy10.setXminus();
      enemy.enemyGenerate(g);
      enemy2.enemyGenerate(g);
      enemy3.enemyGenerate(g);
      enemy4.enemyGenerate(g);
      enemy5.enemyGenerate(g);
      enemy6.enemyGenerate(g);
      enemy7.enemyGenerate(g);
      enemy8.enemyGenerate(g);
      enemy9.enemyGenerate(g);
      enemy10.enemyGenerate(g);

      if(Math.abs(p.getXx()- enemy.getXx()) < 10 && Math.abs(p.getYy()- enemy.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }

      }
      if(Math.abs(p.getXx()- enemy2.getXx()) < 10 && Math.abs(p.getYy()- enemy2.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }

      }
      if(Math.abs(p.getXx()- enemy3.getXx()) < 10 && Math.abs(p.getYy()- enemy3.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }

      }
      if(Math.abs(p.getXx()- enemy4.getXx()) < 10 && Math.abs(p.getYy()- enemy4.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }

      }
      if(Math.abs(p.getXx()- enemy5.getXx()) < 10 && Math.abs(p.getYy()- enemy5.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }

      }
      if(Math.abs(p.getXx()- enemy6.getXx()) < 10 && Math.abs(p.getYy()- enemy6.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }
      }
      if(Math.abs(p.getXx()- enemy7.getXx()) < 10 && Math.abs(p.getYy()- enemy7.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }
      }
      if(Math.abs(p.getXx()- enemy8.getXx()) < 10 && Math.abs(p.getYy()- enemy8.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }
      }
      if(Math.abs(p.getXx()- enemy9.getXx()) < 10 && Math.abs(p.getYy()- enemy9.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }
      }
      if(Math.abs(p.getXx()- enemy10.getXx()) < 10 && Math.abs(p.getYy()- enemy10.getYy()) < 10){
        tr = false;
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        if (highscore < score){
          highscore = score;
        }
      }
      if(Math.abs(p.getXx()-(points.get(0)).x) < 10 && Math.abs(p.getYy()-(points.get(0)).y) < 10){
        score++;
        points.clear();
        points.add(new Point(pointRandomX(),pointRandomY()));
        // System.out.println(""+pointRandomX()+" , "+pointRandomY());
        System.out.println("Score :"+score);

      }
      g.setColor(Color.BLACK);
      // g.setFont(new Font("Calibri",Font.PLAIN,20));
      g.drawString("Score: "+score,320,30);
      g.drawString("HighScore: "+highscore,295,50);
      g.setColor(Color.RED);
      g.fillOval((points.get(0)).x, (points.get(0)).y, 10, 10);
      if(p.getXx() < 0 || p.getXx() > 375 || p.getYy() < 0 || p.getYy() > 350 ){
        g.setColor(Color.BLACK);
        System.out.println("Crash !!!!!!");
        g.drawString("Game Over",160,160);
        g.drawString("Your Score :"+score,155,180);
        g.drawString("Press Spacebar to play again.",120,200);
        points.clear();
        points.add(new Point(pointRandomX(),pointRandomY()));
        if (highscore < score){
          highscore = score;
        }
        tr = false;
      }
      repaint();
  }
}
}
  public int getScore(){
    return this.score;
  }



  public int pointRandomX(){
    int rand = random.nextInt(320)+10;
    return this.x = rand;
  }

  public int pointRandomY(){
    int rand2 = random.nextInt(320)+10;
    return this.y = rand2;
  }

  public void keyPressed(KeyEvent k){
    switch(k.getKeyCode()){
      case KeyEvent.VK_D:
      case KeyEvent.VK_RIGHT:
        p.setDx(3);
        break;
      case KeyEvent.VK_S:
      case KeyEvent.VK_DOWN:
        p.setDy(3);
        break;
      case KeyEvent.VK_A:
      case KeyEvent.VK_LEFT:
        p.setDx(-3);
        break;
      case KeyEvent.VK_W:
      case KeyEvent.VK_UP:
        p.setDy(-3);
        break;
      case KeyEvent.VK_SPACE:
        p.setX();
        p.setY();
        score = 0;
        tr = true;
        points.clear();
        points.add(new Point(pointRandomX(),pointRandomY()));
        break;
      case KeyEvent.VK_O:
        tr = false;
        break;
      case KeyEvent.VK_ENTER:
        screen = 2;
        break;
  }
}
  public void keyReleased(KeyEvent k){
    switch(k.getKeyCode()){
      case KeyEvent.VK_D:
      case KeyEvent.VK_RIGHT:
        p.setDx(0);
        break;
      case KeyEvent.VK_S:
      case KeyEvent.VK_DOWN:
        p.setDy(0);
        break;
      case KeyEvent.VK_A:
      case KeyEvent.VK_LEFT:
        p.setDx(0);
        break;
      case KeyEvent.VK_W:
      case KeyEvent.VK_UP:
        p.setDy(0);
        break;
      case KeyEvent.VK_P:
        tr = true;
        break;
    }

  }
  public void keyTyped(KeyEvent arg0){

  }

}
