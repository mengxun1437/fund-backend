package online.mengxun.fund.server.utils;

public class Check {
  public static boolean CheckValid_FundCode(String stockCode) {
    return stockCode.length() == 6;
  }
}
