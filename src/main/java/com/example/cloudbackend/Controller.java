package com.example.cloudbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(originPatterns = "*")
@Transactional
public class Controller {

    @Autowired
    private ContentObjectRepository contentObjectRepository;

    @GetMapping("/hello")
    public String hello(){
        return "sdjsdj";
    }

    @PostMapping("/save")
    public @ResponseBody boolean save(@RequestBody String content){
        ContentObject c = new ContentObject();
        c.setContent(content);
        contentObjectRepository.saveAndFlush(c);
        return true;
    }

    @GetMapping("/fetch")
    public @ResponseBody ContentObject fetch(){
        return new ContentObject();
    }
}
