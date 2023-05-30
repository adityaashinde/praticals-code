package package1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class KeyboardDemo extends Applet implements KeyListener
{
 String msg = "";
 public void init()
 {
 addKeyListener(this);
 }
 public void keyReleased(KeyEvent k)
 {
 msg="Key Released";
 showStatus("Key Released");
 repaint();
 }
 public void keyTyped(KeyEvent k)
 {
 msg="Key Typed";
 showStatus("Key Typed");
 repaint();
 }
 public void keyPressed(KeyEvent k)
 {


 msg="Key Pressed";
 showStatus("Key Pressed");
 repaint();
 int key=k.getKeyCode();
 switch(key)
 {
 case KeyEvent.VK_F1:
 msg=msg+":F1";
 break;
 case KeyEvent.VK_F2:
 msg=msg+":F2";
 break;
 case KeyEvent.VK_F3:
 msg=msg+":F3";
 break;
 case KeyEvent.VK_F4:
 msg=msg+":F4";
 break;
 case KeyEvent.VK_UP:
 msg=msg+":KEY UP";
 break;
 case KeyEvent.VK_DOWN:
 msg=msg+":KEY Down ";
 break;
 case KeyEvent.VK_LEFT:
 msg=msg+":KEY LEFT";
 break;
 case KeyEvent.VK_RIGHT:
 msg=msg+":KEY RIGHT ";
 break;


 }
 }
 public void paint(Graphics g)
 {
 g.drawString(msg, 10, 10);
 }
}
