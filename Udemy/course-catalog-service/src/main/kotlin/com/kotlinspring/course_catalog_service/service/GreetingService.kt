package com.kotlinspring.course_catalog_service.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class GreetingService {

    /*
        Anytime i have a variable i need to initialize that variable with the value
        or add the `lateinit` modifier, because this variable will be initialized after the
        application starts up !
     */
    @Value("\${message}")
    lateinit var message: String

    fun retrieveGreeting(name : String) = "$name, $message"
}