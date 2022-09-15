package com.aws.aws.entity;

import lombok.Data;

@Data
public class EC2Location {

    private String region;
    private String availabilityZone;
}
