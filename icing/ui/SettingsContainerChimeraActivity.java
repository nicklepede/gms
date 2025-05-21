package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import defpackage.assn;
import defpackage.blfw;
import defpackage.blmk;
import defpackage.blve;
import defpackage.blvo;
import defpackage.blxc;
import defpackage.blxy;
import defpackage.bp;
import defpackage.fpad;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SettingsContainerChimeraActivity extends qet {
    private blvo j;

    @Override // defpackage.qet
    public final boolean hu() {
        if (getSupportFragmentManager().b() == 0) {
            finish();
            return true;
        }
        getSupportFragmentManager().R();
        return true;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            blfw.f("SettingsContainerChimeraActivity received a null action.");
            return;
        }
        blmk blmkVar = new blmk(getApplicationContext());
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
                bpVar.u(R.id.debug_container, new blxy(), "packagesFragment");
                bpVar.a();
            }
            if (fpad.a.a().ab()) {
                blmkVar.p(7003);
                return;
            }
            return;
        }
        if (c == 1) {
            blmkVar.p(8003);
        } else if (c != 2) {
            blfw.g("SettingsContainerChimeraActivity received unknown intent action: %s", action);
            return;
        }
        blmkVar.p(8005);
        if (this.j == null) {
            this.j = new blvo(this);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("query");
            if (stringExtra == null) {
                stringExtra = "";
            }
            blxc blxcVar = (blxc) getSupportFragmentManager().h("indexablesFragment");
            if (blxcVar != null) {
                blxcVar.x(stringExtra);
            }
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
        blvo blvoVar = this.j;
        if (blvoVar != null) {
            blvoVar.b = true;
            qet qetVar = blvoVar.a;
            qetVar.setTitle(R.string.personalize_using_shared_data_settings_title);
            qetVar.setContentView(R.layout.on_device_sharing_activity);
            blvoVar.c = qetVar.getPackageManager();
            blvoVar.h = new assn(qetVar);
            blvoVar.i = blvoVar.h.H(R.string.personalize_using_shared_data_settings_apps_header);
            blvoVar.j = blvoVar.h.H(R.string.personalize_using_shared_data_settings_other_sources_header);
            blvoVar.h.D(qetVar.getWindow());
            blvoVar.d = (MaterialProgressBar) qetVar.findViewById(R.id.progress);
            blvoVar.e = (TextView) qetVar.findViewById(R.id.empty);
            blvoVar.e.setText(R.string.personalize_using_shared_data_ui_empty);
            blvoVar.f = (TextView) qetVar.findViewById(R.id.error);
            blvoVar.f.setText(R.string.on_device_sharing_ui_error);
            new blve(blvoVar).execute(new Void[0]);
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        blvo blvoVar = this.j;
        if (blvoVar != null) {
            blvoVar.b = false;
        }
    }
}
