package com.andretissot.firebasecrashreport;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import com.google.firebase.crash.FirebaseCrash;


/**
 * Created by André Augusto Tissot on 15/10/16.
 */

public class FirebaseCrashReport extends CordovaPlugin {
    public boolean execute(final String action, final JSONArray args,
                           final CallbackContext callbackContext) throws JSONException {
        if (action.equals("log")) {
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        FirebaseCrash.report(new Exception(args.getString(0)));
                        callbackContext.success(1);
                    } catch (Exception e){
                        FirebaseCrash.log(e.getMessage());
                        e.printStackTrace();
                        callbackContext.error(e.getMessage());
                    }
                }
            });
        } else return false;
        return true;
    }
}
