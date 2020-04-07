
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;





public class db {
	
	private static final String url = "jdbc:oracle:thin:@131.230.133.11:1521:cs"; 
	private static final String user = "cjohnson"; 
	private static final String password = "Kitl0iBU"; 
	
	
	// JDBC variables for opening and managing connection 
	
	private static Connection con; 
	private static Statement stmt; 
	private static ResultSet rs;
	
	
	//get number of entries for songs table
		public static int totalNumOfsong() {
		
			int num = 0;
		
			String query = "select * from songs_appears"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){

					num++;
				
				}
			
							
				}catch (SQLException sqlEx) { 
				
					sqlEx.printStackTrace(); 
				
				}finally{ 
				
					//close connection ,stmt and resultset here 
				
					try { 
						con.close(); 
						rs.close(); 
						stmt.close(); 
					
					} catch(SQLException se) { 
					
						/*can't do anything */ 
					
					}
				
				}
			
			return num;
	
		}
		
		
	//get total number of entries for musicians table
	public static int totalNumOfMus() {
		
		int num = 0;
		
		String query = "select * from Musicians"; 
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){

				num++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
		
		
		
		return num; 
			
	}
	
	//get number of entries in live table
	public int totalNumOflive() {
	
		int num = 0;
	
		String query = "select * from lives"; 
	
	
		try { 
		
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
		
			// getting Statement object to execute query 
			stmt = con.createStatement();
		
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
		
		
			//get total number of space for array
			while(rs.next()){

				num++;
			
			}
		
						
			}catch (SQLException sqlEx) { 
			
				sqlEx.printStackTrace(); 
			
			}finally{ 
			
				//close connection ,stmt and resultset here 
			
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
			
			}
	
	
	
		return num; 
	
	
	}
	
	
	//get number of entries for place table
		public int totalNumOfPlace() {
		
			int num = 0;
		
			String query = "select * from places"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){

					num++;
				
				}
			
							
				}catch (SQLException sqlEx) { 
				
					sqlEx.printStackTrace(); 
				
				}finally{ 
				
					//close connection ,stmt and resultset here 
				
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					}
				}
			
			return num;
				
		}
	
	//get number of entries for phone table
		public int totalNumOfPhone() {
		
			int num = 0;
		
			String query = "select * from Telephone_Home"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){

					num++;
				
				}
			
							
				}catch (SQLException sqlEx) { 
				
					sqlEx.printStackTrace(); 
				
				}finally{ 
				
					//close connection ,stmt and resultset here 
				
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					}
				}
			
			return num;	
		
		}
	
	//get number of entries for performance table
		public int totalNumOfPerform() {
		
			int num = 0;
		
			String query = "select * from perform"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){

					num++;
				
				}
			
							
				}catch (SQLException sqlEx) { 
				
					sqlEx.printStackTrace(); 
				
				}finally{ 
				
					//close connection ,stmt and resultset here 
				
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					}
				}
			
			return num;
				
			}

	
	//get number of entries for album producer table
		public static int totalNumOfAlbum() {
		
			int num = 0;
		
			String query = "select * from album_producer"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){

					num++;
				
				}
			
							
				}catch (SQLException sqlEx) { 
				
					sqlEx.printStackTrace(); 
				
				}finally{ 
				
					//close connection ,stmt and resultset here 
				
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					}
				}
			
			return num;
				
				}
		
		
	
	//get number of entries for instruments table
	public int totalNumOfIns() {
	
		int num = 0;
	
		String query = "select * from instruments"; 
	
	
		try { 
		
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
		
			// getting Statement object to execute query 
			stmt = con.createStatement();
		
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
		
		
			//get total number of space for array
			while(rs.next()){

				num++;
			
			}
		
						
			}catch (SQLException sqlEx) { 
			
				sqlEx.printStackTrace(); 
			
			}finally{ 
			
				//close connection ,stmt and resultset here 
			
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
			
			}
	
	
	
		return num; 
	
	
	}
	
	
	//get number of entries for plays instrument table
		public int totalNumOfPlay() {
		
			int num = 0;
		
			String query = "select * from Plays"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){

					num++;
				
				}
			
							
				}catch (SQLException sqlEx) { 
				
					sqlEx.printStackTrace(); 
				
				}finally{ 
				
					//close connection ,stmt and resultset here 
				
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					}
				
				}
		
		
		
			return num; 
		
		}
		
		public static String[][] searchSong(String song) {
			
			int trak = 0;
			int entry = 4;
			String[][] array = new String[totalNumOfsong()][entry];
			
			String query = "select * from songs_appears where title = '"+song+ "'"; 
			
			
			try { 
				
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
				
				// getting Statement object to execute query 
				stmt = con.createStatement();
				
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
				
				
				//get total number of space for array
				while(rs.next()){
					
					if(rs.getString("title").startsWith(song)==true){
						array[trak][entry - 4]= rs.getString("songId"); 
						array[trak][entry - 3]= rs.getString("author");
						array[trak][entry - 2]= rs.getString("title");
						array[trak][entry - 1]= rs.getString("albumId");
					
					}

					
					trak++;
					
		         }
				
								
				}catch (SQLException sqlEx) { 
					
					sqlEx.printStackTrace(); 
					
				}finally{ 
					
					//close connection ,stmt and resultset here 
					
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					} 
					
				}
			
			
			
			return array; 
			
			
			}
		
		public static Object[][] searchAlbum(String name) {
			
			int trak = 0;
			int entry = 4;
			Object[][] array = new String[totalNumOfAlbum()][entry];
		
			String query = "select * from album_producer where title = '"+name+"'"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){
					
		
					if(rs.getString("title").startsWith(name)==true){
						
						array[trak][entry - 4]= rs.getString("albumId");
						array[trak][entry - 3]= rs.getString("copyright");
						array[trak][entry - 2]= rs.getString("speed");
						array[trak][entry - 1]= rs.getString("title");
					}
				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				} 
				
			}
		
		
		
			return array; 
		
		
		}
		
		public static String[][] searchMus(String name) {
			
			int trak = 0;
			int entry = 2;
			String[][] array = new String[totalNumOfMus()][entry];
			
			String query = "select * from Musicians where name = '"+name+"'"; 
			
			
			try { 
				
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
				
				// getting Statement object to execute query 
				stmt = con.createStatement();
				
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
				
				
				//get total number of space for array
				while(rs.next()){
					

					if(rs.getString("name").startsWith(name) == true){
					
						
					array[trak][entry - 2]= rs.getString("ssn"); 
					array[trak][entry - 1]= rs.getString("name");
					
					}


					
					trak++;
					
		         }
				
								
				}catch (SQLException sqlEx) { 
					
					sqlEx.printStackTrace(); 
					
				}finally{ 
					
					//close connection ,stmt and resultset here 
					
					try { 
						
						stmt.close(); 
						stmt.close(); 
						rs.close(); 
						
					} catch(SQLException se) { 
						
					/*can't do anything */ 
						
					}
					
				}
			
			
			
			return array; 
			
			
		}
		
		public static void mod(String table, String type,String changeItem, String item) {
			
			
			String query = "update " + table + " set " + type + " = '" + item + "' where "+ type + " = '"+ changeItem +"'"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query);  
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
				
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		
		
		public static void delete(String table, String type,String item) {
			
			
			String query = "delete from " + table + " where " + type + " = '" + item + "'"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query);  
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
				
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addMus(String ssn, String name) {
			
			
			String query = "insert into musicians values ('" + ssn + "', '"+ name +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query);  
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
				
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addInst(String id, String name,String key) {
			
			String query = "insert into instruments values ('" + id + "', '"+ name +"','"+ key +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addPla( String name) {
			
			String query = "insert into Places values ('" + name + "')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addPlay(String ssn, String id) {
			
			String query = "insert into plays values ('" + ssn + "', '"+ id +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 

					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addAlbum(String albumid,String ssn, String name, String copy, int speed, String title) {
			
			String query = "insert into album_producer values ('" + albumid + "', '"+ ssn +"','"+ copy +"','" + speed + "', '"+ title +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 

					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addSong(int songid, String auth, String title,String albumid) {
			
			String query = "insert into songs_appears values (" + songid + ", '"+ auth +"', '" + title + "', '"+ albumid +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 

					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addPhone(String num, String add) {
			
			String query = "insert into Telephone_Home values ('" + num + "', '"+ add +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 

					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addLive(String ssn, String phone, String add) {
			
			String query = "insert into lives values ('" + ssn + "', '"+ phone +"', '"+ add +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
				
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}
		
		public static void addPerf(int songid, String ssn) {
			
			String query = "insert into perform values (" + songid + ", '"+ ssn +"')"; 
			
			
			try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(query); 
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
		
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
			
			
		}

	
	
	public String[][] showMus() {
		
		int trak = 0;
		int entry = 2;
		String[][] array = new String[totalNumOfMus()][entry];
		
		String query = "select * from Musicians"; 
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){

				array[trak][entry - 2]= rs.getString("ssn"); 
				array[trak][entry - 1]= rs.getString("name");


				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
		
		
		
		return array; 
		
		
	}
	
	
	
	public String[][] showLives() {
		
		int trak = 0;
		int entry = 3;
		String[][] array = new String[totalNumOflive()][entry];
		
		String query = "select musicians.name,lives.number, lives.address from lives "
				+ "inner join musicians on musicians.ssn = lives.ssn"; 
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){

				array[trak][entry - 1]= rs.getString("address"); 
				array[trak][entry - 2]= rs.getString("num");
				array[trak][entry - 3]= rs.getString("name");


				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
		
		
		
		return array; 
		
		
	}
	
	public String[][] showAlbumsWitMus() {
		
		int trak = 0;
		int entry = 6;
		String[][] array = new String[totalNumOfAlbum()+3][entry];
		
		String query = "select album_producer.albumId,album_producer.copyright,album_producer.speed,"
				+ " songs_appears.author, songs_appears.title,musicians.name "
				+ " from album_producer" + 
				" inner join musicians" + 
				" on musicians.ssn= album_producer.ssn" + 
				" inner join songs_appears" + 
				" on songs_appears.albumid = album_producer.albumid"; 
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){

				array[trak][entry - 1]= rs.getString("copyright"); 
				array[trak][entry - 2]= rs.getString("speed");
				array[trak][entry - 3]= rs.getString("title");
				array[trak][entry - 4]= rs.getString("albumid"); 
				array[trak][entry - 5]= rs.getString("author");
				array[trak][entry - 6]= rs.getString("name"); 
	


				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
		
		
		
		return array; 
		
		
	}
	
	public String[][] showPerform() {
		
		int trak = 0;
		int entry = 3;
		String[][] array = new String[totalNumOfPerform()][entry];
		
		String query = "select songs_appears.author, songs_appears.title,musicians.name " + 
				" from perform " + 
				" inner join musicians " + 
				" on musicians.ssn = perform.ssn " + 
				" inner join songs_appears on songs_appears.songid = perform.songid";
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){
	
				array[trak][entry - 1]= rs.getString("title"); 
				array[trak][entry - 2]= rs.getString("author");
				array[trak][entry - 3]= rs.getString("name");
	
	
	
				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				} 
				
			}
		
		
		
		return array; 
		
		
	}


	public String[][] showMusInstr() {
		
		int trak = 0;
		int entry = 5;
		String[][] array = new String[totalNumOfPlay()][entry];
		
		String query = "select musicians.name,instruments.dname,Instruments.notes,plays.ssn,plays.instrld "
				+ " from plays inner join musicians on musicians.ssn = plays.ssn "
				+ " inner join instruments on instruments.instrld = plays.instrld order by musicians.name"; 
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){

				array[trak][entry - 1]= rs.getString("instrld"); 
				array[trak][entry - 2]= rs.getString("ssn");
				array[trak][entry - 3]= rs.getString("notes");
				array[trak][entry - 4]= rs.getString("dname"); 
				array[trak][entry - 5]= rs.getString("name");


				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				} 
				
			}
		
		
		
		return array; 
		
		
	}
	
	public String[][] showSong() {
		
		int trak = 0;
		int entry = 4;
		String[][] array = new String[totalNumOfsong()][entry];
		
		String query = "select * from songs_appears"; 
		
		
		try { 
			
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			
			//get total number of space for array
			while(rs.next()){

				array[trak][entry - 4]= rs.getString("songId"); 
				array[trak][entry - 3]= rs.getString("author");
				array[trak][entry - 2]= rs.getString("title");
				array[trak][entry - 1]= rs.getString("albumId");

				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				} 
				
			}
		
		
		
		return array; 
		
		
		}
	
		
	
		public Object[][] showAlbum() {
		
			int trak = 0;
			int entry = 4;
			Object[][] array = new String[totalNumOfAlbum()][entry];
		
			String query = "select * from album_producer"; 
		
		
			try { 
			
				// opening database connection to MySQL server 
				con = DriverManager.getConnection(url, user, password); 
			
				// getting Statement object to execute query 
				stmt = con.createStatement();
			
				// executing SELECT query 
				rs = stmt.executeQuery(query); 
			
			
				//get total number of space for array
				while(rs.next()){
					
		

				array[trak][entry - 4]= rs.getString("albumId");
				array[trak][entry - 3]= rs.getString("copyright");
				array[trak][entry - 2]= rs.getString("speed");
				array[trak][entry - 1]= rs.getString("title");
				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				} 
				
			}
		
		
		
			return array; 
		
		
		}
	
		public String[][] showInst() {
		
			int trak = 0;
			int entry = 3;
			String[][] array = new String[totalNumOfIns()][entry];
		
			String query = "SELECT * FROM Instruments"; 
			System.out.println(query);
		
		
			try { 
			
				System.out.println("try");
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			
			// getting Statement object to execute query 
			stmt = con.createStatement();
			
			// executing SELECT query 
			rs = stmt.executeQuery(query); 
			
			System.out.println("rs");
			
			//get total number of space for array
			while(rs.next()){
				
				System.out.println("loop");
				
				System.out.println("he");
				
				System.out.println(rs.getString("instrld"));

				array[trak][entry - 3]= rs.getString("instrld"); 
				array[trak][entry - 2]= rs.getString("dname");
				array[trak][entry - 1]= rs.getString("notes");

				
				trak++;
				
	         }
			
							
			}catch (SQLException sqlEx) { 
				
				sqlEx.printStackTrace(); 
				
			}finally{ 
				
				//close connection ,stmt and resultset here 
				
				try { 
					
					stmt.close(); 
					stmt.close(); 
					rs.close(); 
					
				} catch(SQLException se) { 
					
				/*can't do anything */ 
					
				}
				
			}
		
		
		
		return array; 
		
		
		}

	
}
