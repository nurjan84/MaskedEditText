package kz.nurzhan.maskededittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;

public class MainActivity extends AppCompatActivity {

    MaskedEditText maskedEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maskedEditText = findViewById(R.id.phone);

        maskedEditText.addMaskedTextWatcher(new MaskedEditText.MaskedTextWatcher() {
            @Override
            public void onTextChanged(MaskedEditText maskedEditText, CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(MaskedEditText maskedEditText, CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
