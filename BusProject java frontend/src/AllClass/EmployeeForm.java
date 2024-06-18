package AllClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  

import javax.swing.border.Border;

import java.util.Calendar;

public class EmployeeForm extends JFrame implements ActionListener,ItemListener {
    private Container c;
    private JLabel title;
    private JLabel fname;
    private JTextField tfname;
    private JLabel lname;
    private JTextField tlname;
    private JButton submi;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private JLabel ldate;
    private JComboBox date,date1;
    private JLabel lmonth;
    private JComboBox month,month1;
    private JLabel lyear;
    private JComboBox year,year1;
    private JLabel lcountry;
    private JComboBox country;
    private JLabel ledu;
    private JTextField tedu;
    private JLabel lwork;
    private JTextField twork;
    private JLabel ljob;
    private JTextField tjob;
    private JLabel ldateH;
    private JLabel birth;
    private ButtonGroup buttonGroup;
    private JButton back;
  
    
    private String sqlFname="";
    private String sqlLname="";
    private String sqlSex;
    private String sqlBirthDay;
    private int sqlBirthDay2;
    private String sqlBirthMonth;
    private String sqlBirthyear;
    private int sqlBirthyear2;
    private String sqlNationality;
    private String sqlWork="";
    private String sqlExp="";
    private String sqlJob="";
    private String sqlDate;
    private int sqlDate2;
    private String sqlMonth;
    private String sqlyear;
    private int sqlyear2;
    
    String [] sqlBirthDay1;
    String [] sqlBirthMonth1;
    String [] sqlBirthyear1;
    
    String [] sqlDay1;
    String [] sqlMonth1;
    String [] sqlyear1;
    
    private int select,age=0,age1=0;
    
    int f=0;
    static int n=4,n1=4;
    
    JFrame frame;
    static int bb1=0,bb2=0,cs1=0,cs2=0;
    
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
  		
	
	public int j,yearNow;
	
	
	private String countries []
			={"Ethiopian","African","Asian","Australian","North American",
			  "South American","Europian"};
	
	
	
	public static void onlyDigits(String str){
		try {
		    n = Integer.parseInt(str);
		    bb1=0;
		} catch (NumberFormatException e) {
		    // str is not a number
			bb1=-1;
		}
	}
	
	public static void onlyDigits1(String str){
		try {
		    n1 = Integer.parseInt(str);
		    bb2=-2;
		} catch (NumberFormatException e) {
		    // str is not a number
			bb2=-1;
		}
	}
	
	
	public EmployeeForm(String sqlFname,String sqlLname,String sqlWork,String sqlExp,String sqlJob,int cs1,int cs2,String [] dates,String [] months,String [] years,
			String [] dates1,String [] months1,String [] years1)
	
    {
		 setIconImage(icon); 
		 
		Calendar cal = Calendar.getInstance();
		yearNow=cal.get(Calendar.YEAR);
		
	
        setTitle("Employee");
        setBounds(300, 90, 600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);


        back=new JButton(icon1);
        //back.setFont(new Font("Arial", Font.PLAIN, 18));
		//back.setText("Back");
	    back.setBackground(Color.decode("#F0F8FF"));
	    back.setBorder(BorderFactory.createLineBorder(Color.decode("#F0F8FF")));
	    back.setSize(60, 30);
        back.setLocation(60, 30);
        c.add(back);
  
        title = new JLabel("ABC");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.BLUE);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        fname = new JLabel("First name");
        fname.setFont(new Font("Arial", Font.PLAIN, 20));
        fname.setSize(100, 20);
        fname.setLocation(100, 100);
        c.add(fname);
  
        tfname = new JTextField();
        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
        tfname.setSize(190, 20);
        tfname.setLocation(260, 100);
        if(sqlFname.equals("NULL")) {
        	tfname.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tfname.setText(sqlFname);
        }
        c.add(tfname);
  
        lname = new JLabel("Last name");
        lname.setFont(new Font("Arial", Font.PLAIN, 20));
        lname.setSize(100, 20);
        lname.setLocation(100, 130);
        c.add(lname);
  
        tlname = new JTextField();
        tlname.setFont(new Font("Arial", Font.PLAIN, 15));
        tlname.setSize(190, 20);
        tlname.setLocation(260, 130);
        if(sqlLname.equals("NULL")) {
        	tlname.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tlname.setText(sqlLname);
        }
        c.add(tlname);
        
        
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 160);
        c.add(gender);
  
        male = new JRadioButton("Male");
        male.setActionCommand("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(260, 160);
        c.add(male);
  
        female = new JRadioButton("Female");
        female.setActionCommand("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(260, 180);
        c.add(female);
        
        buttonGroup = new ButtonGroup();
        
        //add radio buttons
        buttonGroup.add(male);
        buttonGroup.add(female);
       
        
        birth = new JLabel("Bairth day");
        birth.setFont(new Font("Arial", Font.PLAIN, 20));
        birth.setSize(100, 20);
        birth.setLocation(100, 210);
        c.add(birth);
        

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(260, 210);
        if(cs1==-1) {
        	date.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
       }
        c.add(date);
        date.setMaximumRowCount(4);
        
        select=date.getSelectedIndex()	;//for getting the value of the combobox
        sqlBirthDay=dates[select];
        sqlBirthDay2=Integer.parseInt(sqlBirthDay);
 
        
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(50, 20);
        month.setLocation(310, 210);
        if(cs1==-1) {
        	month.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
       }
        c.add(month);
        month.setMaximumRowCount(4);
        select=month.getSelectedIndex();
        sqlBirthMonth=months[select];
  
        
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(70, 20);
        year.setLocation(360, 210);
        if(cs1==-1) {
        	 year.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(year);
        year.setMaximumRowCount(4);
        
        select=year.getSelectedIndex();
        sqlBirthyear=years[select];
        sqlBirthyear2=Integer.parseInt(sqlBirthyear);
       
        
        lcountry = new JLabel("Nationality");
        lcountry.setFont(new Font("Arial", Font.PLAIN, 20));
        lcountry.setSize(100, 20);
        lcountry.setLocation(100, 300);
        c.add(lcountry);
           
        country = new JComboBox(countries);
        country.setFont(new Font("Arial", Font.PLAIN, 15));
        country.setSize(120, 20);
        country.setLocation(260, 300);
        c.add(country);
        country.setMaximumRowCount(4);
        
        select=country.getSelectedIndex();
        sqlNationality=months[select];
        
        
        ledu = new JLabel("Edu Background");
        ledu.setFont(new Font("Arial", Font.PLAIN, 20));
        ledu.setSize(200, 20);
        ledu.setLocation(100, 330);
        c.add(ledu);
        
        tedu = new JTextField();
        tedu.setFont(new Font("Arial", Font.PLAIN, 15));
        tedu.setSize(190, 20);
        tedu.setLocation(260, 330);
        if(sqlWork.equals("NULL")) {
        	tedu.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tedu.setText(sqlWork);
        }
        c.add(tlname);
        c.add(tedu);
        
        
        lwork = new JLabel("Work Exprians");
        lwork.setFont(new Font("Arial", Font.PLAIN, 20));
        lwork.setSize(200, 20);
        lwork.setLocation(100, 360);
        c.add(lwork);
        
        twork = new JTextField();
        twork.setFont(new Font("Arial", Font.PLAIN, 15));
        twork.setSize(190, 20);
        twork.setLocation(260, 360);
        if(sqlExp.equals("NULL")) {
        	twork.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	twork.setText(sqlExp);
        }
        if(bb1==-1 || EnterStation.n<0 || EnterStation.n>40) {
        	twork.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(twork);
        
        
        ljob = new JLabel("Job description");
        ljob.setFont(new Font("Arial", Font.PLAIN, 20));
        ljob.setSize(200, 20);
        ljob.setLocation(100, 390);
        c.add(ljob);
        
        tjob = new JTextField();
        tjob.setFont(new Font("Arial", Font.PLAIN, 15));
        tjob.setSize(190, 20);
        tjob.setLocation(260, 390);
        if(sqlJob.equals("NULL")) {
        	tjob.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tjob.setText(sqlJob);
        }if(bb2==-2) {
        	twork.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(tjob);
        
        ldateH = new JLabel("Highered date");
        ldateH.setFont(new Font("Arial", Font.PLAIN, 20));
        ldateH.setSize(200, 20);
        ldateH.setLocation(100, 420);
        c.add(ldateH);
        

        date1 = new JComboBox(dates1);
        date1.setFont(new Font("Arial", Font.PLAIN, 15));
        date1.setSize(50, 20);
        date1.setLocation(260, 420);
        if(cs2==-1) {
        	date1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
       }
        c.add(date1);
        date1.setMaximumRowCount(4);
        
        select=date1.getSelectedIndex()	;//for getting the value of the combobox
        sqlDate=dates1[select];
        sqlDate2=Integer.parseInt(sqlDate);
 
        
        month1 = new JComboBox(months1);
        month1.setFont(new Font("Arial", Font.PLAIN, 15));
        month1.setSize(50, 20);
        month1.setLocation(310, 420);
        if(cs2==-1) {
        	month1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
       }
        c.add(month1);
        month1.setMaximumRowCount(4);
        
        select= month1.getSelectedIndex()	;//for getting the value of the combobox
        sqlMonth=months1[select];
  
        
        year1 = new JComboBox(years1);
        year1.setFont(new Font("Arial", Font.PLAIN, 15));
        year1.setSize(70, 20);
        year1.setLocation(360, 420);
        if(cs2==-1) {
        	year1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
       }
        c.add(year1);
        year1.setMaximumRowCount(4);
        
        select=year1.getSelectedIndex()	;//for getting the value of the combobox
        sqlyear=years1[select];
        //sqlyear2=Integer.parseInt(sqlyear);
        
        
  
        submi = new JButton("Submit");
        submi.setFont(new Font("Arial", Font.PLAIN, 15));
        submi.setSize(100, 20);
        submi.setLocation(300, 470);
        submi.setBackground(Color.CYAN);
        submi.setForeground(Color.magenta);
        c.add(submi);
        
        
        
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        
        submi.addActionListener(this);
        back.addActionListener(this);
        date.addItemListener(this);
        month.addItemListener(this);
        year.addItemListener(this);
        date1.addItemListener(this);
        month1.addItemListener(this);
        year1.addItemListener(this);
        
        setVisible(true);
    }
	
	public void itemStateChanged(ItemEvent ie) {
	    sqlBirthDay=(String )date.getSelectedItem();
        //sqlBirthDay2=Integer.parseInt(sqlBirthDay);
        
        sqlBirthMonth=(String)month.getSelectedItem();
        //sqlBirthMonth2=Integer.parseInt(sqlBirthMonth);
        
        sqlBirthyear=(String)year.getSelectedItem();
       // sqlBirthyear2=Integer.parseInt(sqlBirthyear);
        
        sqlDate=(String )date1.getSelectedItem();
        //sqlBirthDay2=Integer.parseInt(sqlBirthDay);
        
        sqlMonth=(String)month1.getSelectedItem();
        //sqlBirthMonth2=Integer.parseInt(sqlBirthMonth);
        
        sqlyear=(String)year1.getSelectedItem();
       // sqlBirthyear2=Integer.parseInt(sqlBirthyear);
        
  }
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        sqlBirthDay2=Integer.parseInt(sqlBirthDay);
        sqlBirthyear2=Integer.parseInt(sqlBirthyear);
        
        sqlyear2=Integer.parseInt(sqlyear);
        
        sqlBirthDay1=new String[1];
        sqlBirthDay1[0]=String.valueOf(sqlBirthDay2);
        sqlBirthMonth1=new String[1];
        sqlBirthMonth1[0]=sqlBirthMonth;
        sqlBirthyear1=new String[1];
        sqlBirthyear1[0]=String.valueOf(sqlBirthyear2);
        
        sqlDay1=new String[1];
        sqlDay1[0]=String.valueOf(sqlDate2);
        sqlMonth1=new String[1];
        sqlMonth1[0]=sqlMonth;
        sqlyear1=new String[1];
        sqlyear1[0]=String.valueOf(sqlyear2);
        
        if(s.equals("Submit")) {
        	String url="jdbc:mysql://localhost:3306/project";
    		String user="root";
    		String password="";
    		
    		sqlFname=tfname.getText();//getting the value of the textfleld 
    		sqlLname=tlname.getText();//getting the value of the textfleld 
    		sqlWork=tedu.getText();//for getting the value of the textfield
    		sqlExp=twork.getText();//for getting the value of the textfield
    		sqlJob=tjob.getText();//for getting the value of the textfield
    		sqlSex=buttonGroup.getSelection().getActionCommand();
    		
    		onlyDigits(sqlExp);
    		onlyDigits1(sqlJob);
    		
    		age=(yearNow-sqlBirthyear2);
    		age1=(yearNow-sqlyear2);
    		
    		//System.out.println(age1+" =======================");
    	        
    		if(sqlFname.length()==0 || sqlLname.length()==0 || sqlWork.length()==0 || sqlExp.length()==0 || sqlJob.length()==0) {
    			if(sqlFname.length()==0 ) {
    				sqlFname="NULL";
    			}
    			if(sqlLname.length()==0 ) {
    				sqlLname="NULL";
    			}
    			if(sqlWork.length()==0) {
    				sqlWork="NULL";
    			}
    			if( sqlExp.length()==0) {
    				 sqlExp="NULL";
    			}
    			if(sqlJob.length()==0) {
    				sqlJob="NULL";
    			}
    			this.setVisible(false);
    			EmployeeForm ep= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,sqlBirthDay1,sqlBirthMonth1,sqlBirthyear1,sqlDay1,sqlMonth1,sqlyear1);
    		}else if(age<18 || age >60) {
    			
    			 cs1=-1;
    			 JOptionPane.showMessageDialog(frame, "Employee age canot be <18 or >60");
    			 this.setVisible(false);
    			 EmployeeForm ep= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,AdminWindow.dates,AdminWindow.months,AdminWindow.years,sqlDay1,sqlMonth1,sqlyear1);
    			 
    		 }else if(age1!=0) {
     			
   			 cs2=-1;
   			 JOptionPane.showMessageDialog(frame, "Employee date of highered can not be less than current year");
   			 this.setVisible(false);
   			 EmployeeForm ep= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,sqlBirthDay1,sqlBirthMonth1,sqlBirthyear1,AdminWindow.dates1,AdminWindow.months1,AdminWindow.years1);
   			 
   		 }else if(bb1==-1) {
            
            	JOptionPane.showMessageDialog(frame, "Employee expriance must be number");
            	this.setVisible(false);
            	EmployeeForm ep= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,sqlBirthDay1,sqlBirthMonth1, sqlBirthyear1,sqlDay1,sqlMonth1, sqlyear1);
            	
            }else if(bb1==0 && EnterStation.n<4 || EnterStation.n>13 ) {
            	f=-1;
            	JOptionPane.showMessageDialog(frame, "Employee expriance can not be <0 and >40");
            	this.setVisible(false);
            	EmployeeForm ep= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,sqlBirthDay1,sqlBirthMonth1, sqlBirthyear1,sqlDay1,sqlMonth1, sqlyear1);
            }else if(bb2==-2) {
            
            	JOptionPane.showMessageDialog(frame, "Job description must be string");
            	this.setVisible(false);
            	EmployeeForm ep= new EmployeeForm(sqlFname,sqlLname,sqlWork,sqlExp,sqlJob,cs1,cs2,sqlBirthDay1,sqlBirthMonth1, sqlBirthyear1,sqlDay1,sqlMonth1, sqlyear1);
            	
            }
    		   		
    		//String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		//String qur="SELECT *FROM sign_inadmin WHERE acount='"+name+"'";
    		
    		//System.out.println(name);
    		else {
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
    			stt.execute("INSERT INTO employee (fName,lName,Birth_day,Birth_month,Birth_year,sex,nation,background,WorkExpriInYear,job_Discription,Higered_day,Higered_month,Higered_year) VALUES"+ 
			            "('"+sqlFname+"','"+sqlLname+"','"+sqlBirthDay2+"','"+sqlBirthMonth+"','"+sqlBirthyear2+"','"+sqlSex+"','"+sqlNationality+"','"+sqlWork+"','"+sqlExp+"','"+sqlJob+"','"+sqlDate2+"','"+sqlMonth+"','"+sqlyear2+"')");
    	
    		
    		c.setVisible(false);
                this.setVisible(false);
                
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
    	
    		}
        }else {
        	this.setVisible(false);
        	AdminWindow aw = new AdminWindow();
        }
       
    }
        	
}
