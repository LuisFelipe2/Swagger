package swagger.documentation.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import swagger.documentation.domain.Balance;
import swagger.documentation.domain.BalanceId;

import java.util.List;

@RestController
@RequestMapping("/investments")
public class InvestmentsController {

	@GetMapping("/balances")
	public Page<List<Balance>> getBalances(@RequestParam(
		                                value = "page",
		                                required = false,
		                                defaultValue = "0") int page,
	                                      @RequestParam(
		                                value = "size",
		                                required = false,
		                                defaultValue = "10") int size) {

		List<Balance> balanceList = List.of(new Balance());

		return Page.empty();
	}

	@GetMapping("/balances/{BalanceId}")
	public Balance getBalance(@PathParam("id") BalanceId id) {

		return new Balance();
	}
}
