package Controller;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Staff;

public class Jackson2 {
	public static void main(String[] args) {
		Jackson2 obj = new Jackson2();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			Staff staff = mapper.readValue(new File("staff.json"), Staff.class);
			System.out.println(staff);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
