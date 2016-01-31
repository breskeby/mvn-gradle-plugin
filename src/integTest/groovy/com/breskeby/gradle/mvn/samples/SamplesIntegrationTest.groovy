package com.breskeby.gradle.mvn.samples

import spock.lang.IgnoreIf
import spock.lang.Specification

import static org.junit.Assert.fail

class SamplesIntegrationTest extends Specification {
    @IgnoreIf({ !new File("test-projects/spring-data-jpa").exists() })
    def "can build 'spring-data-jpa'"() {
        expect:
        fail()
    }


}
