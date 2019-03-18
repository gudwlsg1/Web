package kr.hs.dgsw.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalculatorService cs;

    @GetMapping("/cal/{num1}/{sign}/{num2}")
    public String cal(@PathVariable String num1, @PathVariable String sign, @PathVariable String num2){
        double sum = cs.cal(num1, sign, num2);

        return String.valueOf(sum);
    }
}
