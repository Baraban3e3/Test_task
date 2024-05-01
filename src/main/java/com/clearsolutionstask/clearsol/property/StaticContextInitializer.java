package com.clearsolutionstask.clearsol.property;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StaticContextInitializer {

    private final ageProp ageProp;

    @PostConstruct
    void init() {
        ageProp.setMinimalAge(Integer.valueOf("${property.minimalAge}"));
    }

}