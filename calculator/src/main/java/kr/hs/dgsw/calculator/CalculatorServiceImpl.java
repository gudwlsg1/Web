package kr.hs.dgsw.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double cal(String num1, String sign, String num2) {

        switch (sign){
            case "+" :
                return Double.parseDouble(num1) + Double.parseDouble(num2);
            case "-" :
                return Double.parseDouble(num1) - Double.parseDouble(num2);
            case "*" :
                return Double.parseDouble(num1) * Double.parseDouble(num2);
            case "/" :
                return Double.parseDouble(num1) / Double.parseDouble(num2);
        }

        return 0;
    }
}
