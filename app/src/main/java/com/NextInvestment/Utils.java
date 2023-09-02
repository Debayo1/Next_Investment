package com.NextInvestment;


import android.content.Context;
import android.view.View;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.app.Activity;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.animation.*;
import android.widget.ImageView;
import org.json.*;

import java.util.*;

public class Utils {
	
	public static HashMap<String, Object> getHashMap(String st) {
		return ((HashMap<String, Object>) new Gson().fromJson(st, new TypeToken<HashMap<String, Object>>(){}.getType()));
	}
	
	public static void checkTheme(Context context) {
        PreferenceHelper.setDefaultSettings(context);
		switch(Utils.getHashMap(PreferenceHelper.retriveSettings(context)).get("theme").toString()) {
			case "system":
			    int nightModeFlags = context.getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
			
			    if (nightModeFlags == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
					((android.app.Activity) context).setTheme(R.style.DarkAppTheme);
				} else {
					((android.app.Activity) context).setTheme(R.style.AppTheme);
				}
			    break;
			case "light":
				((android.app.Activity) context).setTheme(R.style.AppTheme);
			    break;
			case "dark":
			    ((android.app.Activity) context).setTheme(R.style.DarkAppTheme);
			    break;
		}
		
	}
	
	
	public static void imageViewTheme(ImageView iv) {
		iv.setColorFilter(ColorHelper.getInverseColor(iv.getContext()), PorterDuff.Mode.SRC_IN);
	}
	public static void imageViewTheme(ImageView... ivs) {
		for(ImageView iv : ivs) {
			imageViewTheme(iv);
		}
	}
}
