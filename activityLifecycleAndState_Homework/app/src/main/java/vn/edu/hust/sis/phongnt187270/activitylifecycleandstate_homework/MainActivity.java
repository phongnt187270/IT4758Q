package vn.edu.hust.sis.phongnt187270.activitylifecycleandstate_homework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.textView);

        if(savedInstanceState != null){
            boolean isVisible = savedInstanceState.getBoolean("visible");
            if(isVisible){
                mShowCount.setText(savedInstanceState.getString("mTextCount"));
            }
        }
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if(mShowCount.getVisibility() == View.VISIBLE){
            outState.putBoolean("visible", true);
            outState.putString("mTextCount", mShowCount.getText().toString());
        }
    }
}