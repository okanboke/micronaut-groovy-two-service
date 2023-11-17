package com.example.service

import io.micronaut.context.annotation.Primary
import jakarta.inject.Singleton

@Primary // iki adet sınıfta aynı metod var ise diğerini göz ardı eder
@Singleton
class HelloWorldService implements IMyService {


    @Override
    def helloFromService() {
        return "hello from Service"
    }
}
