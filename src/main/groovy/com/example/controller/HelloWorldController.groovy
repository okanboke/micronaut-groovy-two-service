package com.example.controller

import com.example.service.HelloWorldService
import com.example.service.IMyService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller("/hello")
class HelloWorldController {

    @Inject
    private IMyService service

    @Get(produces = MediaType.TEXT_PLAIN)
    def helloWorld() {
        return service.helloFromService()
    }
}
