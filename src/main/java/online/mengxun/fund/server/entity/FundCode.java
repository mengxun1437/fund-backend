package online.mengxun.fund.server.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class FundCode {
  @Id private String id;
  private String fundCode;
  private String fundName;
  private String fundType;
}
