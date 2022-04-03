package funix.prm.lab35_labexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLeft, btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_part_3);

        btnLeft = findViewById(R.id.btnLeft);
        btnLeft.setOnClickListener(view -> {
            btnLeft.setText(R.string.clear_btn);
            btnRight.setText(R.string.btn_click_me);
        });

        btnRight = findViewById(R.id.btnRight);
        btnRight.setOnClickListener(view -> {
            btnRight.setText(R.string.clear_btn);
            btnLeft.setText(R.string.btn_click_me);
        });
    }
}