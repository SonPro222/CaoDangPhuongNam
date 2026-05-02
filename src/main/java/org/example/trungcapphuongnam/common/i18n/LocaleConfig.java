<<<<<<< HEAD
package org.example.trungcapphuongnam.common.i18n;
=======
package org.example.trungcapphuongnam.common.i18n_dangonngu;
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class LocaleConfig {

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver resolver = new SessionLocaleResolver();
        resolver.setDefaultLocale(new Locale("vi"));
        return resolver;
    }
}