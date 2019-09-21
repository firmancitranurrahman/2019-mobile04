package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import id.ac.polinema.intent.user;

public class ProfileParcelableActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        usernameInput= findViewById(R.id.input_username);
        nameInput= findViewById(R.id.input_name);
        ageInput= findViewById(R.id.input_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            user u = extras.getParcelable("user");
        }
    }
}
