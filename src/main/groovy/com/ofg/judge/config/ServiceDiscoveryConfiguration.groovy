package com.ofg.judge.config
import com.ofg.infrastructure.discovery.ServiceResolverConfiguration
import groovy.transform.TypeChecked
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.Profile

import static com.ofg.microservice.Profiles.PRODUCTION

@TypeChecked
@Configuration
@Import(ServiceResolverConfiguration)
@Profile(PRODUCTION)
class ServiceDiscoveryConfiguration {
}
