package com.dbxml.dbxml.controller;

import com.dbxml.dbxml.domains.dao.LadDao;
import com.dbxml.dbxml.service_impl.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("main")
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final MainService mainService;

    @GetMapping("helloTest")
    public String helloTest() {
        log.info("API Call Received !!!!");
        return mainService.helloTest();
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
