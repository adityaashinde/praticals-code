package package1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class expt1_Applet extends Applet implements KeyListener
{
 String msg = "";

 public void init()
 {
 addKeyListener(this);
 }

 public void keyReleased(KeyEvent k)
 {
 showStatus("Key Released");
msg="Key Released";
 repaint();
 }

 public void keyTyped(KeyEvent k)
 {
 showStatus("Key Typed");
msg="Key Typed";
 repaint();
 }

 public void keyPressed(KeyEvent k)
 {
 showStatus("Key Pressed");
msg="Key Pressed";
 repaint();
 }

 public void paint(Graphics g)
 {
 g.drawString(msg, 10, 10);
 }
}