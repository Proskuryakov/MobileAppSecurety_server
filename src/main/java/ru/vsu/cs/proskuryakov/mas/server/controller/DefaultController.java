package ru.vsu.cs.proskuryakov.mas.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.cs.proskuryakov.mas.server.model.SimpleResponse;

@RestController
public class DefaultController {

    private static final String KEY = "MegaPa$$word";
    private static final String IV = "InitVector";
    private static final EasyAES EASY_AES = new EasyAES(KEY, 256, IV);

    @GetMapping("echo")
    public SimpleResponse listener(
        @RequestParam(value = "data", required = false) String data
    ){
        if (data == null) {
            return new SimpleResponse(0, "no data sent");
        }
        return new SimpleResponse(1, EASY_AES.decrypt(data));
    }

}
