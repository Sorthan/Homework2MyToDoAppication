package th.ac.su.mytodoappication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast t1 = Toast.makeText(LoginActivity.this,"WELCOME TO",Toast.LENGTH_LONG);
        t1.show();
        Toast t2 = Toast.makeText(LoginActivity.this,"My ToDo APPLICATION",Toast.LENGTH_SHORT);
        t2.show();
    }
}
