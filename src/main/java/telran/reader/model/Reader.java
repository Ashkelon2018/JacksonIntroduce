package telran.reader.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class Reader {
	int id;
	String name;
	int birthYear;
	List<String> lovedBooks;
	
	@JsonIgnore
	public String getMostLovedBook() {
		return lovedBooks.get(0);
	}

}
