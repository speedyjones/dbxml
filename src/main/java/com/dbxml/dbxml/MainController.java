package com.dbxml.dbxml;

import com.dbxml.dbxml.domains.dao.LadDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("main")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;


    @GetMapping("helloTest")
    public String helloTest() {
        return "hello msg from dbxml App";
    }

    @PostMapping(value = "getXmlData")
    private String getXmlData(@RequestBody List<LadDao> ladDao) throws IOException {
        return mainService.getXmlData(ladDao);
    }

    @PostMapping("encryptFile")
    private String encryptFile(@RequestBody String data) {
        return mainService.encryptFile(data);
    }

    @PostMapping("decryptFile")
    private String decryptFile(@RequestBody String data) {
        return mainService.decryptFile(data);
    }

}
