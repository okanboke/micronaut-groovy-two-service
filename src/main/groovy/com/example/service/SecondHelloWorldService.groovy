package com.example.service

import io.micronaut.context.annotation.Primary
import jakarta.inject.Singleton

@Singleton
class SecondHelloWorldService implements IMyService {


    @Override
    def helloFromService() {
        return "hello from Second Service"
    }
}
