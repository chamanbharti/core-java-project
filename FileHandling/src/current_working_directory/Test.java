package current_working_directory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	
	public static void main(String[] args) {
		
		//step 1
		String currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println(currentWorkingDirectory);
		
		// step 2
		Path currentWorkingDir = Paths.get("").toAbsolutePath();
		System.out.println(currentWorkingDir);
		System.out.println(currentWorkingDir.normalize().toString());
		
		
	}

}
