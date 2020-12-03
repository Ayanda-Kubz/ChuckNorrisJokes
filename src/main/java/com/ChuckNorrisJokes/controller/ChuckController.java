package com.ChuckNorrisJokes.controller;

import com.ChuckNorrisJokes.service.ChuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckController {

    private ChuckService chuckService;

    @Autowired
    public ChuckController(ChuckService chuckService) {
        this.chuckService = chuckService;
    }

    @RequestMapping({"/",""})
    public String showJoke (Model model){
        model.addAttribute("joke", chuckService.getRandomJoke());

        return "chucknorris";
    }
}
