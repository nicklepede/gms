package com.google.android.gms.auth.uiflows.gettoken;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import defpackage.aano;
import defpackage.aanp;
import defpackage.adjb;
import defpackage.adkp;
import defpackage.adlg;
import defpackage.adlj;
import defpackage.arke;
import defpackage.jth;
import defpackage.jti;
import defpackage.jtu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetTokenChimeraActivity extends adlg implements jth {
    public static final aano h = new aano("response");
    public static final aano i;
    public static final aano j;
    private static final aano k;

    static {
        new aano("consent_intent");
        i = new aano("isSupervisedMemberAccount");
        j = new aano("request");
        k = new aano("suppress_ui");
    }

    public static Intent j(Context context, TokenRequest tokenRequest, boolean z, boolean z2, arke arkeVar) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.gettoken.GetTokenActivity");
        aanp aanpVar = new aanp();
        aanpVar.d(j, tokenRequest);
        aanpVar.d(k, Boolean.valueOf(z));
        aanpVar.d(adjb.b, Boolean.valueOf(z2));
        aanpVar.d(adjb.a, arkeVar.a());
        return className.putExtras(aanpVar.a);
    }

    @Override // defpackage.jth
    public final jtu a(int i2, Bundle bundle) {
        return new adlj(this, this);
    }

    @Override // defpackage.jth
    public final /* bridge */ /* synthetic */ void b(jtu jtuVar, Object obj) {
        gD(-1, new Intent().putExtras((Bundle) obj));
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "GetTokenActivity";
    }

    @Override // defpackage.adkg
    protected final void gH() {
        if (((Boolean) s().b(k, false)).booleanValue()) {
            setTheme(R.style.InvisibleCustomTitle);
        } else {
            setTheme(R.style.common_Theme_Light_Dialog_MinWidth);
        }
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((Boolean) s().b(k, false)).booleanValue() && bundle == null) {
            adkp adkpVar = new adkp();
            aanp aanpVar = new aanp();
            aanpVar.d(adkp.ah, Integer.valueOf(R.string.auth_gls_name_checking_info_title));
            adkpVar.setArguments(aanpVar.a);
            adkpVar.show(gI(), "dialog");
        }
        jti.a(this).c(0, null, this);
    }

    @Override // defpackage.jth
    public final void c(jtu jtuVar) {
    }
}
