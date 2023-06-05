package ru.vsu.cs.proskuryakov.listener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.cs.proskuryakov.listener.model.SimpleResponse;

@RestController
public class DefaultController {

    @GetMapping("echo")
    public SimpleResponse listener(
        @RequestParam(value = "data", required = false) String data
    ){
        if (data == null) {
            return new SimpleResponse(0, "no data sent");
        }
        return new SimpleResponse(1, data);
    }

}
