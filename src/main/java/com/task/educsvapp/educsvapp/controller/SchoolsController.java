package com.task.educsvapp.educsvapp.controller;

import com.task.educsvapp.educsvapp.service.SchoolsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/school/v1")
@RequiredArgsConstructor
public class SchoolsController {

    private SchoolsService schoolsService;
    @RequestMapping(path="feedSchoolsData")
    public void setDataInDB() throws IOException {
        schoolsService.saveSchoolsData();

    }
}
