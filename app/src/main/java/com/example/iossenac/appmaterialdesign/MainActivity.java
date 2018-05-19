package com.example.iossenac.appmaterialdesign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Clicou no FAB", Snackbar.LENGTH_LONG)
                        .setAction("Desfazer", new MyUndoListener()).show();
            }
        });
    }

    public class MyUndoListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Toast.makeText(MainActivity.this,"Disparado o botao Undo!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
