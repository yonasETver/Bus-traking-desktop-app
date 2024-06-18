package AllClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 

public class NewStation extends JFrame implements ActionListener {
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
    private JTextField sta14;
    private JLabel lsta14;
    private JButton back;
    JFrame frame;
    
    public int txt,numSte;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
    
    int f=0;
    static int n=1;
    static int bb1=0;
    
    private String sqlOne="";
    private String sqlTwo="";
    private String sqlThree="";
    private String sqlFour="";
    private String sqlFive="";
    private String sqlSix="";
    private String sqlSeven="";
    private String sqlEight="";
    private String sqlNine="";
    private String sqlTen="";
    private String sqlEleven="";
    private String sqlTwowelv="";
    private String sqlThrteen="";
    private String sql14="";
    
   
    private String sid;
    
    public static void onlyDigits(String str){
		try {
		    n = Integer.parseInt(str);
		    bb1=0;
		} catch (NumberFormatException e) {
		    // str is not a number
			bb1=-1;
		}
	}
    
	public NewStation(int txt2,String stid,String sqlOne,String sqlTwo,String sqlThree,String sqlFour,
			String sqlFive,String sqlSix,String sqlSeven,String sqlEight,String sqlNine,String sqlTen,
			String sqlEleven,String sqlTwowelv,String sqlThrteen,String sql14)
    {
		
		 setIconImage(icon); 
		 
        setTitle("Station ID");
        setBounds(300, 90, 650, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
        
        txt=txt2;
        sid=stid;
     
        //back=new JButton("Back");
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
        	lsta1 = new JLabel("Station 1 ID");
        	lsta1.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta1.setSize(150, 20);
        	lsta1.setLocation(100, 160);
            c.add(lsta1);
      
            sta1 = new JTextField();
            sta1.setFont(new Font("Arial", Font.PLAIN, 15));
            sta1.setSize(190, 20);
            sta1.setLocation(300, 160);
            if(sqlOne.equals("NULL")) {
            	sta1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta1.setText(sqlOne);
        	}
            c.add(sta1);
            
            
            lsta2 = new JLabel("Station 2 ID");
        	lsta2.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta2.setSize(150, 20);
        	lsta2.setLocation(100, 190);
            c.add(lsta2);
      
            sta2 = new JTextField();
            sta2.setFont(new Font("Arial", Font.PLAIN, 15));
            sta2.setSize(190, 20);
            sta2.setLocation(300, 190);
            if(sqlTwo.equals("NULL")) {
            	sta2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta2.setText(sqlTwo);
        	}
            c.add(sta2);
            
            lsta3 = new JLabel("Station 3 ID");
        	lsta3.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta3.setSize(150, 20);
        	lsta3.setLocation(100, 220);
            c.add(lsta3);
      
            sta3 = new JTextField();
            sta3.setFont(new Font("Arial", Font.PLAIN, 15));
            sta3.setSize(190, 20);
            sta3.setLocation(300, 220);
            if(sqlThree.equals("NULL")) {
            	sta3.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta3.setText(sqlThree);
        	}
            c.add(sta3);
            
            lsta4 = new JLabel("Station 4 ID");
        	lsta4.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta4.setSize(150, 20);
        	lsta4.setLocation(100, 250);
            c.add(lsta4);
      
            sta4 = new JTextField();
            sta4.setFont(new Font("Arial", Font.PLAIN, 15));
            sta4.setSize(190, 20);
            sta4.setLocation(300, 250);
            if(sqlFour.equals("NULL")) {
            	sta4.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta4.setText(sqlOne);
        	}
            c.add(sta4);
            
            
        }
        if(txt>=5) {
        	setBounds(300, 90, 600, 400);
        	lsta5 = new JLabel("Station 5 ID");
        	lsta5.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta5.setSize(150, 20);
        	lsta5.setLocation(100, 280);
            c.add(lsta5);
      
            sta5 = new JTextField();
            sta5.setFont(new Font("Arial", Font.PLAIN, 15));
            sta5.setSize(190, 20);
            sta5.setLocation(300, 280);
            if(sqlFive.equals("NULL")) {
            	sta5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta5.setText(sqlFive);
        	}
            c.add(sta5);
        }
        
        if(txt>=6) {
        	setBounds(300, 90, 600, 450);
        	lsta6 = new JLabel("Station 6 ID");
        	lsta6.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta6.setSize(150, 20);
        	lsta6.setLocation(100, 310);
            c.add(lsta6);
      
            sta6 = new JTextField();
            sta6.setFont(new Font("Arial", Font.PLAIN, 15));
            sta6.setSize(190, 20);
            sta6.setLocation(300, 310);
            if(sqlSix.equals("NULL")) {
            	sta6.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta6.setText(sqlSix);
        	}
            c.add(sta6);
        }
        
        if(txt>=7) {
        	setBounds(300, 90, 600, 450);
        	lsta7 = new JLabel("Station 7 ID");
        	lsta7.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta7.setSize(150, 20);
        	lsta7.setLocation(100, 340);
            c.add(lsta7);
      
            sta7 = new JTextField();
            sta7.setFont(new Font("Arial", Font.PLAIN, 15));
            sta7.setSize(190, 20);
            sta7.setLocation(300, 340);
            if(sqlSeven.equals("NULL")) {
            	sta7.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta7.setText(sqlSeven);
        	}
            c.add(sta7);
        }
        
        if(txt>=8) {
        	setBounds(300, 90, 600, 480);
        	lsta8 = new JLabel("Station 8 ID");
        	lsta8.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta8.setSize(150, 20);
        	lsta8.setLocation(100, 370);
            c.add(lsta8);
      
            sta8 = new JTextField();
            sta8.setFont(new Font("Arial", Font.PLAIN, 15));
            sta8.setSize(190, 20);
            sta8.setLocation(300, 370);
            if(sqlEight.equals("NULL")) {
            	sta8.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta8.setText(sqlEight);
        	}
            c.add(sta8);
        }
        
        if(txt>=9) {
        	setBounds(300, 90, 600, 500);
        	lsta9 = new JLabel("Station 9 ID");
        	lsta9.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta9.setSize(150, 20);
        	lsta9.setLocation(100, 400);
            c.add(lsta9);
      
            sta9 = new JTextField();
            sta9.setFont(new Font("Arial", Font.PLAIN, 15));
            sta9.setSize(190, 20);
            sta9.setLocation(300, 400);
            if(sqlNine.equals("NULL")) {
            	sta9.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta9.setText(sqlNine);
        	}
            c.add(sta9);
        }
        
        if(txt>=10) {
        	setBounds(300, 90, 600, 520);
        	lsta10 = new JLabel("Station 10 ID");
        	lsta10.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta10.setSize(150, 20);
        	lsta10.setLocation(100, 430);
            c.add(lsta10);
      
            sta10 = new JTextField();
            sta10.setFont(new Font("Arial", Font.PLAIN, 15));
            sta10.setSize(190, 20);
            sta10.setLocation(300, 430);
            if(sqlTen.equals("NULL")) {
            	sta10.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta10.setText(sqlTen);
        	}
            c.add(sta10);
        }
        
        if(txt>=11) {
        	setBounds(300, 90, 600, 550);
        	lsta11 = new JLabel("Station 11 ID");
        	lsta11.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta11.setSize(150, 20);
        	lsta11.setLocation(100, 460);
            c.add(lsta11);
      
            sta11 = new JTextField();
            sta11.setFont(new Font("Arial", Font.PLAIN, 15));
            sta11.setSize(190, 20);
            sta11.setLocation(300, 460);
            if(sqlEleven.equals("NULL")) {
            	sta11.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta11.setText(sqlEleven);
        	}
            c.add(sta11);
        }
        
        if(txt>=12) {
        	setBounds(300, 90, 600, 550);
        	lsta12 = new JLabel("Station 12 ID");
        	lsta12.setFont(new Font("Arial", Font.PLAIN, 20));
        	lsta12.setSize(150, 20);
        	lsta12.setLocation(100, 490);
            c.add(lsta12);
      
            sta12 = new JTextField();
            sta12.setFont(new Font("Arial", Font.PLAIN, 15));
            sta12.setSize(190, 20);
            sta12.setLocation(300, 490);
            if(sqlTwowelv.equals("NULL")) {
            	sta12.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	}else {
        		sta12.setText(sqlTwowelv);
        	}
            c.add(sta12);
        }
        
        if(txt>=13) {
        setBounds(300, 90, 600, 550);
        lsta13 = new JLabel("Station 13 ID");
        lsta13.setFont(new Font("Arial", Font.PLAIN, 20));
        lsta13.setSize(150, 20);
        lsta13.setLocation(100, 520);
        c.add(lsta13);
      
        sta13 = new JTextField();
        sta13.setFont(new Font("Arial", Font.PLAIN, 15));
        sta13.setSize(190, 20);
        sta13.setLocation(300, 520);
        if(sqlThrteen.equals("NULL")) {
        	sta13.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
    	}else {
    		sta13.setText(sqlThrteen);
    	}
        c.add(sta13);
        }
        
        if(txt==4) {
        	
        	  setBounds(300, 90, 600, 550);
              lsta14 = new JLabel("No of buses");
              lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
              lsta14.setSize(150, 20);
              lsta14.setLocation(100, 280);
              c.add(lsta14);
            
              sta14 = new JTextField();
              sta14.setFont(new Font("Arial", Font.PLAIN, 15));
              sta14.setSize(190, 20);
              sta14.setLocation(300, 280);
              if(sql14.equals("NULL") ) {
            	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }else {
            	  sta14.setText(sql14);
              }
              
              if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
            	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
              }
              c.add(sta14);
        	
            setBounds(300, 90, 600, 400);
            sub = new JButton("Submit");
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 320);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==5) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 310);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 310);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
            setBounds(300, 90, 600, 440);
            sub = new JButton("Submit");
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 350);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==6) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 340);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 340);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
            setBounds(300, 90, 600, 480);
            sub = new JButton("Submit");
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(340, 390);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==7) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 370);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 370);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
            setBounds(300, 90, 600, 530);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setSize(100, 20);
            sub.setLocation(340, 420);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==8) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 400);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 400);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
            setBounds(300, 90, 600, 580);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setSize(100, 20);
            sub.setLocation(340, 450);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==9) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 430);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 430);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
            setBounds(300, 90, 600, 600);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setSize(100, 20);
            sub.setLocation(340, 480);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==10) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 460);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 460);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
            setBounds(300, 90, 600, 630);
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            sub.setSize(100, 20);
            sub.setLocation(340, 510);
            sub.setBackground(Color.CYAN);
            sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
            c.add(sub);
            }
        else if(txt==11) {
        	
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 490);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 490);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
        setBounds(300, 90, 600, 670);
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        sub.setSize(100, 20);
        sub.setLocation(340, 550);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        //sub.addActionListener(this);
        c.add(sub);
        }
        
        else if(txt==12) {
        
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 520);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 520);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
        setBounds(300, 90, 600, 690);
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        sub.setSize(100, 20);
        sub.setLocation(340, 570);
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
            //sub.addActionListener(this);
        c.add(sub);
        }
        
        else if(txt==13) {
        
        	setBounds(300, 90, 600, 550);
            lsta14 = new JLabel("No of buses");
            lsta14.setFont(new Font("Arial", Font.PLAIN, 20));
            lsta14.setSize(150, 20);
            lsta14.setLocation(100, 550);
            c.add(lsta14);
          
            sta14 = new JTextField();
            sta14.setFont(new Font("Arial", Font.PLAIN, 15));
            sta14.setSize(190, 20);
            sta14.setLocation(300, 550);
            if(sql14.equals("NULL") ) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }else {
          	  sta14.setText(sql14);
            }
            
            if(bb1==-1 || NewStation.n<1 || NewStation.n>10) {
          	  sta14.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            c.add(sta14);
            
        setBounds(300, 90, 600, 720);
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setBackground(Color.CYAN);
        sub.setForeground(Color.magenta);
        sub.setSize(100, 20);
        sub.setLocation(340, 600);
                //sub.addActionListener(this);
        c.add(sub);
        }
        
        sub.addActionListener(this);
        back.addActionListener(this);
        
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("Submit")) {
                System.out.println("Submit..........................");
                String url="jdbc:mysql://localhost:3306/project";
    		String user="root";
    		String password="";
    		
    		sql14=sta14.getText();
                System.out.println("The value ............. "+ bb1);
    		onlyDigits(sql14);
                System.out.println("number of bussssssss......................."+ sql14);
                System.out.println("The value ............. "+ bb1);
    		
    		
    		
    		
    		if(txt>=1) {
    		sqlOne=sta1.getText();//getting the value of the textfleld
    		}if(txt>=2) {
    		sqlTwo=sta2.getText();//getting the value of the textfleld
    		}if(txt>=3) { 
    		sqlThree=sta3.getText();//for getting the value of the textfield
    		}if(txt>=4) {
    		sqlFour=sta4.getText();//for getting the value of the textfield
    		}if(txt>=5) {
    		sqlFive=sta5.getText();//for getting the value of the textfield
    		}if(txt>=6) {
    		sqlSix=sta6.getText();//for getting the value of the textfield
    		}if(txt>=7) {
    		sqlSeven=sta7.getText();//for getting the value of the textfield
    		}if(txt>=8) {
    		sqlEight=sta8.getText();//for getting the value of the textfield
		    }if(txt>=9) {
    		sqlNine=sta9.getText();
		    }if(txt>10) {
    		sqlTen=sta10.getText();
		    }if(txt>=11) {
    		sqlEleven=sta11.getText();
		    }if(txt>=12) {
    		sqlTwowelv=sta12.getText();
		    }if(txt>=13) {
    		sqlThrteen=sta13.getText();
		    }
		    
		    
		    
		    if(sqlOne.length()==0 || sqlTwo.length()==0 || sqlThree.length()==0 || sqlFour.length()==0 || sqlFive.length()==0 ||
 				   sqlSix.length()==0 || sqlSeven.length()==0 || sqlEight.length()==0 || sqlNine.length()==0 || sqlTen.length()==0
 				   || sqlEleven.length()==0 || sqlTwowelv.length()==0 || sqlThrteen.length()==0|| sql14.length()==0 ) {
                        System.out.println("1st if ................................");
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
 		     }if(sql14.length()==0 ) {
 		    	sql14="NULL"; 
 		     }
 		     
 		    
 			   this.setVisible(false);
 			  NewStation ns=new NewStation(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen,sql14);
 			   
 		}
        if( bb1 == -1) {
                System.out.println("Not number.....................................");
        	JOptionPane.showMessageDialog(frame, "Number of bus must be integer number");
        	this.setVisible(false);
        	NewStation ns=new NewStation(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen,sql14);
        	
        }else if(bb1==0 && NewStation.n<1 || NewStation.n>10 ) {
            System.out.println("second if........................");
        	f=-1;
        	JOptionPane.showMessageDialog(frame, "Number of bus per/root can not be <1 and >10");
        	this.setVisible(false);
        	NewStation ns=new NewStation(txt,sid,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen,sql14);
        }else {
    	    System.out.println("Thired if........................"); 
        	numSte=Integer.parseInt(sql14);	
    		//String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		//String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		
    		//System.out.println(name);
    		
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
                        System.out.println("connnnn....................");
    			stt.execute("INSERT INTO roots (root_ID,stationOne,stationTWO,stationThree,stationFour,stationFive,stationSix,stationSeven,stationEight,stationNine,stationTen,stationEleven,stationTwowelv,stationThrteen,numberOfbus) VALUES"+ 
			            "('"+sid+"','"+sqlOne+"','"+sqlTwo+"','"+sqlThree+"','"+sqlFour+"','"+sqlFive+"','"+sqlSix+"','"+sqlSeven+"','"+sqlEight+"','"+sqlNine+"','"+sqlTen+"','"+sqlEleven+"','"+sqlTwowelv+"','"+sqlThrteen+"','"+numSte+"')");

    		
    			this.setVisible(false);
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
    	
 		}	
        }else  {
        	this.setVisible(false);
        	EnterStation en=new EnterStation(StationName.txt1,StationName.stid);
        }
		}
	
}
