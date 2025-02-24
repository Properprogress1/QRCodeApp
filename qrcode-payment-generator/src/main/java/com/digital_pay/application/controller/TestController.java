package com.digital_pay.application.controller;

import com.digital_pay.application.entity.Merchant;
import com.digital_pay.application.entity.User;
import com.digital_pay.application.repository.MerchantRepository;
import com.digital_pay.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MerchantRepository merchantRepository;

    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> getStatus() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "running");


        List<User> users = userRepository.findAll();
        response.put("userCount", users.size());
        response.put("users", users);


        List<Merchant> merchants = merchantRepository.findAll();
        response.put("merchantCount", merchants.size());
        response.put("merchants", merchants);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/init-data")
    public ResponseEntity<Map<String, Object>> initData() {
        Map<String, Object> response = new HashMap<>();


        if (!userRepository.existsById(1L)) {
            User user = new User();
            user.setId(1L);
            user.setBalance(new BigDecimal("1000.00"));
            userRepository.save(user);
            response.put("userCreated", true);
        } else {
            response.put("userCreated", false);
        }


        if (!merchantRepository.existsById(12345L)) {
            Merchant merchant = new Merchant();
            merchant.setId(12345L);
            merchant.setBalance(new BigDecimal("1000.00"));
            merchantRepository.save(merchant);
            response.put("merchantCreated", true);
        } else {
            response.put("merchantCreated", false);
        }

        return ResponseEntity.ok(response);
    }
}