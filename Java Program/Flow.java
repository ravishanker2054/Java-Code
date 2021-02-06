import java.awt.*;
import java.awt.event.*;
public class Flow extends Frame
{
 public Flow()
 {
  setLayout(new FlowLayout());
  Label one=new Label("one");
  Label two=new Label("two");
  Label three=new Label("three");
  add(one);
  add(two);
  add(three);
 }
 public static void main(String args[])
 {
  Flow b=new Flow();
  b.setSize(300,300);
  b.setTitle("FLOW LAYOUT");
  b.setVisible(true);
  
 }
}