package com.aws.aws.service;

import com.aws.aws.entity.EC2Location;

public interface AwsService {
    EC2Location getInfoAboutInstance();

}
