package kr.hs.dgsw.web_get;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GetController {

    //value 생략
    @GetMapping("/greeting")
    public String sayHello(
            @RequestParam(required = false, defaultValue = "NONAME") String name,
            @RequestParam(required = false, defaultValue = "Hello") String say
    ) {
        return say + " " + name;
    }

    //String이 아니므로 value 명시
    @GetMapping(
            value = {
            "/greeting1/{say}/{name}",
            "/greeting1/{say}",
            "/greeting1//{name}",
            "/greeting1"
            }
    )
    
    public String sayHello1(
            @PathVariable Optional<String> say,
            @PathVariable Optional<String> name){
        String tmpSay = say.isPresent() ? say.get() : "Hello";
        String tmpName = name.isPresent() ? name.get() : "NONAME";

        return tmpSay + " " + tmpName;
    }
}
