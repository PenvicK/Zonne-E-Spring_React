package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.UserTesteDTO;
import com.zonnee.projetozonne.entities.UserTeste;
import com.zonnee.projetozonne.config.jwt.JwtUtil;
import com.zonnee.projetozonne.repositories.UserTesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserTesteRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
    }

    public UserTesteDTO addNewUser(UserTeste user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        UserTeste result = userRepository.save(user);
        return new UserTesteDTO(result);
    }
//    @Override //teste
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        return new User("foo", "foo", new ArrayList<>());
//    }
}
