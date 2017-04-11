
package example;

import java.io.IOException;

import org.apache.commons.lang.WordUtils;

public class Hello {


	public static void main(String[] args) {
        	String  message = "hello ivy !";
		System.out.println("standard message : " + message);
		System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
		int monmax = 0;
		try {
			CSVReader reader = new CSVReader(new FileReader("data.csv"));
		
			List<String[]> myEntries = reader.readAll();
			while (reader.hasNext()){

				int number = reader.next();
				if (!number.equals("")){
					int temp = Integer.parseInt(number);
					System.out.println("Nombre lu : " +temp);

					if(temp > monmax){
						monmax = temp;
					}
				}
			}
			reader.close();			
		} catch (IOException e){
			System.out.println("Parse ERROR");
		}
		
		System.out.println("Nombre maximum : " + monmax);

	}
}
        

