package webb.todd.mywebviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String MAIN_LOG = "Main";

    Button buttonUCSD, buttonEngility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUCSD = (Button) findViewById( R.id.buttonUCSD );
        buttonUCSD.setOnClickListener( this );

        buttonEngility = (Button) findViewById( R.id.buttonEngility );
        buttonEngility.setOnClickListener( this );
    }

    @Override
    public void onClick( final View v ) {

        if( v.getId() == R.id.buttonUCSD ){
            Intent intent = new Intent( this, UCSDActivity.class );
            Log.v( MAIN_LOG, "Starting UCSD Activity" );
            startActivity( intent );
        }
        if( v.getId() == R.id.buttonEngility ){
            Intent intent = new Intent( this, EngilityActivity.class );
            Log.v( MAIN_LOG, "Starting Engility Activity" );
            startActivity( intent );
        }
    }
}
