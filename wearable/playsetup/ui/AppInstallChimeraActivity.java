package com.google.android.gms.wearable.playsetup.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.playsetup.ui.AppInstallChimeraActivity;
import defpackage.atad;
import defpackage.atzb;
import defpackage.bp;
import defpackage.dhlh;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dlwl;
import defpackage.dmmw;
import defpackage.doeo;
import defpackage.fwfk;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AppInstallChimeraActivity extends rxx {
    public final void a(AppTheme appTheme, Intent intent) {
        dmmw.f(appTheme, intent, this);
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
        doeo doeoVar = new doeo();
        if (Log.isLoggable("Wear_PlaySetup", 3)) {
            Log.d("Wear_PlaySetup", String.format("[AppInstallFragment] initialize(%b)", Boolean.valueOf(booleanExtra)));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_le_device", booleanExtra);
        bundle.putString("node_id", stringExtra);
        bundle.putString("caller_id", str);
        bundle.putParcelable("theme", appTheme);
        doeoVar.setArguments(bundle);
        bpVar.z(R.id.fragment_container, doeoVar, "AppInstallFragment");
        bpVar.a();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (Log.isLoggable("Wear_PlaySetup", 3)) {
            Log.d("Wear_PlaySetup", "Received back button event, canceling activity.");
        }
        setResult(0);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fwfk.a.lK().c()) {
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
        atad d = dlwl.d(this);
        if (getCallingPackage() == null) {
            a(dmmw.d(), intent);
            return;
        }
        String callingPackage = getCallingPackage();
        atzb.s(callingPackage);
        dhlw bc = d.bc(callingPackage);
        bc.z(new dhlq() { // from class: dodu
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                AppTheme appTheme = (AppTheme) obj;
                if (Log.isLoggable("Wear_PlaySetup", 3)) {
                    Log.d("Wear_PlaySetup", "Result: ".concat(String.valueOf(String.valueOf(appTheme))));
                }
                AppInstallChimeraActivity.this.a(appTheme, intent);
            }
        });
        bc.y(new dhln() { // from class: dodv
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                if (Log.isLoggable("Wear_PlaySetup", 5)) {
                    Log.w("Wear_PlaySetup", "Did not get app theme result ", exc);
                }
                AppInstallChimeraActivity.this.a(dmmw.d(), intent);
            }
        });
        bc.a(new dhlh() { // from class: dodw
            @Override // defpackage.dhlh
            public final void jX() {
                AppInstallChimeraActivity.this.a(dmmw.d(), intent);
            }
        });
    }
}
