package package1;



	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	
	public class expt3_Result extends JFrame{
	JPanel jp = new JPanel();
	JLabel lname = new JLabel();
	JButton bsubmit = new JButton("Submit");
	JTextField tname = new JTextField(20);
	JLabel lMath = new JLabel();
	JTextField tMath = new JTextField(20);
	JLabel lScience = new JLabel();
	JTextField tScience = new JTextField(20);
	JLabel lEnglish = new JLabel();
	JTextField tEnglish = new JTextField(20);
	
	public expt3_Result()
	{
	lname.setText("Enter Name");
	jp.add(lname);
	jp.add(tname);
	lMath.setText("Enter Math Marks");
	jp.add(lMath);
	jp.add(tMath);
	lScience.setText("Enter Science Marks");
	jp.add(lScience);
	jp.add( tScience);
	lEnglish.setText("Enter English Marks");
	jp.add(lEnglish);
	jp.add(tEnglish);
	jp.add(bsubmit);
	add(jp);
	
	bsubmit.addActionListener (new ActionListener (){
		public void actionPerformed(ActionEvent arg0) {
			String val=tname.getText();
			JLabel l1 = new JLabel( "Welcome "+val);
			int sub1 = Integer.parseInt(tMath.getText());
			int sub2 = Integer.parseInt(tScience.getText());
			int sub3 = Integer.parseInt(tEnglish.getText());
			int sum = sub1+sub2+sub3;
			float average = sum/3;
	
			JLabel l2 = new JLabel("Average "+ average);
				JPanel jip = new JPanel();
				jip.add(l1);
				jip.add(l2);
				
				JFrame inf = new JFrame();
				inf.setVisible(true);
				inf.add(jip);
				inf.setSize(300, 200);
			   }
			});
		}
	
	public static void main(String[] args){
	expt3_Result rc = new expt3_Result();
	rc.setSize(300, 400);
	rc.setVisible(true);
	}

}
