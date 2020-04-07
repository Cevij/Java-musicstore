import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class dialog_window extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	db info = new db();
	
	public void searchMusWindow() {
		
		 
		JTextField tableField = new JTextField();
		JTextField item = new JTextField();
		 
		 
		 Object[] inputFields = {
				 "*Tables are as followed: Musicians, Album_Producer, Songs_Appears*", null,
				 "*no results will show if rule is not followed*", null,
				 	"Enter the table you like to search:", tableField,
	                "Enter entery you would like it to search: ", item};
		

		 int result = JOptionPane.showConfirmDialog(null, inputFields,
		        "Search", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		    
		 if (result == JOptionPane.OK_OPTION) {
			 
			 if(item.getText().length() == 0 || tableField.getText().length() == 0) {
				 
				 @SuppressWarnings("unused")
				int result2 = JOptionPane.showConfirmDialog(null, "Please fill in all fields",
					        "ERROR", JOptionPane.ERROR_MESSAGE);
				 
			 }else {
				 
				 	if(tableField.getText().equalsIgnoreCase("musicians")!=false) {
				 	
				 			Object[] cols = {"SSN","Name"};
				 			JTable table = new JTable(db.searchMus(item.getText()), cols);
				 			JOptionPane.showMessageDialog(null, new JScrollPane(table));
				 		
				 	}
				 	
				 	if(tableField.getText().equalsIgnoreCase("Album_Producer")!=false) {
				 		
				 		Object[] cols = { "Album ID","Copy-right","Speed","Title"};
			 			JTable table = new JTable(db.searchAlbum(item.getText()), cols);
			 			JOptionPane.showMessageDialog(null, new JScrollPane(table));
				 		
				 	}
				 	
				 	if(tableField.getText().equalsIgnoreCase("Songs_Appears")!=false) {
				 		
				 		Object[] cols = {"Song ID","Author","Title","Album ID"};
			 			JTable table = new JTable(db.searchSong(item.getText()), cols);
			 			JOptionPane.showMessageDialog(null, new JScrollPane(table));
				 		
				 	}
				 
				 
			 }
	
	    }


}

	
		public void modWindow() {
			
			 
			String code = "cs430@SIUC"; 
			JTextField itemField = new JTextField();
			JTextField changField = new JTextField();
			JTextField tableField = new JTextField();
			JTextField typeField = new JTextField();
			JTextField codeField = new JTextField();
			 
			 
			 Object[] inputFields = {"*Note all entries can't be modified", null,
					 	"Enter the table you like to modifiy from:", tableField,
		                "Enter the column name you would like to modifiy from: ", typeField,
		                "Enter entery you would like to change: ", changField,
		                "Enter entery you would like it to change to: ", itemField};
			 
			 Object[] inputField = {"Please enter the password ", codeField};
			
	
			 int result = JOptionPane.showConfirmDialog(null, inputFields,
			        "MODIFIY", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			    
			 if (result == JOptionPane.OK_OPTION) {
				 
				 if(typeField.getText().length() == 0 || tableField.getText().length() == 0 || changField.getText().length() == 0
						 || itemField.getText().length() == 0) {
					 
					 @SuppressWarnings("unused")
					int result2 = JOptionPane.showConfirmDialog(null, "Please fill in all fields",
						        "ERROR", JOptionPane.ERROR_MESSAGE);
					 
				 }else {
					 
					 @SuppressWarnings("unused")
						int result3 = JOptionPane.showConfirmDialog(null, inputField,
							        "Passcode", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
					 if(code.equals(codeField.getText())!= false) {
					 
						 		db.mod(tableField.getText(), typeField.getText(), changField.getText(), itemField.getText());
					 
						 		@SuppressWarnings("unused")
						 		int result2 = JOptionPane.showConfirmDialog(null, "Modification was sucessful",
						 				"Complete", JOptionPane.INFORMATION_MESSAGE);
						 		
						 	}else {
						 		
						 		@SuppressWarnings("unused")
								int result2 = JOptionPane.showConfirmDialog(null, "wrong password",
									        "ERROR", JOptionPane.ERROR_MESSAGE);
						 		
						 		}
					 
				 }
		
		    }
	

	}
		
		public void deleWindow() {
			
			 
			String code = "cs430@SIUC";
			JTextField deleField = new JTextField();
			JTextField tableField = new JTextField();
			JTextField typeField = new JTextField();
			JTextField codeField = new JTextField();
			 
			 
			 Object[] inputFields = {"*Note all entries can't be modified*", null,
					 "Enter the table you like to remove from:", tableField,
		                "Enter the column name you would like to remove from: ", typeField,
		                "Enter entery you would like to remove: ", deleField};
			 
			 Object[] inputField = {"Please enter the password ", codeField};
			
	
			 int result = JOptionPane.showConfirmDialog(null, inputFields,
			        "DELETE", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			    
			 if (result == JOptionPane.OK_OPTION) {
				 
				 if(deleField.getText().length() == 0 || tableField.getText().length() == 0 || typeField.getText().length() == 0) {
					 
					 @SuppressWarnings("unused")
					int result2 = JOptionPane.showConfirmDialog(null, "Please fill in all fields",
						        "ERROR", JOptionPane.ERROR_MESSAGE);
					 
				 }else {
					 

					int result3 = JOptionPane.showConfirmDialog(null, inputField,
						        "Passcode", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
					 
					 if (result3 == JOptionPane.OK_OPTION) {
					 	
						 if(code.equals(codeField.getText())!= false) {
					 		
					 	
					 		db.delete(tableField.getText(), typeField.getText(), deleField.getText());
					 
					 		@SuppressWarnings("unused")
					 		int result2 = JOptionPane.showConfirmDialog(null, "Deletion was sucessful",
					 				"Complete", JOptionPane.INFORMATION_MESSAGE);
					 		}	else {
					 		
					 		@SuppressWarnings("unused")
							int result2 = JOptionPane.showConfirmDialog(null, "wrong password",
								        "ERROR", JOptionPane.ERROR_MESSAGE);
					 		
					 		}
					 	}
					 }
		
		    }
	

	}
		
		
	
}
