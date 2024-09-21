package com.kotlinspring.course_catalog_service.controller

import com.kotlinspring.course_catalog_service.service.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController // define a RESTful web service in Spring. It marks the class as a controller where every method returns a response body (usually JSON, XML, or a plain string
@RequestMapping("v1/greetings") // This annotation defines the base URI or URL path at which the controller will be available.
class GreetingController(val greetingService: GreetingService) {


    @GetMapping("/{name}") // This annotation maps HTTP GET requests to the method that handles the request.
    fun retrieveGreeting(@PathVariable("name") name: String): String { // @PathVariable => This annotation binds the path variable from the URL to a method parameter.
        return greetingService.retrieveGreeting(name)
    }
}