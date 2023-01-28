package com.mathew_real_eastate.matthew_business_website.profile;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserProfileService {
    private final UserProfileDataAccessService userProfileDataAccessService;
    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    List<UserProfile> getUserProfiles() {
        return userProfileDataAccessService.getUserProfiles();
    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
        // check wether image is empty
        // check if file is an image
        // check the use exist
        // grab meetadata
        // store the image in s3 and update database with s3 image link
    }
}
