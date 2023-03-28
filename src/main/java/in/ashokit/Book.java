package in.ashokit;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Book {
	private Integer BookId;
	private String BookName;
	private Double BookPrice;

}
