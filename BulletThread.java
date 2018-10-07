import java.awt.*;
class BulletThread extends Thread
{
public void run()
{
try
{
Button b=new Button();
for(int i=350;i>=0;i=i-10)
{
int x1=b.getX();
int y1=b.getY();
int x2=MyGame.target.getX();
int y2=MyGame.target.getY();

if((x1>=x2 && x1<=x2+100) && (y1>=y2 && y1<=y2+20))
{
int a=Integer.parseInt(MyGame.score.getText());
a++;
MyGame.score.setText(""+a);
break;
}
b.setBounds(MyGame.tank.getX()+15,i,10,10);
MyGame.f.add(b);
Thread.sleep(50);
}
b.setBounds(195,0,10,10);
}
catch(Exception e)
{
}
}
}




