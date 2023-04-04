package com.example.practice_htmx.controller

import com.example.practice_htmx.domain.TestClass
import jakarta.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class IndexController {

    @GetMapping("/")
    fun index(@ModelAttribute("form") form: TestClass): String {
        return "index"
    }

    @GetMapping("/form")
    fun form(@ModelAttribute("form") form: TestClass): String {
        return "index :: todo"
    }

    @PostMapping("/commit")
    fun commit(@Valid @ModelAttribute("form") form: TestClass, bindingResult: BindingResult) : String {
        if(bindingResult.hasErrors()){
            return "index :: todo"
        }
        return "todo-read :: todo"
    }
}