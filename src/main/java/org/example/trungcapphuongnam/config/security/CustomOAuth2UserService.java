package org.example.trungcapphuongnam.config.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oauth2User = super.loadUser(userRequest);
        Map<String, Object> attributes = oauth2User.getAttributes();

        String email = (String) attributes.get("email");

        if (email == null || email.isBlank()) {
            throw new OAuth2AuthenticationException(
                    new OAuth2Error("email_not_found"),
                    "Không lấy được email từ Google"
            );
        }

        /*
         TODO:
         Ở đây kiểm tra DB:
         - Nếu email đã có tài khoản: load role thật.
         - Nếu chưa có: tạo tài khoản mới hoặc chặn đăng nhập.
        */

        List<GrantedAuthority> authorities = List.of(
                new SimpleGrantedAuthority("ROLE_SINH_VIEN")
        );

        return new DefaultOAuth2User(authorities, attributes, "email");
    }
}