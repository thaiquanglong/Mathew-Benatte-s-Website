package com.mathew_real_eastate.matthew_business_website.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mathew_real_eastate.matthew_business_website.datastore.FakeUseProfileDataStore;

@Repository
public class UserProfileDataAccessService {
    private final FakeUseProfileDataStore fakeUseProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUseProfileDataStore fakeUseProfileDataStore) {
        this.fakeUseProfileDataStore = fakeUseProfileDataStore;
    }

    List<UserProfile> getUserProfiles(){
        return fakeUseProfileDataStore.getUserProfiles();
    }
    
}
