import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Frame extends JFrame{

  public Frame(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Dodge The Dot !!!");
    setSize(400,400);
    setResizable(false);
    setBackground(Color.BLACK);

    init();
  }
  public void init(){
    setLocationRelativeTo(null);

    // setLayout(new GridLayout(1,1,0,0));

    Screen s = new Screen();

    add(s);

    setVisible(true);
  }

  public static void main(String[] args) {
    Frame f = new Frame();
    // p.drawCircle();
    // Player p = new Player();
  //   while(true){
  //   System.out.println(p.getDx());
  //   System.out.println(p.getDy());
  // }
  }
}
