package com.dbxml.dbxml;

import com.dbxml.dbxml.dao.LadDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("main")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;


    @PostMapping(value = "getXmlData")
    private String getXmlData(@RequestBody List<LadDao> ladDao) throws IOException {
        return mainService.getXmlData(ladDao);
    }


}
