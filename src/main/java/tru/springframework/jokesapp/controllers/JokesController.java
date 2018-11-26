package tru.springframework.jokesapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tru.springframework.jokesapp.services.ChuckNorrisQuoteService;
import org.springframework.ui.Model;

@Controller
public class JokesController {

    ChuckNorrisQuoteService chuckNorrisQuoteService;
    @Autowired
    public JokesController(ChuckNorrisQuoteService chuckNorrisQuoteService) {
        this.chuckNorrisQuoteService = chuckNorrisQuoteService;
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", chuckNorrisQuoteService.getQuote());
        return "chcecknorris";
    }
}
