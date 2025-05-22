package com.google.android.gms.adsidentity.settings;

import android.app.UiModeManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.fmqy;
import defpackage.ig;
import defpackage.rxx;
import defpackage.vda;
import defpackage.vdf;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdsIdentitySettingsChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fmqy.i()) {
            fmqy.v();
            startActivity(new Intent("com.google.android.gms.settings.ADS_PRIVACY").setPackage(getPackageName()));
            finish();
            return;
        }
        if (fmqy.s() && ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4) {
            setTheme(R.style.Theme_GoogleMaterial_Dark);
            ig hO = hO();
            if (hO != null) {
                hO.z(R.string.common_ads_settings_title);
            }
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(android.R.id.content, new vdf());
            bpVar.d();
            return;
        }
        ig hO2 = hO();
        if (hO2 != null) {
            hO2.z(R.string.common_ads_settings_title);
            hO2.o(true);
            ArrayList<View> arrayList = new ArrayList<>();
            findViewById(R.id.action_bar).findViewsWithText(arrayList, getApplicationContext().getText(R.string.common_ads_settings_title), 1);
            if (!arrayList.isEmpty()) {
                arrayList.get(0).setPadding(10, 0, 0, 0);
            }
        }
        if (fmqy.m()) {
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(android.R.id.content, new vda());
            bpVar2.a();
        } else {
            bp bpVar3 = new bp(getSupportFragmentManager());
            bpVar3.t(android.R.id.content, new vda());
            bpVar3.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
