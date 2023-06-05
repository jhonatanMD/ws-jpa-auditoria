package com.ws.app;

import com.ws.model.PersonEntity;
import com.ws.model.dto.PersonDto;
import com.ws.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
public class AppController {

    private final PersonRepository personRepository;

    @PostMapping
    public String post(@RequestBody PersonDto person){
        personRepository.save(new PersonEntity(person.getId(),person.getName(),person.getLastName()));
        return "ok";
    }
}
