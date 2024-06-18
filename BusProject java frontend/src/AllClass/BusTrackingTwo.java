package AllClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class BusTrackingTwo extends JFrame implements ActionListener,ItemListener {
	
	
	    private float [] kilometer,kilometer1,kilometer2;
	    private String roots;
	
	 
		private JLabel jl0,jl01,jl02,jl03,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
		private JPanel jp0,jp01,jp02,jp03,jp04,jp05,jp06,jp07,jp,jp2,jp3,jp4,flow,flow1;
		private JButton jb0,jb01,jb02,jb03,jb04;
		private JButton back;
		private JComboBox jc,jc1,jc2,jc3;
		private JTextField jt,jt1,jt2,jt3,jt4;
		private String qur;
		
		Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
		 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
		
		private String [] one,two,three,root,stationName,startEnd,roots1,staNamesAll;
		
		
		
	
	public BusTrackingTwo(String [] root, String [] stationName) {
		
		setIconImage(icon); 
		
		staNamesAll=new String[stationName.length];
		for(int i=0;i<stationName.length;i++) {
			staNamesAll[i]=stationName[i];
		}
		roots= root[0];
		
		roots1= new String[1];
		roots1[0]=root[0];
		String user="root";
		String password="";
		String url="jdbc:mysql://localhost:3306/project";
		
		int size=stationName.length;
		System.out.println("Size..........."+size);
		kilometer= new float[size];
		for(int i=0;i<kilometer.length;i++) {
			kilometer[i]=-1;
		}
		 qur="SELECT 	stationOneKM,stationTWOKM,stationThreeKM,stationFourKM,stationFiveKM,stationSixKM,stationSevenKM,stationEightKM,stationNineKM,stationTenKM,stationElevenKM,stationTwowelvKM,stationThrteenKM FROM stationkm WHERE root_ID = '"+roots+"'";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
				
				
		   
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				for(i=0;i<size;i++) {
				if(i==0) {
				kilometer[0]=re1.getFloat("stationOneKM");

				}else if(i==1) {
					kilometer[1]=re1.getFloat("stationTWOKM");
					
				}else if(i==2) {
					kilometer[2]=re1.getFloat("stationThreeKM");
					
				}else if(i==3) {
					kilometer[3]=re1.getFloat("stationFourKM");
					
				}else if(i==4) {
					kilometer[4]=re1.getFloat("stationFiveKM");
					
				}else if(i==5) {
					kilometer[5]=re1.getFloat("stationSixKM");
					
				}else if(i==6) {
					kilometer[6]=re1.getFloat("stationSevenKM");
					
				}else if(i==7) {
					kilometer[7]=re1.getFloat("stationEightKM");
					
				}else if(i==8) {
					kilometer[8]=re1.getFloat("stationNineKM");
					
				}else if(i==9) {
					kilometer[9]=re1.getFloat("stationTenKM");
					
				}else if(i==10) {
					kilometer[10]=re1.getFloat("stationElevenKM");
					
				}else if(i==11) {
					kilometer[11]=re1.getFloat("stationTwowelvKM");
					
				}else if(i==12) {
					kilometer[12]=re1.getFloat("stationThrteenKM");
					
				}
				}
				
			
			}
			
			
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			for(int i=0;i<kilometer.length;i++) {
				System.out.print(kilometer[i]+"  ");
			}
			
			
		
		
		
		
		
		this.stationName = new String[stationName.length];
		for(int i=0;i<stationName.length;i++) {
			this.stationName[i]=stationName[i];
		}
		
		this.root= new String[root.length];
		for(int i=0;i<root.length;i++) {
			this.root[i]=root[i];
		}
		//this.indx3=indx;
		
	
		startEnd = new String[2];
		startEnd[0]="Start";
		startEnd[1]="End";
	
		
		
		
		one =new String [4];
		two =new String [4];
		three =new String [4];
		Container cp =getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("User window");
		setBounds(300, 90, 800, 400);
		
		
		
		jp0= new JPanel();
		jp01= new JPanel();
		jp02= new JPanel();
		jp03= new JPanel();
		jp04= new JPanel();
		jp05= new JPanel();
		jp06= new JPanel();
		jp07= new JPanel();
		
		jl=new JLabel("Root");
		jl.setFont(new Font("Verdana",Font.BOLD,16));
		jl.setBackground(Color.orange);
		jl2=new JLabel("Current station");
		jl2.setFont(new Font("Verdana",Font.BOLD,16));
		jl2.setBackground(Color.orange);
		jl3=new JLabel("From");
		jl3.setFont(new Font("Verdana",Font.BOLD,16));
		jl3.setBackground(Color.orange);
		
		
		
		jl10=new JLabel("Waiting Time");
		jl10.setFont(new Font("Verdana",Font.BOLD,29));
		jl10.setForeground(Color.BLACK);
		
		jt= new JTextField();
		jt.setEditable(false);
	    jt.setColumns(10);
	    jt.setForeground(Color.WHITE);
	    jt.setBackground(Color.darkGray);
		jt1= new JTextField();
		jt1.setEditable(false);
	    jt1.setColumns(10);
	    jt1.setForeground(Color.WHITE);
	    jt1.setBackground(Color.darkGray);
		jt2= new JTextField();
		jt2.setEditable(false);
	    jt2.setColumns(10);
	    jt2.setForeground(Color.WHITE);
	    jt2.setBackground(Color.darkGray);
		jt3= new JTextField();
		jt3.setEditable(false);
	    jt3.setColumns(10);
	    jt3.setForeground(Color.WHITE);
	    jt3.setBackground(Color.darkGray);
		jt4= new JTextField();
		jt4.setEditable(false);
	    jt4.setColumns(10);
	    jt4.setForeground(Color.WHITE);
	    jt4.setBackground(Color.darkGray);
		 
		jc=new JComboBox(root);
		//jc.setSelectedIndex(-1);
		jc.setFont(new Font("Arial", Font.PLAIN, 14));
        jc.setSize(50, 20);
        jc.setMaximumRowCount(4);
		jc2=new JComboBox(stationName);
		jc2.setSelectedIndex(-1);
		jc2.setFont(new Font("Arial", Font.PLAIN, 14));
        jc2.setSize(50, 20);
        jc2.setMaximumRowCount(4);
        jc3=new JComboBox(startEnd);
		jc3.setSelectedIndex(-1);
		jc3.setFont(new Font("Arial", Font.PLAIN, 14));
        jc3.setSize(50, 20);
        jc3.setMaximumRowCount(4);
	
		
		
		
	 
		cp.add(jp0);
		
		    jp = new JPanel(new BorderLayout());
		    jp2 = new JPanel(new BorderLayout());
		    jp3 = new JPanel(new FlowLayout());
		    jp4 = new JPanel(new GridLayout(2,5,10,10));
		    flow=new JPanel(new FlowLayout());
		    flow1=new JPanel(new FlowLayout());
		   
		   // getContentPane().add(jp0);
		  
		    back=new JButton(icon1);
	        //back.setFont(new Font("Arial", Font.PLAIN, 18));
			back.setText("");
		    back.setBackground(Color.decode("#F0F8FF"));
		    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
		    back.setSize(60, 30);
	        back.setLocation(60, 30);
		    
		    jb0= new JButton("List all root");
			jb01= new JButton("View spacific root");
			//jb02= new JButton("View spacific root payment");
			jb03= new JButton("View spacific root waiting time");
			//jb04= new JButton("View spacific root payment bus distance");
			
			jl0= new JLabel("ABC CITY BUS TRACKING SYSTEM");
			jl01= new JLabel("                  ");
			jl02= new JLabel("                   ");
			jl03= new JLabel(" ");
			jl03.setFont(new Font("Verdana",Font.BOLD,29));
			jl0.setBounds(50, 100, 200, 50);
			jl0.setFont(new Font("Verdana",Font.BOLD,29));
			jl0.setForeground(Color.BLUE);
			
			back.setBounds(30, 100, 120, 20);
			back.setBackground(Color.ORANGE);
			jb0.setBounds(30, 100, 100, 20);
			jb0.setBackground(Color.CYAN);
			jb01.setBounds(30, 100, 100, 20);
			jb01.setBackground(Color.CYAN);
			//jb02.setBounds(30, 100, 100, 20);
			//jb02.setBackground(Color.CYAN);
			jb03.setBounds(30, 100, 100, 20);
			jb03.setBackground(Color.orange);
			//jb04.setBounds(30, 100, 100, 20);
			//jb04.setBackground(Color.CYAN);
			
			jp0.setLayout(new BorderLayout());
			jp01.setLayout(new BorderLayout());
			jp02.setLayout(new BorderLayout());
			jp03.setLayout(new FlowLayout());
			jp04.setLayout(new FlowLayout());
			jp05.setLayout(new FlowLayout());
			jp06.setLayout(new FlowLayout());
			jp07.setLayout(new FlowLayout());
			
			
			
			//cp.add(jp0);
			jp0.add(jp01,BorderLayout.CENTER);
			jp0.add(jp04,BorderLayout.NORTH);
			jp04.add(jl0);
			jp01.add(jp02,BorderLayout.CENTER);
			jp02.add(jp03,BorderLayout.NORTH);
			
			jp01.add(jp05,BorderLayout.SOUTH);
			jp05.add(jl02);
			jp01.add(jp06,BorderLayout.EAST);
			jp06.add(jl01);
			jp01.add(jp07,BorderLayout.WEST);
			jp07.add(jl02);
			
			
			jp02.add(jp,BorderLayout.CENTER);
			jp.add(flow1,BorderLayout.NORTH);
			flow1.add(jl10);
			
			jp.add(jp2,BorderLayout.CENTER);
			jp2.add(jp3,BorderLayout.NORTH);
			jp2.add(flow,BorderLayout.CENTER);
			
			jp3.add(jl);
			jp3.add(jc);
			jp3.add(jl2);
			jp3.add(jc2);
			jp3.add(jl3);
			jp3.add(jc3);
			

			Border blue = BorderFactory.createLineBorder(Color.BLUE);
			jp02.setBorder(blue);
			
			jp03.add(back);
			jp03.add(jb0);
			jp03.add(jb01);
			//jp03.add(jb02);
			jp03.add(jb03);
			//jp03.add(jb04);
			
			//jp02.add(jp,BorderLayout.CENTER);
			
			jl=new JLabel();
		    //jl.setText("Addis Ababa city all bus roots");
		    jl.setFont(new Font("Arial", Font.BOLD, 29));
	        jl.setForeground(Color.BLUE);
	        
	        
	        jc.addItemListener(this);
	        jc2.addItemListener(this);
	        jc3.addItemListener(this);

	        
	        
	        
	        
	        
	        jb0.addActionListener(this);
	        jb01.addActionListener(this);
	        //jb02.addActionListener(this);
	        jb03.addActionListener(this);
	        //jb04.addActionListener(this);
	        back.addActionListener(this);
	        
	        setVisible(true);
	}
	
	
	
	public void itemStateChanged(ItemEvent ie) {
		float km,in1,in2;
		int indx;
		String [] stName,stPos;
		stName= new String[1];
		stPos= new String[1];
		
		String str1 = (String) jc2.getSelectedItem();
		stName[0]=str1 ;
		kilometer1= new float[kilometer.length];
		kilometer2= new float[kilometer.length];
		String str = (String) jc3.getSelectedItem();
		stPos[0]=str;
                
                System.out.println("+++++++The position ++++++....."+ str);
	    if(str=="Start") {
	    	
			indx=jc2.getSelectedIndex();
			km=kilometer[indx];
			System.out.println("\n kmmm...mm"+km);
			this.setVisible(false);
			CurentPos cs= new CurentPos(roots1,stName,stPos,km,staNamesAll);
	    }else if(str=="End") {
	    	indx=jc2.getSelectedIndex();
	    	int j=0;
	    	for(int i=kilometer.length-1;i>=0;i--) {
	    		if(i==kilometer.length-1) {
	    			kilometer1[j]=0;
	    			j++;

	    		}else {
	    		in1=kilometer[i+1];
	    		in2=kilometer[i];
	    		kilometer1[j]=(in1-in2)+kilometer1[j-1];
	    		j++;
	    		}
	    	}
	    	
	    	j=kilometer1.length-1;
	    	for(int i=0;i<kilometer1.length;i++) {
	    		kilometer2[j]=kilometer1[i];
	    		j--;
	    	}
	    	km=kilometer2[indx];
	    	
	    	 System.out.println(" kilooooo---- ");
	 	    for(int i=0;i<kilometer1.length;i++) {
	 		System.out.print(kilometer1[i]+"  ");
	 	    }
	 		System.out.println("\n kmmm...mm"+km);
	 		this.setVisible(false);
	 		CurentPos cs= new CurentPos(roots1,stName,stPos,km,staNamesAll);
	 	    
	    }
	    
	   
		
	  }
	
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
      
        if(s.equals("List all root")) {
        	//station id
        	this.setVisible(false);
        	CountTable ct= new CountTable();
        }else if(s.equals("View spacific root")) {
        	this.setVisible(false);
        	SpecificRoot vp= new SpecificRoot();
        }
        else if(s.equals("")) {
        	this.setVisible(false);
        	BusTracking bt = new BusTracking();
        }
    }

}
