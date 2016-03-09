package se.oscarb.activitylifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*
        När och i vilken ordning körs de olika metoderna?
        Pröva olika saker i mobilen! Kan du få alla att köras?
        Anteckna vad du gjorde som fick respektive metod att köras
        och vilka metoder som kördes precis innan/efter.

        Fundera också på - vilka tillstånd gick appen mellan?
     */


    // Metoden körs när appen startar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity Lifecycle", "Metoden onCreate() körs!");
    }
    // Metoden körs när appen förstörs // Henry
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    // Metoden körs när appen pausar // Henry
    @Override
    protected void onPause() {
        super.onPause();
    }
    // Metoden körs när appen startar om // Henry
    @Override
    protected void onRestart() {
        super.onRestart();
        
    }
    // Metoden körs när appen körs igen // Henry
    @Override
    protected void onResume() {
        super.onResume();
    }
    // Metoden körs när appen startar om // Henry
    // Körs när aktiviteten blir synlig / Iggy
    @Override
    protected void onStart() {
        super.onStart();
    }
    // Metoden körs när appen slutar // Henry
    @Override
    protected void onStop() {
        super.onStop();
    }
}
