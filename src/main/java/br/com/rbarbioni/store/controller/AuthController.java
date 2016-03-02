package br.com.rbarbioni.store.controller;

import br.com.rbarbioni.store.Constants;
import br.com.rbarbioni.store.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by renan on 16/12/15.
 */

@RestController
@RequestMapping(value= Constants.API + "auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(method= RequestMethod.GET)
    public String auth( ){
        return "SERVIÇO NÃO SEGURO";
    }
}
