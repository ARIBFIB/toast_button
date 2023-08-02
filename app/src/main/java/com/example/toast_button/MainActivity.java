package com.example.toast_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //        Toast.makeText(MainActivity.this, "default Tost", Toast.LENGTH_SHORT).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button = findViewById(R.id.btntost);


                toast = new Toast(MainActivity.this);

                View v = getLayoutInflater().inflate(R.layout.toast_text_btn, (ViewGroup) findViewById(R.id.viewContent));

                toast.setView(view);


                textView = findViewById(R.id.toast_text_btn);

                textView.setText("Message Sent Successfully");

                toast.setDuration(Toast.LENGTH_LONG);

                toast.show();

            }
        });


    }
}