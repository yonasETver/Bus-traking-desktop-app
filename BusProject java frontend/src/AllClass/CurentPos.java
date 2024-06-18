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

import java.util.Calendar;

public class CurentPos extends JFrame implements ActionListener{
	
	

	   
	 
	
	 
		private JLabel jl0,jl01,jl02,jl03,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
		private JPanel jp0,jp01,jp02,jp03,jp04,jp05,jp06,jp07,jp,jp2,jp3,jp4,flow,flow1,flow2;
		private JButton jb0,jb01,jb02,jb03,jb04;
		private JButton back;
		private JComboBox jc,jc1,jc2,jc3;
		private JTextField jt,jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13,jt14,jt15,jt16,jt17,jt18,jt19,jt20,jt21,jt22,jt23,jt24,jt25,jt26,jt27,jt28,jt29;
		
		Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
		 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
		
		 
		private String [] one,two,three,name,root2;
		private int year,month,date,hour,minitue;
		private String root,qur,direction;
		private float curPos;
		private float [] averKilo;
		private int size;
		private int [] year1,month1,date1,hour1,minitue1;
		private float [] curPos1,curPosion,WaittingTime;
		private String roots;
		private int busNo;
		private int [] busTrack;
		private String [] busTrack2,curPosion2,WaittingTime2,roots4,name4,staNamesAll;
		private String busNo2;
		
	
	public CurentPos(String [] roots1,String [] stName,String [] stPos,float km,String [] staNamesAll) {
	
		setIconImage(icon);
		
		this.staNamesAll=new String[staNamesAll.length];
		for(int i=0;i<staNamesAll.length;i++) {
			this.staNamesAll[i]=staNamesAll[i];
		}
		roots=roots1[0];
		roots4=new String[roots1.length];
		roots4[0]=roots1[0];
		name4=new String[stName.length];
		name4[0]=stName[0];
		
		
		root2= new String[1];
		root2[0]=roots1[0];
		direction=stPos[0];
		
		name=new String [1];
		name[0]=stName[0].trim();
			
		curPos=km;
		
		Calendar cal = Calendar.getInstance();
	      // current date and time

	      year=cal.get(Calendar.YEAR);
	      month=cal.get(Calendar.MONTH);
	      month+=1;
	      date=cal.get(Calendar.DAY_OF_MONTH);
	      hour=cal.get(Calendar.HOUR_OF_DAY);
	      minitue=cal.get(Calendar.MINUTE);
	      //System.out.println("Date------");
	      System.out.println("Roots  "+roots);
	      System.out.println("Year  "+year);
	      System.out.println("Month "+ month);
	      System.out.println("Date "+date);
	      System.out.println("Hour  "+hour);
	      System.out.println("Minitye  "+minitue);
	      System.out.println("Position "+km);
		
		//reading bus number
		String user="root";
		String password="";
		String url="jdbc:mysql://localhost:3306/project";
		
		
		//select values
		
		
	     qur="SELECT  carId  FROM busid WHERE 	root_ID= '"+roots+"'";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
				
				
		   
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				busNo=re1.getInt("carId");
		
				i++;
			
			}
			
				System.out.print(busNo+"  ");
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
		//identifing bus number
		
		busNo2=String.valueOf(busNo);
		
		

		
		try {
		Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
		Connection con= DriverManager.getConnection(url,user,password);
		Statement stt= con.createStatement();
		//String roots=(String)jc.getSelectedItem();
		//roots="ABADO06";
	    int m,n;
		m=minitue;
		n=minitue-5;
		//curPos3=(String)jc2.getSelectedItem();
		//curPos3="4.2 ";
		//curPos3=curPos3.trim();
		qur="select count(*) from bustrackingtwo  WHERE root_ID = '"+roots+"' AND minitue >= '"+n+"' AND minitue <= '"+m+"'  AND year = '"+year+"' "
				+ "AND month = '"+month+"' AND date_ = '"+date+"' AND time_ = '"+hour+"'  AND dire='"+direction+"' AND currentPos < '"+curPos+"' ";

		
	     
		ResultSet re=stt.executeQuery(qur);//accessing table
	
	 
     re.next();
     size= re.getInt(1);
   
    
	}catch(Exception ex) {
		ex.printStackTrace();
	}

		System.out.println("Size----"+size);

	
	
					
					//reading the root
					/*year1= new int[size];
					month1=new int[size];
					date1=new int [size];
					hour1=new int[size];
					minitue1=new int[size];
					curPos1= new float[size];
					averKilo=new float[size];*/
					//String roots=(String)jc.getSelectedItem();
					//roots="ABADO06";
					
					//direction=(String)jc3.getSelectedItem();
					//direction="Start";
					
					//String curPos3=(String)jc2.getSelectedItem();
					//curPos3="4.2 ";
					//curPos3=curPos3.trim();
				    int m,n;
				    
				    if(minitue==56) {
				    	hour-=1;
				    	m=59;
				    	n=59-5;
				    }else if(minitue==57) {
				    	hour-=1;
				    	m=58;
				    	n=58-5;
				    }else if(minitue==58) {
				    	hour-=1;
				    	m=57;
				    	n=57-5;
				    }else if(minitue==59) {
				    	hour-=1;
				    	m=56;
				    	n=56-5;
				    }else {
					m=minitue;
					n=minitue-5;
				    }
					
					curPos1=new float [size];
					averKilo= new float[size];
					busTrack= new int[size];
					
				     qur="SELECT year,currentPos,carTrackingId,dire,time_,date_,month,averageKM_hou,minitue  FROM bustrackingtwo WHERE root_ID = '"+roots+"' AND minitue >= '"+n+"' "
				     		+ "AND minitue <= '"+m+"'  AND year = '"+year+"' AND month = '"+month+"' AND date_ = '"+date+"' AND time_ = '"+hour+"' "
				     				+ "AND dire='"+direction+"' AND currentPos<'"+curPos+"' ";
						
						try {
							Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
							Connection con1= DriverManager.getConnection(url,user,password);
							Statement stt1= con1.createStatement();
							
							
							
					   
							
						ResultSet re1=stt1.executeQuery(qur);//accessing table
						int i=0;
						while (re1.next()) {
							
							//year1[i]=re1.getInt("year");
							//month1[i]=re1.getInt("month");
					       // date1[i]=re1.getInt("date_");
					       // hour1[i]=re1.getInt("time_");
					       // minitue1[i]=re1.getInt("minitue");
						   busTrack[i]=re1.getInt("carTrackingId");
					       curPos1[i]=re1.getFloat("currentPos");//
					       averKilo[i]=re1.getFloat("averageKM_hou");//
							i++;
						
						}
						/*System.out.println("Year..");
						for(i=0;i<year1.length;i++) {
							System.out.print(curPos1[i]+"  ");
						}*/
						
					}catch(Exception ex) {
						ex.printStackTrace();
					
				}
			       
						/*System.out.println("Year..");
						for(int i= 0;i<year1.length;i++) {
							System.out.println(year1[i]);
							System.out.println(month1[i]);
							System.out.println(date1[i]);
							System.out.println(hour1[i]);
							System.out.println(minitue1[i]);
							System.out.println(curPos1[i]);
							System.out.println(averKilo[i]);
						}*/
						
		//change to string 		
		busTrack2= new String[busTrack.length];
		for(int i=0;i<busTrack.length;i++) {
			busTrack2[i]=String.valueOf(busTrack[i]);
		}
		
		curPosion=new float[size];
		for(int i=0;i<size;i++) {
			curPosion[i]=km-curPos1[i];
		}
		
		curPosion2= new String[curPosion.length];
		
		for(int i=0;i<curPosion.length;i++) {
			curPosion2[i]=String.valueOf(curPosion[i]);
		}
		
		WaittingTime= new float[size];
		for(int i=0;i<size;i++) {
			WaittingTime[i]=curPosion[i]/(averKilo[i]/60);
		}
		
		WaittingTime2=new String[WaittingTime.length];
		
		for(int i=0;i<WaittingTime.length;i++) {
			WaittingTime2[i]=String.valueOf(WaittingTime[i]);
		}
		
		
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
		
		
		
		jl10=new JLabel("Waiting Time");
		jl10.setFont(new Font("Verdana",Font.BOLD,29));
		jl10.setForeground(Color.BLACK);
		
		
		
		if(size>=0) {
		jt= new JTextField();
		jt.setEditable(false);
	    jt.setColumns(10);
	    jt.setBackground(Color.pink);
	    jt.setText("Root");
		jt1= new JTextField();
		jt1.setEditable(false);
	    jt1.setColumns(10);
	    jt1.setBackground(Color.pink);
	    jt1.setText("Bus number");
		jt2= new JTextField();
		jt2.setEditable(false);
	    jt2.setColumns(10);
	    jt2.setBackground(Color.pink);
	    jt2.setText("Bus ID");
		jt3= new JTextField();
		jt3.setEditable(false);
	    jt3.setColumns(10);
	    jt3.setBackground(Color.pink);
	    jt3.setText("Bus position");
		jt4= new JTextField();
		jt4.setEditable(false);
	    jt4.setColumns(10);
	    jt4.setBackground(Color.pink);
	    jt4.setText("Waiting time");
	     }
	    
	    if(size>=1) {
	    jt5= new JTextField();
		jt5.setEditable(false);
	    jt5.setColumns(10);
	    jt5.setForeground(Color.WHITE);
	    jt5.setBackground(Color.darkGray);
	    jt5.setText(roots);
	    jt6= new JTextField();
		jt6.setEditable(false);
	    jt6.setColumns(10);
	    jt6.setText(busNo2);
	    jt6.setForeground(Color.WHITE);
	    jt6.setBackground(Color.darkGray);
	    jt7= new JTextField();
		jt7.setEditable(false);
	    jt7.setColumns(10);
	    jt7.setForeground(Color.WHITE);
	    jt7.setBackground(Color.darkGray);
	    jt7.setText(busTrack2[0]);
	    jt8= new JTextField();
		jt8.setEditable(false);
	    jt8.setColumns(10);
	    jt8.setForeground(Color.WHITE);
	    jt8.setBackground(Color.darkGray);
	    jt8.setText(curPosion2[0]+" km");
	    jt9= new JTextField();
		jt9.setEditable(false);
	    jt9.setColumns(10);
	    jt9.setForeground(Color.WHITE);
	    jt9.setBackground(Color.darkGray);
	    jt9.setText(WaittingTime2[0]+ " m");
	    }
	    
	    if(size>=2) {
		    jt10= new JTextField();
			jt10.setEditable(false);
		    jt10.setColumns(10);
		    jt10.setForeground(Color.WHITE);
		    jt10.setBackground(Color.darkGray);
		    jt10.setText(roots);
		    jt11= new JTextField();
			jt11.setEditable(false);
		    jt11.setColumns(10);
		    jt11.setText(busNo2);
		    jt11.setForeground(Color.WHITE);
		    jt11.setBackground(Color.darkGray);
		    jt12= new JTextField();
			jt12.setEditable(false);
		    jt12.setColumns(10);
		    jt12.setForeground(Color.WHITE);
		    jt12.setBackground(Color.darkGray);
		    jt12.setText(busTrack2[1]);
		    jt13= new JTextField();
			jt13.setEditable(false);
		    jt13.setColumns(10);
		    jt13.setForeground(Color.WHITE);
		    jt13.setBackground(Color.darkGray);
		    jt13.setText(curPosion2[1]+ " km");
		    jt14= new JTextField();
			jt14.setEditable(false);
		    jt14.setColumns(10);
		    jt14.setForeground(Color.WHITE);
		    jt14.setBackground(Color.darkGray);
		    jt14.setText(WaittingTime2[1]+" m");
		    }
	    if(size>=3) {
		    jt15= new JTextField();
			jt15.setEditable(false);
		    jt15.setColumns(10);
		    jt15.setForeground(Color.WHITE);
		    jt15.setBackground(Color.darkGray);
		    jt15.setText(roots);
		    jt16= new JTextField();
			jt16.setEditable(false);
		    jt16.setColumns(10);
		    jt16.setText(busNo2);
		    jt16.setForeground(Color.WHITE);
		    jt16.setBackground(Color.darkGray);
		    jt17= new JTextField();
			jt17.setEditable(false);
		    jt17.setColumns(10);
		    jt17.setForeground(Color.WHITE);
		    jt17.setBackground(Color.darkGray);
		    jt17.setText(busTrack2[2]);
		    jt18= new JTextField();
			jt18.setEditable(false);
		    jt18.setColumns(10);
		    jt18.setForeground(Color.WHITE);
		    jt18.setBackground(Color.darkGray);
		    jt18.setText(curPosion2[2]+ " km");
		    jt19= new JTextField();
			jt19.setEditable(false);
		    jt19.setColumns(10);
		    jt19.setForeground(Color.WHITE);
		    jt19.setBackground(Color.darkGray);
		    jt19.setText(WaittingTime2[2]+" m");
		    }
	    if(size>=4) {
		    jt20= new JTextField();
			jt20.setEditable(false);
		    jt20.setColumns(10);
		    jt20.setForeground(Color.WHITE);
		    jt20.setBackground(Color.darkGray);
		    jt20.setText(roots);
		    jt21= new JTextField();
			jt21.setEditable(false);
		    jt21.setColumns(10);
		    jt21.setText(busNo2);
		    jt21.setForeground(Color.WHITE);
		    jt21.setBackground(Color.darkGray);
		    jt22= new JTextField();
			jt22.setEditable(false);
		    jt22.setColumns(10);
		    jt22.setForeground(Color.WHITE);
		    jt22.setBackground(Color.darkGray);
		    jt22.setText(busTrack2[3]);
		    jt23= new JTextField();
			jt23.setEditable(false);
		    jt23.setColumns(10);
		    jt23.setForeground(Color.WHITE);
		    jt23.setBackground(Color.darkGray);
		    jt23.setText(curPosion2[3]+" km");
		    jt24= new JTextField();
			jt24.setEditable(false);
		    jt24.setColumns(10);
		    jt24.setForeground(Color.WHITE);
		    jt24.setBackground(Color.darkGray);
		    jt24.setText(WaittingTime2[3]+" m");
		    }
	    if(size>=5) {
		    jt25= new JTextField();
			jt25.setEditable(false);
		    jt25.setColumns(10);
		    jt25.setForeground(Color.WHITE);
		    jt25.setBackground(Color.darkGray);
		    jt25.setText(roots);
		    jt26= new JTextField();
			jt26.setEditable(false);
		    jt26.setColumns(10);
		    jt26.setText(busNo2);
		    jt26.setForeground(Color.WHITE);
		    jt26.setBackground(Color.darkGray);
		    jt27= new JTextField();
			jt27.setEditable(false);
		    jt27.setColumns(10);
		    jt27.setForeground(Color.WHITE);
		    jt27.setBackground(Color.darkGray);
		    jt27.setText(busTrack2[4]);
		    jt28= new JTextField();
			jt28.setEditable(false);
		    jt28.setColumns(10);
		    jt28.setForeground(Color.WHITE);
		    jt28.setBackground(Color.darkGray);
		    jt28.setText(curPosion2[4]+" km");
		    jt29= new JTextField();
			jt29.setEditable(false);
		    jt29.setColumns(10);
		    jt29.setForeground(Color.WHITE);
		    jt29.setBackground(Color.darkGray);
		    jt29.setText(WaittingTime2[4]+" m");
		    }
	    
	    
	    
		 
		jc=new JComboBox(root2);
		jc.setFont(new Font("Arial", Font.PLAIN, 14));
        jc.setSize(50, 20);
        jc.setMaximumRowCount(4);
		jc2=new JComboBox(name);
		//jc2.setSelectedIndex(-1);
		jc2.setFont(new Font("Arial", Font.PLAIN, 14));
        jc2.setSize(50, 20);
        jc2.setMaximumRowCount(4);
		jc3=new JComboBox(three);
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
		    //flow2=new JPanel(new GridLayout(2,5,10,10));
		    if(size==0) {
		    	flow2 = new JPanel(new GridLayout(1,5,10,10));
			    }
		    if(size==1) {
		    	flow2 = new JPanel(new GridLayout(2,5,10,10));
		    }
		    
		    if(size==2) {
		    	flow2 = new JPanel(new GridLayout(3,5,10,10));
			 }
		    
		    if(size==3) {
		    	flow2 = new JPanel(new GridLayout(4,5,10,10));
			  }
		    
		    if(size==4) {
		    	flow2 = new JPanel(new GridLayout(5,5,10,10));
			 }
		    
		    if(size==5) {
		    	flow2 = new JPanel(new GridLayout(6,5,10,10));
			 }
		   
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
			
			flow.add(flow2);
			
			
			jp3.add(jl);
			jp3.add(jc);
			jp3.add(jl2);
			jp3.add(jc2);
			//jp3.add(jl3);
			//jp3.add(jc3);
			
			if(size>=0) {
			flow2.add(jt);
			flow2.add(jt1);
			flow2.add(jt2);
			flow2.add(jt3);
			flow2.add(jt4);
			}
			
			if(size>=1) {
			flow2.add(jt5);
			flow2.add(jt6);
			flow2.add(jt7);
			flow2.add(jt8);
			flow2.add(jt9);
			}
			
			if(size>=2) {
				flow2.add(jt10);
				flow2.add(jt11);
				flow2.add(jt12);
				flow2.add(jt13);
				flow2.add(jt14);
		   }
			
			if(size>=3) {
				flow2.add(jt15);
				flow2.add(jt16);
				flow2.add(jt17);
				flow2.add(jt18);
				flow2.add(jt19);
				}
			if(size>=4) {
				flow2.add(jt20);
				flow2.add(jt21);
				flow2.add(jt22);
				flow2.add(jt23);
				flow2.add(jt24);
				}
			if(size>=5) {
				flow2.add(jt25);
				flow2.add(jt26);
				flow2.add(jt27);
				flow2.add(jt28);
				flow2.add(jt29);
				}
			
			
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
	        
	        
	       

	        
	        
	        
	        
	        
	        jb0.addActionListener(this);
	        jb01.addActionListener(this);
	        //jb02.addActionListener(this);
	        jb03.addActionListener(this);
	        //jb04.addActionListener(this);
	        back.addActionListener(this);
	        
	        
	    
	
	        setVisible(true);
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
        	BusTrackingTwo bt = new BusTrackingTwo(roots4,this.staNamesAll);
        }
    }

}
