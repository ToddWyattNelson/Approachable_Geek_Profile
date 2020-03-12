package com.agp.profile.adapters;

import com.agp.profile.entities.Profile;
import com.agp.profile.usecases.ProfileRepository;

/** InMemoryProfileRepository */
public class InMemoryProfileRepository implements ProfileRepository {

  //Members
  private Profile profile = new Profile();

  //Methods
  @Override
  public Profile get() {
    return profile;
  }

  @Override
  public void put(Profile profile) {
    this.profile = profile;
  }
}
