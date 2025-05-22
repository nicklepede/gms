package com.google.android.gms.clearcut.init;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import defpackage.arxt;
import defpackage.dpya;
import defpackage.fozj;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ClearcutBootCompleteIntentOperation extends IntentOperation {
    private static void a() {
        if (fozj.f()) {
            return;
        }
        ClearcutLoggerChimeraService.a.execute(new Runnable() { // from class: asda
            @Override // java.lang.Runnable
            public final void run() {
                ashm ashmVar = null;
                try {
                    try {
                        ashmVar = ashm.c();
                        ashg a = ashmVar.a();
                        if (a != null) {
                            a.B(3);
                        }
                    } catch (IOException e) {
                        Log.e("CCTBootComplete", "Could not write internal log event: ", e);
                    }
                } finally {
                    autg.f(ashmVar);
                }
            }
        });
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -101572338) {
            if (hashCode == -60251293 && action.equals("android.intent.action.CLEARCUT_BOOT_COMPLETED")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            a();
            return;
        }
        if (c != 1) {
            return;
        }
        int i = arxt.a;
        if (Build.VERSION.SDK_INT < 24) {
            arxt.a(this);
            SharedPreferences sharedPreferences = getSharedPreferences("bootCount", 0);
            int i2 = sharedPreferences.getInt("bootCount", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            int i3 = i2 + 1;
            edit.putInt("bootCount", i3);
            edit.apply();
            arxt.a = i3;
            Log.i("CCTBootCount", "(BOOT_COMPLETE intent)Device boot count in Clearcut increased.");
        }
        if (dpya.j()) {
            return;
        }
        a();
    }
}
