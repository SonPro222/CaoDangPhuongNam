//package org.example.trungcapphuongnam.config.security;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
//import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
//import org.springframework.security.oauth2.core.OAuth2Error;
//import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Service;
//// Nhớ import các class NguoiDungRepository và NguoiDung của ông vào đây
//
//import java.util.Collections;
//import java.util.Map;
//
//@Service
//public class CustomOAuth2UserService extends DefaultOAuth2UserService {
//
//    // Tiêm Repository của ông vào đây để query DB
//    // private final NguoiDungRepository nguoiDungRepository;
//
//    @Override
//    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
//        // 1. Lấy thông tin user từ Google
//        OAuth2User oAuth2User = super.loadUser(userRequest);
//        Map<String, Object> attributes = oAuth2User.getAttributes();
//
//        // 2. Lấy email từ Google
//        String email = (String) attributes.get("email");
//
//        if (email == null) {
//            throw new OAuth2AuthenticationException(new OAuth2Error("email_not_found"), "Không lấy được email từ Google");
//        }
//
//        // 3. BẢO MẬT: Kiểm tra email có tồn tại trong hệ thống (DB) hay không?
//        // NguoiDung nguoiDung = nguoiDungRepository.findByEmail(email)
//        //         .orElseThrow(() -> new OAuth2AuthenticationException(
//        //                 new OAuth2Error("unauthorized"), "Email này chưa được Phòng Đào Tạo cấp quyền!"));
//
//        // 4. Lấy quyền (Role) từ DB ghép vào Spring Security
//        // String roleName = "ROLE_" + nguoiDung.getVaiTro().toUpperCase();
//        String roleName = "ROLE_SINH_VIEN"; // Hardcode tạm để ông test, nhớ mở comment dòng trên
//        GrantedAuthority authority = new SimpleGrantedAuthority(roleName);
//
//        // 5. Trả về đối tượng User cho Spring Security quản lý
//        return new DefaultOAuth2User(
//                Collections.singletonList(authority),
//                attributes,
//                "email" // Cột dùng làm key định danh chính là email
//        );
//    }
//}