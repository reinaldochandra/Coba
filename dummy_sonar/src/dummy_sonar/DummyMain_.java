package dummy_sonar;

import java.awt.Menu;
import java.beans.Transient;
import java.io.ObjectInputStream.GetField;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.jmx.LoggerDynamicMBean;


public class DummyMain {
	
	public static final Logger log = Logger.getLogger("");
	
	private static final Logger Log = Logger.getLogger( DummyMain.class.getName() );
	
	public static void main(String args[]){
		try {
			// block 1
			System.out.println("Block 1");
		} catch (Exception e) {
			Log.info(e);
		}
		
		try {
			// block 2
			System.out.println("Block 2");
		} catch (Exception e) {
			Log.info(e);
		}
		
		try {
			// Do Something
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void doBuildLeftMenu(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("leftMenu") == null) {
			public final transient List<String> messages = (List) request.getSession().getAttribute("");
		    request.getSession().setAttribute("leftMenu", messages);
		}
	}
	
}
