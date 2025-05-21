package com.google.android.gms.fitness.settings.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.aspy;
import defpackage.asqh;
import defpackage.bgvi;
import defpackage.bhaf;
import defpackage.cslv;
import defpackage.eiig;
import defpackage.focp;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessSettingsChimeraActivity extends bgvi implements View.OnClickListener {
    static {
        bhaf.a();
    }

    public FitnessSettingsChimeraActivity() {
        super(R.string.common_fitness_settings_title);
    }

    private final void k(int i) {
        String languageTag;
        LocaleList localeList;
        if (!aspy.b(this)) {
            Toast.makeText(this, R.string.common_no_network, 1).show();
            return;
        }
        int b = (int) focp.a.a().b();
        focp focpVar = focp.a;
        int a = (int) focpVar.a().a();
        String g = focpVar.a().g();
        if (asqh.a()) {
            localeList = LocaleList.getDefault();
            languageTag = localeList.toLanguageTags();
        } else {
            languageTag = Locale.getDefault().toLanguageTag();
        }
        if (languageTag != null) {
            g = Uri.parse(g).buildUpon().appendQueryParameter("hl", languageTag).build().toString();
        }
        String a2 = a();
        eiig.x(a2);
        Intent c = cslv.c(g, a2, b, a);
        c.addFlags(402653184);
        startActivityForResult(c, i);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                i = 2;
            }
        }
        Intent intent2 = new Intent("com.google.android.gms.fitness.START_SYNC");
        intent2.setPackage("com.google.android.gms");
        intent2.putExtra("account", a());
        intent2.putExtra("sync_source", 4);
        intent2.putExtra("sync_server", true);
        sendBroadcast(intent2);
        if (i == 2) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.connected_apps_and_devices) {
            startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 412).putExtra("extra.accountName", a()), 3);
        } else if (id == R.id.manage_data_sources) {
            k(1);
        }
    }

    @Override // defpackage.bgvi, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("com.google.android.gms.fitness.settings.DELETE_HISTORY".equals(getIntent().getAction())) {
            k(2);
            return;
        }
        setContentView(R.layout.fitness_settings);
        View findViewById = findViewById(R.id.connected_apps_and_devices);
        findViewById(R.id.manage_data_sources).setOnClickListener(this);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(this);
    }
}
