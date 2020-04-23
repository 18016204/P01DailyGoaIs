package sg.edu.rp.c346.id18016204.p01dailygoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button btnDone =findViewById(R.id.OK);
btnDone.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        RadioGroup rg = findViewById(R.id.radioGroup1);
        RadioGroup rg2 = findViewById(R.id.radioGroup2);
RadioGroup rg3 = findViewById(R.id.radioGroup3);


        int selectedButtonId = rg.getCheckedRadioButtonId();
        int selectedButtonId2 = rg2.getCheckedRadioButtonId();
int selectedButtonId3 = rg3.getCheckedRadioButtonId();

        RadioButton rb = findViewById(selectedButtonId);
        RadioButton rb2 = findViewById(selectedButtonId2);
RadioButton rb3 = findViewById(selectedButtonId3);

        EditText editText = findViewById(R.id.editText1);



        String [] info = {rb.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),editText.getText().toString()};
        Intent i = new Intent(MainActivity.this, newActivity2.class);
        i.putExtra("info" , info);
        startActivity(i);



    }
});
    }
}
