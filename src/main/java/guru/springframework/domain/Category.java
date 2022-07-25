package guru.springframework.domain;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Category {
  private String id;
  private String description;

  @DBRef private Set<Recipe> recipes;
}
