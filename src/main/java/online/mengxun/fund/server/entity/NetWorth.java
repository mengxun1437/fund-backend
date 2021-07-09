package online.mengxun.fund.server.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class NetWorth {
  @Id private String id;
  private String fundCode;
  private Date fundDate;
  private String fundDwjz;
  private String fundLjjz;
}
