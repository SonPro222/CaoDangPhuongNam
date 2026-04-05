//package org.example.trungcapphuongnam.config.security;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import java.util.Collections;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    // private final NguoiDungRepository repository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        // 1. Tìm người dùng trong bảng nguoi_dung bằng email
//        // NguoiDung user = repository.findByEmail(email)
//        //    .orElseThrow(() -> new UsernameNotFoundException("Không tìm thấy user: " + email));
//
//        // 2. Trả về đối tượng User của Spring Security kèm theo Role từ DB
//        return new User(
//                "user_email",
//                "user_password",
//                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
//        );
//    }
//}