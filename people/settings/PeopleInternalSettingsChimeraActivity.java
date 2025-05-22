package com.google.android.gms.people.settings;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.atpj;
import defpackage.auiq;
import defpackage.bp;
import defpackage.cwof;
import defpackage.cwow;
import defpackage.cwug;
import defpackage.cwuh;
import defpackage.cwup;
import defpackage.dg;
import defpackage.fubg;
import defpackage.fubp;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeopleInternalSettingsChimeraActivity extends rxx {
    private cwup j;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class MenagerieInternalDebugSettingsOperation extends apzq {
        @Override // defpackage.apzq
        public final GoogleSettingsItem b() {
            Boolean valueOf;
            cwow.N();
            valueOf = Boolean.valueOf(fubp.a.lK().bd());
            boolean booleanValue = valueOf.booleanValue();
            cwow.N();
            boolean aN = fubp.a.lK().aN();
            Boolean.valueOf(aN).getClass();
            if (!booleanValue || !aN) {
                return null;
            }
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS").setPackage(getPackageName());
            intent.putExtra("settings_mode", 4);
            return new GoogleSettingsItem(intent, 2, "Menagerie Debug Settings", aqlc.MENAGERIE_DEBUG_ITEM, auiq.DEFAULT_PEOPLE);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class PeopleInternalSettingsOperation extends apzq {
        @Override // defpackage.apzq
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS").setPackage(getPackageName()), 2, "People debug", aqlc.PEOPLE_DEBUG_ITEM, auiq.DEFAULT_PEOPLE);
            googleSettingsItem.f = true;
            googleSettingsItem.g = ((Boolean) atpj.e.i()).booleanValue();
            return googleSettingsItem;
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Boolean valueOf;
        dg cwuhVar;
        super.onCreate(bundle);
        cwow.N();
        valueOf = Boolean.valueOf(fubp.a.lK().bd());
        if (!valueOf.booleanValue()) {
            cwup cwupVar = new cwup();
            this.j = cwupVar;
            cwupVar.b(this);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            viewGroup.addView(this.j.a(getLayoutInflater(), viewGroup));
            return;
        }
        setContentView(com.google.android.gms.R.layout.people_settings_fragment_container);
        int intExtra = getIntent().getIntExtra("settings_mode", 0);
        if (fubg.a.lK().b() && intExtra == 4) {
            intExtra = 0;
        }
        if (intExtra == 1) {
            cwuhVar = new cwuh();
        } else if (intExtra != 4) {
            cwof.e("PeopleISA", "PeopleInternalSettings requires a '%s' extra but did not recognize the value %s", "settings_mode", Integer.valueOf(intExtra));
            finish();
            cwuhVar = null;
        } else {
            cwuhVar = new cwug();
        }
        if (cwuhVar != null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(com.google.android.gms.R.id.people_settings_fragment_container, cwuhVar);
            bpVar.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        cwup cwupVar = this.j;
        if (cwupVar != null) {
            cwupVar.c(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        cwup cwupVar = this.j;
        if (cwupVar != null) {
            cwupVar.d(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        cwup cwupVar = this.j;
        if (cwupVar != null) {
            cwupVar.e();
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        cwup cwupVar = this.j;
        if (cwupVar != null) {
            cwupVar.f();
        }
        super.onStop();
    }
}
