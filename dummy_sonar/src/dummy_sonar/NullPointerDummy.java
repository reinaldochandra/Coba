package dummy_sonar;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NullPointerDummy {
	
	private boolean evaluate = true;
	
	public void Evaluate(){
		this.evaluate = true;
		if(this.evaluate){
			//Do Something
		}
	}
	
	String getName() {
		return "REI";
	}
	
	public boolean CheckForNull(){
		if(getName().isEmpty()){
			return true;
		}
		return false;
	}
	

	
	public void CheckForNullTryCatch() throws SQLException{
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection("","","");
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		
			if(stmt != null && conn != null){
				stmt.close();
				conn.close();
			}
		}
		
	}
	
	public boolean equals(Object obj){
		// Do Something
		return true;
	}
	
	public int hashCode(){
		// Do Something
		return 0;
		
	}
	
	
	public void CheckStream() throws IOException{
		
		OutputStream stream = null;
		try{
		  stream = new FileOutputStream("myfile.txt");

		}catch(Exception e){
		  // ...
		}
		stream.flush();
	}
	
	public void FileWrite() throws IOException{
		
		File qCSorterFile = new File("");
		FileWriter fw = new FileWriter(qCSorterFile, false);
		fw.write("");
		fw.flush();
		fw.close();
		
	}
	
	public String getContentsFromFile(String fileName, String eolDelimiter,String info) {
		String sql = null;
		StringBuffer sqlBuff = new StringBuffer();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			// Do Something
		} catch (FileNotFoundException e) {
			// Do Something
		} catch (IOException e) {
			// Do Something
		}
		
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			String message = null;
		      while ( (message = input.readLine()) != null) {
		        sqlBuff.append(message).append(eolDelimiter);
		      }
		      sql = sqlBuff.toString();
	    }
	    catch (Exception ex) {
	      //System.out.println("The file '" + fileName +
	      //                   "' couldn't be found. " + info);
	      ex.printStackTrace();
	    }
	    return sql;
	  }	
	
}

