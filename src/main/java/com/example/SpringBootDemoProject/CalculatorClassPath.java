package com.example.SpringBootDemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CalculatorClassPath {
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String calculate(@PathVariable float num1, @PathVariable float num2, @PathVariable String operation){
        float result = 0;
        if ("add".equals(operation)){
            result = num1 + num2;
        } else if ("substract".equals(operation)) {
            result = num1 - num2;
        } else if ("multiply".equals(operation)) {
            result = num1 * num2;
        } else if ("divide".equals(operation)) {
            if(num2 != 0){
                result = num1 / num2;
            }else{
                throw new IllegalArgumentException("Division by Zero is not allowed!! Give valid values..");
            }
        }else{
            throw new IllegalArgumentException("Invalid operation. Give input in Lowercase."+ operation);
        }
        return "{\"operation\": \"" + operation + "\", \"result\": " + result + "}";
    }
}
