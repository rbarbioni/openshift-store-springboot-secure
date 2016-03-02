package br.com.rbarbioni.store;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by renan on 17/12/15.
 */
public class Test {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        Map headers = new HashMap();
        headers.put("Authorization", "Basic cmJhcmJpb25pOnJlbmFu");

        HttpEntity httpEntity = new HttpEntity( headers );
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://192.168.2.169:8080/api/product", String.class, httpEntity);

    }
}
