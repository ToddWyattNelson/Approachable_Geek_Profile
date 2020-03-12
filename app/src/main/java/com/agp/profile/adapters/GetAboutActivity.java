package com.agp.profile.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.agp.profile.entities.Profile;
import com.agp.profile.main.CommandFactory;
import com.agp.profile.usecases.EditAboutCommand;
import com.agp.profile.usecases.GetProfileCommand;
import com.example.approachablegeekprofile.R;

public class GetAboutActivity extends AppCompatActivity {

    private TextView about;

    private CommandFactory factory = new CommandFactory();
    private EditAboutCommand editAboutCommand = factory.createEditAboutCommand();
    private GetProfileCommand getProfileCommand = factory.createGetProfileCommand();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_about);
        about = (TextView) findViewById(R.id.AboutInput);

    }

    @Override
    public void onResume() {
        super.onResume();
        Profile profile = getProfileCommand.execute();
        about.setText(profile.getAbout());

    }

    public void UpdateAbout(View view) {
        editAboutCommand.execute( about.getText().toString());


        Toast toast = Toast.makeText(this, "Updating About", Toast.LENGTH_SHORT);
        toast.show();

        finish();
    }
}
