package AllClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.Border;

import java.util.Calendar;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UserSugnUp extends JFrame implements ActionListener,ItemListener {
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
    private JComboBox date;
    private JLabel lmonth;
    private JComboBox month;
    private JLabel lyear;
    private JComboBox year;
    private JLabel lcountry;
    private JComboBox country;
    private JLabel lregion;
    private JComboBox region;
    private JLabel lcity;
    private JTextField tcity;
    private JLabel lphone;
    private JTextField tphone;
    private JLabel lemail;
    private JTextField temail;
    private JLabel lacountName;
    private JTextField tacountName;
    private JLabel lpassword;
    private JPasswordField tpassword;
    private JLabel lrepassword;
    private JPasswordField trepassword;
    private JLabel birth;
    private ButtonGroup buttonGroup;
    private JButton back;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
	
    
    static int age=0;
    
    static int len=0;
    
    String sqlFname="";
    String sqlLname="";
    String sqlSex="";
    String sqlBirthDay="1";
    String sqlBirthMonth="Jan";
    String sqlBirthyear="1910";
    String sqlCoutry="";
    String sqlRegion="";
    String sqlCity="";
    String sqlPhone="";
    String sqlEmail="";
    String sqlAccount="";
    String sqlPass="";
    String sqlPass2="";
    
    String [] sqlBirthDay1;
    String [] sqlBirthMonth1;
    String [] sqlBirthyear1;
    
    int sqlBirthDay2;
    int sqlBirthMonth2;
    int sqlBirthyear2;
    int select,cs=0,cs3=0;
    static int bb1=0,cs1=0;
    
    private int yearNow;
    
    JFrame frame;
    
    
    
	
	private String countries []
			={"Ethiopia"};
	
	private String regions []
			= {"Tigray","Afar","Amhara",
			   "Oromiya","SNNP","Sidama",
			   "Somale","Benishangul","Gambela",
			   "Harar","Dredewa","Addis Ababa"
					
			};
	
	
	public static void onlyDigits(String str){
		try {
		    long n = Long.parseLong(str);
		    bb1=0;
		} catch (NumberFormatException e) {
		    // str is not a number
			bb1=-1;
		}
	}
	
	public UserSugnUp(String sqlFname,String sqlLname,String sqlCity,String sqlPhone,
                     String sqlEmail,String sqlAccount,String sqlPass,String sqlPass2,int cs, int cs1,String [] dates,String [] months,String [] years)
                    
    {
		
		setIconImage(icon); 
		
		Calendar cal = Calendar.getInstance();
		yearNow=cal.get(Calendar.YEAR);
		
		
        setTitle("user Sign-up");
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
        title.setFont(new Font("Arial", Font.BOLD, 29));
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
        tfname.setLocation(250, 100);
        if(sqlFname.equals("NULL")) {
        	tfname.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else {
        	tfname.setText(sqlFname);
        }
 
        c.add(tfname);
        
        //sqlFname=tfname.getText();//getting the value of the textfleld 
  
        lname = new JLabel("Last name");
        lname.setFont(new Font("Arial", Font.PLAIN, 20));
        lname.setSize(100, 20);
        lname.setLocation(100, 130);
        c.add(lname);
  
        tlname = new JTextField();
        tlname.setFont(new Font("Arial", Font.PLAIN, 15));
        tlname.setSize(190, 20);
        tlname.setLocation(250, 130);
        if(sqlLname.equals("NULL")) {
        	tlname.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else {
        	 tlname.setText(sqlFname);
        }
        c.add(tlname);
        
        //sqlLname=tlname.getText();//getting the value of the textfleld 
        
        gender = new JLabel("Sex");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 160);
        c.add(gender);
  
        male = new JRadioButton("Male");
        male.setActionCommand("Male");
        
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(250, 160);
        c.add(male);
  
        female = new JRadioButton("Femal");
        female.setActionCommand("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(250, 180);
        c.add(female);
        
        buttonGroup = new ButtonGroup();
        
        //add radio buttons
        buttonGroup.add(male);
        buttonGroup.add(female);
       
        
        //female.addActionListener(this);
        //male.addActionListener(this);
        
        birth = new JLabel("Bairth day");
        birth.setFont(new Font("Arial", Font.PLAIN, 20));
        birth.setSize(100, 20);
        birth.setLocation(100, 210);
        c.add(birth);
        
        

        date = new JComboBox(dates);
        date.setSelectedIndex(0);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(250, 210);
        
        if(cs1==-1) {
        	date.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else if(age>=15 && age <=100) {
        	 date.setSelectedIndex(0);
        	 //date.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        
        date.setMaximumRowCount(4);
        c.add(date);
       
 
       // select=date.getSelectedIndex()	;//for getting the value of the combobox
       
        //sqlBirthDay1= new String[1];
        //sqlBirthDay1[0]=sqlBirthDay;
        		
        month = new JComboBox(months);
        month.setSelectedIndex(0);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(50, 20);
        month.setLocation(300, 210);
        //month.setSelectedIndex(-1);
        if(cs1==-1) {
        	month.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else if(age>=15 && age <=100) {
        	month.setSelectedIndex(0);
        	//month.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        c.add(month);
        month.setMaximumRowCount(4);
        
       // select=month.getSelectedIndex();
        
        //sqlBirthMonth1= new String[1];
        //sqlBirthMonth1[0]=sqlBirthMonth;
        
        
        year = new JComboBox(years);
        //year.setSelectedIndex(0);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(70, 20);
        year.setLocation(350, 210);
        
        if(cs1==-1) {
        	year.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else if(age>=15 && age <=100) {
        	year.setSelectedIndex(0);
        	//year.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
        c.add(year);
        year.setMaximumRowCount(4);
        
        //select=year.getSelectedIndex();//for getting the value of the combobox
        
        //sqlBirthyear1= new String[1];
        //sqlBirthyear1[0]=sqlBirthyear;
        
        lcountry = new JLabel("Country");
        lcountry.setFont(new Font("Arial", Font.PLAIN, 20));
        lcountry.setSize(100, 20);
        lcountry.setLocation(100, 300);
        c.add(lcountry);
           
        country = new JComboBox(countries);
        country.setFont(new Font("Arial", Font.PLAIN, 15));
        country.setSize(80, 20);
        country.setLocation(250, 300);
        c.add(country);
        
        select=country.getSelectedIndex();//for getting the value of the combobox
        sqlCoutry=countries[select];
        
        
        lregion = new JLabel("Region");
        lregion.setFont(new Font("Arial", Font.PLAIN, 20));
        lregion.setSize(100, 20);
        lregion.setLocation(100, 330);
        c.add(lregion);
        
       
        
        region = new JComboBox(regions);
        region.setFont(new Font("Arial", Font.PLAIN, 15));
        region.setSize(120, 25);
        region.setLocation(250, 330);
        c.add(region);
        region.setMaximumRowCount(4);
        
        select=region.getSelectedIndex();//for getting the value of the combobox
        sqlRegion=regions[select];
        
        lcity = new JLabel("City");
        lcity.setFont(new Font("Arial", Font.PLAIN, 20));
        lcity.setSize(100, 20);
        lcity.setLocation(100, 360);
        c.add(lcity);
        
        tcity = new JTextField();
        tcity.setFont(new Font("Arial", Font.PLAIN, 15));
        tcity.setSize(190, 20);
        tcity.setLocation(250, 360);
        if(sqlCity.equals("NULL")) {
        	tcity.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else {
        	tcity.setText(sqlCity);
        }
        c.add(tcity);
        
        //sqlCity=tcity.getText();//for getting the value of the textfield
        
        lphone= new JLabel("Phone");
        lphone.setFont(new Font("Arial", Font.PLAIN, 20));
        lphone.setSize(100, 20);
        lphone.setLocation(100, 390);
        c.add(lphone);
        
        tphone = new JTextField();
        tphone.setFont(new Font("Arial", Font.PLAIN, 15));
        tphone.setSize(190, 20);
        tphone.setLocation(250, 390);
        if(sqlPhone.equals("NULL") || cs3==-1) {
        	tphone.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else if(bb1==-1 && len<10 || len>10) {
        	tphone.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        	tphone.setText(sqlPhone);
        }
        else {
        	tphone.setText(sqlPhone);
        }
        c.add(tphone);
        
        //sqlPhone=tphone.getText();//for getting the value of the textfield
        
        lemail = new JLabel("Email");
        lemail.setFont(new Font("Arial", Font.PLAIN, 20));
        lemail.setSize(100, 20);
        lemail.setLocation(100, 420);
        c.add(lemail);
        
        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(250, 420);
        if(sqlEmail.equals("NULL")) {
        	temail.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else {
        	temail.setText(sqlEmail);
        }
        c.add(temail);
        
        //sqlEmail=temail.getText();//for getting the value of the textfield
        
        lacountName = new JLabel("Account");
        lacountName.setFont(new Font("Arial", Font.PLAIN, 20));
        lacountName.setSize(100, 20);
        lacountName.setLocation(100, 450);
        c.add(lacountName);
        
        tacountName = new JTextField();
        tacountName.setFont(new Font("Arial", Font.PLAIN, 15));
        tacountName.setSize(190, 20);
        tacountName.setLocation(250, 450);
        if(sqlAccount.equals("NULL")) {
        	tacountName.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else {
        	tacountName.setText(sqlAccount);
        }
        c.add(tacountName);
        
       // sqlAccount=tacountName.getText();//for getting the value of the textfield
        
        lpassword = new JLabel("Password");
        lpassword.setFont(new Font("Arial", Font.PLAIN, 20));
        lpassword.setSize(100, 20);
        lpassword.setLocation(100, 480);
        c.add(lpassword);
        
       
        
        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(190, 20);
        tpassword.setLocation(250, 480);
        if(sqlPass.equals("NULL") ) {
        	tpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else{
        	tpassword.setText(sqlPass);
        }
        
        
        c.add(tpassword);
        
        //sqlPass=tpassword.getText();//for getting the value of the textfield
        
        lrepassword = new JLabel("Password");
        lrepassword.setFont(new Font("Arial", Font.PLAIN, 20));
        lrepassword.setSize(100, 20);
        lrepassword.setLocation(100, 510);
        c.add(lrepassword);
        
        trepassword = new JPasswordField();
        trepassword.setFont(new Font("Arial", Font.PLAIN, 15));
        trepassword.setSize(190, 20);
        trepassword.setLocation(250, 510);
        if(sqlPass2.equals("NULL") || cs==-1 ) {
        	trepassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));	
        }else {
        	trepassword.setText(sqlPass2);
        }
        c.add(trepassword);
        
        //sqlPass2=trepassword.getText();//for getting the value of the textfield
        
        submi = new JButton("Sign-up");
        submi.setFont(new Font("Arial", Font.PLAIN, 15));
        submi.setSize(100, 20);
        submi.setLocation(300, 560);
        submi.setBackground(Color.CYAN);
        submi.setForeground(Color.magenta);
        c.add(submi);
  
        submi.addActionListener(this);
        back.addActionListener(this);
        
        date.addItemListener(this);
        month.addItemListener(this);
        year.addItemListener(this);
       
        
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        
        setVisible(true);
    }
	
	public void itemStateChanged(ItemEvent ie) {
		    sqlBirthDay=(String )date.getSelectedItem();
	        //sqlBirthDay2=Integer.parseInt(sqlBirthDay);
	        
	        sqlBirthMonth=(String)month.getSelectedItem();
	        //sqlBirthMonth2=Integer.parseInt(sqlBirthMonth);
	        
	        sqlBirthyear=(String)year.getSelectedItem();
	        //sqlBirthyear2=Integer.parseInt(sqlBirthyear);
	        
	  }
	
	public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        int x=0;
       
        sqlBirthDay2=Integer.parseInt(sqlBirthDay);
        sqlBirthyear2=Integer.parseInt(sqlBirthyear);
        
        sqlBirthDay1=new String[1];
        sqlBirthDay1[0]=String.valueOf(sqlBirthDay2);
        sqlBirthMonth1=new String[1];
        sqlBirthMonth1[0]=sqlBirthMonth;
        sqlBirthyear1=new String[1];
        sqlBirthyear1[0]=String.valueOf(sqlBirthyear2);
        
        
        
        if(s.equals("Sign-up")) {
        	String url="jdbc:mysql://localhost:3306/project";
    		String user="root";
    		String password="";
    		//System.out.println("Year---"+yearNow+"  "+sqlBirthyear2);
    		
    		
    		
    	    age=(yearNow-sqlBirthyear2);
    	    
    	   System.out.println("Year---"+yearNow+"  "+sqlBirthyear2+"  "+age);
    		sqlFname=tfname.getText();//getting the value of the textfleld 
    		sqlLname=tlname.getText();//getting the value of the textfleld 
    		sqlCity=tcity.getText();//for getting the value of the textfield
    		sqlPhone=tphone.getText();//for getting the value of the textfield
    		sqlEmail=temail.getText();//for getting the value of the textfield
    		sqlAccount=tacountName.getText();//for getting the value of the textfield
    		sqlPass=tpassword.getText();//for getting the value of the textfield
    		sqlPass2=trepassword.getText();//for getting the value of the textfield
    		sqlSex=buttonGroup.getSelection().getActionCommand();
    		
    		len=sqlPhone.length();
    		
    		onlyDigits(sqlPhone);
    		
    	        
    		 boolean bb;
    		 
    		 
    		
    		 
			if(sqlFname.length()==0 || sqlLname.length()==0 || sqlCity.length()==0 || sqlPhone.length()==0 ||
    				 sqlEmail.length()==0 ||sqlAccount.length()==0 || sqlPass.length()==0 || sqlPass2.length()==0) {
    			 if(sqlFname.length()==0 ) {
    				 sqlFname="NULL";
    			 }if(sqlLname.length()==0) {
    				 sqlLname="NULL";
    			 }if(sqlCity.length()==0) {
    				 sqlCity="NULL";
    			 }if(sqlPhone.length()==0) {
    				 sqlPhone="NULL";
    			 }if(sqlEmail.length()==0) {
    				 sqlEmail="NULL";
    			 }if(sqlAccount.length()==0) {
    				 sqlAccount="NULL";
    			 }if(sqlPass.length()==0) {
    				 sqlPass="NULL";
    			 }if(sqlPass2.length()==0) {
    				 sqlPass2="NULL";
    			 }
    
    			 this.setVisible(false);
    			 UserSugnUp uSu= new UserSugnUp(sqlFname,sqlLname,sqlCity,sqlPhone,sqlEmail,sqlAccount,sqlPass,sqlPass2
    					 ,cs,cs1,sqlBirthDay1,sqlBirthMonth1, sqlBirthyear1);
    			 
        		
    			 
    		 }else if(bb1==-1 && len<10 || len>10) {
    			 
    
    			 cs3=-1;
    			 JOptionPane.showMessageDialog(frame, "Phone number can be digit and 10 number");
    			 UserSugnUp uSu= new UserSugnUp(sqlFname,sqlLname,sqlCity,sqlPhone,sqlEmail,sqlAccount,sqlPass,sqlPass2
    					 ,cs,cs1,sqlBirthDay1,sqlBirthMonth1, sqlBirthyear1);
        		 
    		 }else if(age<15 && age <100 || age>15 && age >100 ) {

    			 cs1=-1;
    			 JOptionPane.showMessageDialog(frame, "User age canot be <15 or >100");
    			 this.setVisible(false);
    			 UserSugnUp uSu= new UserSugnUp(sqlFname,sqlLname,sqlCity,sqlPhone,sqlEmail,sqlAccount,sqlPass,sqlPass2
    					 ,cs,cs1,UserForm.dates,UserForm.months,UserForm.years);
        		
    		 }else if(!sqlPass.equals(sqlPass2)) {

    			 cs=-1;
    			 JOptionPane.showMessageDialog(frame, "Password must mach");
    			 this.setVisible(false);
    			 UserSugnUp uSu= new UserSugnUp(sqlFname,sqlLname,sqlCity,sqlPhone,sqlEmail,sqlAccount,sqlPass,sqlPass2
    					 ,cs,cs1,sqlBirthDay1,sqlBirthMonth1, sqlBirthyear1);
        		
    		 }else {
   
    		try {
    			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
    			Connection con= DriverManager.getConnection(url,user,password);
    			Statement stt= con.createStatement();
    			stt.execute("INSERT INTO sigh_upuser (fName,lName,sex,Birth_day,Birth_month,Birth_year,country,region,city,phon,email,AcounName,pass,passConfirm) VALUES"+ 
			            "('"+sqlFname+"','"+sqlLname+"','"+sqlSex+"','"+sqlBirthDay2+"','"+sqlBirthMonth+"','"+sqlBirthyear2+"','"+sqlCoutry+"','"+sqlRegion+"','"+sqlCity+"','"+sqlPhone+"','"+sqlEmail+"','"+sqlAccount+"','"+sqlPass+"','"+sqlPass2+"')");
    	
    		
    			this.setVisible(false);
    		}catch(Exception ex) {
    			ex.printStackTrace();
    		}
        }
        	
        }else  {
        	this.setVisible(false);
        	UserForm f = new UserForm(UserForm.userName,UserForm.passWor);
        }
       
    }
        	
        
    
}
