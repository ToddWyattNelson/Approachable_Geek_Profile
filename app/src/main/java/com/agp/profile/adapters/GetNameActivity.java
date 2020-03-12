package com.agp.profile.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.agp.profile.entities.Profile;
import com.agp.profile.main.CommandFactory;
import com.agp.profile.usecases.EditNameCommand;
import com.agp.profile.usecases.GetProfileCommand;
import com.example.approachablegeekprofile.R;


public class GetNameActivity extends AppCompatActivity {

    private TextView firstName;
    private TextView lastName;

    private CommandFactory factory = new CommandFactory();
    private EditNameCommand editNameCommand = factory.createEditNameCommand();
    private GetProfileCommand getProfileCommand = factory.createGetProfileCommand();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_name);
        firstName = (TextView) findViewById(R.id.FirstNameInput);
        lastName = (TextView) findViewById(R.id.LastNameInput);
    }

    @Override
    public void onResume() {
        super.onResume();
        Profile profile = getProfileCommand.execute();
        firstName.setText(profile.getFirstName());
        lastName.setText(profile.getLastName());
    }

    public void UpdateName(View view) {

        editNameCommand.execute(firstName.getText().toString(), lastName.getText().toString());

        Toast toast = Toast.makeText(this, "Updating Name", Toast.LENGTH_SHORT);
        toast.show();

        finish();
    }


}
