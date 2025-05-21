package com.google.android.gms.people.settings;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.armu;
import defpackage.asew;
import defpackage.bp;
import defpackage.cuey;
import defpackage.cufp;
import defpackage.cukz;
import defpackage.cula;
import defpackage.culi;
import defpackage.dg;
import defpackage.frhl;
import defpackage.frhu;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleInternalSettingsChimeraActivity extends qet {
    private culi j;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class MenagerieInternalDebugSettingsOperation extends anxy {
        @Override // defpackage.anxy
        public final GoogleSettingsItem b() {
            Boolean valueOf;
            cufp.O();
            valueOf = Boolean.valueOf(frhu.a.a().bg());
            boolean booleanValue = valueOf.booleanValue();
            cufp.O();
            boolean aP = frhu.a.a().aP();
            Boolean.valueOf(aP).getClass();
            if (!booleanValue || !aP) {
                return null;
            }
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS").setPackage(getPackageName());
            intent.putExtra("settings_mode", 4);
            return new GoogleSettingsItem(intent, 2, "Menagerie Debug Settings", aojj.MENAGERIE_DEBUG_ITEM, asew.DEFAULT_PEOPLE);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class PeopleInternalSettingsOperation extends anxy {
        @Override // defpackage.anxy
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS").setPackage(getPackageName()), 2, "People debug", aojj.PEOPLE_DEBUG_ITEM, asew.DEFAULT_PEOPLE);
            googleSettingsItem.f = true;
            googleSettingsItem.g = ((Boolean) armu.e.i()).booleanValue();
            return googleSettingsItem;
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Boolean valueOf;
        dg culaVar;
        super.onCreate(bundle);
        cufp.O();
        valueOf = Boolean.valueOf(frhu.a.a().bg());
        if (!valueOf.booleanValue()) {
            culi culiVar = new culi();
            this.j = culiVar;
            culiVar.b(this);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
            viewGroup.addView(this.j.a(getLayoutInflater(), viewGroup));
            return;
        }
        setContentView(com.google.android.gms.R.layout.people_settings_fragment_container);
        int intExtra = getIntent().getIntExtra("settings_mode", 0);
        if (frhl.a.a().b() && intExtra == 4) {
            intExtra = 0;
        }
        if (intExtra == 1) {
            culaVar = new cula();
        } else if (intExtra != 4) {
            cuey.e("PeopleISA", "PeopleInternalSettings requires a '%s' extra but did not recognize the value %s", "settings_mode", Integer.valueOf(intExtra));
            finish();
            culaVar = null;
        } else {
            culaVar = new cukz();
        }
        if (culaVar != null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(com.google.android.gms.R.id.people_settings_fragment_container, culaVar);
            bpVar.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        culi culiVar = this.j;
        if (culiVar != null) {
            culiVar.c(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        culi culiVar = this.j;
        if (culiVar != null) {
            culiVar.d(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        culi culiVar = this.j;
        if (culiVar != null) {
            culiVar.e();
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        culi culiVar = this.j;
        if (culiVar != null) {
            culiVar.f();
        }
        super.onStop();
    }
}
