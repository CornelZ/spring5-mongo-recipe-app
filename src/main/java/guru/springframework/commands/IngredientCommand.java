package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;

/** Created by jt on 6/21/17. */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class IngredientCommand {
  private String id;
  private String recipeId;
  private String description;
  private BigDecimal amount;
  private UnitOfMeasureCommand uom;
}
