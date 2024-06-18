package AllClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

public class NewStationKM extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel rootid;
    private JTextField trootid;
    private JLabel numsta;
    private JTextField tnumsta;
    private JButton sub;
    private JTextField sta1;
    private JLabel lsta1;
    private JTextField sta2;
    private JLabel lsta2;
    private JTextField sta3;
    private JLabel lsta3;
    private JTextField sta4;
    private JLabel lsta4;
    private JTextField sta5;
    private JLabel lsta5;
    private JTextField sta6;
    private JLabel lsta6;
    private JTextField sta7;
    private JLabel lsta7;
    private JTextField sta8;
    private JLabel lsta8;
    private JTextField sta9;
    private JLabel lsta9;
    private JTextField sta10;
    private JLabel lsta10;
    private JTextField sta11;
    private JLabel lsta11;
    private JTextField sta12;
    private JLabel lsta12;
    private JTextField sta13;
    private JLabel lsta13;
    private JButton back;
    
    JFrame frame;
  
    public int txt;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
    private String sqlOne="0.0";
    private String sqlTwo="0.0";
    private String sqlThree="0.0";
    private String sqlFour="0.0";
    private String sqlFive="0.0";
    private String sqlSix="0.0";
    private String sqlSeven="0.0";
    private String sqlEight="0.0";
    private String sqlNine="0.0";
    private String sqlTen="0.0";
    private String sqlEleven="0.0";
    private String sqlTwowelv="0.0";
    private String sqlThrteen="0.0";
    
    
    private float sqlOneKM;
    private float sqlTwoKM;
    private float sqlThreeKM;
    private float sqlFourKM;
    private float sqlFiveKM;
    private float sqlSixKM;
    private float sqlSevenKM;
    private float sqlEightKM;
    private float sqlNineKM;
    private float sqlTenKM;
    private float sqlElevenKM;
    private float sqlTwowelvKM;
    private float sqlThrteenKM;
    
    static int bb1=0, bb2=0, bb3=0,bb4=0,bb5=0,bb6=0,bb7=0,bb8=0,bb9=0,bb10=0,bb11=0,bb12=0,bb13=0;
    
    int f=0;
    static float n=4,n1=4,n2=4,n3=4,n4=4,n5=4,n6=4,n7=4,n8=4,n9=4,n10=4,n11=4,n12=4;
   
    private String sid;
    
    
    public static void onlyDigits(String str){
 		try {
 		    n = Float.parseFloat(str);
 		    bb1=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb1=-1;
 		}
 	}
    
    
    
    public static void onlyDigits1(String str){
 		try {
 		    n1 = Float.parseFloat(str);
 		    bb2=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb2=-1;
 		}
 	}
    
    
    public static void onlyDigits2(String str){
 		try {
 		    n2 = Float.parseFloat(str);
 		    bb3=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb3=-1;
 		}
 	}
    
    
    
    public static void onlyDigits3(String str){
 		try {
 		    n3 = Float.parseFloat(str);
 		    bb4=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb4=-1;
 		}
 	}
    
    
    public static void onlyDigits4(String str){
 		try {
 		    n4 = Float.parseFloat(str);
 		    bb5=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb5=-1;
 		}
 	}
    
    
    public static void onlyDigits5(String str){
 		try {
 		    n5 = Float.parseFloat(str);
 		    bb6=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb6=-1;
 		}
 	}
    
    
    
    public static void onlyDigits6(String str){
 		try {
 		    n6 = Float.parseFloat(str);
 		    bb7=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb7=-1;
 		}
 	}
    
    
    public static void onlyDigits7(String str){
 		try {
 		    n7 = Float.parseFloat(str);
 		    bb8=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb8=-1;
 		}
 	}
    
    
    public static void onlyDigits8(String str){
 		try {
 		    n8 = Float.parseFloat(str);
 		    bb9=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb9=-1;
 		}
 	}
    
    
    public static void onlyDigits9(String str){
 		try {
 		    n9 = Float.parseFloat(str);
 		    bb10=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb10=-1;
 		}
 	}
	
    
    public static void onlyDigits10(String str){
 		try {
 		    n10 = Float.parseFloat(str);
 		    bb11=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb11=-1;
 		}
 	}
    
    
    public static void onlyDigits11(String str){
 		try {
 		    n11 = Float.parseFloat(str);
 		    bb12=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb12=-1;
 		}
 	}
    
    
    public static void onlyDigits12(String str){
 		try {
 		    n12 = Float.parseFloat(str);
 		    bb13=0;
 		} catch (NumberFormatException e) {
 		    // str is not a number
 			bb13=-1;
 		}
 	}
    
  
    
    
	public NewStationKM(int txt2,String stid,String sqlOne,String sqlTwo,String sqlThree,String sqlFour,String sqlFive,
			String sqlSix,String sqlSeven,String sqlEight,String sqlNine,String sqlTen,String sqlEleven,String sqlTwowelv, String sqlThrteen)
    {
		setIconImage(icon); 
		
		setTitle("Station KM");
        setBounds(300, 90, 650, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
        
        txt=txt2;
        sid=stid;
        
        back=new JButton(icon1);
        //back.setFont(new Font("Arial", Font.PLAIN, 18));
		//back.setText("Back");
	    back.setBackground(Color.decode("#F0F8FF"));
	    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
	    back.setSize(60, 30);
        back.setLocation(60, 30);
        c.add(back);
        
  
        title = new JLabel("ABC");
        title.setFont(new Font("Arial", Font.BOLD, 29));
        title.setForeground(Color.BLUE);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        rootid = new JLabel("Root ID");
        rootid.setFont(new Font("Arial", Font.PLAIN, 20));
        rootid.setSize(100, 20);
        rootid.setLocation(100, 100);
        c.add(rootid);
  
        trootid = new JTextField();
        trootid.setFont(new Font("Arial", Font.PLAIN, 15));
        trootid.setSize(190, 20);
        trootid.setLocation(300, 100);
        c.add(trootid);
        
        trootid.setText(stid);
        trootid.setEditable(false);
        
  
        numsta = new JLabel("Number of station");
        numsta.setFont(new Font("Arial", Font.PLAIN, 20));
        numsta.setSize(160, 20);
        numsta.setLocation(100, 130);
        c.add(numsta);
        
        
        tnumsta = new JTextField();
        tnumsta.setFont(new Font("Arial", Font.PLAIN, 15));
        tnumsta.setSize(190, 20);
        tnumsta.setLocation(300, 130);
        c.add(tnumsta);
        
        
        String txts=String.valueOf(txt);
        
        tnumsta.setText(txts);
        tnumsta.setEditable(false);
        
     
        if( txt>=4) {
        	 setBounds(300, 90, 600, 350);
        	lsta1 = new JLabel("Station 1 km");
        	lsta1.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta1.setSize(150, 20);
        	lsta1.setLocation(100, 160);
            c.add(lsta1);
      
            sta1 = new JTextField();
            sta1.setFont(new Font("Arial", Font.PLAIN, 15));
            sta1.setSize(190, 20);
            sta1.setLocation(300, 160);
            if(sqlOne.equals("NULL") ) {
            	  sta1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta1.setText(sqlOne);
              }
              
              if(bb1==-1 || NewStationKM.n<0 || NewStationKM.n>40) {
            	  sta1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta1);
            
            
            lsta2 = new JLabel("Station 2 km");
        	lsta2.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta2.setSize(150, 20);
        	lsta2.setLocation(100, 190);
            c.add(lsta2);
      
            sta2 = new JTextField();
            sta2.setFont(new Font("Arial", Font.PLAIN, 15));
            sta2.setSize(190, 20);
            sta2.setLocation(300, 190);
            if(sqlTwo.equals("NULL") ) {
          	  sta2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta2.setText(sqlTwo);
            }
            
            if(bb2==-1 || NewStationKM.n1<0 || NewStationKM.n1>40) {
          	  sta2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta2);
            
            lsta3 = new JLabel("Station 3 km");
        	lsta3.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta3.setSize(150, 20);
        	lsta3.setLocation(100, 220);
            c.add(lsta3);
      
            sta3 = new JTextField();
            sta3.setFont(new Font("Arial", Font.PLAIN, 15));
            sta3.setSize(190, 20);
            sta3.setLocation(300, 220);
            if(sqlThree.equals("NULL") ) {
            	  sta3.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta3.setText(sqlThree);
              }
              
              if(bb3==-1 || NewStationKM.n2<0 || NewStationKM.n2>40) {
            	  sta3.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta3);
            
            lsta4 = new JLabel("Station 4 km");
        	lsta4.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta4.setSize(150, 20);
        	lsta4.setLocation(100, 250);
            c.add(lsta4);
      
            sta4 = new JTextField();
            sta4.setFont(new Font("Arial", Font.PLAIN, 15));
            sta4.setSize(190, 20);
            sta4.setLocation(300, 250);
            if(sqlFour.equals("NULL") ) {
            	  sta4.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta4.setText(sqlFour);
              }
              
              if(bb4==-1 || NewStationKM.n3<0 || NewStationKM.n3>40) {
            	  sta4.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta4);
            
            
        }
        if(txt>=5) {
        	setBounds(300, 90, 600, 400);
        	lsta5 = new JLabel("Station 5 km");
        	lsta5.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta5.setSize(150, 20);
        	lsta5.setLocation(100, 280);
            c.add(lsta5);
      
            sta5 = new JTextField();
            sta5.setFont(new Font("Arial", Font.PLAIN, 15));
            sta5.setSize(190, 20);
            sta5.setLocation(300, 280);
            if(sqlFive.equals("NULL") ) {
            	  sta5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta5.setText(sqlFive);
              }
              
              if(bb5==-1 || NewStationKM.n4<0 || NewStationKM.n4>40) {
            	  sta5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta5);
        }
        
        if(txt>=6) {
        	setBounds(300, 90, 600, 450);
        	lsta6 = new JLabel("Station 6 km");
        	lsta6.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta6.setSize(150, 20);
        	lsta6.setLocation(100, 310);
            c.add(lsta6);
      
            sta6 = new JTextField();
            sta6.setFont(new Font("Arial", Font.PLAIN, 15));
            sta6.setSize(190, 20);
            sta6.setLocation(300, 310);
            if(sqlSix.equals("NULL") ) {
            	  sta6.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta6.setText(sqlSix);
              }
              
              if(bb6==-1 || NewStationKM.n5<0 || NewStationKM.n5>40) {
            	  sta6.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta6);
        }
        
        if(txt>=7) {
        	setBounds(300, 90, 600, 450);
        	lsta7 = new JLabel("Station 7 km");
        	lsta7.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta7.setSize(150, 20);
        	lsta7.setLocation(100, 340);
            c.add(lsta7);
      
            sta7 = new JTextField();
            sta7.setFont(new Font("Arial", Font.PLAIN, 15));
            sta7.setSize(190, 20);
            sta7.setLocation(300, 340);
            if(sqlSeven.equals("NULL") ) {
            	  sta7.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta7.setText(sqlSeven);
              }
              
              if(bb7==-1 || NewStationKM.n6<0 || NewStationKM.n6>40) {
            	  sta7.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta7);
        }
        
        if(txt>=8) {
        	setBounds(300, 90, 600, 480);
        	lsta8 = new JLabel("Station 8 km");
        	lsta8.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta8.setSize(150, 20);
        	lsta8.setLocation(100, 370);
            c.add(lsta8);
      
            sta8 = new JTextField();
            sta8.setFont(new Font("Arial", Font.PLAIN, 15));
            sta8.setSize(190, 20);
            sta8.setLocation(300, 370);
            if(sqlEight.equals("NULL") ) {
            	  sta8.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta8.setText(sqlEight);
              }
              
              if(bb8==-1 || NewStationKM.n7<0 || NewStationKM.n7>40) {
            	  sta8.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta8);
        }
        
        if(txt>=9) {
        	setBounds(300, 90, 600, 500);
        	lsta9 = new JLabel("Station 9 km");
        	lsta9.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta9.setSize(150, 20);
        	lsta9.setLocation(100, 400);
            c.add(lsta9);
      
            sta9 = new JTextField();
            sta9.setFont(new Font("Arial", Font.PLAIN, 15));
            sta9.setSize(190, 20);
            sta9.setLocation(300, 400);
            if(sqlNine.equals("NULL") ) {
            	  sta9.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta9.setText(sqlNine);
              }
              
              if(bb9==-1 || NewStationKM.n8<0 || NewStationKM.n8>40) {
            	  sta9.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta9);
        }
        
        if(txt>=10) {
        	setBounds(300, 90, 600, 520);
        	lsta10 = new JLabel("Station 10 km");
        	lsta10.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta10.setSize(170, 20);
        	lsta10.setLocation(100, 430);
            c.add(lsta10);
      
            sta10 = new JTextField();
            sta10.setFont(new Font("Arial", Font.PLAIN, 15));
            sta10.setSize(190, 20);
            sta10.setLocation(300, 430);
            if(sqlTen.equals("NULL") ) {
            	  sta10.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta10.setText(sqlTen);
              }
              
              if(bb10==-1 || NewStationKM.n9<0 || NewStationKM.n9>40) {
            	  sta10.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta10);
        }
        
        if(txt>=11) {
        	setBounds(300, 90, 600, 550);
        	lsta11 = new JLabel("Station 11 km");
        	lsta11.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta11.setSize(170, 20);
        	lsta11.setLocation(100, 460);
            c.add(lsta11);
      
            sta11 = new JTextField();
            sta11.setFont(new Font("Arial", Font.PLAIN, 15));
            sta11.setSize(190, 20);
            sta11.setLocation(300, 460);
            if(sqlEleven.equals("NULL") ) {
            	  sta11.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta11.setText(sqlEleven);
              }
              
              if(bb11==-1 || NewStationKM.n10<0 || NewStationKM.n10>40) {
            	  sta2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta11);
        }
        
        if(txt>=12) {
        	setBounds(300, 90, 600, 550);
        	lsta12 = new JLabel("Station 12 km");
        	lsta12.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta12.setSize(170, 20);
        	lsta12.setLocation(100, 490);
            c.add(lsta12);
      
            sta12 = new JTextField();
            sta12.setFont(new Font("Arial", Font.PLAIN, 15));
            sta12.setSize(190, 20);
            sta12.setLocation(300, 490);
            if(sqlTwowelv.equals("NULL") ) {
            	  sta12.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta12.setText(sqlTwowelv);
              }
              
              if(bb12==-1 || NewStationKM.n11<0 || NewStationKM.n11>40) {
            	  sta12.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
            c.add(sta12);
        }
        
        if(txt>=13) {
        setBounds(300, 90, 600, 550);
        lsta13 = new JLabel("Station 13 km");
        lsta13.setFont(new Font("Arial", Font.PLAIN, 20));
        lsta13.setSize(170, 20);
        lsta13.setLocation(100, 520);
        c.add(lsta13);
      
        sta13 = new JTextField();
        sta13.setFont(new Font("Arial", Font.PLAIN, 15));
        sta13.setSize(190, 20);
        sta13.setLocation(300, 520);
        if(sqlThrteen.equals("NULL") ) {
        	  sta13.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
          }else {
        	  sta13.setText(sqlThrteen);
          }
          
          if(bb13==-1 || NewStationKM.n12<0 || NewStationKM.n12>40) {
        	  sta13.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
          }
        c.add(sta13);
        }
        
        if(txt==4) {
            setBounds(300, 90, 600, 400);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 300);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==5) {
            setBounds(300, 90, 600, 410);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 320);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==6) {
            setBounds(300, 90, 600, 430);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 350);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==7) {
            setBounds(300, 90, 600, 480);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 380);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==8) {
            setBounds(300, 90, 600, 500);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 410);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==9) {
            setBounds(300, 90, 600, 520);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 440);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==10) {
            setBounds(300, 90, 600, 570);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 470);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==11) {
        setBounds(300, 90, 600, 620);
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(340, 500);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        //sub.addActionListener(this);
        c.add(sub);
        }
        
        else if(txt==12) {
        setBounds(300, 90, 600, 670);
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(340, 530);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
        c.add(sub);
        }
        
        else if(txt==13) {
        setBounds(300, 90, 600, 700);
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(340, 560);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        c.add(sub);
        }
        
        sub.addActionListener(this);
        back.addActionListener(this);
        
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("Submit")) {
			String url="jdbc:mysql://localhost:3306/project";
    		String user="root";
    		String password="";
    		if(txt>=1) {
    		sqlOne=sta1.getText();//getting the value of the textfleld
    		onlyDigits(sqlOne);
    		//sqlOneKM=Float.parseFloat(sqlOne);
    		}if(txt>=2) {
    		sqlTwo=sta2.getText();//getting the value of the textfleld
    		onlyDigits1(sqlTwo);
    		//sqlTwoKM=Float.parseFloat(sqlTwo);
    		}if(txt>=3) { 
    		sqlThree=sta3.getText();//for getting the value of the textfield
    		onlyDigits2(sqlThree);
    		//sqlThreeKM=Float.parseFloat(sqlThree);
    		}if(txt>=4) {
    		sqlFour=sta4.getText();//for getting the value of the textfield
    		onlyDigits3(sqlFour);
    		//sqlFourKM=Float.parseFloat(sqlFour);
    		}if(txt>=5) {
    		sqlFive=sta5.getText();//for getting the value of the textfield
    		onlyDigits4(sqlFive);
    		//sqlFiveKM=Float.parseFloat(sqlFive);
    		}if(txt>=6) {
    		sqlSix=sta6.getText();//for getting the value of the textfield
    		onlyDigits5(sqlSix);
    		//sqlSixKM=Float.parseFloat(sqlSix);
    		}if(txt>=7) {
    		sqlSeven=sta7.getText();//for getting the value of the textfield
    		onlyDigits6(sqlSeven);
    		//sqlSevenKM=Float.parseFloat(sqlSeven);
    		}if(txt>=8) {
    		sqlEight=sta8.getText();//for getting the value of the textfield
    		onlyDigits7(sqlEight);
    		//sqlEightKM=Float.parseFloat(sqlEight);
		    }if(txt>=9) {
    		sqlNine=sta9.getText();
    		onlyDigits8(sqlNine);
    		//sqlNineKM=Float.parseFloat(sqlNine);
		    }if(txt>10) {
    		sqlTen=sta10.getText();
    		onlyDigits9(sqlTen);
    		//sqlTenKM=Float.parseFloat(sqlTen);
		    }if(txt>=11) {
    		sqlEleven=sta11.getText();
    		onlyDigits10(sqlEleven);
    		//sqlElevenKM=Float.parseFloat(sqlEleven);
		    }if(txt>=12) {
    		sqlTwowelv=sta12.getText();
    		onlyDigits11(sqlTwowelv);
    		//sqlTwowelvKM=Float.parseFloat(sqlTwowelv);
		    }if(txt>=13) {
    		sqlThrteen=sta13.getText();
    		onlyDigits12(sqlThrteen);
    		//sqlThrteenKM=Float.parseFloat(sqlThrteen);
		    }
    	        
		    
		    if(sqlOne.length()==0 || sqlTwo.length()==0 || sqlThree.length()==0 || sqlFour.length()==0 || sqlFive.length()==0 ||
 				   sqlSix.length()==0 || sqlSeven.length()==0 || sqlEight.length()==0 || sqlNine.length()==0 || sqlTen.length()==0
 				   || sqlEleven.length()==0 || sqlTwowelv.length()==0 || sqlThrteen.length()==0) {
 			 if(txt>=1) {
 				 if(sqlOne.length()==0) {
 					 sqlOne="NULL"; 
 				 }
 			 }
 			 if(txt>=2) {
 			   if(sqlTwo.length()==0) {
 				   sqlTwo="NULL";
 			   }
 			 }if(txt>=3) {
 			   if(sqlThree.length()==0) {
 				   sqlThree="NULL";
 			   }
 		     }if(txt>=4) {
 			   if(sqlFour.length()==0) {
 				   sqlFour="NULL";
 			   }
 		     }if(txt>=5) {
 			   if(sqlFive.length()==0) {
 				   sqlFive="NULL";
 			   }
 		     }if(txt>=6) {
 			   if(sqlSix.length()==0) {
 				   sqlSix="NULL"; 
 			   }
 		     }if(txt>=7) {
 			   if(sqlSeven.length()==0) {
 				   sqlSeven="NULL";
 			   }
 		     }if(txt>=8) {
 			   if(sqlEight.length()==0 ) {
 				   sqlEight="NULL";
 			   }
 		     }if(txt>=9) {
 			   if(sqlNine.length()==0) {
 				   sqlNine="NULL";
 			   }
 		     }if(txt>=10) {
 			   if(sqlTen.length()==0) {
 				   sqlTen="NULL";
 			   }
 		     }if(txt>=11) {
 			   if( sqlEleven.length()==0) {
 				   sqlEleven="NULL";
 			   }
 		     }if(txt>=12) {
 			   if(sqlTwowelv.length()==0) {
 				   sqlTwowelv="NULL";
 			   }
 		     }if(txt>=13) {
 			   if(sqlThrteen.length()==0) {
 				   sqlThrteen="NULL";
 			   }
 		     }
 			   this.setVisible(false);
 			   NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
 			   
 		}
        
        if(bb1 == -1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb1==0 && NewStationKM.n<0 || NewStationKM.n>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb2==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb2==0 && NewStationKM.n1<0 || NewStationKM.n1>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb3==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb3==0 && NewStationKM.n2<0 || NewStationKM.n2>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb4==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb4==0 && NewStationKM.n3<0 || NewStationKM.n3>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb5==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb5==0 && NewStationKM.n4<0 || NewStationKM.n4>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb6==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb6==0 && NewStationKM.n5<0 || NewStationKM.n5>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb7==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb7==0 && NewStationKM.n6<0 || NewStationKM.n6>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb8==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb8==0 && NewStationKM.n7<0 || NewStationKM.n7>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb9==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb9==0 && NewStationKM.n8<0 || NewStationKM.n8>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb10==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb10==0 && NewStationKM.n9<0 || NewStationKM.n9>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb11==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb11==0 && NewStationKM.n10<0 || NewStationKM.n10>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb12==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb12==0 && NewStationKM.n11<0 || NewStationKM.n11>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else if(bb13==-1) {
        
        	JOptionPane.showMessageDialog(frame, "Kilometer of station must be number");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        	
        }else if(bb13==0 && NewStationKM.n12<0 || NewStationKM.n12>40 ) {
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "KM can not be <0 and >40");
        	this.setVisible(false);
        	 NewStationKM ns=new NewStationKM(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
        }else {
    		   		
    		//String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		//String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		
    		//System.out.println(name);
        	
        	sqlOneKM=Float.parseFloat(sqlOne);
        	sqlTwoKM=Float.parseFloat(sqlTwo);
        	sqlThreeKM=Float.parseFloat(sqlThree);
        	sqlFourKM=Float.parseFloat(sqlFour);
        	sqlFiveKM=Float.parseFloat(sqlFive);
        	sqlSixKM=Float.parseFloat(sqlSix);
        	sqlSevenKM=Float.parseFloat(sqlSeven);
        	sqlEightKM=Float.parseFloat(sqlEight);
        	sqlNineKM=Float.parseFloat(sqlNine);
        	sqlTenKM=Float.parseFloat(sqlTen);
        	sqlElevenKM=Float.parseFloat(sqlEleven);
        	sqlTwowelvKM=Float.parseFloat(sqlTwowelv);
        	sqlThrteenKM=Float.parseFloat(sqlThrteen);
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
    			stt.execute("INSERT INTO stationkm (stationOneKM,stationTWOKM,stationThreeKM,stationFourKM,stationFiveKM,stationSixKM,stationSevenKM,stationEightKM,stationNineKM,stationTenKM,stationElevenKM,stationTwowelvKM,stationThrteenKM,root_ID) VALUES"+ 
			            "('"+sqlOneKM+"','"+sqlTwoKM+"','"+sqlThreeKM+"','"+sqlFourKM+"','"+sqlFiveKM+"','"+sqlSixKM+"','"+sqlSevenKM+"','"+sqlEightKM+"','"+sqlNineKM+"','"+sqlTenKM+"','"+sqlElevenKM+"','"+sqlTwowelvKM+"','"+sqlThrteenKM+"','"+sid+"')");
    	
    		
    		this.setVisible(false);
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
    	
 		}
        }else {
        	this.setVisible(false);
        	EnterStationKM ep= new EnterStationKM(EnterStationKM.txt1,EnterStationKM.stid);
		}
	}
	
}
