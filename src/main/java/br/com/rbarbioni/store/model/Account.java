package br.com.rbarbioni.store.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by renan on 16/12/15.
 */

@Entity
public class Account extends DomainEntity {

    private String username;

    private String email;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
