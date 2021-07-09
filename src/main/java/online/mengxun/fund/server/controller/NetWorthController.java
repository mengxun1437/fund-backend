package online.mengxun.fund.server.controller;

import online.mengxun.fund.server.repository.NetWorthRepository;
import online.mengxun.fund.server.response.Response;
import online.mengxun.fund.server.utils.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/net_worth")
public class NetWorthController {

  @Autowired private NetWorthRepository netWorthRepository;

  @GetMapping("/{fundCode}")
  public Response getNetWorthByfundCode(@PathVariable String fundCode) {
    if (!Check.CheckValid_FundCode(fundCode)) return Response.error("fund code length error");
    try {
      return Response.success(netWorthRepository.findAllByFundCode(fundCode));
    } catch (Exception e) {
      e.printStackTrace();
      return Response.error();
    }
  }
}
