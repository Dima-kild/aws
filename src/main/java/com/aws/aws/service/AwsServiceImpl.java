package com.aws.aws.service;

import com.aws.aws.entity.EC2Location;
import org.springframework.stereotype.Service;

import static com.amazonaws.util.EC2MetadataUtils.*;

@Service
public class AwsServiceImpl implements AwsService {

    @Override
    public EC2Location getInfoAboutInstance() {
        var ec2Location = new EC2Location();
        ec2Location.setAvailabilityZone(getAvailabilityZone());
        ec2Location.setRegion(getEC2InstanceRegion());
        ec2Location.setUserData(getUserData());
        return ec2Location;
    }
}
