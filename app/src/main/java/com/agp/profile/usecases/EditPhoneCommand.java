package com.agp.profile.usecases;

import com.agp.profile.entities.Profile;

public class EditPhoneCommand {
    //Members
    private ProfileRepository repository;

    // constructor
    public EditPhoneCommand(ProfileRepository repository) {
        this.repository = repository;
    }

    //Methods
    public void execute(String phone) {
        try {
            Profile profile = repository.get();
            profile.setPhone(phone);

            repository.put(profile);
        } catch (Exception exception) {
            // do something
        }
    }
}
