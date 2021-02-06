import java.awt.*;
import java.awt.event.*;
public class mouse1 extends Frame implements MouseListener,Mouse MotionListener
{
 String msg=" ";
 int mouseX=0,mouseY=0;
 public mouse1()
 {
   addMouseListener(this);
   addMouseMotionListener(this);
 }
 public void mouseClicked(MouseEvent e)
 {
   msg=msg+"...clicked recieved";
   repaint();
 }
 public void mouseEntered(MouseEvent e)
 {
  mouseX=100;
  mouseY=100;
  msg="Mouse Entered";
  repaint();
 }
 public void mouseExited(MouseEvent e)
 {
  mouseX=100;
  mouseY=100;
  msg="Mouse Exited";
  repaint();
 }
 public void mouseReleased(MouseEvent e)
 {
  mouseX=e.getX();
  mouseY=e.getY();
  msg="Button Recieved";
  repaint();
 }
 public void mouseDragged(MouseEvent e)
 {
  mouseX=e.getX();
  mouseY=e.getY();
  msg=" "+"mouseat"+mouseX+","+mouseY;
  repaint();
 }
 public void mouseMoved(MouseEvent e)
 {
  msg="moving mouse at"+e.getX()+","+e.getY();
  repaint();
 }
 public void paint(Graphics g)
 {
  g.drawString(msg,mouseX,mouseY);
 }
 public static void main(String args[])
 {
  mouse1 obj=new mouse1();
  obj.setSize(new Dimension(300,300));
  obj.setTitle("Mouse Event");
  obj.setVisible(true);
 }
}