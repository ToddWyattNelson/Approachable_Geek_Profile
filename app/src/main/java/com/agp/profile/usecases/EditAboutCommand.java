package com.agp.profile.usecases;

import com.agp.profile.entities.Profile;

public class EditAboutCommand {
    //Members
    private ProfileRepository repository;

    // constructor
    public EditAboutCommand(ProfileRepository repository) {
        this.repository = repository;
    }

    //Methods
    public void execute(String about) {
        try {
            Profile profile = repository.get();
            profile.setAbout(about);

            repository.put(profile);
        } catch (Exception exception) {
            // do something
        }
    }
}
