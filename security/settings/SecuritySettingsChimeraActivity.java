package com.google.android.gms.security.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.mdm.settings.AdmSettingsChimeraActivity;
import defpackage.asin;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.ccxq;
import defpackage.cyry;
import defpackage.cywk;
import defpackage.cywm;
import defpackage.cywy;
import defpackage.eits;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SecuritySettingsChimeraActivity extends cywk {
    public assp j;
    private boolean k;

    @Override // defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        hy().o(true);
        super.onCreate(bundle);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != R.id.security_apps_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        l(eits.m("isMdmVisible", String.valueOf(this.k), "isVerifyAppsVisible", "true"), asin.a());
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        if (this.j == null) {
            return;
        }
        new cywm(this).start();
    }

    @Override // defpackage.anxn
    protected final void q(assn assnVar) {
        assk H = assnVar.H(R.string.common_mdm_feature_name);
        boolean d = new ccxq(this).d();
        this.k = d;
        if (d) {
            assp asspVar = new assp(this);
            asspVar.r(R.string.common_mdm_feature_name);
            asspVar.p(R.string.mdm_settings_locate_title);
            asspVar.m(AdmSettingsChimeraActivity.k(this));
            H.k(asspVar);
        }
        assk H2 = assnVar.H(R.string.security_status_section_title);
        int i = VerifyAppsSettingsChimeraActivity.x;
        new cywy(this).start();
        assp asspVar2 = new assp(this);
        this.j = asspVar2;
        asspVar2.r(R.string.google_play_protect_title);
        this.j.m(cyry.n(this, 2));
        H2.k(this.j);
    }
}
