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

public class BusTracking extends JFrame implements ActionListener,ItemListener {
	
	 
		private JLabel jl0,jl01,jl02,jl03,jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
		private JPanel jp0,jp01,jp02,jp03,jp04,jp05,jp06,jp07,jp,jp2,jp3,jp4,flow,flow1;
		private JButton jb0,jb01,jb02,jb03,jb04;
		private JButton back;
		private JComboBox jc,jc1,jc2,jc3;
		private JTextField jt,jt1,jt2,jt3,jt4;
		
		private String qur;
		private String [] one,two,three;
		
		private int count,coun=0,size;
		private String [] rootID;
		
		
		private String [] stationName1;
		private String [] stationName2;
		private String [] stationName3;
		private String [] stationName4;
		private String [] stationName5;
		private String [] stationName6;
		private String [] stationName7;
		private String [] stationName8;
		private String [] stationName9;
		private String [] stationName10;
		private String [] stationName11;
		private String [] stationName12;
		private String [] stationName13;
		
		
	    Icon icon1 = new ImageIcon("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\b10.png");
		 Image icon = Toolkit.getDefaultToolkit().getImage("G:\\Yonas DB\\Computer\\Programing\\Demo2\\Java\\BusProject\\src\\AllClass\\icon2.png");
		
		private String [] stationName01;
		private String [] stationName02;
		private String [] stationName03;
		private String [] stationName04;
		private String [] stationName05;
		private String [] stationName06;
		private String [] stationName07;
		private String [] stationName08;
		private String [] stationName09;
		private String [] stationName010;
		private String [] stationName011;
		private String [] stationName012;
		private String [] stationName013;
		
		
		private String [] stationName001;
		private String [] stationName002;
		private String [] stationName003;
		private String [] stationName004;
		private String [] stationName005;
		private String [] stationName006;
		private String [] stationName007;
		private String [] stationName008;
		private String [] stationName009;
		private String [] stationName0010;
		private String [] stationName0011;
		private String [] stationName0012;
		private String [] stationName0013;
		
		
	
	public BusTracking() {
		
		setIconImage(icon); 
		
		// counter the number of root 
		String user="root";
		String password="";
		String url="jdbc:mysql://localhost:3306/project";
		
		
		try {
		Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
		Connection con= DriverManager.getConnection(url,user,password);
		Statement stt= con.createStatement();
		
		String qur="select count(*) from roots";

		
	     
		ResultSet re=stt.executeQuery(qur);//accessing table
	
	 
     re.next();
    count = re.getInt(1);
   
    
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		
		//reading the root
		
		rootID= new String[count];
		
	     qur="SELECT 	root_ID  FROM roots ORDER BY  root_ID ASC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
				Connection con1= DriverManager.getConnection(url,user,password);
				Statement stt1= con1.createStatement();
				
				
				
		   
				
			ResultSet re1=stt1.executeQuery(qur);//accessing table
			int i=0;
			while (re1.next()) {
				
				rootID[i]=re1.getString("root_ID");
		
				i++;
			
			}
			for(i=0;i<rootID.length;i++) {
				System.out.print(rootID[i]+"  ");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		
	}
			
			
    /*
     * 
     * The station name 
     * 
     * 
     * */
			
			//for station one name 
			size=count;
			
			stationName1= new String[size];
			 qur="SELECT 	stationOneName FROM stationname ORDER BY  root_ID ASC";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
					Connection con1= DriverManager.getConnection(url,user,password);
					Statement stt1= con1.createStatement();
					
					
					
			   
					
				ResultSet re1=stt1.executeQuery(qur);//accessing table
				int i=0;
				while (re1.next()) {
					
					stationName1[i]=re1.getString("stationOneName");
			
					i++;
				
				}
				System.out.println();
				for(i=0;i<stationName1.length;i++) {
					System.out.print(stationName1[i]+"  ");
				}
				
			}catch(Exception ex) {
				ex.printStackTrace();
			
		}
				
				
				//for station two name 
				
				stationName2= new String[size];
				 qur="SELECT 	stationTWOName FROM stationname ORDER BY  root_ID ASC";
					
					try {
						Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
						Connection con1= DriverManager.getConnection(url,user,password);
						Statement stt1= con1.createStatement();
						
						
						
				   
						
					ResultSet re1=stt1.executeQuery(qur);//accessing table
					int i=0;
					while (re1.next()) {
						
						stationName2[i]=re1.getString("stationTWOName");
				
						i++;
					
					}
					System.out.println();
					for(i=0;i<stationName2.length;i++) {
						System.out.print(stationName2[i]+"  ");
					}
					
				}catch(Exception ex) {
					ex.printStackTrace();
				
			}
					
					
					//for station three name 
					
					stationName3= new String[size];
					 qur="SELECT 	stationThreeName FROM stationname ORDER BY  root_ID ASC";
						
						try {
							Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
							Connection con1= DriverManager.getConnection(url,user,password);
							Statement stt1= con1.createStatement();
							
							
							
					   
							
						ResultSet re1=stt1.executeQuery(qur);//accessing table
						int i=0;
						while (re1.next()) {
							
							stationName3[i]=re1.getString("stationThreeName");
					
							i++;
						
						}
						System.out.println();
						for(i=0;i<stationName3.length;i++) {
							System.out.print(stationName3[i]+"  ");
						}
						
					}catch(Exception ex) {
						ex.printStackTrace();
					
				}
						
						
						//for station four name 
						
						stationName4= new String[size];
						 qur="SELECT 	stationFourName FROM stationname ORDER BY  root_ID ASC";
							
							try {
								Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
								Connection con1= DriverManager.getConnection(url,user,password);
								Statement stt1= con1.createStatement();
								
								
								
						   
								
							ResultSet re1=stt1.executeQuery(qur);//accessing table
							int i=0;
							while (re1.next()) {
								
								stationName4[i]=re1.getString("stationFourName");
						
								i++;
							
							}
							System.out.println();
							for(i=0;i<stationName4.length;i++) {
								System.out.print(stationName4[i]+"  ");
							}
							
						}catch(Exception ex) {
							ex.printStackTrace();
						
					}
			
							
							//for station five name 
							
							stationName5= new String[size];
							 qur="SELECT 	stationFiveName FROM stationname ORDER BY  root_ID ASC";
								
								try {
									Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
									Connection con1= DriverManager.getConnection(url,user,password);
									Statement stt1= con1.createStatement();
									
									
									
							   
									
								ResultSet re1=stt1.executeQuery(qur);//accessing table
								int i=0;
								while (re1.next()) {
									
									stationName5[i]=re1.getString("stationFiveName");
							
									i++;
								
								}
								System.out.println();
								for(i=0;i<stationName5.length;i++) {
									System.out.print(stationName5[i]+"  ");
								}
								
							}catch(Exception ex) {
								ex.printStackTrace();
							
						}
								
								
								//for station six name 
								
								stationName6= new String[size];
								 qur="SELECT 	stationSixName FROM stationname ORDER BY  root_ID ASC";
									
									try {
										Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
										Connection con1= DriverManager.getConnection(url,user,password);
										Statement stt1= con1.createStatement();
										
										
										
								   
										
									ResultSet re1=stt1.executeQuery(qur);//accessing table
									int i=0;
									while (re1.next()) {
										
										stationName6[i]=re1.getString("stationSixName");
								
										i++;
									
									}
									System.out.println();
									for(i=0;i<stationName6.length;i++) {
										System.out.print(stationName6[i]+"  ");
									}
									
								}catch(Exception ex) {
									ex.printStackTrace();
								
							}
									
									//for station seven name 
									
									stationName7= new String[size];
									 qur="SELECT 	stationSevenName FROM stationname ORDER BY  root_ID ASC";
										
										try {
											Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
											Connection con1= DriverManager.getConnection(url,user,password);
											Statement stt1= con1.createStatement();
											
											
											
									   
											
										ResultSet re1=stt1.executeQuery(qur);//accessing table
										int i=0;
										while (re1.next()) {
											
											stationName7[i]=re1.getString("stationSevenName");
									
											i++;
										
										}
										System.out.println();
										for(i=0;i<stationName7.length;i++) {
											System.out.print(stationName7[i]+"  ");
										}
										
									}catch(Exception ex) {
										ex.printStackTrace();
									
								}
										
										
										//for station eight name 
										
										stationName8= new String[size];
										 qur="SELECT 	stationEightName FROM stationname ORDER BY  root_ID ASC";
											
											try {
												Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
												Connection con1= DriverManager.getConnection(url,user,password);
												Statement stt1= con1.createStatement();
												
												
												
										   
												
											ResultSet re1=stt1.executeQuery(qur);//accessing table
											int i=0;
											while (re1.next()) {
												
												stationName8[i]=re1.getString("stationEightName");
										
												i++;
											
											}
											System.out.println();
											for(i=0;i<stationName8.length;i++) {
												System.out.print(stationName8[i]+"  ");
											}
											
										}catch(Exception ex) {
											ex.printStackTrace();
										
									}
											
					
											//for station nine name 
											
											stationName9= new String[size];
											 qur="SELECT stationNineName FROM stationname ORDER BY  root_ID ASC";
												
												try {
													Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
													Connection con1= DriverManager.getConnection(url,user,password);
													Statement stt1= con1.createStatement();
													
													
													
											   
													
												ResultSet re1=stt1.executeQuery(qur);//accessing table
												int i=0;
												while (re1.next()) {
													
													stationName9[i]=re1.getString("stationNineName");
											
													i++;
												
												}
												System.out.println();
												for(i=0;i<stationName9.length;i++) {
													System.out.print(stationName9[i]+"  ");
												}
												
											}catch(Exception ex) {
												ex.printStackTrace();
											
										}
			
												
												//for station ten name 
												
												stationName10= new String[size];
												 qur="SELECT stationTenName FROM stationname ORDER BY  root_ID ASC";
													
													try {
														Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
														Connection con1= DriverManager.getConnection(url,user,password);
														Statement stt1= con1.createStatement();
														
														
														
												   
														
													ResultSet re1=stt1.executeQuery(qur);//accessing table
													int i=0;
													while (re1.next()) {
														
														stationName10[i]=re1.getString("stationTenName");
												
														i++;
													
													}
													System.out.println();
													for(i=0;i<stationName10.length;i++) {
														System.out.print(stationName10[i]+"  ");
													}
													
												}catch(Exception ex) {
													ex.printStackTrace();
												
											}
													
													
													//for station eleven name 
													
													stationName11= new String[size];
													 qur="SELECT stationElevenName FROM stationname ORDER BY  root_ID ASC";
														
														try {
															Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
															Connection con1= DriverManager.getConnection(url,user,password);
															Statement stt1= con1.createStatement();
															
															
															
													   
															
														ResultSet re1=stt1.executeQuery(qur);//accessing table
														int i=0;
														while (re1.next()) {
															
															stationName11[i]=re1.getString("stationElevenName");
													
															i++;
														
														}
														System.out.println();
														for(i=0;i<stationName11.length;i++) {
															System.out.print(stationName11[i]+"  ");
														}
														
													}catch(Exception ex) {
														ex.printStackTrace();
													
												}
														
														
														//for station twelve name 
														
														stationName12= new String[size];
														 qur="SELECT stationTwowelvName FROM stationname ORDER BY  root_ID ASC";
															
															try {
																Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
																Connection con1= DriverManager.getConnection(url,user,password);
																Statement stt1= con1.createStatement();
																
																
																
														   
																
															ResultSet re1=stt1.executeQuery(qur);//accessing table
															int i=0;
															while (re1.next()) {
																
																stationName12[i]=re1.getString("stationTwowelvName");
														
																i++;
															
															}
															System.out.println();
															for(i=0;i<stationName12.length;i++) {
																System.out.print(stationName12[i]+"  ");
															}
															
														}catch(Exception ex) {
															ex.printStackTrace();
														
													}
															
															//for station thirteen name 
															
															stationName13= new String[size];
															 qur="SELECT stationThrteenName FROM stationname ORDER BY  root_ID ASC";
																
																try {
																	Class.forName("com.mysql.jdbc.Driver");//used to connect to database 
																	Connection con1= DriverManager.getConnection(url,user,password);
																	Statement stt1= con1.createStatement();
																	
																	
																	
															   
																	
																ResultSet re1=stt1.executeQuery(qur);//accessing table
																int i=0;
																while (re1.next()) {
																	
																	stationName13[i]=re1.getString("stationThrteenName");
															
																	i++;
																
																}
																System.out.println();
																for(i=0;i<stationName13.length;i++) {
																	System.out.print(stationName13[i]+"  ");
																}
																
															}catch(Exception ex) {
																ex.printStackTrace();
															
														}
																
					//for assigning the roots
					stationName01 =new String[13];
					for(int i=0;i<13;i++) {
						stationName01[i]="NULL";
					}
					stationName02 =new String[13];
					for(int i=0;i<13;i++) {
						stationName02[i]="NULL";
					}
					stationName03 =new String[13];
					for(int i=0;i<13;i++) {
						stationName03[i]="NULL";
					}
					stationName04 =new String[13];
					for(int i=0;i<13;i++) {
						stationName04[i]="NULL";
					}
					stationName05 =new String[13];
					for(int i=0;i<13;i++) {
						stationName05[i]="NULL";
					}
					stationName06 =new String[13];
					for(int i=0;i<13;i++) {
						stationName06[i]="NULL";
					}
					stationName07 =new String[13];
					for(int i=0;i<13;i++) {
						stationName07[i]="NULL";
					}
					stationName08 =new String[13];
					for(int i=0;i<13;i++) {
						stationName08[i]="NULL";
					}
					stationName09 =new String[13];
					for(int i=0;i<13;i++) {
						stationName09[i]="NULL";
					}
					stationName010 =new String[13];
					for(int i=0;i<13;i++) {
						stationName010[i]="NULL";
					}
					stationName011 =new String[13];
					for(int i=0;i<13;i++) {
						stationName011[i]="NULL";
					}
					stationName012 =new String[13];
					for(int i=0;i<13;i++) {
						stationName012[i]="NULL";
					}
					stationName013 =new String[13];
					for(int i=0;i<13;i++) {
						stationName013[i]="NULL";
					}
					int j=0;
				
			       for(int i=0;i<13;i++) {
			    	   if(i==0) {
			    		   
			    		   for(j=0;j<stationName1.length;j++) {
			    			   if(j==0) {
			    		            stationName01[i] =stationName1[j];
			    			   }else if(j==1) {
			    		            stationName02[i] =stationName1[j];	   
			    			   }else if(j==2) {
			    		            stationName03[i] =stationName1[j];	   
			    			   }else if(j==3) {
			    		            stationName04[i] =stationName1[j];	   
			    			   }else if(j==4) {
			    		            stationName05[i] =stationName1[j];	   
			    			   }else if(j==5) {
			    		            stationName06[i] =stationName1[j];	   
			    			   }else if(j==6) {
			    		            stationName07[i] =stationName1[j];	
			    			   }else if(j==7) {
			    		            stationName08[i] =stationName1[j];	   
			    			   }else if(j==8) {
			    		            stationName09[i] =stationName1[j];	   
			    			   }else if(j==9) {
			    		            stationName010[i] =stationName1[j];	   
			    			   }else if(j==10) {
			    		            stationName011[i] =stationName1[j];	   
			    			   }else if(j==11) {
			    		            stationName012[i] =stationName1[j];	   
			    			   }
			    			   else if(j==12) {
			    		            stationName013[i] =stationName1[j];	   
			    			   }
			    		   }
			    	   }else if(i==1) {
			    		   for(j=0;j<stationName2.length;j++) {
			    		   
			    		   if(j==0) {
		    		            stationName01[i] =stationName2[j];
		    			   }else if(j==1) {
		    		            stationName02[i] =stationName2[j];	   
		    			   }else if(j==2) {
		    		            stationName03[i] =stationName2[j];	   
		    			   }else if(j==3) {
		    		            stationName04[i] =stationName2[j];	   
		    			   }else if(j==4) {
		    		            stationName05[i] =stationName2[j];	   
		    			   }else if(j==5) {
		    		            stationName06[i] =stationName2[j];	   
		    			   }else if(j==6) {
		    		            stationName07[i] =stationName2[j];	
		    			   }else if(j==7) {
		    		            stationName08[i] =stationName2[j];	   
		    			   }else if(j==8) {
		    		            stationName09[i] =stationName2[j];	   
		    			   }else if(j==9) {
		    		            stationName010[i] =stationName2[j];	   
		    			   }else if(j==10) {
		    		            stationName011[i] =stationName2[j];	   
		    			   }else if(j==11) {
		    		            stationName012[i] =stationName2[j];	   
		    			   }
		    			   else if(j==12) {
		    		            stationName013[i] =stationName2[j];	   
		    			   }
			    	   }
			       }else if(i==2) {
			    		   for(j=0;j<stationName3.length;j++) {
			    		   
			    		   if(j==0) {
		    		            stationName01[i] =stationName3[j];
		    			   }else if(j==1) {
		    		            stationName02[i] =stationName3[j];	   
		    			   }else if(j==2) {
		    		            stationName03[i] =stationName3[j];	   
		    			   }else if(j==3) {
		    		            stationName04[i] =stationName3[j];	   
		    			   }else if(j==4) {
		    		            stationName05[i] =stationName3[j];	   
		    			   }else if(j==5) {
		    		            stationName06[i] =stationName3[j];	   
		    			   }else if(j==6) {
		    		            stationName07[i] =stationName3[j];	
		    			   }else if(j==7) {
		    		            stationName08[i] =stationName3[j];	   
		    			   }else if(j==8) {
		    		            stationName09[i] =stationName3[j];	   
		    			   }else if(j==9) {
		    		            stationName010[i] =stationName3[j];	   
		    			   }else if(j==10) {
		    		            stationName011[i] =stationName3[j];	   
		    			   }else if(j==11) {
		    		            stationName012[i] =stationName3[j];	   
		    			   }
		    			   else if(j==12) {
		    		            stationName013[i] =stationName3[j];	   
		    			   }
			    	   }
			       }else if(i==3) {
		    		   for(j=0;j<stationName4.length;j++) {
			    		   
		    		   if(j==0) {
	    		            stationName01[i] =stationName4[j];
	    			   }else if(j==1) {
	    		            stationName02[i] =stationName4[j];	   
	    			   }else if(j==2) {
	    		            stationName03[i] =stationName4[j];	   
	    			   }else if(j==3) {
	    		            stationName04[i] =stationName4[j];	   
	    			   }else if(j==4) {
	    		            stationName05[i] =stationName4[j];	   
	    			   }else if(j==5) {
	    		            stationName06[i] =stationName4[j];	   
	    			   }else if(j==6) {
	    		            stationName07[i] =stationName4[j];	
	    			   }else if(j==7) {
	    		            stationName08[i] =stationName4[j];	   
	    			   }else if(j==8) {
	    		            stationName09[i] =stationName4[j];	   
	    			   }else if(j==9) {
	    		            stationName10[i] =stationName4[j];	   
	    			   }else if(j==10) {
	    		            stationName011[i] =stationName4[j];	   
	    			   }else if(j==11) {
	    		            stationName012[i] =stationName4[j];	   
	    			   }
	    			   else if(j==12) {
	    		            stationName013[i] =stationName4[j];	   
	    			   }
		    	   }
		       }else if(i==4) {
	    		   for(j=0;j<stationName5.length;j++) {
		    		   
	    		   if(j==0) {
			            stationName01[i] =stationName5[j];
				   }else if(j==1) {
			            stationName02[i] =stationName5[j];	   
				   }else if(j==2) {
			            stationName03[i] =stationName5[j];	   
				   }else if(j==3) {
			            stationName04[i] =stationName5[j];	   
				   }else if(j==4) {
			            stationName05[i] =stationName5[j];	   
				   }else if(j==5) {
			            stationName06[i] =stationName5[j];	   
				   }else if(j==6) {
			            stationName07[i] =stationName5[j];	
				   }else if(j==7) {
			            stationName08[i] =stationName5[j];	   
				   }else if(j==8) {
			            stationName09[i] =stationName5[j];	   
				   }else if(j==9) {
			            stationName010[i] =stationName5[j];	   
				   }else if(j==10) {
			            stationName011[i] =stationName5[j];	   
				   }else if(j==11) {
			            stationName012[i] =stationName5[j];	   
				   }
				   else if(j==12) {
			            stationName013[i] =stationName5[j];	   
				   }
	    	   }
	       }else if(i==5) {
			   for(j=0;j<stationName6.length;j++) {
	    		   
			   if(j==0) {
		            stationName01[i] =stationName6[j];
			   }else if(j==1) {
		            stationName02[i] =stationName6[j];	   
			   }else if(j==2) {
		            stationName03[i] =stationName6[j];	   
			   }else if(j==3) {
		            stationName04[i] =stationName6[j];	   
			   }else if(j==4) {
		            stationName05[i] =stationName6[j];	   
			   }else if(j==5) {
		            stationName06[i] =stationName6[j];	   
			   }else if(j==6) {
		            stationName07[i] =stationName6[j];	
			   }else if(j==7) {
		            stationName08[i] =stationName6[j];	   
			   }else if(j==8) {
		            stationName09[i] =stationName6[j];	   
			   }else if(j==9) {
		            stationName010[i] =stationName6[j];	   
			   }else if(j==10) {
		            stationName011[i] =stationName6[j];	   
			   }else if(j==11) {
		            stationName012[i] =stationName6[j];	   
			   }
			   else if(j==12) {
		            stationName013[i] =stationName6[j];	   
			   }
		   }
	   }else if(i==6) {
		   for(j=0;j<stationName7.length;j++) {
			   
		   if(j==0) {
	            stationName01[i] =stationName7[j];
		   }else if(j==1) {
	            stationName02[i] =stationName7[j];	   
		   }else if(j==2) {
	            stationName03[i] =stationName7[j];	   
		   }else if(j==3) {
	            stationName04[i] =stationName7[j];	   
		   }else if(j==4) {
	            stationName05[i] =stationName7[j];	   
		   }else if(j==5) {
	            stationName06[i] =stationName7[j];	   
		   }else if(j==6) {
	            stationName07[i] =stationName7[j];	
		   }else if(j==7) {
	            stationName08[i] =stationName7[j];	   
		   }else if(j==8) {
	            stationName09[i] =stationName7[j];	   
		   }else if(j==9) {
	            stationName010[i] =stationName7[j];	   
		   }else if(j==10) {
	            stationName011[i] =stationName7[j];	   
		   }else if(j==11) {
	            stationName012[i] =stationName7[j];	   
		   }
		   else if(j==12) {
	            stationName013[i] =stationName7[j];	   
		   }
	   }
	}else if(i==7) {
		   for(j=0;j<stationName8.length;j++) {
			   
		   if(j==0) {
	         stationName01[i] =stationName8[j];
		   }else if(j==1) {
	         stationName02[i] =stationName8[j];	   
		   }else if(j==2) {
	         stationName03[i] =stationName8[j];	   
		   }else if(j==3) {
	         stationName04[i] =stationName8[j];	   
		   }else if(j==4) {
	         stationName05[i] =stationName8[j];	   
		   }else if(j==5) {
	         stationName06[i] =stationName8[j];	   
		   }else if(j==6) {
	         stationName07[i] =stationName8[j];	
		   }else if(j==7) {
	         stationName08[i] =stationName8[j];	   
		   }else if(j==8) {
	         stationName09[i] =stationName8[j];	   
		   }else if(j==9) {
	         stationName010[i] =stationName8[j];	   
		   }else if(j==10) {
	         stationName011[i] =stationName8[j];	   
		   }else if(j==11) {
	         stationName012[i] =stationName8[j];	   
		   }
		   else if(j==12) {
	         stationName013[i] =stationName8[j];	   
		   }
	}
	}else if(i==8) {
		   for(j=0;j<stationName9.length;j++) {
			   
		   if(j==0) {
	         stationName01[i] =stationName9[j];
		   }else if(j==1) {
	         stationName02[i] =stationName9[j];	   
		   }else if(j==2) {
	         stationName03[i] =stationName9[j];	   
		   }else if(j==3) {
	         stationName04[i] =stationName9[j];	   
		   }else if(j==4) {
	         stationName05[i] =stationName9[j];	   
		   }else if(j==5) {
	         stationName06[i] =stationName9[j];	   
		   }else if(j==6) {
	         stationName07[i] =stationName9[j];	
		   }else if(j==7) {
	         stationName08[i] =stationName9[j];	   
		   }else if(j==8) {
	         stationName09[i] =stationName9[j];	   
		   }else if(j==9) {
	         stationName010[i] =stationName9[j];	   
		   }else if(j==10) {
	         stationName011[i] =stationName9[j];	   
		   }else if(j==11) {
	         stationName012[i] =stationName9[j];	   
		   }
		   else if(j==12) {
	         stationName013[i] =stationName9[j];	   
		   }
	}
	}else if(i==9) {
		   for(j=0;j<stationName10.length;j++) {
			   
		   if(j==0) {
	         stationName01[i] =stationName10[j];
		   }else if(j==1) {
	         stationName02[i] =stationName10[j];	   
		   }else if(j==2) {
	         stationName03[i] =stationName10[j];	   
		   }else if(j==3) {
	         stationName04[i] =stationName10[j];	   
		   }else if(j==4) {
	         stationName05[i] =stationName10[j];	   
		   }else if(j==5) {
	         stationName06[i] =stationName10[j];	   
		   }else if(j==6) {
	         stationName07[i] =stationName10[j];	
		   }else if(j==7) {
	         stationName08[i] =stationName10[j];	   
		   }else if(j==8) {
	         stationName09[i] =stationName10[j];	   
		   }else if(j==9) {
	         stationName010[i] =stationName10[j];	   
		   }else if(j==10) {
	         stationName011[i] =stationName10[j];	   
		   }else if(j==11) {
	         stationName012[i] =stationName10[j];	   
		   }
		   else if(j==12) {
	         stationName013[i] =stationName10[j];	   
		   }
	}
	}else if(i==10) {
		   for(j=0;j<stationName11.length;j++) {
			   
		   if(j==0) {
	         stationName01[i] =stationName11[j];
		   }else if(j==1) {
	         stationName02[i] =stationName11[j];	   
		   }else if(j==2) {
	         stationName03[i] =stationName11[j];	   
		   }else if(j==3) {
	         stationName04[i] =stationName11[j];	   
		   }else if(j==4) {
	         stationName05[i] =stationName11[j];	   
		   }else if(j==5) {
	         stationName06[i] =stationName11[j];	   
		   }else if(j==6) {
	         stationName07[i] =stationName11[j];	
		   }else if(j==7) {
	         stationName08[i] =stationName11[j];	   
		   }else if(j==8) {
	         stationName09[i] =stationName11[j];	   
		   }else if(j==9) {
	         stationName010[i] =stationName11[j];	   
		   }else if(j==10) {
	         stationName011[i] =stationName11[j];	   
		   }else if(j==11) {
	         stationName012[i] =stationName11[j];	   
		   }
		   else if(j==12) {
	         stationName013[i] =stationName11[j];	   
		   }
	}
	}else if(i==11) {
		   for(j=0;j<stationName12.length;j++) {
			   
		   if(j==0) {
	         stationName01[i] =stationName12[j];
		   }else if(j==1) {
	         stationName02[i] =stationName12[j];	   
		   }else if(j==2) {
	         stationName03[i] =stationName12[j];	   
		   }else if(j==3) {
	         stationName04[i] =stationName12[j];	   
		   }else if(j==4) {
	         stationName05[i] =stationName12[j];	   
		   }else if(j==5) {
	         stationName06[i] =stationName12[j];	   
		   }else if(j==6) {
	         stationName07[i] =stationName12[j];	
		   }else if(j==7) {
	         stationName08[i] =stationName12[j];	   
		   }else if(j==8) {
	         stationName09[i] =stationName12[j];	   
		   }else if(j==9) {
	         stationName010[i] =stationName12[j];	   
		   }else if(j==10) {
	         stationName011[i] =stationName12[j];	   
		   }else if(j==11) {
	         stationName012[i] =stationName12[j];	   
		   }
		   else if(j==12) {
	         stationName013[i] =stationName12[j];	   
		   }
	}
	}else if(i==12) {
		   for(j=0;j<stationName13.length;j++) {
			   
		   if(j==0) {
	         stationName01[i] =stationName13[j];
		   }else if(j==1) {
	         stationName02[i] =stationName13[j];	   
		   }else if(j==2) {
	         stationName03[i] =stationName13[j];	   
		   }else if(j==3) {
	         stationName04[i] =stationName13[j];	   
		   }else if(j==4) {
	         stationName05[i] =stationName13[j];	   
		   }else if(j==5) {
	         stationName06[i] =stationName13[j];	   
		   }else if(j==6) {
	         stationName07[i] =stationName13[j];	
		   }else if(j==7) {
	         stationName08[i] =stationName13[j];	   
		   }else if(j==8) {
	         stationName09[i] =stationName13[j];	   
		   }else if(j==9) {
	         stationName010[i] =stationName13[j];	   
		   }else if(j==10) {
	         stationName011[i] =stationName13[j];	   
		   }else if(j==11) {
	         stationName012[i] =stationName13[j];	   
		   }
		   else if(j==12) {
	         stationName013[i] =stationName13[j];	   
		   }
	}
	}
			    	   
			    	   
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName01.length;i++) {
			    	   System.out.print(stationName01[i]+"   ");
			       }
					
			       System.out.println();
			       for(int i=0;i<stationName02.length;i++) {
			    	   System.out.print(stationName02[i]+"   ");
			       }
					
			       System.out.println();
			       for(int i=0;i<stationName03.length;i++) {
			    	   System.out.print(stationName03[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName04.length;i++) {
			    	   System.out.print(stationName04[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName05.length;i++) {
			    	   System.out.print(stationName05[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName06.length;i++) {
			    	   System.out.print(stationName06[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName07.length;i++) {
			    	   System.out.print(stationName07[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName08.length;i++) {
			    	   System.out.print(stationName08[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName09.length;i++) {
			    	   System.out.print(stationName09[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName010.length;i++) {
			    	   System.out.print(stationName010[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName011.length;i++) {
			    	   System.out.print(stationName011[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName012.length;i++) {
			    	   System.out.print(stationName012[i]+"   ");
			       }
			       
			       System.out.println();
			       for(int i=0;i<stationName013.length;i++) {
			    	   System.out.print(stationName013[i]+"   ");
			       }
			     
			       
			       
			   //for fixing the size for station one   
			   if(!stationName01[0].equals("NULL")) {
			   for(int i=0;i<stationName01.length;i++) {
				   if(stationName01[i].equals("NULL")||stationName01[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName001=new String[coun];
			   
			   System.out.println(coun);
			   for(int i=0;i<coun;i++) {
				   stationName001[i]= stationName01[i];
			   }
			   
			   for(int i=0;i<stationName001.length;i++) {
				   System.out.print(stationName001[i]+"  ");
			   }
			   
			   }
			   //for fixing the size for station two 
			   if(!stationName02[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName02.length;i++) {
				   if(stationName02[i].equals("NULL")||stationName02[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName002=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName002[i]= stationName02[i];
			   }
			   
			   for(int i=0;i<stationName002.length;i++) {
				   System.out.print(stationName002[i]+"  ");
			   }
			   
			   }
			 //for fixing the size for station three 
			   if(!stationName03[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName03.length;i++) {
				   if(stationName03[i].equals("NULL")||stationName03[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName003=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName003[i]= stationName03[i];
			   }
			   
			   for(int i=0;i<stationName003.length;i++) {
				   System.out.print(stationName003[i]+"  ");
			   }
			   }
			   
			 //for fixing the size for station four 
			   if(!stationName04[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName04.length;i++) {
				   if(stationName04[i].equals("NULL")||stationName04[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName004=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName004[i]= stationName04[i];
			   }
			   
			   for(int i=0;i<stationName004.length;i++) {
				   System.out.print(stationName004[i]+"  ");
			   }
			   }
			   
			 //for fixing the size for station five
			   if(!stationName05[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName05.length;i++) {
				   if(stationName05[i].equals("NULL")||stationName05[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName005=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName005[i]= stationName05[i];
			   }
			   
			   for(int i=0;i<stationName005.length;i++) {
				   System.out.print(stationName005[i]+"  ");
			   }
			   
			   }
			 //for fixing the size for station six 
			   if(!stationName06[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName06.length;i++) {
				   if(stationName06[i].equals("NULL")||stationName06[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName006=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName006[i]= stationName06[i];
			   }
			   
			   for(int i=0;i<stationName006.length;i++) {
				   System.out.print(stationName006[i]+"  ");
			   }
			   
			   }
			   System.out.println("Size.."+stationName07.length);
			 //for fixing the size for station seven
			   if(!stationName07[0].equals("NULL")){
			   coun=0;
			   for(int i=0;i<stationName07.length;i++) {
				   if(stationName07[i].equals("NULL")||stationName07[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName007=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName007[i]= stationName07[i];
			   }
			   
			   for(int i=0;i<stationName007.length;i++) {
				   System.out.print(stationName007[i]+"  ");
			   }
			   
			   }
			 //for fixing the size for station eight 
			   if(!stationName08[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName08.length;i++) {
				   if(stationName08[i].equals("NULL")||stationName08[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName008=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName008[i]= stationName08[i];
			   }
			   
			   for(int i=0;i<stationName008.length;i++) {
				   System.out.print(stationName008[i]+"  ");
			   }
			   }
			 //for fixing the size for station nine
			   if(!stationName09[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName09.length;i++) {
				   if(stationName09[i].equals("NULL")||stationName09[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName009=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName009[i]= stationName09[i];
			   }
			   
			   for(int i=0;i<stationName009.length;i++) {
				   System.out.print(stationName009[i]+"  ");
			   }
			   }
			 //for fixing the size for station ten 
			   if(stationName010[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName010.length;i++) {
				   if(stationName010[i].equals("NULL")||stationName010[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName0010=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName0010[i]= stationName010[i];
			   }
			   
			   for(int i=0;i<stationName0010.length;i++) {
				   System.out.print(stationName0010[i]+"  ");
			   }
			   }
			   
			 //for fixing the size for station eleven
			   if(!stationName011[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName011.length;i++) {
				   if(stationName011[i].equals("NULL")||stationName011[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName0011=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName0011[i]= stationName011[i];
			   }
			   
			   for(int i=0;i<stationName0011.length;i++) {
				   System.out.print(stationName0011[i]+"  ");
			   }
			   }
			 //for fixing the size for station twelve 
			   if(!stationName012[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName012.length;i++) {
				   if(stationName012[i].equals("NULL")||stationName012[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName0012=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName0012[i]= stationName012[i];
			   }
			   
			   for(int i=0;i<stationName0012.length;i++) {
				   System.out.print(stationName0012[i]+"  ");
			   }
			   }
			 //for fixing the size for station thirteen 
			   if(!stationName013[0].equals("NULL")) {
			   coun=0;
			   for(int i=0;i<stationName013.length;i++) {
				   if(stationName013[i].equals("NULL")||stationName013[i].equals(null)) {
					   
				   }else {
					   coun++;
				   }
			   }
			   
			   System.out.println(coun);
			   
			   stationName0013=new String[coun];
			   
			   //System.out.println();
			   for(int i=0;i<coun;i++) {
				   stationName0013[i]= stationName013[i];
			   }
			   
			   for(int i=0;i<stationName0013.length;i++) {
				   System.out.print(stationName0013[i]+"  ");
			   }
			   
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
		
		jt= new JTextField();
		jt.setEditable(false);
	    jt.setColumns(10);
	    jt.setBackground(Color.CYAN);
		jt1= new JTextField();
		jt1.setEditable(false);
	    jt1.setColumns(10);
	    jt1.setBackground(Color.CYAN);
		jt2= new JTextField();
		jt2.setEditable(false);
	    jt2.setColumns(10);
	    jt2.setBackground(Color.CYAN);
		jt3= new JTextField();
		jt3.setEditable(false);
	    jt3.setColumns(10);
	    jt3.setBackground(Color.CYAN);
		jt4= new JTextField();
		jt4.setEditable(false);
	    jt4.setColumns(10);
	    jt4.setBackground(Color.CYAN);
		 
		jc=new JComboBox(rootID);
		jc.setSelectedIndex(-1);
		jc.setFont(new Font("Arial", Font.PLAIN, 14));
        jc.setSize(50, 20);
        jc.setMaximumRowCount(4);
		jc2=new JComboBox(two);
		jc2.setSelectedIndex(-1);
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
		   
		   // getContentPane().add(jp0);
		  
		    back=new JButton(icon1);
	        //back.setFont(new Font("Arial", Font.PLAIN, 18));
			//back.setText("Back");
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
			//jp3.add(jl3);
			//jp3.add(jc3);
			

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
		
		String str = (String) jc.getSelectedItem();
	    String [] root=new String[1];
	    root[0]=str;
	    
		int indx;
		indx=jc.getSelectedIndex();
		
		if(indx==0) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName001);
		}else if(indx==1) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName002);
		}else if(indx==2) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName003);
		}else if(indx==3) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName004);
		}else if(indx==4) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName005);
		}else if(indx==5) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName006);
		}else if(indx==6) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName007);
		}else if(indx==7) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName008);
		}else if(indx==8) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName009);
		}else if(indx==9) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName0010);
		}else if(indx==10) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName0011);
		}else if(indx==11) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName0012);
		}else if(indx==13) {
			this.setVisible(false);
			BusTrackingTwo tr= new BusTrackingTwo(root, stationName0013);
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
        else if(s.equals(""))  {
        	this.setVisible(false);
        	UserForm f = new UserForm(UserForm.userName,UserForm.passWor);
        }
    }

}
