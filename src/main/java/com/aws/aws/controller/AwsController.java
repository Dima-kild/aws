package com.aws.aws.controller;

import com.aws.aws.entity.EC2Location;
import com.aws.aws.service.AwsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AwsController {

    private final AwsService awsService;

    @GetMapping(value = "/aws")
    public EC2Location getInfo() {
        return awsService.getInfoAboutInstance();
    }
}
