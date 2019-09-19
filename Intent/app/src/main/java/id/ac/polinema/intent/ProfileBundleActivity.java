package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        this.usernameText = findViewById(R.id.text_username);
        this.nameText = findViewById(R.id.text_name);
        this.ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            this.usernameText.setText(extras.getString("USERNAME_KEY"));
            this.nameText.setText(extras.getString("NAME_KEY"));
            this.ageText.setText((extras.getInt("AGE_KEY")));
        }
    }
}
