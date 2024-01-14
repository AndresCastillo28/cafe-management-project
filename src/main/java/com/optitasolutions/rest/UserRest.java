package com.optitasolutions.rest;

import com.optitasolutions.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/user")
public interface UserRest {

    @PostMapping(path = "/signup")
    ResponseEntity<String> signUp(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping
    ResponseEntity<List<UserWrapper>> getAllUser();

    @PutMapping
    ResponseEntity<String> update(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/check-token")
    ResponseEntity<String> checkToken();

    @PostMapping(path = "/change-password")
    ResponseEntity<String> changePassword(@RequestBody Map<String, String> requestMap);

    @PostMapping(path = "/forgot-password")
    ResponseEntity<String> forgotPassword(@RequestBody Map<String, String> requestMap);

}
