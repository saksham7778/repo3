class TimerThread extends Thread
{
public void run()
{
try
{
for(int i=60;i>=1;i--)
{
MyGame.timer.setText(""+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
}
}
}




