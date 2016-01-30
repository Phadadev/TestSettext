package com.pw.paphat.testsettext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtInput;
    private TextView txtInput;
    private Button btnClickForInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput = (EditText) findViewById(R.id.edtInput);
        txtInput = (TextView) findViewById(R.id.txtInput);
        btnClickForInput = (Button) findViewById(R.id.btnClickForInput);

        btnClickForInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(edtInput.getText().toString());
            }
        });

    }
}
