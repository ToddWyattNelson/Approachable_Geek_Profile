package com.agp.profile.adapters;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.agp.profile.entities.Profile;
import com.agp.profile.main.CommandFactory;
import com.agp.profile.usecases.EditPhoneCommand;
import com.agp.profile.usecases.GetProfileCommand;
import com.example.approachablegeekprofile.R;


public class GetPhoneActivity extends AppCompatActivity {

    private TextView phone;
    private CommandFactory factory = new CommandFactory();
    private EditPhoneCommand editPhoneCommand = factory.createEditPhoneCommand();
    private GetProfileCommand getProfileCommand = factory.createGetProfileCommand();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_phone);
        phone = (TextView) findViewById(R.id.PhoneInput);

    }

    @Override
    public void onResume() {
        super.onResume();
        Profile profile = getProfileCommand.execute();
        phone.setText(profile.getPhone());

    }

    public void UpdatePhone(View view) {
        editPhoneCommand.execute(phone.getText().toString());

        Toast toast = Toast.makeText(this, "Updating Phone: ", Toast.LENGTH_SHORT);
        toast.show();

        finish();
    }

}
