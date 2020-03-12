package com.agp.profile.usecases;

import com.agp.profile.entities.Profile;

/**
 * EditNameCommand
 */
public class EditNameCommand {

    //Members
    private ProfileRepository repository;

    // constructor
    public EditNameCommand(ProfileRepository repository) {
        this.repository = repository;
    }

    //Methods
    public void execute(String firstName, String lastName) {
        try {
            Profile profile = repository.get();
            profile.setFirstName(firstName);
            profile.setLastName(lastName);

            repository.put(profile);
        } catch (Exception exception) {
            // do something
        }
    }
}
