package vn.edu.hust.sis.phongnt187270.login_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signIn_btn = (Button)findViewById(R.id.signIn_button);
        EditText email_text = (EditText)findViewById(R.id.email_text);
        EditText password_text = (EditText)findViewById(R.id.password_text);

        signIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email_text.getText().toString().equals("admin") &&
                password_text.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Login Succes", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login False", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}