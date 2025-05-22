package com.google.android.gms.carsetup;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.ancc;
import defpackage.ancv;
import defpackage.anpz;
import defpackage.anqa;
import defpackage.ekvl;
import defpackage.eokl;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.ig;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AaSettingsActivityImpl extends rxx {
    static final ComponentName j = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.DiscoverAaSettingsActivity");

    static boolean k(PackageManager packageManager, String str) {
        return new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage(str).resolveActivity(packageManager) != null;
    }

    public final void a(eolj eoljVar) {
        ancc.a(this).c(ancv.f(eokl.CAR_SERVICE, eolk.SETTINGS_AA_GOOGLE_SETTINGS, eoljVar).c());
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(eolj.ct);
        if (getIntent().hasExtra("gearhead_package")) {
            startActivity(new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage(getIntent().getStringExtra("gearhead_package")));
            finish();
            return;
        }
        if (k(getPackageManager(), "com.google.android.projection.gearhead")) {
            startActivity(new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage("com.google.android.projection.gearhead"));
            finish();
            return;
        }
        a(eolj.cu);
        setContentView(R.layout.discover_aa_settings);
        ig hO = hO();
        ekvl.y(hO);
        hO.q(4, 4);
        hO.o(true);
        ((TextView) findViewById(R.id.discover_aa_title)).setText(getString(R.string.car_setup_discover_aa, new Object[]{getString(R.string.car_app_name)}));
        int color = getColor(R.color.material_grey_700);
        int[] iArr = {R.id.car_setup_discover_nav, R.id.car_setup_discover_media, R.id.car_setup_discover_messaging, R.id.car_setup_discover_voice_control};
        for (int i = 0; i < 4; i++) {
            ((TextView) findViewById(iArr[i])).getCompoundDrawablesRelative()[0].setTint(color);
        }
        Button button = (Button) findViewById(R.id.car_setup_discover_learn_more);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.android.com/auto"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            button.setOnClickListener(new anpz(this, intent));
        } else {
            button.setVisibility(8);
        }
        ((Button) findViewById(R.id.car_setup_discover_get_app)).setOnClickListener(new anqa(this));
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        if (k(getPackageManager(), "com.google.android.projection.gearhead")) {
            finish();
        }
    }
}
