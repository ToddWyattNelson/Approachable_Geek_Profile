package com.agp.profile.usecases;

import com.agp.profile.entities.Profile;

public class EditEmailCommand {
    //Members
    private ProfileRepository repository;

    // constructor
    public EditEmailCommand(ProfileRepository repository) {
        this.repository = repository;
    }

    //Methods
    public void execute(String email) {
        try {
            Profile profile = repository.get();
            profile.setEmail(email);

            repository.put(profile);
        } catch (Exception exception) {
            // do something
        }
    }
}
