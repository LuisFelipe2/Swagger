package swagger.documentation.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Balance {

	private BalanceId balanceId;
	private BigDecimal totalValue;
	private BigDecimal currentValue;
	private BigDecimal maxValue;
	private BigDecimal minValue;
	private int timeInterval;
	private boolean isFalling;
}
