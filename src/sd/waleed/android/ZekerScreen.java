package sd.waleed.android;

import java.io.IOException;



import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZekerScreen extends ListActivity { 
    //TextView t ;
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
		
		//t = (TextView)findViewById(R.id.content);
		
		//Typeface face = Typeface.createFromAsset(getAssets(), "me_quran_volt_newmet.ttf");
		//t.setTypeface(face);
		
		
		v = (TextView)findViewById(R.id.title);
		help = new AzkarHelper(this);
		try {
            help.createDataBase();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_LONG).show();
        }
		c = help.getAllAzkarInCategory(getIntent().getExtras().getString("zeker_title"));		
		startManagingCursor(c);
		v.setText(getIntent().getExtras().getString("title"));
		setListAdapter(new ZekrAdapter(c));
		/*
		if(c.moveToFirst()){
			do{
				//t.setText((t.getText().toString()+"\n\n"+c.getString(1)));
			}while(c.moveToNext());
		}*/
	}
	
	private class ZekrAdapter extends CursorAdapter {
		EditText zekra ;
		public ZekrAdapter(Cursor c){			
			super(ZekerScreen.this,c);			
		}

		@Override
		public void bindView(View arg0, Context arg1, Cursor arg2) {
			// TODO Auto-generated method stub			
			//zekra.setText(arg2.getString(1));
			ZekrHolder holder = (ZekrHolder)arg0.getTag();
			holder.populateFrom(arg2,help);
		}

		@Override
		public View newView(Context arg0, Cursor arg1, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater = getLayoutInflater();
			View row=inflater.inflate(R.layout.zekerrow,parent,false);
			ZekrHolder holder = new ZekrHolder(row);
			row.setTag(holder);
			//zekra = (EditText)row.findViewById(R.id.zekr);
			return row;
		}
	}
	
	static class ZekrHolder {
		private EditText zekr = null;
		private View row = null ;
		
		public ZekrHolder(View row){
			this.row = row ;
			zekr = (EditText)row.findViewById(R.id.zekr);
		}
		
		void populateFrom(Cursor c , AzkarHelper helper ){
			zekr.setText(helper.getZekr(c));
		}
	}
	
}




