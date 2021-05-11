package vn.edu.hust.sis.phongnt187270.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkChocolate;
    CheckBox checkSprinkle;
    CheckBox checkNut;
    CheckBox checkCherry;
    CheckBox checkOrio;

    private String message = "Topping: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkChocolate = (CheckBox)findViewById(R.id.checkBox_chocolate);
        checkSprinkle = (CheckBox)findViewById(R.id.checkBox_sprinkles);
        checkNut = (CheckBox)findViewById(R.id.checkBox_nuts);
        checkCherry = (CheckBox)findViewById(R.id.checkBox_Cherry);
        checkOrio = (CheckBox)findViewById(R.id.checkBox_orio);

        Button buttonShowToast = (Button)findViewById(R.id.button_showToast);

        buttonShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });


    }

    private void showToast(){


        if(checkChocolate.isChecked()){
            message += checkChocolate.getText().toString();
        }
        if(checkSprinkle.isChecked()){
            if(message== null)  {
                message =  this.checkSprinkle.getText().toString();
            } else {
                message += " " + this.checkSprinkle.getText().toString();
            }
        }
        if(checkNut.isChecked()){
            if(message== null)  {
                message =  this.checkNut.getText().toString();
            } else {
                message += " " + this.checkNut.getText().toString();
            }
        }
        if(checkCherry.isChecked()){
            if(message== null)  {
                message =  this.checkCherry.getText().toString();
            } else {
                message += " " + this.checkCherry.getText().toString();
            }
        }
        if(checkOrio.isChecked()){
            if(message== null)  {
                message =  this.checkOrio.getText().toString();
            } else {
                message += " " + this.checkOrio.getText().toString();
            }
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }


}