import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gian implements MouseListener{
	String first = "";
	static int count = 0;
	JFrame traff = new JFrame();
	JButton las1 = new JButton();
	JButton las2 = new JButton();
	JTextField light1 = new JTextField();
	JTextField light2 = new JTextField();
	JLabel road = new JLabel();
	JLabel carcount = new JLabel();
	JLabel cons = new JLabel();
	
	void frm() {
		traff.setLayout(null);
		traff.setVisible(true);
		traff.setSize(1200, 500);
		traff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		traff.add(cons);
		cons.setText("UNDER CONSTRUCTION");
		cons.setHorizontalAlignment(JTextField.CENTER);
		cons.setOpaque(true);
		cons.setBackground(Color.GRAY);
		cons.setBounds(250,200,650,100);
		
		traff.add(road);
		road.setOpaque(true);
		road.setBackground(Color.BLACK);
		road.setBounds(0,200,1200,200);
		
		traff.add(light1);
		light1.setBackground(Color.GREEN);
		light1.setText("light");
		light1.setHorizontalAlignment(JTextField.CENTER);
		light1.setBounds(200,150,50,50);
		
		traff.add(light2);
		light2.setBackground(Color.GREEN);
		light2.setText("light");
		light2.setHorizontalAlignment(JTextField.CENTER);
		light2.setBounds(900,150,50,50);
		
		traff.add(las1);
		las1.setText("Laser #1");
		las1.setBounds(50,150,100,50);
		las1.addMouseListener(this);
		
		traff.add(las2);
		las2.setText("Laser #2");
		las2.setBounds(1000,150,100,50);
		las2.addMouseListener(this);
		
		traff.add(carcount);
		carcount.setBounds(550,100,50,50);
	}
	
	public static void main(String[]args) {
		new Gian().frm();
	}
	
	@Override
	public void mouseClicked(MouseEvent src) {
		Gian open = new Gian();
		if(src.getSource()==las1) {
			if(first.equals("")&&count==0) {
				first="las1";
				light1.setBackground(Color.GREEN);
				light2.setBackground(Color.RED);
			}
			if(first.equals("las1")){
				count++;
			}else {
				count--;
				if(count==0) {
					first="";
					light2.setBackground(Color.GREEN);
					light1.setBackground(Color.GREEN);
				}
			}
			carcount.setText(""+count);
		}else {
			if(first.equals("")&&count==0) {
				first="las2";
				light2.setBackground(Color.GREEN);
				light1.setBackground(Color.RED);
			}
			if(first.equals("las2")){
				count++;
			}else {
				count--;
				if(count==0) {
					first="";
					light1.setBackground(Color.GREEN);
					light2.setBackground(Color.GREEN);
				}
			}
			carcount.setText(""+count);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}