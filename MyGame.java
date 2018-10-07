import java.awt.*;
import java.awt.event.*;
class MyGame implements ActionListener,MouseMotionListener
{
static Frame f;
static Button target,bullet,tank;
static Label score,timer;
MyGame()
{
f=new Frame();
f.addMouseMotionListener(this);
target=new Button();
tank=new Button();
tank.addActionListener(this);
bullet=new Button();
score=new Label("0");
timer=new Label("60");
timer.setFont(new Font("Arial",1,20));
score.setFont(new Font("Arial",1,20));
f.setLayout(null);
target.setBounds(0,30,100,20);
tank.setBounds(180,360,40,40);
bullet.setBounds(195,350,10,10);
score.setBounds(10,360,40,40);
timer.setBounds(360,360,40,40);
f.add(target);
f.add(tank);
f.add(bullet);
f.add(timer);
f.add(score);


f.setSize(400,400);
f.setVisible(true);
TargetThread t1=new TargetThread();
t1.start();
TimerThread t2=new TimerThread();
t2.start();






}
public static void main(String ar[])
{
MyGame g=new MyGame();
}
public void actionPerformed(ActionEvent e)
{
BulletThread t1=new BulletThread();
t1.start();

}
public void mouseMoved(MouseEvent e)
{
tank.setBounds(e.getX(),360,40,40);
}
public void mouseDragged(MouseEvent e)
{

}
}




