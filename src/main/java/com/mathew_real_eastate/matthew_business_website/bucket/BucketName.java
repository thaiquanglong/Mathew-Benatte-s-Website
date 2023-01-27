package com.mathew_real_eastate.matthew_business_website.bucket;

public enum BucketName {
    PROFILE_IMAGE("matthewrealsite");

    private final String bucketName;
    BucketName(String bucketName){
        this.bucketName = bucketName;
    }
    public String getBucketName(){
        return bucketName;
    }
}
