package android.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView profilePic = findViewById(R.id.profile_picture);
        profilePic.setImageResource(R.drawable.profilepic);

        TextView name = findViewById(R.id.name);
        TextView birthday = findViewById(R.id.birthday);
        TextView country = findViewById(R.id.country);

        name.setText("Geoffrey Boss");
        name.setTextSize(32);
        birthday.setText("August 19");
        birthday.setTextSize(32);
        country.setText("USA/Kenya");
        country.setTextSize(32);
    }
}
