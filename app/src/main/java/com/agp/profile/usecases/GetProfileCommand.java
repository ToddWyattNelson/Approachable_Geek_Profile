package com.agp.profile.usecases;

import com.agp.profile.entities.Profile;

/** GetProfileCommand */
public class GetProfileCommand {

  //Members
  private ProfileRepository repository;

  // constructor
  public GetProfileCommand(ProfileRepository repository) {
    this.repository = repository;
  }

  //Methods
  public Profile execute() {
    return repository.get();
  }
}
