package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        if (session.getAttribute("gameInstance") == null) {
            session.setAttribute("gameInstance", new game());
        }
        // Provide default values so the page doesn't crash on first load
        model.addAttribute("message", "Enter a number to start!");
        model.addAttribute("gameOver", false);
        return "index";
    }

    @PostMapping("/guess")
    public String handleGuess(@RequestParam("number") int guess, HttpSession session, Model model) {
        game gn = (game) session.getAttribute("gameInstance");

        // Use the checkCondition method from your guestheno.java
        String result = gn.checkCondition(guess);

        if (result.equals("WON")) {
            model.addAttribute("message", "YOU HAVE WON! YOU TOOK " + gn.countnumberr + " TRIES");
            model.addAttribute("gameOver", true);
        } else {
            model.addAttribute("message", result);
            model.addAttribute("gameOver", false);
        }
        return "index";
    }

    @GetMapping("/reset")
    public String reset(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}