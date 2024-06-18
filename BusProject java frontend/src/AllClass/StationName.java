package AllClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.Border;

public class StationName extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel rootid;
    private JTextField trootid;
    private JLabel numsta;
    private JTextField tnumsta;
    private JButton jb;
    private JButton back;
    
    JFrame frame;
  
    public static String txt1="";
    private String txt12="";
    public int txt2;
    public static String stid="";
    private String stid12 ="";
    static int bb1=0;
    
    int f=0;
    static int n=4;
    
    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
	 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
    
  		
    
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
   
    
    public static void onlyDigits(String str){
		try {
		    n = Integer.parseInt(str);
		    bb1=0;
		} catch (NumberFormatException e) {
		    // str is not a number
			bb1=-1;
		}
	}
    
    
	
	public StationName(String stid,String txt1)
    {
		
		setIconImage(icon); 
		
        setTitle("Station name");
        setBounds(300, 90, 650, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        jb=new JButton("Ok");
        jb.setBackground(Color.CYAN);
        jb.setForeground(Color.magenta);
  
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
  
        rootid = new JLabel("Root ID");
        rootid.setFont(new Font("Arial", Font.PLAIN, 20));
        rootid.setSize(100, 20);
        rootid.setLocation(100, 100);
        
        c.add(rootid);
  
        trootid = new JTextField();
        trootid.setFont(new Font("Arial", Font.PLAIN, 15));
        trootid.setSize(190, 20);
        trootid.setLocation(300, 100);
        if(stid.equals("NULL")) {
        	trootid.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	trootid.setText(stid);
        }
        c.add(trootid);
  
        numsta = new JLabel("Number of station");
        numsta.setFont(new Font("Arial", Font.PLAIN, 20));
        numsta.setSize(160, 20);
        numsta.setLocation(100, 130);
        c.add(numsta);
  
        tnumsta = new JTextField();
        tnumsta.setFont(new Font("Arial", Font.PLAIN, 15));
        tnumsta.setSize(190, 20);
        tnumsta.setLocation(300, 130);
        if(txt1.equals("NULL") ) {
        	tnumsta.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }else {
        	tnumsta.setText(txt1);
        }
        
        if(bb1==-1 || StationName.n<4 || StationName.n>13) {
        	tnumsta.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
        c.add(tnumsta);
        
        jb.setFont(new Font("Arial", Font.PLAIN, 15));
        jb.setBackground(Color.CYAN);
        jb.setForeground(Color.magenta);
        jb.setSize(60,20);
        jb.setLocation(520, 130);
        c.add(jb);
        
       
        jb.addActionListener(this);
        back.addActionListener(this);
        
  
        
        setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e)
    {
		
		
		
        String s = e.getActionCommand();
        if(s.equals("Ok")) {
        	
        	
        	
        	txt12=tnumsta.getText();
        	onlyDigits(txt12);
           
            stid12=trootid.getText();
            
           if(txt12.length()==0 || stid12.length()==0) {
        	   
        	   if(txt12.length()==0) {
        		   txt12="NULL";
        	   }
            	
               if(stid12.length()==0) {
            	   stid12="NULL";
               }
            	this.setVisible(false);
            	StationName sn=new StationName (stid12,txt12);
            }else if(bb1==-1) {
            
            	JOptionPane.showMessageDialog(frame, "Number of station must be integer number");
            	this.setVisible(false);
            	StationName sn=new StationName (stid12,txt12);
            	
            }else if(bb1==0 && StationName.n<4 || StationName.n>13 ) {
            	f=-1;
            	JOptionPane.showMessageDialog(frame, "station can not be <4 and >13");
            	this.setVisible(false);
            	StationName sn=new StationName (stid12,txt12);
            }
            else {
            
            this.setVisible(false);
            txt2=Integer.parseInt(txt12);
        	NewStationName n= new NewStationName (txt2,stid12,sqlOne,sqlTwo,sqlThree,sqlFour,sqlFive,sqlSix,sqlSeven,sqlEight,sqlNine,sqlTen,sqlEleven,sqlTwowelv,sqlThrteen);
            }
        	
        }else {
        	this.setVisible(false);
        	AdminWindow aw = new AdminWindow();
        }
        
    }

}
