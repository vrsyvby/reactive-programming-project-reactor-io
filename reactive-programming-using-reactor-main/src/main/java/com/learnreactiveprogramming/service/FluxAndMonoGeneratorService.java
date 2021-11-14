package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoGeneratorService {


    public Flux<String> namesFlux(){

        return Flux.fromIterable(List.of("alex","bob","chloe","adam"));
    }

    public Mono<Double> namesMono(){

        return Mono.fromSupplier(Math::random);
    }

    public static void main(String[] args) {
        FluxAndMonoGeneratorService service= new FluxAndMonoGeneratorService();
        service.namesFlux().subscribe(System.out::println);// nothing happens until you subscribe.
        service.namesMono().subscribe(System.out::println);
    }
}
