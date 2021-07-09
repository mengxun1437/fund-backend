package online.mengxun.fund.server.repository;

import online.mengxun.fund.server.entity.NetWorth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NetWorthRepository extends JpaRepository<NetWorth, String> {
  List<NetWorth> findAllByFundCode(String stockCode);
}
