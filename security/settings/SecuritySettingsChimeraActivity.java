package com.google.android.gms.security.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.mdm.settings.AdmSettingsChimeraActivity;
import defpackage.aumh;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.cfgo;
import defpackage.dbbw;
import defpackage.dbgi;
import defpackage.dbgk;
import defpackage.dbgw;
import defpackage.elgx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SecuritySettingsChimeraActivity extends dbgi {
    public auwj j;
    private boolean k;

    @Override // defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        hO().o(true);
        super.onCreate(bundle);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != R.id.security_apps_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        l(elgx.m("isMdmVisible", String.valueOf(this.k), "isVerifyAppsVisible", "true"), aumh.a());
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        if (this.j == null) {
            return;
        }
        new dbgk(this).start();
    }

    @Override // defpackage.apzf
    protected final void q(auwh auwhVar) {
        auwe H = auwhVar.H(R.string.common_mdm_feature_name);
        boolean d = new cfgo(this).d();
        this.k = d;
        if (d) {
            auwj auwjVar = new auwj(this);
            auwjVar.r(R.string.common_mdm_feature_name);
            auwjVar.p(R.string.mdm_settings_locate_title);
            auwjVar.m(AdmSettingsChimeraActivity.k(this));
            H.k(auwjVar);
        }
        auwe H2 = auwhVar.H(R.string.security_status_section_title);
        int i = VerifyAppsSettingsChimeraActivity.x;
        new dbgw(this).start();
        auwj auwjVar2 = new auwj(this);
        this.j = auwjVar2;
        auwjVar2.r(R.string.google_play_protect_title);
        this.j.m(dbbw.n(this, 2));
        H2.k(this.j);
    }
}
