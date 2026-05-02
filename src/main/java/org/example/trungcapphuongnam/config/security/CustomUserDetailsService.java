package org.example.trungcapphuongnam.config.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        if (email == null || email.isBlank()) {
            throw new UsernameNotFoundException("Email không hợp lệ");
        }

        /*
         TODO:
         Sau này thay đoạn dưới bằng DB:

         TaiKhoan taiKhoan = taiKhoanRepository.findByEmail(email)
             .orElseThrow(() -> new UsernameNotFoundException("Không tìm thấy tài khoản: " + email));

         return new User(
             taiKhoan.getEmail(),
             taiKhoan.getMatKhau(),
             List.of(new SimpleGrantedAuthority("ROLE_" + taiKhoan.getVaiTro().name()))
         );
        */

        return new User(
                email,
                "",
                List.of(new SimpleGrantedAuthority("ROLE_SINH_VIEN"))
        );
    }
}