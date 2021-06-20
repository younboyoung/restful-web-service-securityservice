package com.example.restfulwebservice.login;

import com.example.restfulwebservice.config.JwtTokenUtil;
import com.example.restfulwebservice.user.JwtUserDetailsService;
import com.example.restfulwebservice.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception{
        final User user = jwtUserDetailsService.authenticateByEmailAndPassword(
                authenticationRequest.getEmail(), authenticationRequest.getPassword());
        final String token = jwtTokenUtil.generateToken(user.getEmail());
        return ResponseEntity.ok(new JwtResponse(token));
    }

}


