package org.shop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("org.shop.data")
@Import({RepositoryConfig.class,
    ServiceConfig.class,
    InitializerConfig.class,
    FactoryConfig.class,
    BeansConfig.class})
public class SystemConfig {

}
