package com.example.restfulwebservice.user;

import com.example.restfulwebservice.user.User;
import com.example.restfulwebservice.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        com.example.restfulwebservice.user.User user = userRepository.findByEmail(email)
                .orElseThrow(()->new UserNotFoundException(email));
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(Role.USER.getValue()));
        if(email.equals("boyung1021@naver.com")){
       // if(user.getRole().equals("celebrity)
            grantedAuthorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        }

        return new org.springframework.security.core.userdetails
                .User(user.getEmail(), user.getUser_password(), grantedAuthorities);
    }

    public User authenticateByEmailAndPassword(String email, String password){
        com.example.restfulwebservice.user.User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(email));

        if(!passwordEncoder.matches(password, passwordEncoder.encode(user.getUser_password()))){
            throw new BadCredentialsException("Password not matched");
        }

        return user;
    }
}
