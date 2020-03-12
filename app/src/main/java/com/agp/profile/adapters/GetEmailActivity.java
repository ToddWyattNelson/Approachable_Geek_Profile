package com.agp.profile.adapters;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.agp.profile.entities.Profile;
import com.agp.profile.main.CommandFactory;
import com.agp.profile.usecases.EditEmailCommand;
import com.agp.profile.usecases.GetProfileCommand;
import com.example.approachablegeekprofile.R;

public class GetEmailActivity extends AppCompatActivity {

    private TextView email;

    private CommandFactory factory = new CommandFactory();
    private EditEmailCommand editEmailCommand = factory.createEditEmailCommand();
    private GetProfileCommand getProfileCommand = factory.createGetProfileCommand();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_email);
        email = (TextView) findViewById(R.id.EmailInput);

    }

    @Override
    public void onResume() {
        super.onResume();
        Profile profile = getProfileCommand.execute();
        email.setText(profile.getEmail());

    }

    public void UpdateEmail(View view) {
        editEmailCommand.execute( email.getText().toString());


        Toast toast = Toast.makeText(this, "Updating Email ", Toast.LENGTH_SHORT);
        toast.show();

        finish();
    }
}
