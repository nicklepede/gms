package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import defpackage.auwh;
import defpackage.bnmo;
import defpackage.bntc;
import defpackage.bobw;
import defpackage.bocg;
import defpackage.bodu;
import defpackage.boeq;
import defpackage.bp;
import defpackage.frtk;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SettingsContainerChimeraActivity extends rxx {
    private bocg j;

    @Override // defpackage.rxx
    public final boolean hK() {
        if (getSupportFragmentManager().b() == 0) {
            finish();
            return true;
        }
        getSupportFragmentManager().R();
        return true;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            bnmo.f("SettingsContainerChimeraActivity received a null action.");
            return;
        }
        bntc bntcVar = new bntc(getApplicationContext());
        int hashCode = action.hashCode();
        if (hashCode == -1422852856) {
            if (action.equals("com.google.android.gms.icing.PRIVACY_SETTINGS")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -60840178) {
            if (hashCode == 2063728496 && action.equals("com.google.android.gms.icing.APP_INDEXING_DEBUG")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.icing.ON_DEVICE_SHARING_UI")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            setContentView(R.layout.app_indexing_debug_activity);
            if (bundle == null) {
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.u(R.id.debug_container, new boeq(), "packagesFragment");
                bpVar.a();
            }
            if (frtk.a.lK().aa()) {
                bntcVar.p(7003);
                return;
            }
            return;
        }
        if (c == 1) {
            bntcVar.p(8003);
        } else if (c != 2) {
            bnmo.g("SettingsContainerChimeraActivity received unknown intent action: %s", action);
            return;
        }
        bntcVar.p(8005);
        if (this.j == null) {
            this.j = new bocg(this);
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("query");
            if (stringExtra == null) {
                stringExtra = "";
            }
            bodu boduVar = (bodu) getSupportFragmentManager().h("indexablesFragment");
            if (boduVar != null) {
                boduVar.x(stringExtra);
            }
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        super.onStart();
        bocg bocgVar = this.j;
        if (bocgVar != null) {
            bocgVar.b = true;
            rxx rxxVar = bocgVar.a;
            rxxVar.setTitle(R.string.personalize_using_shared_data_settings_title);
            rxxVar.setContentView(R.layout.on_device_sharing_activity);
            bocgVar.c = rxxVar.getPackageManager();
            bocgVar.h = new auwh(rxxVar);
            bocgVar.i = bocgVar.h.H(R.string.personalize_using_shared_data_settings_apps_header);
            bocgVar.j = bocgVar.h.H(R.string.personalize_using_shared_data_settings_other_sources_header);
            bocgVar.h.D(rxxVar.getWindow());
            bocgVar.d = (MaterialProgressBar) rxxVar.findViewById(R.id.progress);
            bocgVar.e = (TextView) rxxVar.findViewById(R.id.empty);
            bocgVar.e.setText(R.string.personalize_using_shared_data_ui_empty);
            bocgVar.f = (TextView) rxxVar.findViewById(R.id.error);
            bocgVar.f.setText(R.string.on_device_sharing_ui_error);
            new bobw(bocgVar).execute(new Void[0]);
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        bocg bocgVar = this.j;
        if (bocgVar != null) {
            bocgVar.b = false;
        }
    }
}
