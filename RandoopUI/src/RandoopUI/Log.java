package RandoopUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class Log{
	JFrame f = new JFrame();
	static String conf="";
	
	Color clr1=new Color(81,101,222);
	
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
	
	Container cont=f.getContentPane();
	
	JLabel lbl1=new JLabel();
	JLabel lbl2=new JLabel();
	JLabel lbl3=new JLabel();
	JLabel lbl4=new JLabel();
	
	JTextField txt1=new JTextField();
	
	
	List<String> config= new ArrayList<String>();
	
	JButton btn1=new JButton();
	JButton btn2=new JButton();
	JButton btn3=new JButton();
	
	JComboBox<String> cb1;
	
	JRadioButton chk1=new JRadioButton();
	JRadioButton chk2=new JRadioButton();
	
	Font fh=new Font("Trebuchet MS",Font.BOLD,12);
	Font fs=new Font("Trebuchet MS",Font.BOLD,13);
	Font fl=new Font("Serif",Font.BOLD,60);
	Font fi=new Font("Trebuchet MS",Font.ITALIC,12);
	Font fe=new Font("Trebuchet MS",Font.ITALIC,18);
	
	public Log() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(200, 50, 1100, 700);
		f.setTitle("Randoop UI");
		f.setResizable(false);
		
		
		File flog=new File("Log.txt");
		if(flog.exists()) {
		 config = null;
		try (Stream<String> lines = Files.lines(Paths.get("Log.txt"))) {
			config = lines.collect(Collectors.toList());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
			
		
		}else {
			config.add("New");
		}
		
		cont.setBackground(Color.DARK_GRAY);
		cont.setLayout(null);
		
		lbl1.setBounds(100,180,400,300);
		lbl1.setText("<html>Randoop<br> User <br>Interface</html>");
		lbl1.setFont(fl);
		lbl1.setForeground(Color.PINK);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		
		//btn1.setBounds(800,150,100,100);
	
		
		// Color color=new Color(128,0,0); 
		
		lbl2.setBounds(600,180,400,30);
		lbl2.setText("Configuration");
		lbl2.setFont(fe);
		lbl2.setForeground(Color.WHITE);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
		cb1= new JComboBox<String>(config.toArray(new String[config.size()]));
		cb1.setBounds(700,210,200,30);
		cb1.setFont(fi);
		cb1.setForeground(Color.BLACK);
		cb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cb1.getSelectedItem().toString().equals("New")) {
					
					lbl3.setBounds(700,250,200,30);
					lbl3.setText("Configuration-Name");
					lbl3.setFont(fi);
					lbl3.setForeground(Color.WHITE);
					lbl3.setHorizontalAlignment(SwingConstants.CENTER);
					
					txt1.setBounds(700,280,200,30);
					txt1.setFont(fi);
					txt1.setForeground(Color.BLACK);
					txt1.setHorizontalAlignment(SwingConstants.LEFT);
					txt1.setText("");
					txt1.enable(true);
					
					
				}else {
					txt1.enable(false);
				}
				
				
			}
			
		});
		
		chk1.setBounds(650,350,200,30);
		chk1.setText("Gentests");
		chk1.setFont(fe);
		chk1.setForeground(Color.WHITE);
		chk1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		chk2.setBounds(800,350,200,30);
		chk2.setText("Minimize");
		chk2.setFont(fe);
		chk2.setForeground(Color.WHITE);
		chk2.setHorizontalAlignment(SwingConstants.CENTER);
		
		ButtonGroup group = new ButtonGroup();
		group.add(chk1);
		group.add(chk2);
		
		btn3.setBounds(1000, 0, 100, 30);
		btn3.getBackground();
		btn3.setText("Help");
		btn3.setForeground(Color.BLACK);
		btn3.setFont(fi);
		btn3.setCursor(cr);
		btn3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	
	        	try {
	        	    Desktop.getDesktop().browse(new URL("https://randoop.github.io/randoop/manual/").toURI());
	        	} catch (Exception e1)
	        	{}
	 			
	          }}); 
		
		btn2.setBounds(800,600,100,30);
		btn2.setText("Exit");
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setForeground(Color.BLACK);
		btn2.setFont(fi);
		btn2.setCursor(cr);
		btn2.addActionListener(new ActionListener() {
	         
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}});
		btn1.setBounds(900,600,100,30);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setText("Save & Next");
		btn1.setForeground(Color.BLACK);
		btn1.setFont(fi);
		btn1.setCursor(cr);
		
		btn1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	
	        	if(!config.contains(txt1.getText())&& !txt1.getText().equals("")) {
	        		
	        		config.add(txt1.getText());
	        		conf=txt1.getText();
	        		
	        		 FileWriter writer;
	 	 			try {
	 	 				writer = new FileWriter("Log.txt");
	 	 			  
	 	 			for(String str: config) {
	 	 			  writer.write(str + System.lineSeparator());
	 	 			}
	 	 			writer.close();}
	 	 			catch (IOException e1) {
	 	 				// TODO Auto-generated catch block
	 	 				e1.printStackTrace();
	 	 				}
	 	 				
	 	 				
	 	 				if(chk1.isSelected()) {
	 	 					first.conf=conf;
	 	 					new first();
	 	 					f.dispose();
	 	 				}
	 	 				else if(chk2.isSelected()) {
	 	 					third.conf=conf;
	 	 					new third();
	 	 					f.dispose();
	 	 				}else {
	 	 					JOptionPane.showMessageDialog(null, "No Option Selected!",
	 	 				            "Message Dialog", JOptionPane.PLAIN_MESSAGE);
	 	 				}
	 	 				
	 	 				
	 	 			
	        	}else if(!cb1.getSelectedItem().toString().equals("New")){
	        		conf=cb1.getSelectedItem().toString();
	        		if(chk1.isSelected()) {
 	 					first.conf=conf;
 	 					new first();
 	 					f.dispose();
 	 				}
 	 				else if(chk2.isSelected()) {
 	 					third.conf=conf;
 	 					new third();
 	 					f.dispose();
 	 				}else {
 	 					JOptionPane.showMessageDialog(null, "No Option Selected!",
 	 				            "Message Dialog", JOptionPane.PLAIN_MESSAGE);
 	 				}
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(null, "Please Select some configuration!",
	 				            "Message Dialog", JOptionPane.PLAIN_MESSAGE);
	        	}
	        	 
	        	 
	        	
	          }}); 
		
		
		
		f.add(lbl1);
		f.add(lbl2);
		f.add(lbl3);
		f.add(lbl4);
		
		f.add(txt1);
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		f.add(chk1);
		f.add(chk2);
		
		f.add(cb1);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Log();
	}
}
