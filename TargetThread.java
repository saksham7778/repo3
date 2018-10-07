class TargetThread extends Thread
{
public void run()
{
try
{
while(true)
{
int x=MyGame.target.getX();
if(x>=400)
x=0;
MyGame.target.setBounds(x+10,30,100,20);
Thread.sleep(50);
}
}
catch(Exception e)
{
}
}
}




