package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class ErrorController {

    @GetMapping("/error")
    public String handleError(Model model) {
        // Provide any custom error information to the view, if needed
        model.addAttribute("errorMessage", "An error occurred");

        // Return the name of your error view (e.g., error.html)
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Log the exception, if needed
        return "redirect:/error";
    }
}