<<<<<<< HEAD
package org.example.trungcapphuongnam.common.i18n;
=======
package org.example.trungcapphuongnam.common.i18n_dangonngu;
>>>>>>> 6a4be8fd05295f2dbc861b8448b73a83fa198c8c

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setBasename("messages");
        ms.setDefaultEncoding("UTF-8");
        return ms;
    }
}