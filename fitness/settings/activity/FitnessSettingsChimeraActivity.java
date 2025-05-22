package com.google.android.gms.fitness.settings.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.auts;
import defpackage.auub;
import defpackage.bizy;
import defpackage.bjev;
import defpackage.cuva;
import defpackage.ekvl;
import defpackage.fquy;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessSettingsChimeraActivity extends bizy implements View.OnClickListener {
    static {
        bjev.a();
    }

    public FitnessSettingsChimeraActivity() {
        super(R.string.common_fitness_settings_title);
    }

    private final void k(int i) {
        String languageTag;
        LocaleList localeList;
        if (!auts.b(this)) {
            Toast.makeText(this, R.string.common_no_network, 1).show();
            return;
        }
        fquy fquyVar = fquy.a;
        int b = (int) fquyVar.lK().b();
        int a = (int) fquyVar.lK().a();
        String g = fquyVar.lK().g();
        if (auub.a()) {
            localeList = LocaleList.getDefault();
            languageTag = localeList.toLanguageTags();
        } else {
            languageTag = Locale.getDefault().toLanguageTag();
        }
        if (languageTag != null) {
            g = Uri.parse(g).buildUpon().appendQueryParameter("hl", languageTag).build().toString();
        }
        String a2 = a();
        ekvl.y(a2);
        Intent c = cuva.c(g, a2, b, a);
        c.addFlags(402653184);
        startActivityForResult(c, i);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.bizy, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
