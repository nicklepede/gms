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
import defpackage.alar;
import defpackage.albk;
import defpackage.aloo;
import defpackage.alop;
import defpackage.eiig;
import defpackage.elwx;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.ig;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AaSettingsActivityImpl extends qet {
    static final ComponentName j = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.DiscoverAaSettingsActivity");

    static boolean k(PackageManager packageManager, String str) {
        return new Intent("com.google.android.projection.gearhead.SETTINGS").setPackage(str).resolveActivity(packageManager) != null;
    }

    public final void a(elxv elxvVar) {
        alar.a(this).c(albk.f(elwx.CAR_SERVICE, elxw.SETTINGS_AA_GOOGLE_SETTINGS, elxvVar).c());
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(elxv.ct);
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
        a(elxv.cu);
        setContentView(R.layout.discover_aa_settings);
        ig hy = hy();
        eiig.x(hy);
        hy.q(4, 4);
        hy.o(true);
        ((TextView) findViewById(R.id.discover_aa_title)).setText(getString(R.string.car_setup_discover_aa, new Object[]{getString(R.string.car_app_name)}));
        int color = getColor(R.color.material_grey_700);
        int[] iArr = {R.id.car_setup_discover_nav, R.id.car_setup_discover_media, R.id.car_setup_discover_messaging, R.id.car_setup_discover_voice_control};
        for (int i = 0; i < 4; i++) {
            ((TextView) findViewById(iArr[i])).getCompoundDrawablesRelative()[0].setTint(color);
        }
        Button button = (Button) findViewById(R.id.car_setup_discover_learn_more);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.android.com/auto"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            button.setOnClickListener(new aloo(this, intent));
        } else {
            button.setVisibility(8);
        }
        ((Button) findViewById(R.id.car_setup_discover_get_app)).setOnClickListener(new alop(this));
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        if (k(getPackageManager(), "com.google.android.projection.gearhead")) {
            finish();
        }
    }
}
