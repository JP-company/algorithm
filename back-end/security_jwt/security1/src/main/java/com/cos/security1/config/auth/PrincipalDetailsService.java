package com.cos.security1.config.auth;

import com.cos.security1.model.User;
import com.cos.security1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


// 시큐리티 설정에서 loginProcessingUrl("/login");
// login 요청이 오면 자동으로 UserDetailsService 타입으로 IoC되어 있는 loadUserByUsername 메서드가 실행된다.
@Service
public class PrincipalDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    // 시큐리티 session(내부 Authentication(내부 UserDetails))
    @Override
    // '/login' POST 에서 받는 폼 input 태그의 name 과 loadUserByUsername() 메서드의 파라미터가 같아야 한다.
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username = " + username);
        User userEntity = userRepository.findByUsername(username);
        System.out.println("userEntity = " + userEntity);
        if (userEntity != null) {
            PrincipalDetails principalDetails = new PrincipalDetails(userEntity);
            System.out.println("principalDetails.getUsername() = " + principalDetails.getUsername());
            System.out.println("principalDetails.getPassword() = " + principalDetails.getPassword());
            System.out.println("principalDetails.getAuthorities() = " + principalDetails.getAuthorities());
            return principalDetails;
        }
        return null;
    }
}
