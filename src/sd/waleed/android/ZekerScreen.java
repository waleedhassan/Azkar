package sd.waleed.android;

import java.io.IOException;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZekerScreen extends Activity { 
    TextView t ;
	TextView v ;
	AzkarHelper help ;
	Cursor c ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.zekerscreen);
		
		t = (TextView)findViewById(R.id.content);
		v = (TextView)findViewById(R.id.title);
		help = new AzkarHelper(this);
		try {
            help.createDataBase();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_LONG).show();
        }
		c = help.getAllAzkarInCategory(getIntent().getExtras().getString("zeker_title"));
		v.setText(getIntent().getExtras().getString("title"));
		if(c.moveToFirst()){
			do{
				t.setText((t.getText().toString()+"\n\n"+c.getString(1)));
			}while(c.moveToNext());
		}
	}
	
}
