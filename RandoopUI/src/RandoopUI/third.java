package RandoopUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;

public class third {
	static String com;
	static String conf;
	JFrame f = new JFrame();
	
	
	
	Color clr1=new Color(211,211,192);
	
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
	
	Font fh=new Font("Trebuchet MS",Font.BOLD,12);
	Font fs=new Font("Trebuchet MS",Font.BOLD,13);
	Font fl=new Font("Serif",Font.BOLD,40);
	Font fi=new Font("Trebuchet MS",Font.ITALIC,12);
	Font fe=new Font("Trebuchet MS",Font.PLAIN,11);
	
	Container cont=f.getContentPane();
	
	JButton btn1=new JButton();
	JButton btn2=new JButton();
	JButton btn3=new JButton();
	JButton btn4=new JButton();
	JButton btn5=new JButton();
	
	JTextField txt1=new JTextField();
	JTextField txt2=new JTextField();
	JTextField txt3=new JTextField();
	JTextField txt4=new JTextField();
	JTextField txt5=new JTextField();
	JTextField txt6=new JTextField();
	JTextField txt7=new JTextField();
	JTextField txt8=new JTextField();
	
	JLabel lbl1=new JLabel();
	JLabel lbl2=new JLabel();
	JLabel lbl3=new JLabel();
	JLabel lbl4=new JLabel();
	JLabel lbl5=new JLabel();
	JLabel lbl6=new JLabel();
	JLabel lbl7=new JLabel();
	JLabel lbl8=new JLabel();
	JLabel lbl9=new JLabel();
	JLabel lbl10=new JLabel();
	JLabel lbl11=new JLabel();
	JLabel lbl12=new JLabel();
	JLabel lbl13=new JLabel();
	JLabel lbl14=new JLabel();
	
	JComboBox<String> cb1;
	
	String bool_f[]= {"false","true"};
	
	public third() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(200, 50, 1100, 700);
		f.setTitle("Randoop UI");
		f.setResizable(false);
		
		cont.setBackground(Color.DARK_GRAY);
		cont.setLayout(null);
		
		File flog=new File(conf+"2.txt");
		File op=new File("output2.txt");
		
		List<String> result = null;
		if(flog.exists()) {
			
		try (Stream<String> lines = Files.lines(Paths.get(conf+"2.txt"))) {
			result = lines.collect(Collectors.toList());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
			
		
		}else if(op.exists()){
			try (Stream<String> lines = Files.lines(Paths.get("output2.txt"))) {
				result = lines.collect(Collectors.toList());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}else {
			ArrayList<String> list=new ArrayList<String>();
			list.add("path");
			list.add("path");
			list.add("String");
			list.add("String");
			list.add("600");
			list.add("30");
			
			FileWriter writer;
			try {
				writer = new FileWriter("output2.txt");
			  
			for(String str: list) {
			  writer.write(str + System.lineSeparator());
			}
			writer.close();}
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try (Stream<String> lines = Files.lines(Paths.get("output2.txt"))) {
				result = lines.collect(Collectors.toList());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		lbl1.setBounds(10,10,1080,70);
		lbl1.setText("Randoop UI");
		lbl1.setFont(fl);
		lbl1.setForeground(Color.LIGHT_GRAY);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbl2.setBounds(00,40,1100,70);
		lbl2.setText("_____________________________________________________"
				+ "________________________________________________________"
				+ "_________________________________________________________"
				+ "_________________");
		lbl2.setFont(fi);
		lbl2.setForeground(Color.WHITE);
		lbl2.setHorizontalAlignment(SwingConstants.LEFT);
		
		lbl3.setBounds(70,100,150,20);
		lbl3.setText("classpath");
		lbl3.setFont(fi);
		lbl3.setForeground(Color.WHITE);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt1.setBounds(260,100,180,20);
		txt1.setFont(fi);
		txt1.setForeground(Color.BLACK);
		txt1.setHorizontalAlignment(SwingConstants.LEFT);
		if (!result.get(0).equals("path")||!result.get(0).equals("")) {
			txt1.setText(result.get(0));
		}
		else{txt1.setText("path");}
		
		btn1.setBounds(450,100,60,20);
		btn1.setText("Browse");
		btn1.setBackground(clr1);
		btn1.setForeground(Color.BLACK);
		btn1.setFont(fi);
		btn1.setCursor(cr);
		btn1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	 			j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	 			int r = j.showSaveDialog(null);
	 			if (r == JFileChooser.APPROVE_OPTION) { 
	                 txt1.setText(j.getSelectedFile().getAbsolutePath());
	 			}
	 			else {
	 				txt1.setText("path");
	 			}
	 			
	          }}); 
		
		lbl4.setBounds(540,100,150,20);
		lbl4.setText("randoop.jar");
		lbl4.setFont(fi);
		lbl4.setForeground(Color.WHITE);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
	
		txt2.setBounds(680,100,180,20);
		txt2.setFont(fi);
		txt2.setForeground(Color.BLACK);
		txt2.setHorizontalAlignment(SwingConstants.LEFT);
		if (!result.get(1).equals("path")||!result.get(1).equals("")) {
			txt2.setText(result.get(1));
		}
		else{txt2.setText("path");}
		
		btn2.setBounds(870,100,60,20);
		btn2.setText("Browse");
		btn2.setBackground(clr1);
		btn2.setForeground(Color.BLACK);
		btn2.setFont(fi);
		btn2.setCursor(cr);
		btn2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	 			j.setFileSelectionMode(JFileChooser.FILES_ONLY);
	 			int r = j.showSaveDialog(null);
	 			if (r == JFileChooser.APPROVE_OPTION) { 
	                 txt2.setText(j.getSelectedFile().getAbsolutePath());
	 			}
	 			else {
	 				txt2.setText("");
	 			}
	          }}); 
		
		lbl5.setBounds(50,140,200,20);
		lbl5.setText("--suitepath");
		lbl5.setFont(fi);
		lbl5.setForeground(Color.WHITE);
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt3.setBounds(260,140,200,20);
		txt3.setFont(fi);
		txt3.setForeground(Color.BLACK);
		txt3.setHorizontalAlignment(SwingConstants.LEFT);
		if (!result.get(2).equals("String")||!result.get(2).equals("")) {
			txt3.setText(result.get(2));
		}
		else{txt3.setText("String");}
		
		lbl6.setBounds(520,140,200,20);
		lbl6.setText("--suiteclasspath");
		lbl6.setFont(fi);
		lbl6.setForeground(Color.WHITE);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
	
		txt4.setBounds(680,140,200,20);
		txt4.setFont(fi);
		txt4.setForeground(Color.BLACK);
		txt4.setHorizontalAlignment(SwingConstants.LEFT);
		if (!result.get(3).equals("String")||!result.get(3).equals("")) {
			txt4.setText(result.get(3));
		}
		else{txt4.setText("String");}
		
		lbl7.setBounds(50,180,200,20);
		lbl7.setText("--minimizetimeout");
		lbl7.setFont(fi);
		lbl7.setForeground(Color.WHITE);
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt5.setBounds(260,180,200,20);
		txt5.setFont(fi);
		txt5.setForeground(Color.BLACK);
		txt5.setHorizontalAlignment(SwingConstants.LEFT);
		if (!result.get(4).equals("600")||!result.get(4).equals("")) {
			txt5.setText(result.get(4));
		}
		else{txt5.setText("600");}
		
		lbl8.setBounds(520,180,200,20);
		lbl8.setText("--testsuitetimeout");
		lbl8.setFont(fi);
		lbl8.setForeground(Color.WHITE);
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
	
		txt6.setBounds(680,180,200,20);
		txt6.setFont(fi);
		txt6.setForeground(Color.BLACK);
		txt6.setHorizontalAlignment(SwingConstants.LEFT);
		if (!result.get(5).equals("30")||!result.get(5).equals("")) {
			txt6.setText(result.get(5));
		}
		else{txt6.setText("30");}
		
		lbl9.setBounds(520,220,200,20);
		lbl9.setText("--verboseminimizer");
		lbl9.setFont(fi);
		lbl9.setForeground(Color.WHITE);
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		
		cb1= new JComboBox<String>(bool_f);
		cb1.setBounds(680,220,200,20);
		cb1.setFont(fi);
		cb1.setForeground(Color.BLACK);
		
		btn3.setBounds(790,600, 110, 20);
		btn3.setText("Previous");
		btn3.setBackground(clr1);
		btn3.setForeground(Color.BLACK);
		btn3.setFont(fi);
		btn3.setCursor(cr);
		btn3.addActionListener(new ActionListener() {
	         
			public void actionPerformed(ActionEvent e) {
				
				f.dispose();
				new Log();
	 			}
		}); 
		
		btn4.setBounds(910,600, 110, 20);
		btn4.setText("RUN");
		btn4.setBackground(clr1);
		btn4.setForeground(Color.BLACK);
		btn4.setFont(fi);
		btn4.setCursor(cr);
		btn4.addActionListener(new ActionListener() {
	         
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> list=new ArrayList<String>();
				list.add(txt1.getText());
				list.add(txt2.getText());
				list.add(txt3.getText());
				list.add(txt4.getText());
				list.add(txt5.getText());
				list.add(txt6.getText());
				
				FileWriter writer;
				try {
					writer = new FileWriter(conf+"2.txt");
				  
				for(String str: list) {
				  writer.write(str + System.lineSeparator());
				}
				writer.close();}
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (txt1.getText().equals("path") || txt2.getText().equals("path") ||txt3.getText().equals("String")||
						txt4.getText().equals("String")||txt1.getText().equals("") || txt2.getText().equals("")||
						txt3.getText().equals("")||txt4.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Required Field empty!",
				            "Message Dialog", JOptionPane.PLAIN_MESSAGE);
				}else {
				
				com = "java -"+lbl3.getText()+" " + txt1.getText() + ":" + txt2.getText() + 
						" randoop.main.Main minimize "+lbl5.getText()+"="+txt3.getText()+" "+lbl6.getText()+"="
						+txt4.getText();
				
				if(!txt5.getText().equals("600")) {
					com= com + " " + lbl7.getText() + "="+ txt5.getText();
				}
				if(!txt6.getText().equals("30")) {
					com= com + " " + lbl8.getText() + "="+ txt6.getText();
				}
				if(!cb1.getSelectedItem().toString().equals("false")) {
					com= com + " " + lbl9.getText() + "="+ cb1.getSelectedItem();
				}
				
				JFrame frame = new JFrame ("Execution");
				frame.setBounds(400,300,800,400);
				frame.setResizable(false);
				//

				//TEXT AREA
				JTextArea textArea = new JTextArea("Execution");
				textArea.setSize(800,400);    

				    textArea.setLineWrap(true);
				    textArea.setEditable(false);
				    textArea.setVisible(true);

				    JScrollPane scroll = new JScrollPane (textArea);
				    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				          scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

				    frame.add(scroll);
				    frame.setVisible(true);
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				try
		        {
					//txt22.setText(com);
			        Process proc=Runtime.getRuntime().exec(com);
			        BufferedReader reader =  
			                new BufferedReader(new InputStreamReader(proc.getInputStream()));

			          String line = "";
			          while((line = reader.readLine()) != null) {
			        	  textArea.append(String.valueOf((line+"\n")));
				        	textArea.setCaretPosition(textArea.getDocument().getLength());
			          }

			          proc.waitFor();  
		        } 
		        catch (Exception ev) 
		        { 
		            //lbl9.setText("HEY Buddy ! U r Doing Something Wrong "); 
		            ev.printStackTrace(); 
		        }
				}
			}});
		
		btn5.setBounds(670,600, 110, 20);
		btn5.setText("Save");
		btn5.setBackground(clr1);
		btn5.setForeground(Color.BLACK);
		btn5.setFont(fi);
		btn5.setCursor(cr);
		btn5.addActionListener(new ActionListener() {
	         
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> list=new ArrayList<String>();
				list.add(txt1.getText());
				list.add(txt2.getText());
				list.add(txt3.getText());
				list.add(txt4.getText());
				list.add(txt5.getText());
				list.add(txt6.getText());
				
				FileWriter writer;
				try {
					writer = new FileWriter(conf+"2.txt");
				  
				for(String str: list) {
				  writer.write(str + System.lineSeparator());
				}
				writer.close();}
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});
		f.add(lbl1);
		f.add(lbl2);
		f.add(lbl3);
		f.add(lbl4);
		f.add(lbl5);
		f.add(lbl6);
		f.add(lbl7);
		f.add(lbl8);
		f.add(lbl9);
		f.add(lbl10);
		
		f.add(txt1);
		f.add(txt2);
		f.add(txt3);
		f.add(txt4);
		f.add(txt5);
		f.add(txt6);
		f.add(txt7);
		f.add(txt8);
		
		f.add(cb1);
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		f.setVisible(true);
	}
	
	
}
