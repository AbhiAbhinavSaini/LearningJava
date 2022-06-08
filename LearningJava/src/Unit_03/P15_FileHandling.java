package Unit_03;

import java.io.BufferedReader;

public class P15_FileHandling {
	public static void main(String[] args) {
	ABC3 obj = new ABC3();
		obj.takeInputFromAFileNoteFromConsole();
		//obj.saveOutputIntoAFile();
		//obj.createALogFile();
	}
}
class ABC3{
	void takeInputFromAFileNoteFromConsole() {
		String path = "Input.txt";
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st = br.readLine()) != null) {
			System.out.println(st);
		}//list that holds strings of a file
		List<String> listofStrings=new ArrayList<String>();
		
		//read entire line as string
		String line = br.readLine();
		
		while(line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}
		for(String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
	}
	void saveOutputIntoAFile() {
		
	}
	void createALogFile() {
		
	}
	
	
}
