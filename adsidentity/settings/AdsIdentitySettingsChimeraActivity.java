package com.google.android.gms.adsidentity.settings;

import android.app.UiModeManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.fkas;
import defpackage.ig;
import defpackage.qet;
import defpackage.tha;
import defpackage.thf;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdsIdentitySettingsChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fkas.i()) {
            fkas.w();
            startActivity(new Intent("com.google.android.gms.settings.ADS_PRIVACY").setPackage(getPackageName()));
            finish();
            return;
        }
        if (fkas.s() && ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4) {
            setTheme(R.style.Theme_GoogleMaterial_Dark);
            ig hy = hy();
            if (hy != null) {
                hy.z(R.string.common_ads_settings_title);
            }
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(android.R.id.content, new thf());
            bpVar.d();
            return;
        }
        ig hy2 = hy();
        if (hy2 != null) {
            hy2.z(R.string.common_ads_settings_title);
            hy2.o(true);
            ArrayList<View> arrayList = new ArrayList<>();
            findViewById(R.id.action_bar).findViewsWithText(arrayList, getApplicationContext().getText(R.string.common_ads_settings_title), 1);
            if (!arrayList.isEmpty()) {
                arrayList.get(0).setPadding(10, 0, 0, 0);
            }
        }
        if (fkas.m()) {
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(android.R.id.content, new tha());
            bpVar2.a();
        } else {
            bp bpVar3 = new bp(getSupportFragmentManager());
            bpVar3.t(android.R.id.content, new tha());
            bpVar3.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
