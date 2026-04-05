//package org.example.trungcapphuongnam.config.security;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.io.IOException;
//
//@Component
//public class OAuth2AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//    // Tiêm class tạo JWT Token của ông vào (trong package jwt_dangnhap)
//    // private final JwtTokenProvider jwtTokenProvider;
//
//    // Thay bằng URL chạy VueJS của ông (thường là http://localhost:5173 hoặc 8080)
//    private final String frontendUrl = "http://localhost:5173/oauth2/redirect";
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//
//        // 1. Lấy thông tin user vừa đăng nhập thành công
//        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
//        String email = oAuth2User.getAttribute("email");
//
//        // 2. Dùng tool JWT của ông gen ra token dựa vào email/role
//        // String token = jwtTokenProvider.generateToken(email);
//        String token = "day_la_chuoi_jwt_token_demo_cua_ong"; // Nhớ thay bằng code thật
//
//        // 3. Gắn token vào URL và chuyển hướng về VueJS
//        String targetUrl = UriComponentsBuilder.fromUriString(frontendUrl)
//                .queryParam("token", token)
//                .build().toUriString();
//
//        getRedirectStrategy().sendRedirect(request, response, targetUrl);
//    }
//}