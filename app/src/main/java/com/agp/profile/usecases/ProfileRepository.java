package com.agp.profile.usecases;

import com.agp.profile.entities.Profile;

/** ProfileRepository */
public interface ProfileRepository {

  //Methods
  Profile get();

  void put(Profile profile);
}
