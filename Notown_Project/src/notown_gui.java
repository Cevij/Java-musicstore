import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;




public class notown_gui extends JFrame {

	private static final long serialVersionUID = 1L;

	//all instances
	JButton btnAdd = new JButton("Add");// add button to panel
	JButton btnLogIn = new JButton("Log In");//log in button to panel
	JButton btnSortBy = new JButton("Sort By");//sort by button to panel
	JButton btnModify = new JButton("Modify");//modify button to panel
	JButton btnDelete = new JButton("Delete");//delete button to panel
	JButton btnClose = new JButton("Close");//close button to panel
	JButton btnSubmit = new JButton("Submit");//submit button to panel
	JButton btnSearch = new JButton("Search");//search button to panel
	JButton adminbtn = new JButton("ADM");
	JButton membtn = new JButton("MEM");
	
	
	JLayeredPane layeredPane = new JLayeredPane();// 1 of 3 panel view main part of gui
	
	JScrollPane scrollPane = new JScrollPane();//add button panel had to use scroll pane due to multilayers constantly overlaps data
	JScrollPane scrollPane_1 = new JScrollPane();
	
	
	db info = new db();// database instance
	
	dialog_window window = new dialog_window();// popup window instance
	
	
	//all labels
	JLabel txtpnSondId = new JLabel();
	JLabel txtpnSongTitle = new JLabel();
	JLabel txtpnSpeedOfAlbum = new JLabel();
	JLabel txtpnCopyrightDate = new JLabel();
	JLabel txtpnAlbumId = new JLabel();
	JLabel txtpnAlbumTitle = new JLabel();
	JLabel txtpnInstrumentKey = new JLabel();
	JLabel txtpnInstrumentName = new JLabel();
	JLabel txtpnInstrumentId = new JLabel();
	JLabel txtpnArtistName = new JLabel();
	JLabel txtpnPhone = new JLabel();
	JLabel txtpnAddress = new JLabel();
	JLabel txtpnName = new JLabel();
	JLabel txtpnSsn = new JLabel();

	
	//pop up menu instances
	JPopupMenu sortMen = new JPopupMenu("sortMen");// Menu for Sort button
	JPopupMenu addMen = new JPopupMenu("addMen");// Menu for Sort button
	JPopupMenu logMen = new JPopupMenu("logMen");// Menu for Sort button
	
	
	
	// circle button options on drop down menu
	JRadioButtonMenuItem musbtn = new JRadioButtonMenuItem("Musician");
	JRadioButtonMenuItem instbtn = new JRadioButtonMenuItem("Instruments");
	JRadioButtonMenuItem albumbtn = new JRadioButtonMenuItem("Album");
	JRadioButtonMenuItem performbtn = new JRadioButtonMenuItem("Musician Songs");
	JRadioButtonMenuItem songbtn = new JRadioButtonMenuItem("Songs");
	JRadioButtonMenuItem livebtn = new JRadioButtonMenuItem("Home of Musicians");
	JRadioButtonMenuItem albumProbtn = new JRadioButtonMenuItem("Album Producers");
	JRadioButtonMenuItem playbtn = new JRadioButtonMenuItem("Instruments Used By Musician");

	//table instance
	private JTable table;
	
	
	//column names for tables
	String[] mus = { "SSN", "Name"};
	String[] inst = { "Instrument ID", "Instrument","Note"};
	String[] album = { "Album ID","Copy-right","Speed","Title"};
	String[] song = {"Song ID","Author","Title","Album ID"};
	String[] perform = {"Name","Author","Title"};
	String[] live = {"Name","Number","Address"};
	String[] albumPro = {"Name","Author","Album ID","Title","Speed","Copyright"};
	String[] play = {"Name","Instruments","Notes","SSN","Instrument ID"};
	
	//text fields instances
	private JTextField ssnField ;
	private JTextField nameField;
	private JTextField ArtField;
	private JTextField phoneField;
	private JTextField addressField;
	private JTextField InstruIdField;
	private JTextField instruNamField;
	private JTextField InstruKeyField;
	private JTextField ablumTitField;
	private JTextField albumIDField;
	private JTextField copyrightField;
	private JTextField speedField;
	private JTextField songTitField;
	private JTextField songIDField;
	
	
	

	//onclick method when preformance button is clicked
	public void songPerform() {
			
		performbtn.addItemListener((ItemEvent a) -> {
	            if (a.getStateChange() == ItemEvent.SELECTED) {
	                
	            	//Table instance
	        		table = new JTable(info.showPerform(),perform);
	        		
	        		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        		
	        		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	        		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	        		
	        		table.setBackground(Color.LIGHT_GRAY);
	        		
	        		table.setBounds(11, 11, 405, 345);
	        		
	        		scrollPane.setViewportView(table);
	        		
	        		layeredPane.add(scrollPane,0);
	        		
	            }
	        });
			
			clearRadio();
		}
	
	public void printLive() {
		
		livebtn.addItemListener((ItemEvent a) -> {
			
	        if (a.getStateChange() == ItemEvent.SELECTED) {
	            
	        	//Table portion of code
	    		table = new JTable(info.showLives(),live);
	    		
	    		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    		
	    		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    		
	    		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    		
	    		table.setBackground(Color.LIGHT_GRAY);
	    		
	    		table.setBounds(11, 11, 405, 345);
	    		
	    		scrollPane.setViewportView(table);
	    		
	    		layeredPane.add(scrollPane,0);
	    		
	        }
	    });
		
		clearRadio();
	}
	
	public void printAlbumPro() {
		
		albumProbtn.addItemListener((ItemEvent a) -> {
			
	        if (a.getStateChange() == ItemEvent.SELECTED) {
	            
	        	//Table portion of code
	    		table = new JTable(info.showAlbumsWitMus(),albumPro);
	    		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    		table.setBackground(Color.LIGHT_GRAY);
	    		table.setBounds(11, 11, 405, 345);
	    		scrollPane.setViewportView(table);
	    		layeredPane.add(scrollPane,0);
	    		
	        }
	    });
		
		clearRadio();
	}
	
	public void printPlay() {
		
		playbtn.addItemListener((ItemEvent a) -> {
	        if (a.getStateChange() == ItemEvent.SELECTED) {
	            
	        	//Table portion of code
	    		table = new JTable(info.showMusInstr(),play);
	    		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    		table.setBackground(Color.LIGHT_GRAY);
	    		table.setBounds(11, 11, 405, 345);
	    		scrollPane.setViewportView(table);
	    		layeredPane.add(scrollPane,0);
	    		
	        }
	    });
		
		clearRadio();
	}


	public void songPrint() {
		
		songbtn.addItemListener((ItemEvent a) -> {
            if (a.getStateChange() == ItemEvent.SELECTED) {
                
            	//Table portion of code
        		table = new JTable(info.showSong(),song);
        		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        		table.setBackground(Color.LIGHT_GRAY);
        		table.setBounds(11, 11, 405, 345);
        		scrollPane.setViewportView(table);
        		layeredPane.add(scrollPane,0);
        		
            }
        });
		
		clearRadio();
	}

	public void musicianPrint() {
		
		musbtn.addItemListener((ItemEvent a) -> {
            if (a.getStateChange() == ItemEvent.SELECTED) {
                
            	//Table portion of code
        		table = new JTable(info.showMus(),mus);
        		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        		table.setBackground(Color.LIGHT_GRAY);
        		table.setBounds(11, 11, 405, 345);
        		scrollPane.setViewportView(table);
        		layeredPane.add(scrollPane,0);
        		
            }
        });
		
		clearRadio();
	}
	
	public void instruPrint() {
		
		instbtn.addItemListener((ItemEvent a) -> {
            if (a.getStateChange() == ItemEvent.SELECTED) {
                
            	//Table portion of code
        		table = new JTable(info.showInst(),inst);
        		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        		table.setBackground(Color.LIGHT_GRAY);
        		table.setBounds(11, 11, 405, 345);
        		scrollPane.setViewportView(table);
        		layeredPane.add(scrollPane,0);
        		
            }
        });
		
		clearRadio();
	}
	
	public void albumPrint() {
		
		albumbtn.addItemListener((ItemEvent a) -> {
            if (a.getStateChange() == ItemEvent.SELECTED) {
                
            	//Table portion of code
        		table = new JTable(info.showAlbum(),album);
        		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        		table.setBackground(Color.LIGHT_GRAY);
        		table.setBounds(11, 11, 405, 345);
        		scrollPane.setViewportView(table);
        		layeredPane.add(scrollPane,0);
        		
            }
        });
		
		clearRadio();
	}
	
	//method to be excuted when add button is clicked
	public void add() {
		
		//creates input text fields
		ablumTitField = new JTextField();
		addressField = new JTextField();
		ArtField = new JTextField();
		phoneField = new JTextField();
		InstruIdField = new JTextField();
		instruNamField = new JTextField();
		InstruKeyField = new JTextField();
		albumIDField = new JTextField();
		copyrightField = new JTextField();
		speedField = new JTextField();
		songTitField = new JTextField();
		songIDField = new JTextField();
		
		//panel that hold all text fields
		layeredPane.add(scrollPane_1,0);
			
		//ssn input textbox
		ssnField = new JTextField();
		ssnField.setBounds(84, 11, 155, 20);
		scrollPane_1.add(ssnField,0);
		ssnField.setColumns(10);
		ssnField.setUI(new HintTextFieldUI("Example: 123456789 ", true));//hint text
		
		//name input textbox 
		nameField = new JTextField();
		nameField.setBounds(84, 42, 149, 20);
		scrollPane_1.add(nameField,0);
		nameField.setColumns(10);

		
		//label ssn
		txtpnSsn.setBackground(SystemColor.activeCaption);
		txtpnSsn.setText("SSN:");
		txtpnSsn.setBounds(10, 11, 39, 20);
		scrollPane_1.add(txtpnSsn,0);
		
		//label name
		txtpnName.setBackground(SystemColor.activeCaption);
		txtpnName.setText("Name:");
		txtpnName.setBounds(10, 42, 39, 20);
		scrollPane_1.add(txtpnName,0);
		
		//label address
		txtpnAddress.setBackground(SystemColor.activeCaption);
		txtpnAddress.setText("Address:");
		txtpnAddress.setBounds(10, 135, 61, 20);
		scrollPane_1.add(txtpnAddress,0);
		
		//label phone
		txtpnPhone.setBackground(SystemColor.activeCaption);
		txtpnPhone.setText("Phone:");
		txtpnPhone.setBounds(10, 104, 51, 20);
		scrollPane_1.add(txtpnPhone,0);
		
		//label artistname
		txtpnArtistName.setBackground(SystemColor.activeCaption);
		txtpnArtistName.setText("Artist Name:");
		txtpnArtistName.setBounds(10, 73, 74, 20);
		scrollPane_1.add(txtpnArtistName,0);
		
		//label instrument id
		txtpnInstrumentId.setBackground(SystemColor.activeCaption);
		txtpnInstrumentId.setText("Instrument Id:");
		txtpnInstrumentId.setBounds(10, 166, 86, 20);
		scrollPane_1.add(txtpnInstrumentId,0);
		
		//label instrument name
		txtpnInstrumentName.setBackground(SystemColor.activeCaption);
		txtpnInstrumentName.setText("Instrument Name:");
		txtpnInstrumentName.setBounds(10, 197, 110, 20);
		scrollPane_1.add(txtpnInstrumentName,0);
		
		//label instrument key
		txtpnInstrumentKey.setBackground(SystemColor.activeCaption);
		txtpnInstrumentKey.setText("Instrument Key:");
		txtpnInstrumentKey.setBounds(10, 228, 95, 20);
		scrollPane_1.add(txtpnInstrumentKey,0);
		
		//label album title
		txtpnAlbumTitle.setBackground(SystemColor.activeCaption);
		txtpnAlbumTitle.setText("Album Title:");
		txtpnAlbumTitle.setBounds(10, 259, 74, 20);
		scrollPane_1.add(txtpnAlbumTitle,0);
		
		//label album id
		txtpnAlbumId.setBackground(SystemColor.activeCaption);
		txtpnAlbumId.setText("Album ID:");
		txtpnAlbumId.setBounds(10, 290, 67, 20);
		scrollPane_1.add(txtpnAlbumId,0);
		
		//label copyright
		txtpnCopyrightDate.setBackground(SystemColor.activeCaption);
		txtpnCopyrightDate.setText("CopyRight:");
		txtpnCopyrightDate.setBounds(260, 11, 86, 20);
		scrollPane_1.add(txtpnCopyrightDate,0);
		
		
		txtpnSpeedOfAlbum.setBackground(SystemColor.activeCaption);
		txtpnSpeedOfAlbum.setText("Album SPD:");
		txtpnSpeedOfAlbum.setBounds(260, 42, 86, 20);
		scrollPane_1.add(txtpnSpeedOfAlbum,0);
		
		
		txtpnSongTitle.setBackground(SystemColor.activeCaption);
		txtpnSongTitle.setText("Song Title:");
		txtpnSongTitle.setBounds(260, 73, 70, 20);
		scrollPane_1.add(txtpnSongTitle,0);
		

		txtpnSondId.setBackground(SystemColor.activeCaption);
		txtpnSondId.setText("Sond ID:");
		txtpnSondId.setBounds(260, 104, 61, 20);
		scrollPane_1.add(txtpnSondId,0);
		

		
		ArtField.setBounds(83, 73, 150, 20);
		scrollPane_1.add(ArtField,0);
		ArtField.setColumns(10);
		
		
		phoneField.setBounds(84, 104, 149, 20);
		scrollPane_1.add(phoneField,0);
		phoneField.setColumns(10);
		phoneField.setUI(new HintTextFieldUI("Example: 7084559889 ", true));
		

		
		addressField.setBounds(83, 135, 150, 20);
		scrollPane_1.add(addressField,0);
		addressField.setColumns(10);
		
		
		InstruIdField.setBounds(93, 166, 149, 20);
		scrollPane_1.add(InstruIdField,0);
		InstruIdField.setColumns(10);
		InstruIdField.setUI(new HintTextFieldUI("Example: 123456789 ", true));
		
		
		instruNamField.setBounds(113, 197, 160, 20);
		scrollPane_1.add(instruNamField,0);
		instruNamField.setColumns(10);
		
		
		InstruKeyField.setBounds(105, 228, 160, 20);
		scrollPane_1.add(InstruKeyField,0);
		InstruKeyField.setColumns(10);
		InstruKeyField.setUI(new HintTextFieldUI("i.e.: F,B-Flat,C ", true));

		
		ablumTitField.setBounds(84, 259, 168, 20);
		scrollPane_1.add(ablumTitField,0);
		ablumTitField.setColumns(10);
		
		
		albumIDField.setBounds(67, 290, 166, 20);
		scrollPane_1.add(albumIDField,0);
		albumIDField.setColumns(10);
		albumIDField.setUI(new HintTextFieldUI("i.e.: 123456789 ", true));
		
		
		copyrightField.setBounds(360, 11, 120, 20);
		scrollPane_1.add(copyrightField,0);
		copyrightField.setColumns(10);
		copyrightField.setUI(new HintTextFieldUI("YYYY-MM-DD ", true));

		
		speedField.setBounds(370, 42, 120, 20);
		scrollPane_1.add(speedField,0);
		speedField.setColumns(10);
		speedField.setUI(new HintTextFieldUI("i.e.: 7 ", true));
		
		
		songTitField.setBounds(324, 73, 176, 20);
		scrollPane_1.add(songTitField,0);
		songTitField.setColumns(10);
		
		
		songIDField.setBounds(316, 104, 176, 20);
		scrollPane_1.add(songIDField,0);
		songIDField.setColumns(10);
		songIDField.setUI(new HintTextFieldUI("i.e.: 12 ", true));
		
		
		btnSubmit.setBounds(403, 308, 89, 23);
		scrollPane_1.add(btnSubmit);
		btnSubmit.setVisible(true);
		
		
		addComfirm();
		
	}
	
	public void addComfirm() {
		
		btnSubmit.addActionListener(new ActionListener() {
			
			String ssn,name,artist,phone,
				address,instruid,instru,instruKey,
				albTit,albId,copy,songTit;
			
			int songid= 0,speed = 0;
			
			String code = "cs430@SIUC";
			
			JTextField codeField = new JTextField();
			
			Object[] inputField = {"Please enter the password ", codeField};
			
			
			public void actionPerformed(ActionEvent e) {
				
					
				 @SuppressWarnings("unused")
					int result3 = JOptionPane.showConfirmDialog(null, inputField,
						        "Passcode", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				 
				 if(code.equals(codeField.getText())!= false) {
				
							ssn = ssnField.getText();name = nameField.getText();
							artist = ArtField.getText(); phone = phoneField.getText();
							address = addressField.getText(); instruid = InstruIdField.getText();
							instru = instruNamField.getText(); instruKey = InstruKeyField.getText();
							albTit = ablumTitField.getText(); albId = albumIDField.getText(); 
							copy = copyrightField.getText(); songTit = songTitField.getText();
							
							if(songIDField.getText().length() != 0)
								songid = Integer.parseInt(songIDField.getText());
							
							if(speedField.getText().length() != 0)
								speed = Integer.parseInt(speedField.getText());
							
							if(ssn != null && name != null)
								db.addMus(ssn,name);
							
							if(instruid != null && instru != null && instruKey != null)
								db.addInst(instruid, instru, instruKey);
							
							if(ssn != null && instruid != null)
								db.addPlay(ssn, instruid);
							
							if(ssn != null && copy != null && artist != null && speed <= 0 && albId != null&& albTit != null)
								db.addAlbum(albId, ssn, artist, copy, speed, albTit);
							
							if(songid <= 0 && artist != null && songTit != null && albId != null)
								db.addSong(songid, artist, songTit, albId);
							
							if(address != null)
								db.addPla(address);
							
							
							if(phone != null && address != null)
								db.addPhone(phone, address);
							
							if(ssn != null && phone != null && address != null)
								db.addLive(ssn, phone, address);
							
							if(songid != 0 && ssn != null)
								db.addPerf(songid, ssn);
							
							
							infoBox();
							
					 	}else {
					 		
					 		@SuppressWarnings("unused")
							int result2 = JOptionPane.showConfirmDialog(null, "wrong password",
								        "ERROR", JOptionPane.ERROR_MESSAGE);
					 		
					 		}
			
				
				
			}
		});
		
	}
	
	//confirmation
	public void infoBox()
    {
        JOptionPane.showMessageDialog(null,"You are sucessfull" , "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
	
	
	
	//log in on-click for admin code
	public void loginAdmin() {
		
		adminbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			btnAdd.setVisible(true);
			btnModify.setVisible(true); 
			btnDelete.setVisible(true);
				
				
			}
		});
		
	}
	
	//log in on-click for member code
		public void loginMem() {
			
			membtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					btnAdd.setVisible(false);
					btnModify.setVisible(false); 
					btnDelete.setVisible(false);
					
					
				}
			});
			
		}
	
	
	//clear the selection of the radio
	public void clearRadio() {

		
		musbtn.setSelected(false);
		instbtn.setSelected(false);
		albumbtn.setSelected(false);
		performbtn.setSelected(false);
		songbtn.setSelected(false);
		livebtn.setSelected(false);
		albumProbtn.setSelected(false);
		playbtn.setSelected(false);
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public notown_gui() {
		
		getContentPane().setBackground(SystemColor.activeCaption);
		setFont(new Font("Courier New", Font.BOLD, 12));
		getContentPane().setForeground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		getContentPane().setLayout(null);
		layeredPane.setBackground(SystemColor.activeCaption);
		
		//Layered panel size and adding it to JFame
		layeredPane.setBounds(37, 66, 502, 342);
		getContentPane().add(layeredPane);
		
		
		scrollPane_1.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setBounds(0, 0, 502, 342);
		
		layeredPane.add(scrollPane_1);
		
		
		//set button invisible
		btnAdd.setVisible(false);
		btnModify.setVisible(false); 
		btnDelete.setVisible(false);
				
				
		//scroll panel
		scrollPane.setBounds(0, 0, 502, 342);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		//radio btn set to unselected

		sortMen.add(playbtn);
		sortMen.add(musbtn);
		sortMen.add(instbtn);
		sortMen.add(livebtn);
		sortMen.add(albumProbtn);
		sortMen.add(albumbtn);
		sortMen.add(performbtn);
		sortMen.add(songbtn);
		
		logMen.add(adminbtn);
		logMen.add(membtn);
		
		adminbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		membtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		btnAdd.setForeground(Color.BLUE);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		//add button onclick
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				add();
				
				
			}
		});
		
		
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		
			
				
				//log in button onclick
				btnLogIn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						logMen.show(btnLogIn, btnLogIn.getWidth(), btnLogIn.getHeight());
						loginAdmin();
						loginMem();
						
						
					}
				});
				
				
				btnLogIn.setBounds(10, 11, 89, 23);
				getContentPane().add(btnLogIn);
				btnLogIn.setBackground(Color.WHITE);
				btnLogIn.setForeground(Color.BLUE);
				
				
				
		btnAdd.setBounds(127, 11, 89, 23);
		getContentPane().add(btnAdd);
		btnSortBy.setForeground(Color.BLUE);
		btnSortBy.setBackground(Color.WHITE);
		btnSortBy.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		//sorting button onclick
		btnSortBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sortMen.show(btnSortBy, btnSortBy.getWidth(), btnSortBy.getHeight());
				
				musicianPrint();
				songPrint();
				instruPrint();
				albumPrint();
				songPerform();
				printAlbumPro();
				printLive();
				printAlbumPro();
				printPlay();
				
			}
		});
		btnSortBy.setBounds(450, 45, 89, 23);
		getContentPane().add(btnSortBy);
		btnModify.setForeground(Color.BLUE);
		btnModify.setBackground(Color.WHITE);
		btnModify.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		//Modify button onclick
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				window.modWindow();
				
				
			}
		});
		btnModify.setBounds(254, 11, 89, 23);
		getContentPane().add(btnModify);
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		//delete button onclick
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				window.deleWindow();
				
			}
		});
		btnDelete.setBounds(485, 11, 89, 23);
		getContentPane().add(btnDelete);
		btnClose.setForeground(Color.BLUE);
		btnClose.setBackground(Color.WHITE);
		btnClose.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		
		
		//close button onclick
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(485, 427, 89, 23);
		getContentPane().add(btnClose);
		btnSearch.setBackground(Color.WHITE);
		
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				window.searchMusWindow();
				
			}
		});
		btnSearch.setForeground(Color.BLUE);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearch.setBounds(373, 12, 89, 23);
		getContentPane().add(btnSearch);	
		
	}
}
