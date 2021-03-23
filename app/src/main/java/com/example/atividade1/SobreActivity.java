package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreActivity extends AppCompatActivity {

    private Button uninassau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        uninassau = findViewById(R.id.Uninassaubutton);

        uninassau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.uninassau.edu.br"));
                startActivity(browserIntent);
            }
        });
    }
}
