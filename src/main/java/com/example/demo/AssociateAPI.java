package com.example.demo;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rd")
@Slf4j
@RequiredArgsConstructor
public class AssociateAPI {


    @PostMapping
    ResponseEntity<String> createAssociate(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
