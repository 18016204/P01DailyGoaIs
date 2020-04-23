package sg.edu.rp.c346.id18016204.p01dailygoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class newActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        Intent i  = getIntent();
        String [] info = i.getStringArrayExtra("info");
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        tv1.setText("Read up on materials before class : " + info[0] );
        tv2.setText("Arrive on time so as not to miss important part of the lesson :" + info[1]);
        tv3.setText("Attempt the problem myself : " + info[2]);
        tv4.setText("Reflection + " + info[3]);

    }
}
