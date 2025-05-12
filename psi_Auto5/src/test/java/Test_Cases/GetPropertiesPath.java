package Test_Cases;

import java.io.File;

public class GetPropertiesPath {
	
	
	public static void main (String args[]) {
		
		String path = new File("/psi_Auto5/src/test/resources/Properties/Config.properties").getAbsolutePath();
		System.out.println("Absolute path: " + path);

	}

}
