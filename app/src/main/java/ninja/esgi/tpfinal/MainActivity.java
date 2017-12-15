package ninja.esgi.tpfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotToActivityButtonClicked(View view) {
        Class newActivity;
        Log.d("BTN_ID", view.getTag().toString());
        switch(view.getTag().toString()) {
            case "firstAct":
                newActivity = FirstActivity.class;
                break;
            case "secondAct":
                newActivity = SecondActivity.class;
                break;
            case "thirdAct":
                newActivity = ThirdActivity.class;
                break;
            default:
                newActivity = MainActivity.class;
        }
        Intent intent = new Intent(this, newActivity);
        startActivity(intent);
    }

}
