package com.acadgild.com.session2_assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonHide;
    private TextView txtImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHide = (Button)findViewById(R.id.btnHide);
        txtImage = (TextView)findViewById(R.id.txtImg);

        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtImage.isShown() && buttonHide.getText().equals("Hide"))
                {
                    txtImage.setVisibility(View.INVISIBLE);
                    buttonHide.setText("Show");
                }
                else if (!txtImage.isShown() && buttonHide.getText().equals("Show"))
                {
                    txtImage.setVisibility(View.VISIBLE);
                    buttonHide.setText("Hide");
                }
            }
        });

    }
}
