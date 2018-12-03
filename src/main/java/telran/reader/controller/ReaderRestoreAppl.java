package telran.reader.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import telran.reader.model.Reader;

public class ReaderRestoreAppl {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String json = "[{\"id\":100,\"name\":\"Peter\",\"birthYear\":1988,\"lovedBooks\":[\"Book1\",\"Book2\"]},{\"id\":200,\"name\":\"Tigran\",\"birthYear\":1986,\"lovedBooks\":[\"Book3\",\"Book4\"]}]";
		List<Reader> readers = 
				mapper.readValue(new File("readers.json"),
						new TypeReference<List<Reader>>() {
						});
			
//		Reader[] readers = mapper.readValue(json, Reader[].class);
		readers.stream().forEach(System.out::println);

	}

}
