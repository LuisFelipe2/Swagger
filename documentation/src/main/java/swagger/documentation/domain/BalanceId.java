package swagger.documentation.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BalanceId {

	@Size(max = 10)
	@NotBlank
	@Pattern(regexp="^[0-9]+$", message="the value must be positive integer")
	private String id;
}
