package RandoopUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;

public class second {
	static String com;
	JFrame f = new JFrame();
	static String conf;
	Color clr1=new Color(211,211,192);
	
	Cursor cr=new Cursor(Cursor.HAND_CURSOR);
	
	Container cont=f.getContentPane();
	
	
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
	JLabel lbl15=new JLabel();
	JLabel lbl16=new JLabel();
	JLabel lbl17=new JLabel();
	JLabel lbl18=new JLabel();
	JLabel lbl19=new JLabel();
	JLabel lbl20=new JLabel();
	JLabel lbl21=new JLabel();
	JLabel lbl22=new JLabel();
	JLabel lbl23=new JLabel();
	JLabel lbl24=new JLabel();
	JLabel lbl25=new JLabel();
	JLabel lbl26=new JLabel();
	JLabel lbl27=new JLabel();
	JLabel lbl28=new JLabel();
	JLabel lbl29=new JLabel();
	JLabel lbl30=new JLabel();
	JLabel lbl31=new JLabel();
	JLabel lbl32=new JLabel();
	JLabel lbl33=new JLabel();
	JLabel lbl34=new JLabel();
	JLabel lbl35=new JLabel();
	JLabel lbl36=new JLabel();
	JLabel lbl37=new JLabel();
	JLabel lbl38=new JLabel();
	JLabel lbl39=new JLabel();
	JLabel lbl40=new JLabel();
	JLabel lbl41=new JLabel();
	JLabel lbl42=new JLabel();
	JLabel lbl43=new JLabel();
	JLabel lbl44=new JLabel();
	JLabel lbl45=new JLabel();
	JLabel lbl46=new JLabel();
	JLabel lbl47=new JLabel();
	JLabel lbl48=new JLabel();
	JLabel lbl49=new JLabel();
	JLabel lbl50=new JLabel();
	
	JButton btn1=new JButton();
	JButton btn2=new JButton();
	JButton btn3=new JButton();
	JButton btn4=new JButton();
	JButton btn5=new JButton();
	JButton btn6=new JButton();
	JButton btn7=new JButton();
	JButton btn8=new JButton();
	JButton btn9=new JButton();
	JButton btn10=new JButton();
	JButton btn11=new JButton();
	JButton btn12=new JButton();
	JButton btn13=new JButton();
	JButton btn14=new JButton();
	JButton btn15=new JButton();
	JButton btn16=new JButton();
	JButton btn17=new JButton();
	JButton btn18=new JButton();
	JButton btn19=new JButton();
	JButton btn20=new JButton();
	JButton btn21=new JButton();
	JButton btn22=new JButton();
	JButton btn23=new JButton();
	JButton btn24=new JButton();
	JButton btn25=new JButton();
	
	JComboBox<String> cb1;
	JComboBox<String> cb2;
	JComboBox<String> cb3;
	JComboBox<String> cb4;
	JComboBox<String> cb5;
	JComboBox<String> cb6;
	JComboBox<String> cb7;
	JComboBox<String> cb8;
	JComboBox<String> cb9;
	
	JTextField txt1=new JTextField();
	JTextField txt2=new JTextField();
	JTextField txt3=new JTextField();
	JTextField txt4=new JTextField();
	JTextField txt5=new JTextField();
	JTextField txt6=new JTextField();
	JTextField txt7=new JTextField();
	JTextField txt8=new JTextField();
	JTextField txt9=new JTextField();
	JTextField txt10=new JTextField();
	JTextField txt11=new JTextField();
	JTextField txt12=new JTextField();
	JTextField txt13=new JTextField();
	JTextField txt14=new JTextField();
	JTextField txt15=new JTextField();
	JTextField txt16=new JTextField();
	JTextField txt17=new JTextField();
	JTextField txt18=new JTextField();
	JTextField txt19=new JTextField();
	JTextField txt20=new JTextField();
	JTextField txt21=new JTextField();
	JTextField txt22=new JTextField();
	JTextField txt23=new JTextField();
	JTextField txt24=new JTextField();
	JTextField txt25=new JTextField();
	JTextField txt26=new JTextField();
	JTextField txt27=new JTextField();
	JTextField txt28=new JTextField();
	JTextField txt29=new JTextField();
	JTextField txt30=new JTextField();
	JTextField txt31=new JTextField();
	JTextField txt32=new JTextField();
	JTextField txt33=new JTextField();
	JTextField txt34=new JTextField();
	JTextField txt35=new JTextField();
	JTextField txt36=new JTextField();
	JTextField txt37=new JTextField();
	JTextField txt38=new JTextField();
	JTextField txt39=new JTextField();
	JTextField txt40=new JTextField();
	JTextField txt41=new JTextField();
	JTextField txt42=new JTextField();
	JTextField txt43=new JTextField();
	JTextField txt44=new JTextField();
	JTextField txt45=new JTextField();
	JTextField txt46=new JTextField();
	JTextField txt47=new JTextField();
	JTextField txt48=new JTextField();
	JTextField txt49=new JTextField();
	JTextField txt50=new JTextField();
	
	String bool_f[]= {"false","true"};
	String bool_t[]= {"true","false"};
	String input_selection[]= {"UNIFORM","SMALL_TESTS"};
	
	Font fh=new Font("Trebuchet MS",Font.BOLD,12);
	Font fs=new Font("Trebuchet MS",Font.BOLD,13);
	Font fl=new Font("Serif",Font.BOLD,40);
	Font fi=new Font("Trebuchet MS",Font.ITALIC,12);
	Font fe=new Font("Trebuchet MS",Font.PLAIN,11);
	
	public second() {
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setBounds(200, 50, 1100, 700);
	f.setTitle("Randoop UI");
	f.setResizable(false);
	
	cont.setBackground(Color.darkGray);
	cont.setLayout(null);
	
	
	File flog=new File(conf+"1.txt");
	File op=new File("output1.txt");
	List<String> result = null;
	if(flog.exists()) {
		
	try (Stream<String> lines = Files.lines(Paths.get(conf+"1.txt"))) {
		result = lines.collect(Collectors.toList());
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
		
	
	}else if(op.exists()){
		try (Stream<String> lines = Files.lines(Paths.get("output1.txt"))) {
			result = lines.collect(Collectors.toList());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}else {
		ArrayList<String> list=new ArrayList<String>();
		list.add("path");
		list.add("filename");
		list.add("filename");
		list.add("filename");
		list.add("0.0");
		list.add("100000000");
		list.add("500");
		list.add("ErrorTest.java");
		list.add("RegressionTest.java");
		list.add("String");
		list.add("String");
		list.add("String");
		list.add("String");
		list.add("String");
		list.add("String");
		list.add("String");
		list.add("0");
		list.add("60000");
		list.add("1000");
		list.add("String");
		list.add("5000");
		
		
		
		FileWriter writer;
		try {
			writer = new FileWriter("output1.txt");
		  
		for(String str: list) {
		  writer.write(str + System.lineSeparator());
		}
		writer.close();}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (Stream<String> lines = Files.lines(Paths.get("output1.txt"))) {
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
	
	lbl3.setBounds(10,90,150,20);
	lbl3.setText("--junit-output-dir");
	lbl3.setFont(fi);
	lbl3.setForeground(Color.WHITE);
	lbl3.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt1.setBounds(170,90,200,20);
	txt1.setFont(fi);
	txt1.setForeground(Color.BLACK);
	txt1.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(0).equals("path") || !result.get(0).equals("")) {
		txt1.setText(result.get(0));
	}
	else{txt1.setText("path");}
	
	btn1.setBounds(380,90,60,20);
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
 				txt1.setText("");
 			}
 			
          }}); 
	
	lbl4.setBounds(10,120,150,20);
	lbl4.setText("--log");
	lbl4.setFont(fi);
	lbl4.setForeground(Color.WHITE);
	lbl4.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt2.setBounds(170,120,200,20);
	txt2.setFont(fi);
	txt2.setForeground(Color.BLACK);
	txt2.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(1).equals("path")||!result.get(1).equals("")) {
		txt2.setText(result.get(1));
	}
	else{txt2.setText("filename");}
	
	btn2.setBounds(380,120,60,20);
	btn2.setText("Select");
	btn2.setBackground(clr1);
	btn2.setForeground(Color.BLACK);
	btn2.setFont(fi);
	btn2.setCursor(cr);
	btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().createFileObject(txt1.getText()));
 			j.setFileSelectionMode(JFileChooser.FILES_ONLY);
 			int r = j.showSaveDialog(null);
 			if (r == JFileChooser.APPROVE_OPTION) { 
                 txt2.setText(j.getSelectedFile().getAbsolutePath());
 			}
 			else {
 				txt2.setText("");
 			}
          }}); 
	
	lbl5.setBounds(10,150,150,20);
	lbl5.setText("--selection-log");
	lbl5.setFont(fi);
	lbl5.setForeground(Color.WHITE);
	lbl5.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt3.setBounds(170,150,200,20);
	txt3.setFont(fi);
	txt3.setForeground(Color.BLACK);
	txt3.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(2).equals("filename")||!result.get(2).equals("")) {
		txt3.setText(result.get(2));
	}
	else{txt3.setText("filename");}
	
	btn3.setBounds(380,150,60,20);
	btn3.setText("Select");
	btn3.setBackground(clr1);
	btn3.setForeground(Color.BLACK);
	btn3.setFont(fi);
	btn3.setCursor(cr);
	btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().createFileObject(txt1.getText()));
	 			j.setFileSelectionMode(JFileChooser.FILES_ONLY);
	 			int r = j.showSaveDialog(null);
	 			if (r == JFileChooser.APPROVE_OPTION) { 
	                 txt3.setText(j.getSelectedFile().getName());
	 			}
	 			else {
	 				txt3.setText("");
	 			}
          }}); 
	
	lbl6.setBounds(10,180,150,20);
	lbl6.setText("--operation-history-log");
	lbl6.setFont(fi);
	lbl6.setForeground(Color.WHITE);
	lbl6.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt4.setBounds(170,180,200,20);
	txt4.setFont(fi);
	txt4.setForeground(Color.BLACK);
	txt4.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(3).equals("filename")||!result.get(3).equals("")) {
		txt4.setText(result.get(3));
	}
	else{txt4.setText("filename");}
	
	btn4.setBounds(380,180,60,20);
	btn4.setText("Select");
	btn4.setBackground(clr1);
	btn4.setForeground(Color.BLACK);
	btn4.setFont(fi);
	btn4.setCursor(cr);
	btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().createFileObject(txt1.getText()));
	 			j.setFileSelectionMode(JFileChooser.FILES_ONLY);
	 			int r = j.showSaveDialog(null);
	 			if (r == JFileChooser.APPROVE_OPTION) { 
	                 txt4.setText(j.getSelectedFile().getName());
	 			}
	 			else {
	 				txt4.setText("");
	 			}
          }}); 
	
	lbl7.setBounds(450,90,180,20);
	lbl7.setText("--alias-ratio");
	lbl7.setFont(fi);
	lbl7.setForeground(Color.WHITE);
	lbl7.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt5.setBounds(640,90,120,20);
	txt5.setFont(fi);
	txt5.setForeground(Color.BLACK);
	txt5.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(4).equals("0.0")||!result.get(4).equals("")) {
		txt5.setText(result.get(4));
	}
	else{txt5.setText("0.0");}
	
	lbl8.setBounds(770,90,180,20);
	lbl8.setText("--clear");
	lbl8.setFont(fi);
	lbl8.setForeground(Color.WHITE);
	lbl8.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt6.setBounds(950,90,120,20);
	txt6.setFont(fi);
	txt6.setForeground(Color.BLACK);
	txt6.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(5).equals("100000000")||!result.get(5).equals("")) {
		txt6.setText(result.get(5));
	}
	else{txt6.setText("100000000");}
	
	lbl9.setBounds(450,120,180,20);
	lbl9.setText("--testsperfile");
	lbl9.setFont(fi);
	lbl9.setForeground(Color.WHITE);
	lbl9.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt7.setBounds(640,120,120,20);
	txt7.setFont(fi);
	txt7.setForeground(Color.BLACK);
	txt7.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(6).equals("500")||!result.get(6).equals("")) {
		txt7.setText(result.get(6));
	}
	else{txt7.setText("500");}
	
	lbl10.setBounds(770,120,180,20);
	lbl10.setText("--error-test-basename");
	lbl10.setFont(fi);
	lbl10.setForeground(Color.WHITE);
	lbl10.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt8.setBounds(950,120,120,20);
	txt8.setFont(fi);
	txt8.setForeground(Color.BLACK);
	txt8.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(7).equals("ErrorTest.java")||!result.get(7).equals("")) {
		txt8.setText(result.get(7));
	}
	else{txt8.setText("ErrorTest.java");}
	
	lbl11.setBounds(450,150,180,20);
	lbl11.setText("--regression-test-basename");
	lbl11.setFont(fi);
	lbl11.setForeground(Color.WHITE);
	lbl11.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt9.setBounds(640,150,120,20);
	txt9.setFont(fi);
	txt9.setForeground(Color.BLACK);
	txt9.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(8).equals("RegressionTest.java")||!result.get(8).equals("")) {
		txt9.setText(result.get(8));
	}
	else{txt9.setText("RegressionTest.java");}
	
	lbl12.setBounds(770,150,180,20);
	lbl12.setText("--junit-package-name");
	lbl12.setFont(fi);
	lbl12.setForeground(Color.WHITE);
	lbl12.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt10.setBounds(950,150,120,20);
	txt10.setFont(fi);
	txt10.setForeground(Color.BLACK);
	txt10.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(9).equals("String")||!result.get(9).equals("")) {
		txt10.setText(result.get(9));
	}
	else{txt10.setText("String");}
	
	lbl13.setBounds(450,180,180,20);
	lbl13.setText("--junit-before-each");
	lbl13.setFont(fi);
	lbl13.setForeground(Color.WHITE);
	lbl13.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt11.setBounds(640,180,120,20);
	txt11.setFont(fi);
	txt11.setForeground(Color.BLACK);
	txt11.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(10).equals("String")||!result.get(10).equals("")) {
		txt11.setText(result.get(10));
	}
	else{txt11.setText("String");}
	
	lbl14.setBounds(770,180,180,20);
	lbl14.setText("--junit-after-each");
	lbl14.setFont(fi);
	lbl14.setForeground(Color.WHITE);
	lbl14.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt12.setBounds(950,180,120,20);
	txt12.setFont(fi);
	txt12.setForeground(Color.BLACK);
	txt12.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(11).equals("String")||!result.get(11).equals("")) {
		txt12.setText(result.get(11));
	}
	else{txt12.setText("String");}
	
	/*lbl15.setBounds(00,180,1100,70);
	lbl15.setText("_____________________________________________________"
			+ "________________________________________________________"
			+ "_________________________________________________________"
			+ "_________________");
	lbl15.setFont(fi);
	lbl15.setForeground(Color.WHITE);
	lbl15.setHorizontalAlignment(SwingConstants.LEFT);*/
	
	lbl16.setBounds(10,210,150,20);
	lbl16.setText("--junit-before-all");
	lbl16.setFont(fi);
	lbl16.setForeground(Color.WHITE);
	lbl16.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt13.setBounds(170,210,200,20);
	txt13.setFont(fi);
	txt13.setForeground(Color.BLACK);
	txt13.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(12).equals("String")||!result.get(12).equals("")) {
		txt13.setText(result.get(12));
	}
	else{txt13.setText("String");}
	
	lbl17.setBounds(450,210,180,20);
	lbl17.setText("--junit-after-all");
	lbl17.setFont(fi);
	lbl17.setForeground(Color.WHITE);
	lbl17.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt14.setBounds(640,210,120,20);
	txt14.setFont(fi);
	txt14.setForeground(Color.BLACK);
	txt14.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(13).equals("String")||!result.get(13).equals("")) {
		txt14.setText(result.get(13));
	}
	else{txt14.setText("String");}
	
	lbl18.setBounds(770,210,180,20);
	lbl18.setText("-D --system-props");
	lbl18.setFont(fi);
	lbl18.setForeground(Color.WHITE);
	lbl18.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt15.setBounds(950,210,120,20);
	txt15.setFont(fi);
	txt15.setForeground(Color.BLACK);
	txt15.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(14).equals("String")||!result.get(14).equals("")) {
		txt15.setText(result.get(14));
	}
	else{txt15.setText("String");}
	
	lbl19.setBounds(10,240,150,20);
	lbl19.setText("--jvm-max-memory");
	lbl19.setFont(fi);
	lbl19.setForeground(Color.WHITE);
	lbl19.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt16.setBounds(170,240,200,20);
	txt16.setFont(fi);
	txt16.setForeground(Color.BLACK);
	txt16.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(15).equals("String")||!result.get(15).equals("")) {
		txt16.setText(result.get(15));
	}
	else{txt16.setText("String");}
	
	lbl20.setBounds(450,240,180,20);
	lbl20.setText("--randomseed");
	lbl20.setFont(fi);
	lbl20.setForeground(Color.WHITE);
	lbl20.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt17.setBounds(640,240,120,20);
	txt17.setFont(fi);
	txt17.setForeground(Color.BLACK);
	txt17.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(16).equals("0")||!result.get(16).equals("")) {
		txt17.setText(result.get(16));
	}
	else{txt17.setText("0");}
	
	lbl21.setBounds(770,240,180,20);
	lbl21.setText("--progressintervalmillis");
	lbl21.setFont(fi);
	lbl21.setForeground(Color.WHITE);
	lbl21.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt18.setBounds(950,240,120,20);
	txt18.setFont(fi);
	txt18.setForeground(Color.BLACK);
	txt18.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(17).equals("60000")||!result.get(17).equals("")) {
		txt18.setText(result.get(17));
	}
	else{txt18.setText("60000");}
	
	lbl22.setBounds(10,270,150,20);
	lbl22.setText("--progressintervalsteps");
	lbl22.setFont(fi);
	lbl22.setForeground(Color.WHITE);
	lbl22.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt19.setBounds(170,270,200,20);
	txt19.setFont(fi);
	txt19.setForeground(Color.BLACK);
	txt19.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(18).equals("1000")||!result.get(18).equals("")) {
		txt19.setText(result.get(18));
	}
	else{txt19.setText("1000");}
	
	lbl23.setBounds(450,270,180,20);
	lbl23.setText("--visitor");
	lbl23.setFont(fi);
	lbl23.setForeground(Color.WHITE);
	lbl23.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt20.setBounds(640,270,120,20);
	txt20.setFont(fi);
	txt20.setForeground(Color.BLACK);
	txt20.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(19).equals("String")||!result.get(19).equals("")) {
		txt20.setText(result.get(19));
	}
	else{txt20.setText("String");}
	
	lbl24.setBounds(770,270,180,20);
	lbl24.setText("--call-timeout");
	lbl24.setFont(fi);
	lbl24.setForeground(Color.WHITE);
	lbl24.setHorizontalAlignment(SwingConstants.CENTER);
	
	txt21.setBounds(950,270,120,20);
	txt21.setFont(fi);
	txt21.setForeground(Color.BLACK);
	txt21.setHorizontalAlignment(SwingConstants.LEFT);
	if (!result.get(20).equals("5000")||!result.get(20).equals("")) {
		txt21.setText(result.get(20));
	}
	else{txt21.setText("5000");}
	
	lbl25.setBounds(10,300,150,20);
	lbl25.setText("--input-selection");
	lbl25.setFont(fi);
	lbl25.setForeground(Color.WHITE);
	lbl25.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb1= new JComboBox<String>(input_selection);
	cb1.setBounds(170,300,200,20);
	cb1.setFont(fi);
	cb1.setForeground(Color.BLACK);
	
	lbl26.setBounds(450,300,180,20);
	lbl26.setText("--dont-output-tests");
	lbl26.setFont(fi);
	lbl26.setForeground(Color.WHITE);
	lbl26.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb2= new JComboBox<String>(bool_f);
	cb2.setBounds(640,300,120,20);
	cb2.setFont(fi);
	cb2.setForeground(Color.BLACK);
	
	lbl27.setBounds(770,300,180,20);
	lbl27.setText("--junit-reflection-allowed");
	lbl27.setFont(fi);
	lbl27.setForeground(Color.WHITE);
	lbl27.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb3= new JComboBox<String>(bool_t);
	cb3.setBounds(950,300,120,20);
	cb3.setFont(fi);
	cb3.setForeground(Color.BLACK);
	
	lbl28.setBounds(10,330,150,20);
	lbl28.setText("--deterministic");
	lbl28.setFont(fi);
	lbl28.setForeground(Color.WHITE);
	lbl28.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb4= new JComboBox<String>(bool_f);
	cb4.setBounds(170,330,200,20);
	cb4.setFont(fi);
	cb4.setForeground(Color.BLACK);
	
	lbl29.setBounds(450,330,180,20);
	lbl29.setText("--progressdisplay");
	lbl29.setFont(fi);
	lbl29.setForeground(Color.WHITE);
	lbl29.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb5= new JComboBox<String>(bool_t);
	cb5.setBounds(640,330,120,20);
	cb5.setFont(fi);
	cb5.setForeground(Color.BLACK);
	
	lbl30.setBounds(770,330,180,20);
	lbl30.setText("--debug-checks");
	lbl30.setFont(fi);
	lbl30.setForeground(Color.WHITE);
	lbl30.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb6= new JComboBox<String>(bool_f);
	cb6.setBounds(950,330,120,20);
	cb6.setFont(fi);
	cb6.setForeground(Color.BLACK);
	
	lbl31.setBounds(10,360,150,20);
	lbl31.setText("--print-non-compiling-file");
	lbl31.setFont(fi);
	lbl31.setForeground(Color.WHITE);
	lbl31.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb7= new JComboBox<String>(bool_f);
	cb7.setBounds(170,360,200,20);
	cb7.setFont(fi);
	cb7.setForeground(Color.BLACK);
	
	lbl32.setBounds(450,360,180,20);
	lbl32.setText("--use-threads");
	lbl32.setFont(fi);
	lbl32.setForeground(Color.WHITE);
	lbl32.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb8= new JComboBox<String>(bool_f);
	cb8.setBounds(640,360,120,20);
	cb8.setFont(fi);
	cb8.setForeground(Color.BLACK);
	
	lbl46.setBounds(770,360,180,20);
	lbl46.setText("--forbid_null");
	lbl46.setFont(fi);
	lbl46.setForeground(Color.WHITE);
	lbl46.setHorizontalAlignment(SwingConstants.CENTER);
	
	cb9= new JComboBox<String>(bool_f);
	cb9.setBounds(950,360,120,20);
	cb9.setFont(fi);
	cb9.setForeground(Color.BLACK);
	
	btn11.setBounds(790,600, 110, 20);
	btn11.setText("Previous");
	btn11.setBackground(clr1);
	btn11.setForeground(Color.BLACK);
	btn11.setFont(fi);
	btn11.setCursor(cr);
	btn11.addActionListener(new ActionListener() {
         
		public void actionPerformed(ActionEvent e) {
			
			f.dispose();
			new first();
 			}
	}); 
	
	/*txt22.setBounds(110,400,600,20);
	txt22.setFont(fi);
	txt22.setForeground(Color.BLACK);
	txt22.setHorizontalAlignment(SwingConstants.LEFT);*/
	
	
	btn12.setBounds(910,600, 110, 20);
	btn12.setText("RUN");
	btn12.setBackground(clr1);
	btn12.setForeground(Color.BLACK);
	btn12.setFont(fi);
	btn12.setCursor(cr);
	btn12.addActionListener(new ActionListener() {
         
		public void actionPerformed(ActionEvent e) {
			
			ArrayList<String> list=new ArrayList<String>();
			list.add(txt1.getText());
			list.add(txt2.getText());
			list.add(txt3.getText());
			list.add(txt4.getText());
			list.add(txt5.getText());
			list.add(txt6.getText());
			list.add(txt7.getText());
			list.add(txt8.getText());
			list.add(txt9.getText());
			list.add(txt10.getText());
			list.add(txt11.getText());
			list.add(txt12.getText());
			list.add(txt13.getText());
			list.add(txt14.getText());
			list.add(txt15.getText());
			list.add(txt16.getText());
			list.add(txt17.getText());
			list.add(txt18.getText());
			list.add(txt19.getText());
			list.add(txt20.getText());
			list.add(txt21.getText());
			
			
			
			FileWriter writer;
			try {
				writer = new FileWriter(conf+"1.txt");
			  
			for(String str: list) {
			  writer.write(str + System.lineSeparator());
			}
			writer.close();}
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			if (txt1.getText().equals("path") ||
					txt1.getText().equals("") ) {
				JOptionPane.showMessageDialog(null, "Required Field empty!",
			            "Message Dialog", JOptionPane.PLAIN_MESSAGE);
			}else {
				if(!txt1.getText().equals("path")) {
					com= com + " " + lbl3.getText() + "="+ txt1.getText();
				}

				if(!txt2.getText().equals("filename")) {
					com= com + " " + lbl4.getText() + "="+ txt2.getText();
				}

				if(!txt3.getText().equals("filename")) {
					com= com + " " + lbl5.getText() + "="+ txt3.getText();
				}

				if(!txt4.getText().equals("filename")) {
					com= com + " " + lbl6.getText() + "="+ txt4.getText();
				}

				if(!txt5.getText().equals("0.0")) {
					com= com + " " + lbl7.getText() + "="+ txt5.getText();
				}

				if(!txt6.getText().equals("100000000")) {
					com= com + " " + lbl8.getText() + "="+ txt6.getText();
				}

				if(!txt7.getText().equals("500")) {
					com= com + " " + lbl9.getText() + "="+ txt7.getText();
				}

				if(!txt8.getText().equals("ErrorTest.java")) {
					com= com + " " + lbl10.getText() + "="+ txt8.getText();
				}

				if(!txt9.getText().equals("RegressionTest.java")) {
					com= com + " " + lbl11.getText() + "="+ txt9.getText();
				}

				if(!txt10.getText().equals("String")) {
					com= com + " " + lbl12.getText() + "="+ txt10.getText();
				}

				if(!txt11.getText().equals("String")) {
					com= com + " " + lbl13.getText() + "="+ txt11.getText();
				}

				if(!txt12.getText().equals("String")) {
					com= com + " " + lbl14.getText() + "="+ txt12.getText();
				}

				if(!txt13.getText().equals("String")) {
					com= com + " " + lbl16.getText() + "="+ txt13.getText();
				}

				if(!txt14.getText().equals("String")) {
					com= com + " " + lbl17.getText() + "="+ txt14.getText();
				}

				if(!txt15.getText().equals("String")) {
					com= com + " " + lbl18.getText() + "="+ txt15.getText();
				}

				if(!txt16.getText().equals("String")) {
					com= com + " " + lbl19.getText() + "="+ txt16.getText();
				}

				if(!txt17.getText().equals("0")) {
					com= com + " " + lbl20.getText() + "="+ txt17.getText();
				}

				if(!txt18.getText().equals("60000")) {
					com= com + " " + lbl21.getText() + "="+ txt18.getText();
				}

				if(!txt19.getText().equals("1000")) {
					com= com + " " + lbl22.getText() + "="+ txt19.getText();
				}

				if(!txt20.getText().equals("String")) {
					com= com + " " + lbl23.getText() + "="+ txt20.getText();
				}
				if(!txt21.getText().equals("5000")) {
					com= com + " " + lbl24.getText() + "="+ txt21.getText();
				}
				if(!(cb1.getSelectedItem().toString()).equals("UNIFORM")) {
					com= com + " " + lbl25.getText() + "=" + cb1.getSelectedItem();
				}
				if(!(cb2.getSelectedItem().toString()).equals("false")) {
					com= com + " " + lbl26.getText() + "=" + cb2.getSelectedItem();
				}
				if(!(cb3.getSelectedItem().toString()).equals("true")) {
					com= com + " " + lbl27.getText() + "=" + cb3.getSelectedItem();
				}
				if(!(cb4.getSelectedItem().toString()).equals("false")) {
					com= com + " " + lbl28.getText() + "=" + cb4.getSelectedItem();
				}
				if(!(cb5.getSelectedItem().toString()).equals("true")) {
					com= com + " " + lbl29.getText() + "=" + cb5.getSelectedItem();
				}
				if(!(cb6.getSelectedItem().toString()).equals("false")) {
					com= com + " " + lbl30.getText() + "=" + cb6.getSelectedItem();
				}
				if(!(cb7.getSelectedItem().toString()).equals("false")) {
					com= com + " " + lbl31.getText() + "=" + cb7.getSelectedItem();
				}
				if(!(cb8.getSelectedItem().toString()).equals("false")) {
					com= com + " " + lbl32.getText() + "=" + cb8.getSelectedItem();
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
				    
				try
		        {
					textArea.append(String.valueOf((com+"\n")));
			        Process proc=Runtime.getRuntime().exec(com);
			        InputStream lsOut = proc.getInputStream();
			        InputStreamReader r = new InputStreamReader(lsOut);
			        BufferedReader in = new BufferedReader(r);

			        String line;
			        while ((line = in.readLine()) != null) {
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
	
	btn13.setBounds(670,600, 110, 20);
	btn13.setText("Save");
	btn13.setBackground(clr1);
	btn13.setForeground(Color.BLACK);
	btn13.setFont(fi);
	btn13.setCursor(cr);
	btn13.addActionListener(new ActionListener() {
         
		public void actionPerformed(ActionEvent e) {
			
			ArrayList<String> list=new ArrayList<String>();
			list.add(txt1.getText());
			list.add(txt2.getText());
			list.add(txt3.getText());
			list.add(txt4.getText());
			list.add(txt5.getText());
			list.add(txt6.getText());
			list.add(txt7.getText());
			list.add(txt8.getText());
			list.add(txt9.getText());
			list.add(txt10.getText());
			list.add(txt11.getText());
			list.add(txt12.getText());
			list.add(txt13.getText());
			list.add(txt14.getText());
			list.add(txt15.getText());
			list.add(txt16.getText());
			list.add(txt17.getText());
			list.add(txt18.getText());
			list.add(txt19.getText());
			list.add(txt20.getText());
			list.add(txt21.getText());
			
			
			
			FileWriter writer;
			try {
				writer = new FileWriter(conf+"1.txt");
			  
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
	f.add(lbl11);
	f.add(lbl12);
	f.add(lbl13);
	f.add(lbl14);
	f.add(lbl15);
	f.add(lbl16);
	f.add(lbl17);
	f.add(lbl18);
	f.add(lbl19);
	f.add(lbl20);
	f.add(lbl21);
	f.add(lbl22);
	f.add(lbl23);
	f.add(lbl24);
	f.add(lbl25);
	f.add(lbl26);
	f.add(lbl27);
	f.add(lbl28);
	f.add(lbl29);
	f.add(lbl30);
	f.add(lbl31);
	f.add(lbl32);
	f.add(lbl33);
	f.add(lbl34);
	f.add(lbl35);
	f.add(lbl36);
	f.add(lbl37);
	f.add(lbl38);
	f.add(lbl39);
	f.add(lbl40);
	f.add(lbl41);
	f.add(lbl42);
	f.add(lbl43);
	f.add(lbl44);
	f.add(lbl45);
	f.add(lbl46);
	f.add(lbl47);
	f.add(lbl48);
	f.add(lbl49);
	f.add(lbl50);
	
	f.add(cb1);
	f.add(cb2);
	f.add(cb3);
	f.add(cb4);
	f.add(cb5);
	f.add(cb6);
	f.add(cb7);
	f.add(cb8);
	f.add(cb9);
	
	f.add(btn1);
	f.add(btn2);
	f.add(btn3);
	f.add(btn4);
	f.add(btn5);
	f.add(btn6);
	f.add(btn7);
	f.add(btn8);
	f.add(btn9);
	f.add(btn10);
	f.add(btn11);
	f.add(btn12);
	f.add(btn13);
	f.add(btn14);
	f.add(btn15);
	f.add(btn16);
	f.add(btn17);
	f.add(btn18);
	f.add(btn19);
	f.add(btn20);
	f.add(btn21);
	f.add(btn22);
	f.add(btn23);
	f.add(btn24);
	f.add(btn25);
	
	f.add(txt1);
	f.add(txt2);
	f.add(txt3);
	f.add(txt4);
	f.add(txt5);
	f.add(txt6);
	f.add(txt7);
	f.add(txt8);
	f.add(txt9);
	f.add(txt10);
	f.add(txt11);
	f.add(txt12);
	f.add(txt13);
	f.add(txt14);
	f.add(txt15);
	f.add(txt16);
	f.add(txt17);
	f.add(txt18);
	f.add(txt19);
	f.add(txt20);
	f.add(txt21);
	f.add(txt22);
	f.add(txt23);
	f.add(txt24);
	f.add(txt25);
	f.add(txt26);
	f.add(txt27);
	f.add(txt28);
	f.add(txt29);
	f.add(txt30);
	f.add(txt31);
	f.add(txt32);
	f.add(txt33);
	f.add(txt34);
	f.add(txt35);
	f.add(txt36);
	f.add(txt37);
	f.add(txt38);
	f.add(txt39);
	f.add(txt40);
	f.add(txt41);
	f.add(txt42);
	f.add(txt43);
	f.add(txt44);
	f.add(txt45);
	f.add(txt46);
	f.add(txt47);
	f.add(txt48);
	f.add(txt49);
	f.add(txt50);
	
	f.setVisible(true);
	
}
	/*public static void main(String[] args) {
		new second();
	}*/

}
