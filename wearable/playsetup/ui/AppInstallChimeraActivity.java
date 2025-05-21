package com.google.android.gms.wearable.playsetup.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.playsetup.ui.AppInstallChimeraActivity;
import defpackage.aqxo;
import defpackage.arwm;
import defpackage.bp;
import defpackage.dfab;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.djks;
import defpackage.dkbd;
import defpackage.dlsx;
import defpackage.ftjs;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AppInstallChimeraActivity extends qet {
    public final void a(AppTheme appTheme, Intent intent) {
        dkbd.f(appTheme, intent, this);
        setContentView(R.layout.wearable_app_install_activity);
        String stringExtra = intent.getStringExtra("node_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("caller_id");
        String str = stringExtra2 != null ? stringExtra2 : "";
        setContentView(R.layout.wearable_app_install_activity);
        boolean booleanExtra = intent.getBooleanExtra("is_le_device", false);
        bp bpVar = new bp(getSupportFragmentManager());
        if (Log.isLoggable("Wear_PlaySetup", 3)) {
            Log.d("Wear_PlaySetup", String.format("[AppInstallFragment] newInstance(%s, %s, %s, %b)", appTheme, stringExtra, str, Boolean.valueOf(booleanExtra)));
        }
        dlsx dlsxVar = new dlsx();
        if (Log.isLoggable("Wear_PlaySetup", 3)) {
            Log.d("Wear_PlaySetup", String.format("[AppInstallFragment] initialize(%b)", Boolean.valueOf(booleanExtra)));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_le_device", booleanExtra);
        bundle.putString("node_id", stringExtra);
        bundle.putString("caller_id", str);
        bundle.putParcelable("theme", appTheme);
        dlsxVar.setArguments(bundle);
        bpVar.z(R.id.fragment_container, dlsxVar, "AppInstallFragment");
        bpVar.a();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (Log.isLoggable("Wear_PlaySetup", 3)) {
            Log.d("Wear_PlaySetup", "Received back button event, canceling activity.");
        }
        setResult(0);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ftjs.a.a().c()) {
            Log.w("Wear_PlaySetup", "[AppInstallActivity] Activity invoked but feature is disabled.");
            setResult(2);
            finish();
        }
        final Intent intent = getIntent();
        if (Log.isLoggable("Wear_PlaySetup", 4)) {
            Log.i("Wear_PlaySetup", "[AppInstall Activity] Starting AppInstall activity for AppInstallFragment");
            if (Log.isLoggable("Wear_PlaySetup", 3)) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    Log.d("Wear_PlaySetup", "[AppInstall Activity] Extras: null\n");
                } else {
                    Log.d("Wear_PlaySetup", "[AppInstall Activity] Extras:\n");
                    for (String str : extras.keySet()) {
                        Log.d("Wear_PlaySetup", String.format("    %s: %s", str, extras.get(str)));
                    }
                }
            }
        }
        aqxo d = djks.d(this);
        if (getCallingPackage() == null) {
            a(dkbd.d(), intent);
            return;
        }
        String callingPackage = getCallingPackage();
        arwm.s(callingPackage);
        dfaq bd = d.bd(callingPackage);
        bd.z(new dfak() { // from class: dlsd
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                AppTheme appTheme = (AppTheme) obj;
                if (Log.isLoggable("Wear_PlaySetup", 3)) {
                    Log.d("Wear_PlaySetup", "Result: ".concat(String.valueOf(String.valueOf(appTheme))));
                }
                AppInstallChimeraActivity.this.a(appTheme, intent);
            }
        });
        bd.y(new dfah() { // from class: dlse
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                if (Log.isLoggable("Wear_PlaySetup", 5)) {
                    Log.w("Wear_PlaySetup", "Did not get app theme result ", exc);
                }
                AppInstallChimeraActivity.this.a(dkbd.d(), intent);
            }
        });
        bd.a(new dfab() { // from class: dlsf
            @Override // defpackage.dfab
            public final void jH() {
                AppInstallChimeraActivity.this.a(dkbd.d(), intent);
            }
        });
    }
}
