package hello.config;

import hello.filter.WordLadderFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WordLadderConfig {

    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new WordLadderFilter());
        registrationBean.addUrlPatterns("/WordLadder/*");

        return registrationBean;
    }

}
