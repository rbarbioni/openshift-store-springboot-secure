package br.com.rbarbioni.store.repository;

import br.com.rbarbioni.store.model.Account;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by root on 10/12/15.
 */


public interface AccountRepository extends DomainRepository<Account> {

    @Query("SELECT o FROM #{#entityName} o WHERE o.username=?1 OR o.email=?1")
    public Account find ( String usernameOrEmail);
}
