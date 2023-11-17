package com.example

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import jakarta.inject.Inject

@MicronautTest
class HelloWorldControllerTest {

    @Inject
    @Client("/")
    HttpClient client

    @Test
    void helloWorldEndpointRespondsWithProperContrent(){
        // HTTP Client
        var response = client.toBlocking().retrieve("/hello")
        assertEquals("Hello World", response)
    }
}
