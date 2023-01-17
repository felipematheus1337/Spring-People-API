package com.matheus.peopledbweb.controller;


import com.matheus.peopledbweb.biz.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String getPeople(Model model) {
        var people = List.of(new Person(10L,"Jake","Snake", LocalDate.of(1950,1,1),new BigDecimal("5000")),
                new Person(10L,"Matheus","José", LocalDate.of(2006,10,25),new BigDecimal("95000")));
        model.addAttribute("people",people);
        return "people";

    }
}
