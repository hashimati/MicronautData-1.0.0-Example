package io.hashimati.databaseexample.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Error;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;

@Controller("/")
public class ViewController {


    @View("index")
    @Get("/")
    public HttpResponse home()
    {
            return HttpResponse.ok(); 
    }
    
}