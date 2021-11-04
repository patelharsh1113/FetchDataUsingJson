import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {

	public static void main(String[] args) {
		
	        ObjectMapper mapper = new ObjectMapper();

	        try {
	        	
			// ArrayList<Movie>response = mapper.readValue(new File("data.json"), Movie.class);
	        	
	        	
	        	Movie1[] res = mapper.readValue(new File("data.json"), Movie1[].class);
				for(Movie1 m : res)
				{
					System.out.println("Movie name :"+m.title);
				}
				System.out.print("Thiss is in new branch");
			} catch (StreamReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatabindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	}

}
