package com.NextInvestment;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import android.app.Activity;

public class PreferenceHelper {
    
    public static void saveSettings(Context cxt, String dataToSave) {
        savePreferences(cxt, dataToSave, "SETTINGS", "SETTINGS");
    }
    public static String retriveSettings(Context cxt) {
        // setDefaultSettings(cxt);
        String s = retrivePreferences(cxt, "SETTINGS", "SETTINGS");
        if(s == null || s.equals("")) return "{}";
        return s;
    }
    
    public static void savePreferences(Context cxt, String dataToSave, String filePos, String key) {
        if(getInstance(cxt, filePos) == null) return;
        getInstance(cxt, filePos).edit().putString(key, dataToSave).commit();
    }
    public static String retrivePreferences(Context cxt, String filePos, String key) {
        if(getInstance(cxt, filePos) == null) return "";
        String s = getInstance(cxt, filePos).getString(key, "");
        if(s == null || s.equals("")) return "";
        return s;
    }
    
    public static SharedPreferences getInstance(Context cxt, String fileName) {
        SharedPreferences sh = null;
        try{
            sh = cxt.getSharedPreferences(fileName, Activity.MODE_PRIVATE);
        }catch(Exception e){}
        
        return sh;
            
    }
    
    public static void setDefaultSettings(Context cxt) {
        HashMap<String, Object> m = Utils.getHashMap(retriveSettings(cxt));
        
        if(!m.containsKey("theme")) {
            m.put("theme", "system");
        }
        
        saveSettings(cxt, new com.google.gson.Gson().toJson(m));
    }
    
}
