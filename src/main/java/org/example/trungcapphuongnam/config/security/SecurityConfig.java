//package org.example.trungcapphuongnam.config.security;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private final CustomOAuth2UserService customOAuth2UserService;
//    private final OAuth2AuthenticationSuccessHandler oAuth2AuthenticationSuccessHandler;
//
//    public SecurityConfig(CustomOAuth2UserService customOAuth2UserService, OAuth2AuthenticationSuccessHandler oAuth2AuthenticationSuccessHandler) {
//        this.customOAuth2UserService = customOAuth2UserService;
//        this.oAuth2AuthenticationSuccessHandler = oAuth2AuthenticationSuccessHandler;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//
//                // 1. Bật CORS để VueJS chọc vào không bị lỗi Cross-Origin
//                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
//
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/api/v1/auth/**", "/login", "/oauth2/**").permitAll()
//                        .anyRequest().permitAll()
//                )
//
//                // 2. Cấu hình luồng Google Login
//                .oauth2Login(oauth2 -> oauth2
//                        // URL trang Login tự thiết kế bên VueJS.
//                        // Khi backend cần đăng nhập, nó sẽ đá về trang này thay vì trang mặc định của Spring
//                        .loginPage("http://localhost:5173/login")
//
//                        .userInfoEndpoint(userInfo -> userInfo
//                                .userService(customOAuth2UserService) // Lắp class check DB vào
//                        )
//                        .successHandler(oAuth2AuthenticationSuccessHandler) // Lắp class gen JWT vào
//                );
//
//        return http.build();
//    }
//
//    // 3. Cấu hình chi tiết cho CORS (VueJS kết nối an toàn)
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("http://localhost:5173", "http://localhost:8080")); // URL của VueJS
//        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type", "Accept"));
//        configuration.setAllowCredentials(true); // Rất quan trọng nếu muốn truyền cookie/token
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//}