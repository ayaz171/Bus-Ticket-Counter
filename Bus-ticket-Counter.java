


import java.awt.Color; 

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class  BusTicketCounter implements ActionListener {
	
	private JFrame frame;
 
	private JLabel textt;
    private JLabel nameL;
	private JLabel addressL;
	private JLabel phoneL;
	private JLabel dateL;
	private JLabel coachtypeL;
	private JLabel selectbusL;
	private JLabel destinitionL;
	private JLabel Money;
	private JLabel SeatNo;
	private JLabel image;
		
	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem print;
	private JMenuItem save;
	
	private JTextField name;
	private JTextField address;
	private JTextField phone;
	private JTextField date;
	
	private JComboBox coachtype;
	private JComboBox selectbus;
	private JComboBox destinition;
	private JComboBox MoneyL;
	private JComboBox Chair;

	
	private JButton AdvanceTicket;
	private JButton RunningTicket;
	private JButton done;
	private JButton reset;
	public BusTicketCounter(){
		frame = new JFrame();
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Asus\\eclipse-workspace\\BusTicketCounter/ddd.jpg")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textt = new JLabel("                  HEllO SIR WHICH TICKET YOU WANT");  
    
	    AdvanceTicket =  new JButton("ADVANCE TICKET");
	    AdvanceTicket.addActionListener(this);
	    RunningTicket =  new JButton("Running Ticket");
	    RunningTicket.addActionListener(this);		   
	    GridLayout g = new GridLayout(4,2); 
	    frame.getContentPane().setLayout(g);
	    frame.getContentPane().add(textt);
	    frame.getContentPane().add(AdvanceTicket);
	   
	    
	    frame.getContentPane().add(RunningTicket);
	    frame.setResizable(false);
		frame.pack();
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==AdvanceTicket){
			frame.setVisible(false);
			menuBar = new JMenuBar();
			frame =  new JFrame();
			nameL = new JLabel("  Name");
			addressL = new JLabel("  Address");
			phoneL = new JLabel("  Phone");
			dateL = new JLabel("   Date");
			coachtypeL = new JLabel("  Coach");
			SeatNo = new JLabel("  SeatNo. ");
			selectbusL = new JLabel("  Bus");
			destinitionL = new JLabel("  Destination");
			Money = new JLabel("  Money");
			
			name = new JTextField();
			address = new JTextField();
			phone =  new JTextField();
			date = new JTextField();
			
			coachtype = new JComboBox();
			selectbus = new JComboBox();
			Chair = new JComboBox();
		    destinition = new JComboBox();
		    MoneyL = new JComboBox();
		    
		    done =  new JButton("Done");
		    done.addActionListener(this);
		    reset =  new JButton("reset");
		    reset.addActionListener(this);
		    
		    menuBar = new JMenuBar();
		    file = new JMenu("File");
			print = new JMenuItem("Print");
			save = new JMenuItem("Save");
			
		    
		    // initialize the choices of ComboBox
		    
		    
		    coachtype.addItem("AC");
		    coachtype.addItem("NON AC");
		   
		    
		    //OFFERING BUS 
		    String[] option = {"VOLVO I SHIFT","SCANIA","HYUNDAI","HINO 1J","MAN 1J","STARLINE","NABIL","HANIF","HAQUE","BRTC"}; 

		    selectbus = new JComboBox(option);
		    //OFFERING ROUTES
		    
		   
		    String[] option2 = {"DHAKA TO FENI","DHAKA TO CTG","CTG TO DHAKA","DHAKA TO SYLHET","SYLHET TO DHAKA","COX TO DHAKA","DHAKA TO COX"
		    		,"RAJ TO DHAKA","DHAKA TO RAJ","DHAKA TO BENAPOL","BENAPOL TO DHAKA","DHAKA TO JESSORE","JESSORE TO DHAKA",
		    		"KHULNA TO DHAKA","DHAKA TO KUSHTIA","KUSHTIA TO DHAKA","DHAKA TO BOGRA","BOGRA TO DHAKA","DHAKA TO RANGPUR","RANGPUR TO DHAKA"}; 
		  
		    destinition = new JComboBox(option2);
		    //Offering Seat No.
		    String[] option3 = {"A1","A2","A3","A4","B1","B2","B3","B4","C1","C2","C3","C4","D1","D2","D3","D4","E1","E2","E3","E4",
		    		"F1","F2","F3","F4","G1","G2","G3","G4","H1","H2","H3","H4","I1","I2","I3","I4",};
		    Chair = new JComboBox(option3);
		     String[] option4 = {"300 taka","350 taka","370 taka","300 taka","400 taka","420 taka","500 taka","400 taka","420 taka","500 taka","700 taka","900 taka","1000 taka","1500 taka","2000 taka"};
		    MoneyL = new JComboBox(option4);
		    //declare the frame layout
		   
		    GridLayout g = new GridLayout(10,2); 
		    frame.getContentPane().setLayout(g);
		    
		    //ADD THE SWING COMPONENTS INTI THE FRAME 
		    file.add(print);
		    file.add(save);
		    menuBar.add(file);
			frame.setJMenuBar(menuBar);
		    frame.getContentPane().add(nameL);
		    frame.getContentPane().add(name);
		    frame.getContentPane().add(addressL);
		    frame.getContentPane().add(address);
		    frame.getContentPane().add(phoneL);
		    frame.getContentPane().add(phone);
		    frame.getContentPane().add(dateL);
		    frame.getContentPane().add(date);
		    
		    frame.getContentPane().add(coachtypeL);
		    frame.getContentPane().add(coachtype);
		    frame.getContentPane().add(selectbusL);
		    frame.getContentPane().add(selectbus);
		    frame.getContentPane().add(SeatNo);
		    frame.getContentPane().add(Chair);
		    frame.getContentPane().add(destinitionL);
		    frame.getContentPane().add(destinition);
		    frame.getContentPane().add(Money);
		    frame.getContentPane().add(MoneyL);
		    frame.getContentPane().add(done);
		    frame.getContentPane().add(reset);
		   
		    
		    
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(600,500);
		    frame.setTitle(" Wellcome to our Bus ticket Counter ");
		    frame.setLocation(350,100); 
		    frame.getContentPane().setBackground( Color.CYAN );
		   
		   
		}
		if(e.getSource()==RunningTicket){
			frame.setVisible(false);
			frame =  new JFrame();
			nameL = new JLabel("  Name");
			addressL = new JLabel("  Address");
			phoneL = new JLabel("  Phone");
		    dateL = new JLabel("  Date");
			coachtypeL = new JLabel("  Coach");
			SeatNo = new JLabel("  SeatNo. ");
			selectbusL = new JLabel("  Bus");
			destinitionL = new JLabel("  Destination");
			Money = new JLabel("   Money");
			
			name = new JTextField();
			address = new JTextField();
			phone =  new JTextField();
			date = new JTextField();
			coachtype = new JComboBox();
			selectbus = new JComboBox();
		    destinition = new JComboBox();
		    Chair = new JComboBox();
		    MoneyL = new JComboBox();
		    done =  new JButton("Done");
		    done.addActionListener(this);
		    reset =  new JButton("reset");
		    reset.addActionListener(this);
		    menuBar = new JMenuBar();
		    file = new JMenu("File");
			print = new JMenuItem("Print");
			save = new JMenuItem("Save");
		    
		   
		    
		    // initialize the choices of ComboBox
		    
		    coachtype.addItem("AC");
		    coachtype.addItem("NON AC");

		    
		    //OFFERING BUS 
		    String[] option = {"VOLVO I SHIFT","SCANIA","HYUNDAI","HINO 1J","HANIF","MAN 1J","STARLINE","NABIL","HAQUE","BRTC"}; 

		    selectbus = new JComboBox(option);
		    //OFFERING ROUTES
		    
		   
		    String[] option2 = {"DHAKA TO CTG","CTH TO DHAKA","DHAKA TO SYLHET","SYLHET TO DHAKA","COX TO DHAKA","DHAKA TO COX"
		    		,"RAJ TO DHAKA","DHAKA TO RAJ","DHAKA TO BENAPOL","BENAPOL TO DHAKA","DHAKA TO JESSORE","JESSORE TO DHAKA",
		    		"KHULNA TO DHAKA","DHAKA TO KUSHTIA","KUSHTIA TO DHAKA","DHAKA TO BOGRA","BOGRA TO DHAKA","DHAKA TO RANGPUR","RANGPUR TO DHAKA"}; 
		    destinition = new JComboBox(option2);
		    String[] option3 = {"A1","A2","A3","A4","B1","B2","B3","B4","C1","C2","C3","C4","D1","D2","D3","D4","E1","E2","E3","E4",
		    		"F1","F2","F3","F4","G1","G2","G3","G4","H1","H2","H3","H4","I1","I2","I3","I4",};
		    Chair = new JComboBox(option3);
		    String[] option4 = {"300 taka","350 taka","370 taka","300 taka","400 taka","420 taka","500 taka","400 taka","420 taka",
		    		"500 taka","700 taka","900 taka","1000 taka","1500 taka","2000 taka"};
		    MoneyL = new JComboBox(option4);
		    //declare the frame layout
		    
		    GridLayout g = new GridLayout(10,2); 
		    frame.getContentPane().setLayout(g);
		    
		    //ADD THE SWING COMPONENTS INTI THE FRAME 
		    file.add(print);
		    file.add(save);
		    menuBar.add(file);
			frame.setJMenuBar(menuBar);
		    frame.getContentPane().add(nameL);
		    frame.getContentPane().add(name);
		    frame.getContentPane().add(addressL);
		    frame.getContentPane().add(address);
		    frame.getContentPane().add(phoneL);
		    frame.getContentPane().add(phone);
		    frame.getContentPane().add(dateL);
		    frame.getContentPane().add(date);
		    frame.getContentPane().add(coachtypeL);
		    frame.getContentPane().add(coachtype);
		    frame.getContentPane().add(selectbusL);
		    frame.getContentPane().add(selectbus);
		    frame.getContentPane().add(SeatNo);
		    frame.getContentPane().add(Chair);
		    frame.getContentPane().add(destinitionL);
		    frame.getContentPane().add(destinition);
		    frame.getContentPane().add(Money);
		    frame.getContentPane().add(MoneyL);
		    frame.getContentPane().add(done);
		    frame.getContentPane().add(reset);
		    
		    
		    
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(800,500);
		     frame.setTitle(" Welcome to our Bus ticket Counter ");
		    frame.setLocation(700,100); 
		  frame.getContentPane().setBackground( Color.cyan );
		 
		   
		    
		}
		if(e.getSource()==done){
			frame.dispose();
			showInfo();
		}
		if(e.getSource()==reset){
			name.setText("");
			address.setText("");
			phone.setText("");
			date.setText("");
			coachtype.setSelectedIndex(0);
			selectbus.setSelectedIndex(0);
			destinition.setSelectedIndex(0);
			Chair.setSelectedIndex(0);
			MoneyL.setSelectedIndex(0);
					}
		
	}

	public void showInfo(){
		try{
			File f1 = new File("Ticket.txt");
			FileWriter fw = new FileWriter(f1);
			
		
		
		fw.write(name.getText()+"\n");
		fw.write(address.getText()+"\n");
		fw.write(phone.getText()+"\n");
		fw.write(date.getText()+"\n");
		fw.write(coachtype.getSelectedItem().toString()+"\n");
		fw.write(selectbus.getSelectedItem().toString()+"\n");
		fw.write(Chair.getSelectedItem().toString()+"");
		fw.write(destinition.getSelectedItem().toString()+"\n");
		fw.write(destinition.getSelectedItem().toString()+"\n");
		fw.write(MoneyL.getSelectedItem().toString()+"\n");
		System.out.println("    Welcome to our bus ticket counter \n ");
		
		//PersonalInfo
		System.out.println("   Name           : "+name.getText());
		System.out.println("   Address        : "+address.getText());
		System.out.println("   Phone          : "+phone.getText());
		System.out.println("   Date           : "+date.getText());
		
		System.out.println("   COACH          : "+coachtype.getSelectedItem().toString());
		System.out.println("   BUS            : "+selectbus.getSelectedItem().toString());
		System.out.println("   SEAT NO        : "+Chair.getSelectedItem().toString());
		System.out.println("   Destination    : "+destinition.getSelectedItem().toString());
		System.out.println("   Ammount of Cost: "+MoneyL.getSelectedItem().toString());
		System.out.println("   \n \n    THANK YOU FOR TRAVELLING WITH US ");
		fw.close();
	}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


