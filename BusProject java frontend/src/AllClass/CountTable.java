package AllClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class CountTable {
	private int count;
	private String [] staName;
	private String [] staName1;
	private String [] staName2;
	private String [] staName3;
	private String [] staName4;
	private String [] staName5;
	private String [] staName6;
	private String [] staName7;
	private String [] staName8;
	private String [] staName9;
	private String [] staName10;
	private String [] staName11;
	private String [] staName12;
	
	private float [] staEnd;
	private float [] staEnd1;
	private float [] staEnd2;
	private float [] staEnd3;
	private float [] staEnd4;
	private float [] staEnd5;
	private float [] staEnd6;
	private float [] staEnd7;
	private float [] staEnd8;
	private float [] staEnd9;
	private float [] staEnd10;
	private float [] staEnd11;
	private float [] staEnd12;
	
	
	//for holding intial name 
	
	private String [] Lname_sta1;

	//for holding last name
	
	private String [] Fname_sta1;

	private int [] noStation;
	private String [] noStationS;
	private String [] pay_km;
	private int [] no_buses;
	private String [] no_busesS;
	private float [] end_km;
	private String [] end_kmS;
	private int [] bus_no;
	private String [] bus_no1;
	
	
	
	
	public CountTable() {
		
		String url="jdbc:mysql://localhost:3306/project";
		String user="root";
		String password="";
		
		try {
		Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
		Connection con= DriverManager.getConnection(url,user,password);
		Statement stt= con.createStatement();
		
		String qur="select count(*) from roots";

		
	     
		ResultSet re=stt.executeQuery(qur);//accessing table
	
	    

	
    // ResultSet re=stt.executeQuery(qur);//accessing table
     re.next();
    count = re.getInt(1);
    //System.out.println("Number of records in the cricketers_data table: "+count);
    
   // ViewAll_roots va= new ViewAll_roots (count);
    
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		
	
		//reading station one data
		staName=new String[count];
		String qur="SELECT stationOneName FROM stationname ORDER BY root_ID ASC";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
			Connection con1= DriverManager.getConnection(url,user,password);
			Statement stt1= con1.createStatement();
			
			
			
	   
			
		ResultSet re1=stt1.executeQuery(qur);//accessing table
		int i=0;
		while (re1.next()) {
			
			staName[i]=re1.getString("stationOneName");
	
			i++;
		
		}
		/*for(i=0;i<staName.length;i++) {
			System.out.print(staName[i]+"  ");
		}*/
		
	}catch(Exception ex) {
		ex.printStackTrace();
	
}
		
		//reading station two data
		 staName1=new String[count];
		qur="SELECT stationTWOName FROM stationname ORDER BY root_ID ASC";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
			Connection con1= DriverManager.getConnection(url,user,password);
			Statement stt1= con1.createStatement();
			
		ResultSet re1=stt1.executeQuery(qur);//accessing table
		int i=0;
		while (re1.next()) {
			
			staName1[i]=re1.getString("stationTWOName");
			  // Table exists
			i++;
		
		}
		/*System.out.println();
		for(i=0;i<staName1.length;i++) {
			System.out.print(staName1[i]+"  ");
		}*/
		
	}catch(Exception ex) {
		ex.printStackTrace();
	
}
		
		//reading station three data 
		staName2=new String[count];
		qur="SELECT stationThreeName FROM stationname ORDER BY root_ID ASC";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
			Connection con1= DriverManager.getConnection(url,user,password);
			Statement stt1= con1.createStatement();
			
		ResultSet re1=stt1.executeQuery(qur);//accessing table
		int i=0;
		while (re1.next()) {
			
			staName2[i]=re1.getString("stationThreeName");
			  // Table exists
			i++;
		
		}
		/*System.out.println();
		for(i=0;i<staName2.length;i++) {
			System.out.print(staName2[i]+"  ");
		}*/
		
	}catch(Exception ex) {
		ex.printStackTrace();
	
}
		
		//reading station four
		 staName3=new String[count];
			qur="SELECT stationFourName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName3[i]=re1.getString("stationFourName");
				  // Table exists
				i++;
			
			}
			System.out.println();
			for(i=0;i<staName3.length;i++) {
				System.out.print(staName3[i]+"  ");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station five data 
			staName4=new String[count];
			qur="SELECT stationFiveName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName4[i]=re1.getString("stationFiveName");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName4.length;i++) {
				System.out.print(staName4[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station six data 
			staName5=new String[count];
			qur="SELECT stationSixName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName5[i]=re1.getString("stationSixName");
				  // Table exists
				i++;
			
			}
			System.out.println();
			for(i=0;i<staName5.length;i++) {
				System.out.print(staName5[i]+"  ");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station seven data 
			staName6=new String[count];
			qur="SELECT stationSevenName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName6[i]=re1.getString("stationSevenName");
				  // Table exists
				i++;
			
			}
			System.out.println();
			/*for(i=0;i<staName6.length;i++) {
				System.out.print(staName6[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station eight data 
			staName7=new String[count];
			qur="SELECT stationEightName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName7[i]=re1.getString("stationEightName");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName7.length;i++) {
				System.out.print(staName7[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station nine data 
			staName8=new String[count];
			qur="SELECT stationNineName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName8[i]=re1.getString("stationNineName");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName8.length;i++) {
				System.out.print(staName8[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station ten data 
			staName9=new String[count];
			qur="SELECT stationTenName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName9[i]=re1.getString("stationTenName");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName9.length;i++) {
				System.out.print(staName9[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
		
			//reading station eleven data 
			staName10=new String[count];
			qur="SELECT stationElevenName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName10[i]=re1.getString("stationElevenName");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName10.length;i++) {
				System.out.print(staName10[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station twelve data 
			staName11=new String[count];
			qur="SELECT stationTwowelvName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName11[i]=re1.getString("stationTwowelvName");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName11.length;i++) {
				System.out.print(staName11[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station thirteen data 
			staName12=new String[count];
			qur="SELECT stationThrteenName FROM stationname ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staName12[i]=re1.getString("stationThrteenName");
				//staName12[i]=(String)staName12[i];
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staName12.length;i++) {
				System.out.print(staName12[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			 // number of buses
			 //number of station
			no_buses= new int[count];
			 //number of station
			noStation= new int[count];
			
			//for payment per km per root
			pay_km=new String[count];
			 qur="SELECT perKM FROM paymentperkm ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
				
				
		   
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				pay_km[i]=re1.getString("perKM");
	
				i++;
			
			}
			/*for(i=0;i<pay_km.length;i++) {
				System.out.print(pay_km[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
          qur="SELECT numberOfbus FROM roots ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
				
				
		   
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				no_buses[i]=re1.getInt("numberOfbus");
	
				i++;
			
			}
			/*for(i=0;i<no_buses.length;i++) {
				System.out.print(no_buses[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			
			//for bus number
			bus_no=new int[count];
			bus_no1=new String[count];
			 qur="SELECT carId  FROM busid ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
					
					
			   
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					bus_no[i]=re1.getInt("carId");
		
					i++;
				
				}
				System.out.println("bus number");
				for(i=0;i<bus_no.length;i++) {
					System.out.print(bus_no[i]+"  ");
				}
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				for(int i=0;i<bus_no.length;i++) {
					bus_no1[i]=String.valueOf(bus_no[i]);
					
				}
				
				System.out.println("bus number");
				for(int i=0;i<bus_no1.length;i++) {
					System.out.print(bus_no1[i]+"  ");
				}
			
		
			/*
			 * for holding station name start and end
			 * */
			
			Fname_sta1= new String[count];
			Lname_sta1= new String[count];
			
			int k=0,l=0;
			for(int j=0;j<count;j++) {
				if(j==0) {
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[0].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[0].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
					noStation[l]=k+1;
					l++;
					
					
					if(k==0) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName[0];
					}else if(k==1) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName1[0];
					}else if(k==2) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName2[0];
					}else if(k==3) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName3[0];
					}else if(k==4) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName4[0];
					}else if(k==5) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName5[0];
					}else if(k==6) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName6[0];
					}else if(k==7) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName7[0];
					}else if(k==8) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName8[0];
					}else if(k==9) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName9[0];
					}else if(k==10) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName10[0];
					}else if(k==11) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName11[0];
					}else if(k==12) {
						Fname_sta1[0]=staName[0];
						Lname_sta1[0]=staName12[0];
					}
					
			    }else if(j==1) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[1].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[1].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName[1];
					}else if(k==1) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName1[1];
					}else if(k==2) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName2[1];
					}else if(k==3) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName3[1];
						//System.out.println("last sta "+staName3[1]);
					}else if(k==4) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName4[1];
					}else if(k==5) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName5[1];
					}else if(k==6) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName6[1];
					}else if(k==7) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName7[1];
					}else if(k==8) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName8[1];
					}else if(k==9) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName9[1];
					}else if(k==10) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName10[1];
					}else if(k==11) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName11[1];
					}else if(k==12) {
						Fname_sta1[1]=staName[1];
						Lname_sta1[1]=staName12[1];
					}
			    }else if(j==2) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[2].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[2].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName[2];
					}else if(k==1) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName1[2];
					}else if(k==2) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName2[2];
					}else if(k==3) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName3[2];
						System.out.println("last sta "+staName3[2]);
					}else if(k==4) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName4[2];
					}else if(k==5) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName5[2];
					}else if(k==6) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName6[2];
					}else if(k==7) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName7[2];
					}else if(k==8) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName8[2];
					}else if(k==9) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName9[2];
					}else if(k==10) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName10[2];
					}else if(k==11) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName11[2];
					}else if(k==12) {
						Fname_sta1[2]=staName[2];
						Lname_sta1[2]=staName12[2];
					}
			    }else if(j==3) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[3].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[3].equals("NULL")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[3].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
					
					
					noStation[l]=k+1;
					l++;
				
					
					if(k==0) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName[3];
					}else if(k==1) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName1[3];
					}else if(k==2) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName2[3];
					}else if(k==3) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName3[3];
					}else if(k==4) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName4[3];
					}else if(k==5) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName5[3];
					}else if(k==6) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName6[3];
					}else if(k==7) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName7[3];
					}else if(k==8) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName8[3];
					}else if(k==9) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName9[3];
					}else if(k==10) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName10[3];
					}else if(k==11) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName11[3];
					}else if(k==12) {
						Fname_sta1[3]=staName[3];
						Lname_sta1[3]=staName12[3];
					}
			    }else if(j==4) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[4].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[4].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName[4];
					}else if(k==1) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName1[4];
					}else if(k==2) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName2[4];
					}else if(k==3) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName3[4];
					}else if(k==4) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName4[4];
					}else if(k==5) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName5[4];
					}else if(k==6) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName6[4];
					}else if(k==7) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName7[4];
					}else if(k==8) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName8[4];
					}else if(k==9) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName9[4];
					}else if(k==10) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName10[4];
					}else if(k==11) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName11[4];
					}else if(k==12) {
						Fname_sta1[4]=staName[4];
						Lname_sta1[4]=staName12[4];
					}
			    }else if(j==5) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[5].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[5].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName[5];
					}else if(k==1) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName1[5];
					}else if(k==2) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName2[5];
					}else if(k==3) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName3[5];
					}else if(k==4) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName4[5];
					}else if(k==5) {
						Fname_sta1[5]=staName[3];
						Lname_sta1[5]=staName5[5];
					}else if(k==6) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName6[5];
					}else if(k==7) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName7[5];
					}else if(k==8) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName8[5];
					}else if(k==9) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName9[5];
					}else if(k==10) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName10[5];
					}else if(k==11) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName11[5];
					}else if(k==12) {
						Fname_sta1[5]=staName[5];
						Lname_sta1[5]=staName12[5];
					}
			    }else if(j==6) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[6].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[6].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName[6];
					}else if(k==1) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName1[3];
					}else if(k==2) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName2[6];
					}else if(k==3) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName3[6];
					}else if(k==4) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName4[6];
					}else if(k==5) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName5[6];
					}else if(k==6) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName6[6];
					}else if(k==7) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName7[6];
					}else if(k==8) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName8[6];
					}else if(k==9) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName9[6];
					}else if(k==10) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName10[6];
					}else if(k==11) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName11[6];
					}else if(k==12) {
						Fname_sta1[6]=staName[6];
						Lname_sta1[6]=staName12[6];
					}
			    }else if(j==7) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[7].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[7].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
					
					noStation[l]=k+1;
					l++;
				
					
					if(k==0) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName[7];
					}else if(k==1) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName1[7];
					}else if(k==2) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName2[7];
					}else if(k==3) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName3[7];
					}else if(k==4) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName4[7];
					}else if(k==5) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName5[7];
					}else if(k==6) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName6[7];
					}else if(k==7) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName7[7];
					}else if(k==8) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName8[7];
					}else if(k==9) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName9[7];
					}else if(k==10) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName10[7];
					}else if(k==11) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName11[7];
					}else if(k==12) {
						Fname_sta1[7]=staName[7];
						Lname_sta1[7]=staName12[7];
					}
			    }else if(j==8) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[8].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[8].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName[8];
					}else if(k==1) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName1[8];
					}else if(k==2) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName2[8];
					}else if(k==3) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName3[8];
					}else if(k==4) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName4[8];
					}else if(k==5) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName5[8];
					}else if(k==6) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName6[8];
					}else if(k==7) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName7[8];
					}else if(k==8) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName8[8];
					}else if(k==9) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName9[8];
					}else if(k==10) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName10[8];
					}else if(k==11) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName11[8];
					}else if(k==12) {
						Fname_sta1[8]=staName[8];
						Lname_sta1[8]=staName12[8];
					}
			    }else if(j==9) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[9].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[9].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName[9];
					}else if(k==1) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName1[9];
					}else if(k==2) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName2[9];
					}else if(k==3) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName3[9];
					}else if(k==4) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName4[9];
					}else if(k==5) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName5[9];
					}else if(k==6) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName6[9];
					}else if(k==7) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName7[9];
					}else if(k==8) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName8[9];
					}else if(k==9) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName9[9];
					}else if(k==10) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName10[9];
					}else if(k==11) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName11[9];
					}else if(k==12) {
						Fname_sta1[9]=staName[9];
						Lname_sta1[9]=staName12[9];
					}
			    }else if(j==10) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[10].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[10].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
					
					noStation[l]=k+1;
					l++;
				
					
					if(k==0) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName[10];
					}else if(k==1) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName1[10];
					}else if(k==2) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName2[10];
					}else if(k==3) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName3[10];
					}else if(k==4) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName4[10];
					}else if(k==5) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName5[10];
					}else if(k==6) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName6[10];
					}else if(k==7) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName7[10];
					}else if(k==8) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName8[10];
					}else if(k==9) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName9[10];
					}else if(k==10) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName10[10];
					}else if(k==11) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName11[10];
					}else if(k==12) {
						Fname_sta1[10]=staName[10];
						Lname_sta1[10]=staName12[10];
					}
			    }else if(j==11) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[11].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[11].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
					
					noStation[l]=k+1;
					l++;
				
					
					if(k==0) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName[11];
					}else if(k==1) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName1[11];
					}else if(k==2) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName2[11];
					}else if(k==3) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName3[11];
					}else if(k==4) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName4[11];
					}else if(k==5) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName5[11];
					}else if(k==6) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName6[11];
					}else if(k==7) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName7[11];
					}else if(k==8) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName8[11];
					}else if(k==9) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName9[11];
					}else if(k==10) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName10[11];
					}else if(k==11) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName11[11];
					}else if(k==12) {
						Fname_sta1[11]=staName[11];
						Lname_sta1[11]=staName12[11];
					}
			    }else if(j==12) {
			    	k=0;
					for(int i=0;i<13;i++) {
						if(i==0) {
							if(staName[12].equals("")) {
					
					        }else {
					        	k=0;
					        }
				        }else if(i==1) {
				        	if(staName1[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==2) {
				        	if(staName2[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==3) {
				        	if(staName3[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==4) {
				        	if(staName4[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==5) {
				        	if(staName5[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==6) {
				        	if(staName6[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==7) {
				        	if(staName7[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==8) {
				        	if(staName8[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==9) {
				        	if(staName9[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==10) {
				        	if(staName10[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==11) {
				        	if(staName11[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }else if(i==12) {
				        	if(staName12[12].equals("")) {
				        		
				        	}else {
				        		k++;
				        	}
				        }
				    }
				
					
					noStation[l]=k+1;
					l++;
					
					if(k==0) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName[12];
					}else if(k==1) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName1[12];
					}else if(k==2) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName2[12];
					}else if(k==3) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName3[12];
					}else if(k==4) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName4[12];
					}else if(k==5) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName5[12];
					}else if(k==6) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName6[12];
					}else if(k==7) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName7[12];
					}else if(k==8) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName8[12];
					}else if(k==9) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName9[12];
					}else if(k==10) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName10[12];
					}else if(k==11) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName11[12];
					}else if(k==12) {
						Fname_sta1[12]=staName[12];
						Lname_sta1[12]=staName12[12];
					}
			    }
			
			
			//for name 
			
		
			
}
			/*System.out.println("\n"+Fname_sta1[0]+"  "+Lname_sta1[0]);
			System.out.println("\n"+Fname_sta1[1]+"  "+Lname_sta1[1]);
			System.out.println("\n"+Fname_sta1[2]+"  "+Lname_sta1[2]);
			System.out.println("\n"+Fname_sta1[3]+"  "+Lname_sta1[3]);
			System.out.println("\n"+Fname_sta1[4]+"  "+Lname_sta1[4]);
			//System.out.println("\n"+Fname_sta1[5]+"  "+Lname_sta1[5]);
			//System.out.println("\n"+Fname_sta1[6]+"  "+Lname_sta1[6]);
			//System.out.println("\n"+Fname_sta1[7]+"  "+Lname_sta1[7]);
			//System.out.println("\n"+Fname_sta1[8]+"  "+Lname_sta1[8]);
			//System.out.println("\n"+Fname_sta1[9]+"  "+Lname_sta1[9]);
			//System.out.println("\n"+Fname_sta1[10]+"  "+Lname_sta1[10]);
			//System.out.println("\n"+Fname_sta1[11]+"  "+Lname_sta1[12]);
			//System.out.println("\n"+Fname_sta1[12]+"  "+Lname_sta1[21]);
			//System.out.println(noStation[0]);
			//System.out.println(noStation[1]);
			System.out.println(noStation[2]);
			System.out.println(noStation[3]);
			System.out.println(noStation[4]);
			System.out.println(noStation[5]);
			System.out.println(noStation[6]);
			System.out.println(noStation[7]);
			System.out.println(noStation[8]);
			System.out.println(noStation[9]);
			System.out.println(noStation[10]);
			System.out.println(noStation[11]);
			System.out.println(noStation[12]);*/
			
			
			
			/*
			 * for holding the final km
			 * 
			 * */
			
			//reading station one data
			staEnd=new float[count];
			qur="SELECT stationOneKM From stationkm ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
				
				
		   
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staEnd[i]=re1.getFloat("stationOneKM");
		
				i++;
			
			}
			/*for(i=0;i<staEnd.length;i++) {
				System.out.print(staEnd[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station two data
			staEnd1=new float[count];
			qur="SELECT stationTWOKM FROM stationkm ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staEnd1[i]=re1.getFloat("stationTWOKM");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staEnd1.length;i++) {
				System.out.print(staEnd1[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station three data 
			staEnd2=new float[count];
			qur="SELECT stationThreeKM FROM stationkm ORDER BY root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				staEnd2[i]=re1.getFloat("stationThreeKM");
				  // Table exists
				i++;
			
			}
			/*System.out.println();
			for(i=0;i<staEnd2.length;i++) {
				System.out.print(staEnd2[i]+"  ");
			}*/
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			//reading station four
			 staEnd3=new float[count];
				qur="SELECT stationFourKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd3[i]=re1.getFloat("stationFourKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd3.length;i++) {
					System.out.print(staEnd3[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station five data 
				staEnd4=new float[count];
				qur="SELECT stationFiveKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd4[i]=re1.getFloat("stationFiveKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd4.length;i++) {
					System.out.print(staEnd4[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station six data 
				staEnd5=new float[count];
				qur="SELECT stationSixKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd5[i]=re1.getFloat("stationSixKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd5.length;i++) {
					System.out.print(staEnd4[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station seven data 
				staEnd6=new float[count];
				qur="SELECT stationSevenKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd6[i]=re1.getFloat("stationSevenKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd6.length;i++) {
					System.out.print(staEnd6[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station eight data 
				staEnd7=new float[count];
				qur="SELECT stationEightKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd7[i]=re1.getFloat("stationEightKM");
					  // Table exists
					i++;
				
				}/*
				System.out.println("Station eight------");
				for(i=0;i<staEnd7.length;i++) {
					System.out.print(staEnd7[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station nine data 
				staEnd8=new float[count];
				qur="SELECT stationNineKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd8[i]=re1.getFloat("stationNineKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd8.length;i++) {
					System.out.print(staEnd[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station ten data 
				staEnd9=new float[count];
				qur="SELECT stationTenKM FROM stationkm";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd9[i]=re1.getFloat("stationTenKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd9.length;i++) {
					System.out.print(staEnd9[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
			
				//reading station eleven data 
				staEnd10=new float[count];
				qur="SELECT stationElevenKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd10[i]=re1.getFloat("stationElevenKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd10.length;i++) {
					System.out.print(staEnd10[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station twelve data 
				staEnd11=new float[count];
				qur="SELECT StationTwowelvKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd11[i]=re1.getFloat("StationTwowelvKM");
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd11.length;i++) {
					System.out.print(staEnd11[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				//reading station thirteen data 
				staEnd12=new float[count];
				qur="SELECT stationThrteenKM FROM stationkm ORDER BY root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					staEnd12[i]=re1.getFloat("stationThrteenKM");
					
					  // Table exists
					i++;
				
				}
				/*System.out.println();
				for(i=0;i<staEnd12.length;i++) {
					System.out.print(staEnd12[i]+"  ");
				}*/
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
					
				
				/*
				 * for holding end station km
				 * */
				
				end_km= new float[count];
				
				
				k=0; l=0;
				for(int j=0;j<count;j++) {
					if(j==0) {
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[0]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[0]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
						
						if(k==0) {
							end_km[0]=staEnd[0];
							
						}else if(k==1) {
							end_km[0]=staEnd1[0];
						}else if(k==2) {
							end_km[0]=staEnd2[0];
						}else if(k==3) {
							end_km[0]=staEnd3[0];
						}else if(k==4) {
							end_km[0]=staEnd4[0];
						}else if(k==5) {
							end_km[0]=staEnd5[0];
						}else if(k==6) {
							end_km[0]=staEnd6[0];
						}else if(k==7) {
							end_km[0]=staEnd7[0];
						}else if(k==8) {
							end_km[0]=staEnd8[0];
						}else if(k==9) {
							end_km[0]=staEnd9[0];
						}else if(k==10) {
							end_km[0]=staEnd10[0];
						}else if(k==11) {
							end_km[0]=staEnd11[0];
						}else if(k==12) {
							end_km[0]=staEnd12[0];
						}
						
				    }else if(j==1) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[1]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[1]==0.0)  {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
						
						if(k==0) {
							end_km[1]=staEnd[1];
						}else if(k==1) {
							end_km[1]=staEnd1[1];
						}else if(k==2) {
							end_km[1]=staEnd2[1];
						}else if(k==3) {
							end_km[1]=staEnd3[1];
						}else if(k==4) {
							end_km[1]=staEnd4[1];
						}else if(k==5) {
							end_km[1]=staEnd5[1];
						}else if(k==6) {
							end_km[1]=staEnd6[1];
						}else if(k==7) {
							end_km[1]=staEnd7[1];
						}else if(k==8) {
							end_km[1]=staEnd8[1];
						}else if(k==9) {
							end_km[1]=staEnd9[1];
						}else if(k==10) {
							end_km[1]=staEnd10[1];
						}else if(k==11) {
							end_km[1]=staEnd11[1];
						}else if(k==12) {
							end_km[1]=staEnd12[1];
						}
				    }else if(j==2) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[2]==0.0)  {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[2]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
						
						if(k==0) {
							end_km[2]=staEnd[2];
						}else if(k==1) {
							end_km[2]=staEnd1[2];
						}else if(k==2) {
							end_km[2]=staEnd2[2];
						}else if(k==3) {
							end_km[2]=staEnd3[2];
						}else if(k==4) {
							end_km[2]=staEnd4[2];
						}else if(k==5) {
							end_km[2]=staEnd5[2];
						}else if(k==6) {
							end_km[2]=staEnd6[2];
						}else if(k==7) {
							end_km[2]=staEnd7[2];
						}else if(k==8) {
							end_km[2]=staEnd8[2];
						}else if(k==9) {
							end_km[2]=staEnd9[2];
						}else if(k==10) {
							end_km[2]=staEnd10[2];
						}else if(k==11) {
							end_km[2]=staEnd11[2];
						}else if(k==12) {
							end_km[2]=staEnd12[2];
						}
				    }else if(j==3) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[3]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[3]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
						
				
						
						if(k==0) {
							end_km[3]=staEnd[3];
						}else if(k==1) {
							end_km[3]=staEnd1[3];
						}else if(k==2) {
							end_km[3]=staEnd2[3];
						}else if(k==3) {
							end_km[3]=staEnd3[3];
						}else if(k==4) {
							end_km[3]=staEnd4[3];
						}else if(k==5) {
							end_km[3]=staEnd5[3];
						}else if(k==6) {
							end_km[3]=staEnd6[3];
						}else if(k==7) {
							end_km[3]=staEnd7[3];
						}else if(k==8) {
							end_km[3]=staEnd8[3];
						}else if(k==9) {
							end_km[3]=staEnd9[3];
						}else if(k==10) {
							end_km[3]=staEnd10[3];
						}else if(k==11) {
							end_km[3]=staEnd11[3];
						}else if(k==12) {
							end_km[3]=staEnd12[3];
						}
				    }else if(j==4) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[4]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[4]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
				
						if(k==0) {
							end_km[4]=staEnd[4];
						}else if(k==1) {
							end_km[4]=staEnd1[4];
						}else if(k==2) {
							end_km[4]=staEnd2[4];
						}else if(k==3) {
							end_km[4]=staEnd3[4];
						}else if(k==4) {
							end_km[4]=staEnd4[4];
						}else if(k==5) {
							end_km[4]=staEnd5[4];
						}else if(k==6) {
							end_km[4]=staEnd6[4];
						}else if(k==7) {
							end_km[4]=staEnd7[4];
						}else if(k==8) {
							end_km[4]=staEnd8[4];
						}else if(k==9) {
							end_km[4]=staEnd9[4];
						}else if(k==10) {
							end_km[4]=staEnd10[4];
						}else if(k==11) {
							end_km[4]=staEnd11[4];
						}else if(k==12) {
							end_km[4]=staEnd12[4];
						}
				    }else if(j==5) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[5]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[5]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
			
						if(k==0) {
							end_km[5]=staEnd[5];
						}else if(k==1) {
							end_km[5]=staEnd1[5];
						}else if(k==2) {
							end_km[5]=staEnd2[5];
						}else if(k==3) {
							end_km[5]=staEnd3[5];
						}else if(k==4) {
							end_km[5]=staEnd4[5];
						}else if(k==5) {
							end_km[5]=staEnd5[5];
						}else if(k==6) {
							end_km[5]=staEnd6[5];
						}else if(k==7) {
							end_km[5]=staEnd7[5];
						}else if(k==8) {
							end_km[5]=staEnd8[5];
						}else if(k==9) {
							end_km[5]=staEnd9[5];
						}else if(k==10) {
							end_km[5]=staEnd10[5];
						}else if(k==11) {
							end_km[5]=staEnd11[5];
						}else if(k==12) {
							end_km[5]=staEnd12[5];
						}
				    }else if(j==6) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[6]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[6]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
			
						if(k==0) {
							end_km[6]=staEnd[6];
						}else if(k==1) {
							end_km[6]=staEnd1[6];
						}else if(k==2) {
							end_km[6]=staEnd2[6];
						}else if(k==3) {
							end_km[6]=staEnd3[6];
						}else if(k==4) {
							end_km[6]=staEnd4[6];
						}else if(k==5) {
							end_km[6]=staEnd5[6];
						}else if(k==6) {
							end_km[6]=staEnd6[6];
						}else if(k==7) {
							end_km[6]=staEnd7[6];
						}else if(k==8) {
							end_km[6]=staEnd8[6];
						}else if(k==9) {
							end_km[6]=staEnd9[6];
						}else if(k==10) {
							end_km[6]=staEnd10[6];
						}else if(k==11) {
							end_km[6]=staEnd11[6];
						}else if(k==12) {
							end_km[6]=staEnd12[6];
						}
				    }else if(j==7) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[7]==0.0)  {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[7]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
						
			
						
						if(k==0) {
							end_km[7]=staEnd[7];
						}else if(k==1) {
							end_km[7]=staEnd1[7];
						}else if(k==2) {
							end_km[7]=staEnd2[7];
						}else if(k==3) {
							end_km[7]=staEnd3[7];
						}else if(k==4) {
							end_km[7]=staEnd4[7];
						}else if(k==5) {
							end_km[7]=staEnd5[7];
						}else if(k==6) {
							end_km[7]=staEnd6[7];
						}else if(k==7) {
							end_km[7]=staEnd7[7];
						}else if(k==8) {
							end_km[7]=staEnd8[7];
						}else if(k==9) {
							end_km[7]=staEnd9[7];
						}else if(k==10) {
							end_km[7]=staEnd10[7];
						}else if(k==11) {
							end_km[7]=staEnd11[7];
						}else if(k==12) {
							end_km[7]=staEnd12[7];
						}
				    }else if(j==8) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[8]==0.0)  {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[8]==0.0){
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[8]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
			
						if(k==0) {
							end_km[8]=staEnd[8];
						}else if(k==1) {
							end_km[8]=staEnd1[8];
						}else if(k==2) {
							end_km[8]=staEnd2[8];
						}else if(k==3) {
							end_km[8]=staEnd3[8];
						}else if(k==4) {
							end_km[8]=staEnd4[8];
						}else if(k==5) {
							end_km[8]=staEnd5[8];
						}else if(k==6) {
							end_km[8]=staEnd6[8];
						}else if(k==7) {
							end_km[8]=staEnd7[8];
						}else if(k==8) {
							end_km[8]=staEnd8[8];
						}else if(k==9) {
							end_km[8]=staEnd9[8];
						}else if(k==10) {
							end_km[8]=staEnd10[8];
						}else if(k==11) {
							end_km[8]=staEnd11[8];
						}else if(k==12) {
							end_km[8]=staEnd12[8];
						}
				    }else if(j==9) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[9]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[9]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
				
						if(k==0) {
							end_km[9]=staEnd[9];
						}else if(k==1) {
							end_km[9]=staEnd1[9];
						}else if(k==2) {
							end_km[9]=staEnd2[9];
						}else if(k==3) {
							end_km[9]=staEnd3[9];
						}else if(k==4) {
							end_km[9]=staEnd4[9];
						}else if(k==5) {
							end_km[9]=staEnd5[9];
						}else if(k==6) {
							end_km[9]=staEnd6[9];
						}else if(k==7) {
							end_km[9]=staEnd7[9];
						}else if(k==8) {
							end_km[9]=staEnd8[9];
						}else if(k==9) {
							end_km[9]=staEnd9[9];
						}else if(k==10) {
							end_km[9]=staEnd10[9];
						}else if(k==11) {
							end_km[9]=staEnd11[9];
						}else if(k==12) {
							end_km[9]=staEnd12[9];
						}
				    }else if(j==10) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[10]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[10]==0.0){
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[10]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
						
		
						if(k==0) {
							end_km[10]=staEnd[10];
						}else if(k==1) {
							end_km[10]=staEnd1[10];
						}else if(k==2) {
							end_km[10]=staEnd2[10];
						}else if(k==3) {
							end_km[10]=staEnd3[10];
						}else if(k==4) {
							end_km[10]=staEnd4[10];
						}else if(k==5) {
							end_km[10]=staEnd5[10];
						}else if(k==6) {
							end_km[10]=staEnd6[10];
						}else if(k==7) {
							end_km[10]=staEnd7[10];
						}else if(k==8) {
							end_km[10]=staEnd8[10];
						}else if(k==9) {
							end_km[10]=staEnd9[10];
						}else if(k==10) {
							end_km[10]=staEnd10[10];
						}else if(k==11) {
							end_km[10]=staEnd11[10];
						}else if(k==12) {
							end_km[10]=staEnd12[10];
						}
				    }else if(j==11) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[11]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[11]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
						
	
						
						if(k==0) {
							end_km[11]=staEnd[11];
						}else if(k==1) {
							end_km[11]=staEnd1[11];
						}else if(k==2) {
							end_km[11]=staEnd2[11];
						}else if(k==3) {
							end_km[11]=staEnd3[11];
						}else if(k==4) {
							end_km[11]=staEnd4[11];
						}else if(k==5) {
							end_km[11]=staEnd5[11];
						}else if(k==6) {
							end_km[11]=staEnd6[11];
						}else if(k==7) {
							end_km[11]=staEnd7[11];
						}else if(k==8) {
							end_km[11]=staEnd8[11];
						}else if(k==9) {
							end_km[11]=staEnd9[11];
						}else if(k==10) {
							end_km[11]=staEnd10[11];
						}else if(k==11) {
							end_km[11]=staEnd11[11];
						}else if(k==12) {
							end_km[11]=staEnd12[11];
						}
				    }else if(j==12) {
				    	k=0;
						for(int i=0;i<13;i++) {
							if(i==0) {
								if(staEnd[12]==0.0) {
						
						        }else {
						        	k=0;
						        }
					        }else if(i==1) {
					        	if(staEnd1[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==2) {
					        	if(staEnd2[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==3) {
					        	if(staEnd3[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==4) {
					        	if(staEnd4[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==5) {
					        	if(staEnd5[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==6) {
					        	if(staEnd6[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==7) {
					        	if(staEnd7[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==8) {
					        	if(staEnd8[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==9) {
					        	if(staEnd9[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==10) {
					        	if(staEnd10[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==11) {
					        	if(staEnd11[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }else if(i==12) {
					        	if(staEnd12[12]==0.0) {
					        		
					        	}else {
					        		k++;
					        	}
					        }
					    }
					
			
						if(k==0) {
							end_km[12]=staEnd[12];
						}else if(k==1) {
							end_km[12]=staEnd1[12];
						}else if(k==2) {
							end_km[12]=staEnd2[12];
						}else if(k==3) {
							end_km[12]=staEnd3[12];
						}else if(k==4) {
							end_km[12]=staEnd4[12];
						}else if(k==5) {
							end_km[12]=staEnd5[12];
						}else if(k==6) {
							end_km[12]=staEnd6[12];
						}else if(k==7) {
							end_km[12]=staEnd7[12];
						}else if(k==8) {
							end_km[12]=staEnd8[12];
						}else if(k==9) {
							end_km[12]=staEnd9[12];
						}else if(k==10) {
							end_km[12]=staEnd10[12];
						}else if(k==11) {
							end_km[12]=staEnd11[12];
						}else if(k==12) {
							end_km[12]=staEnd12[12];
						}
				    }
				
			
				//for name 
		
	}
				/*
				
			    System.out.println();
						for(int i=0;i<2;i++) {
							System.out.print(end_km[i]+"  ");
						}
				System.out.println("-------------");
				System.out.print(end_km[0]+"  ");
				System.out.print(end_km[1]+"  ");*/
				noStationS=new String[count];
				
				for(int i=0;i<noStation.length;i++) {
					noStationS[i]=String.valueOf(noStation[i]);
				}
				
               no_busesS=new String[count];
				
				for(int i=0;i<no_buses.length;i++) {
					no_busesS[i]=String.valueOf(no_buses[i]);
				}
				
                end_kmS=new String[count];
				
                System.out.println("Endke........");
                for(int i=0;i<end_km.length;i++) {
                	System.out.println(end_km[i]+ "  ");
                }
				for(int i=0;i<end_km.length;i++) {
					end_kmS[i]=String.valueOf(end_km[i]);
				}
			
				/*for(int i=0;i<Fname_sta1.length;i++) {
					System.out.print(Fname_sta1[i]+"  ");
					
				}
				
				for(int i=0;i<Lname_sta1.length;i++) {
					System.out.print(Lname_sta1[i]+"  ");
					
				}*/
				
				ViewAll_roots vs=new	ViewAll_roots(count);
				
				ViewAll_roots vr=new	ViewAll_roots(count,Fname_sta1,Lname_sta1,pay_km,noStationS,end_kmS,no_busesS,bus_no1);	
				
				
}
}


			
		
	

	


