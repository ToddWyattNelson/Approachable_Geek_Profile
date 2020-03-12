package com.agp.profile.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.agp.profile.entities.Profile;
import com.agp.profile.main.CommandFactory;
import com.agp.profile.usecases.GetProfileCommand;
import com.example.approachablegeekprofile.R;

public class MainActivity extends AppCompatActivity {

    private CommandFactory factory = new CommandFactory();
    private GetProfileCommand getProfileCommand = factory.createGetProfileCommand();

    private TextView name;
    private TextView email;
    private TextView phone;
    private TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.Name_Out);
        email = (TextView) findViewById(R.id.Email_Out);
        phone = (TextView) findViewById(R.id.Phone_Out);
        about = (TextView) findViewById(R.id.About_Out);
    }


    @Override
    public void onResume() {
        super.onResume();
        Profile profile = getProfileCommand.execute();
        name.setText(profile.getName());
        email.setText(profile.getEmail());
        phone.setText((profile.getPhone()));
        about.setText(profile.getAbout());
    }


    public void GetName(View view) {
        Intent myIntent = new Intent(this, GetNameActivity.class);
        startActivity(myIntent);
    }



    public void GetPhone(View view) {
        Intent myIntent = new Intent(this, GetPhoneActivity.class);
        startActivityForResult(myIntent, 0);

    }



    public void GetEmail(View view) {
        Intent myIntent = new Intent(this, GetEmailActivity.class);
        startActivityForResult(myIntent, 0);

    }

    public void GetAbout(View view) {
        Intent myIntent = new Intent(this, GetAboutActivity.class);
        startActivityForResult(myIntent, 0);

    }


}