package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;

import java.util.List;

public class FluxAndMonoGeneratorService {


    public Flux<String> namesFlux(){

        return Flux.fromIterable(List.of("alex","bob","chloe","adam"));
    }

    public static void main(String[] args) {
        FluxAndMonoGeneratorService service= new FluxAndMonoGeneratorService();
        service.namesFlux().subscribe(System.out::println);


    }
}
