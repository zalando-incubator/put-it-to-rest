package org.zalando.putittorest;

import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.zalando.logbook.spring.LogbookAutoConfiguration;
import org.zalando.stups.tokens.AccessTokens;
import org.zalando.tracer.spring.TracerAutoConfiguration;

import static org.mockito.Mockito.mock;

@Configuration
@ImportAutoConfiguration({
        RestClientAutoConfiguration.class,
        JacksonAutoConfiguration.class,
        LogbookAutoConfiguration.class,
        TracerAutoConfiguration.class,
})
@ActiveProfiles("default")
public class DefaultTestConfiguration {

    @Bean
    public AccessTokens accessTokens() {
        return mock(AccessTokens.class);
    }

}
