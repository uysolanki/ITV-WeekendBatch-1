package day14;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDriverSingleProduct {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		 ObjectMapper objectMapper = new ObjectMapper();
		 File file = new File("D:/JSONData/singleproduct.json");
		 Product myproduct = objectMapper.readValue(file, Product.class);
		 System.out.println(myproduct);
	}

}
