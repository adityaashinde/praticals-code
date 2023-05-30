package package1;

import java.awt.*;
import java.awt.event.*;

public class expt2_MouseDemo extends Frame implements MouseListener {
	Label l;
	expt2_MouseDemo() {
	super("AWT Frame");
	l = new Label();
	l.setFont(new Font("Courier New", Font.ITALIC, 20));
	l.setBackground(Color.GREEN);
	l.setBounds(25, 60, 250, 30);
	l.setAlignment(Label.CENTER);
	this.add(l);
	this.setSize(300, 300);
	this.setLayout(null);
	this.setVisible(true);
	this.addMouseListener(this);
	this.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	dispose();
	}
	});
	}
	
	public static void main(String[] args) {
	new expt2_MouseDemo();
	}
	public void mouseClicked(MouseEvent e) {
	l.setText("Mouse Clicked");
	}
	public void mousePressed(MouseEvent e) {
	l.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
	l.setText("Mouse Released");
	}
	public void mouseEntered(MouseEvent e) {
	l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
	l.setText("Mouse Exited");
	}		
}
