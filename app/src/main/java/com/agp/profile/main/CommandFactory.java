package com.agp.profile.main;

import com.agp.profile.adapters.InMemoryProfileRepository;
import com.agp.profile.usecases.EditAboutCommand;
import com.agp.profile.usecases.EditEmailCommand;
import com.agp.profile.usecases.EditNameCommand;
import com.agp.profile.usecases.EditPhoneCommand;
import com.agp.profile.usecases.GetProfileCommand;
import com.agp.profile.usecases.ProfileRepository;

/** CommandFactory */
public class CommandFactory {
  private static ProfileRepository repository = new InMemoryProfileRepository();

  //Methods
  public GetProfileCommand createGetProfileCommand() {
    GetProfileCommand command = new GetProfileCommand(repository);
    return command;
  }

  public EditNameCommand createEditNameCommand() {
    EditNameCommand command = new EditNameCommand(repository);
    return command;
  }

  public EditEmailCommand createEditEmailCommand() {
    EditEmailCommand command = new EditEmailCommand(repository);
    return command;
  }

  public EditAboutCommand createEditAboutCommand() {
    EditAboutCommand command = new EditAboutCommand(repository);
    return command;
  }

  public EditPhoneCommand createEditPhoneCommand() {
    EditPhoneCommand command = new EditPhoneCommand(repository);
    return command;
  }

}
