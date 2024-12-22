package day14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDriverMultiplePtoducts {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	  ObjectMapper objectMapper = new ObjectMapper();

      File file = new File("D:/JSONData/allproducts.json");

      List<Product> products = Arrays.asList(objectMapper.readValue(file, Product[].class));
      for(Product product:products)
    	 System.out.println(product);
}
}
