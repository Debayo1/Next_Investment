package com.NextInvestment;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private ImageView imageview6;
	private TextView textview33;
	private LinearLayout linear32;
	private ImageView imageview4;
	private ImageView imageview3;
	private ScrollView vscroll2;
	private LinearLayout linear13;
	private LinearLayout linear5;
	private TextView textview4;
	private TextView textview6;
	private LinearLayout linear10;
	private TextView textview35;
	private TextView textview34;
	private LinearLayout linear15;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear22;
	private LinearLayout linear25;
	private TextView textview31;
	private TextView textview27;
	private LinearLayout linear28;
	private TextView textview32;
	private LinearLayout linear9;
	private LinearLayout linear6;
	private TextView textview5;
	private TextView textview1;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview2;
	private TextView textview3;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private TextView textview8;
	private TextView textview9;
	private TextView textview11;
	private TextView textview10;
	private TextView textview7;
	private ImageView imageview1;
	private ImageView imageview2;
	private LinearLayout linear17;
	private LinearLayout linear16;
	private TextView textview13;
	private TextView textview12;
	private TextView textview20;
	private TextView textview39;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private TextView textview15;
	private TextView textview21;
	private TextView textview14;
	private TextView textview22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private TextView textview17;
	private TextView textview23;
	private TextView textview16;
	private TextView textview24;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private TextView textview19;
	private TextView textview25;
	private TextView textview18;
	private TextView textview26;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private TextView textview29;
	private TextView textview36;
	private TextView textview28;
	private TextView textview37;
	private TextView textview30;
	private TextView textview38;
	
	private PopupWindow popp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
        Utils.checkTheme(this);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		imageview6 = findViewById(R.id.imageview6);
		textview33 = findViewById(R.id.textview33);
		linear32 = findViewById(R.id.linear32);
		imageview4 = findViewById(R.id.imageview4);
		imageview3 = findViewById(R.id.imageview3);
		vscroll2 = findViewById(R.id.vscroll2);
		linear13 = findViewById(R.id.linear13);
		linear5 = findViewById(R.id.linear5);
		textview4 = findViewById(R.id.textview4);
		textview6 = findViewById(R.id.textview6);
		linear10 = findViewById(R.id.linear10);
		textview35 = findViewById(R.id.textview35);
		textview34 = findViewById(R.id.textview34);
		linear15 = findViewById(R.id.linear15);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear22 = findViewById(R.id.linear22);
		linear25 = findViewById(R.id.linear25);
		textview31 = findViewById(R.id.textview31);
		textview27 = findViewById(R.id.textview27);
		linear28 = findViewById(R.id.linear28);
		textview32 = findViewById(R.id.textview32);
		linear9 = findViewById(R.id.linear9);
		linear6 = findViewById(R.id.linear6);
		textview5 = findViewById(R.id.textview5);
		textview1 = findViewById(R.id.textview1);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		hscroll1 = findViewById(R.id.hscroll1);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear14 = findViewById(R.id.linear14);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview11 = findViewById(R.id.textview11);
		textview10 = findViewById(R.id.textview10);
		textview7 = findViewById(R.id.textview7);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		linear17 = findViewById(R.id.linear17);
		linear16 = findViewById(R.id.linear16);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview20 = findViewById(R.id.textview20);
		textview39 = findViewById(R.id.textview39);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		textview15 = findViewById(R.id.textview15);
		textview21 = findViewById(R.id.textview21);
		textview14 = findViewById(R.id.textview14);
		textview22 = findViewById(R.id.textview22);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		textview17 = findViewById(R.id.textview17);
		textview23 = findViewById(R.id.textview23);
		textview16 = findViewById(R.id.textview16);
		textview24 = findViewById(R.id.textview24);
		linear26 = findViewById(R.id.linear26);
		linear27 = findViewById(R.id.linear27);
		textview19 = findViewById(R.id.textview19);
		textview25 = findViewById(R.id.textview25);
		textview18 = findViewById(R.id.textview18);
		textview26 = findViewById(R.id.textview26);
		linear29 = findViewById(R.id.linear29);
		linear30 = findViewById(R.id.linear30);
		linear31 = findViewById(R.id.linear31);
		textview29 = findViewById(R.id.textview29);
		textview36 = findViewById(R.id.textview36);
		textview28 = findViewById(R.id.textview28);
		textview37 = findViewById(R.id.textview37);
		textview30 = findViewById(R.id.textview30);
		textview38 = findViewById(R.id.textview38);
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				View poppV = getLayoutInflater().inflate(R.layout.settings, null);
				final PopupWindow popp = new PopupWindow(poppV, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
				popp.setAnimationStyle(android.R.style.Animation_Dialog);
				popp.showAsDropDown(imageview3, 0,0);
				popp.setBackgroundDrawable(new BitmapDrawable());
				final TextView systemText1 = poppV.findViewById(R.id.systemText1);
				final TextView systemText2 = poppV.findViewById(R.id.systemText2);
				final TextView lightText1 = poppV.findViewById(R.id.lightText1);
				final TextView lightText2 = poppV.findViewById(R.id.lightText2);
				final TextView darkText1 = poppV.findViewById(R.id.darkText1);
				final TextView darkText2 = poppV.findViewById(R.id.darkText2);
				final LinearLayout systemBtn = poppV.findViewById(R.id.systemBtn);
				final LinearLayout lightBtn = poppV.findViewById(R.id.lightBtn);
				final LinearLayout darkBtn = poppV.findViewById(R.id.darkBtn);
				systemText1.setTextColor(ColorHelper.getInverseColor(MainActivity.this));
				systemText2.setTextColor(ColorHelper.getInverseColor(MainActivity.this));
				
				lightText1.setTextColor(ColorHelper.getInverseColor(MainActivity.this));
				lightText2.setTextColor(ColorHelper.getInverseColor(MainActivity.this));
				
				darkText1.setTextColor(ColorHelper.getInverseColor(MainActivity.this));
				darkText2.setTextColor(ColorHelper.getInverseColor(MainActivity.this));
				
				
				final HashMap<String, Object> m = Utils.getHashMap(PreferenceHelper.retriveSettings(MainActivity.this));
				if (m.get("theme").toString().equals("system")) {
					systemText1.setTextColor(0xFFFFFFFF);
					systemText2.setTextColor(0xFFFFFFFF);
					
					
					systemBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.drawbleee2));
				}
				else {
					if (m.get("theme").toString().equals("light")) {
						lightText1.setTextColor(0xFFFFFFFF);
						lightText2.setTextColor(0xFFFFFFFF);
						
						
						lightBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.drawbleee2));
					}
					else {
						if (m.get("theme").toString().equals("dark")) {
							darkText1.setTextColor(0xFFFFFFFF);
							darkText2.setTextColor(0xFFFFFFFF);
							
							
							darkBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.drawbleee2));
						}
					}
				}
				systemBtn.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						m.put("theme", "system");
						PreferenceHelper.saveSettings(MainActivity.this, new com.google.gson.Gson().toJson(m));
						
						recreate();
					}
				});
				lightBtn.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						m.put("theme", "light");
						PreferenceHelper.saveSettings(MainActivity.this, new com.google.gson.Gson().toJson(m));
						
						recreate();
					}
				});
				darkBtn.setOnClickListener(new View.OnClickListener(){
					@Override
					public void onClick(View _view){
						m.put("theme", "dark");
						PreferenceHelper.saveSettings(MainActivity.this, new com.google.gson.Gson().toJson(m));
						
						recreate();
					}
				});
			}
		});
	}
	
	private void initializeLogic() {
		Utils.imageViewTheme(new ImageView[] {imageview1, imageview2, imageview3, imageview4});
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}