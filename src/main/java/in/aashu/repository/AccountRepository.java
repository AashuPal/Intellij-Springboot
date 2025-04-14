package in.aashu.repository;

import in.aashu.entity.Account;
import in.aashu.entity.AccountPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountPk> {
    // Custom query methods can be defined here if needed

}
