package com.google.android.gms.auth.uiflows.gettoken;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afji;
import defpackage.afkw;
import defpackage.afln;
import defpackage.aflq;
import defpackage.atmt;
import defpackage.jzw;
import defpackage.jzx;
import defpackage.kaj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetTokenChimeraActivity extends afln implements jzw {
    public static final acno h = new acno("response");
    public static final acno i;
    public static final acno j;
    private static final acno k;

    static {
        new acno("consent_intent");
        i = new acno("isSupervisedMemberAccount");
        j = new acno("request");
        k = new acno("suppress_ui");
    }

    public static Intent j(Context context, TokenRequest tokenRequest, boolean z, boolean z2, atmt atmtVar) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.gettoken.GetTokenActivity");
        acnp acnpVar = new acnp();
        acnpVar.d(j, tokenRequest);
        acnpVar.d(k, Boolean.valueOf(z));
        acnpVar.d(afji.b, Boolean.valueOf(z2));
        acnpVar.d(afji.a, atmtVar.a());
        return className.putExtras(acnpVar.a);
    }

    @Override // defpackage.jzw
    public final kaj a(int i2, Bundle bundle) {
        return new aflq(this, this);
    }

    @Override // defpackage.jzw
    public final /* bridge */ /* synthetic */ void b(kaj kajVar, Object obj) {
        gT(-1, new Intent().putExtras((Bundle) obj));
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "GetTokenActivity";
    }

    @Override // defpackage.afkn
    protected final void gX() {
        if (((Boolean) s().b(k, false)).booleanValue()) {
            setTheme(R.style.InvisibleCustomTitle);
        } else {
            setTheme(R.style.common_Theme_Light_Dialog_MinWidth);
        }
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((Boolean) s().b(k, false)).booleanValue() && bundle == null) {
            afkw afkwVar = new afkw();
            acnp acnpVar = new acnp();
            acnpVar.d(afkw.ah, Integer.valueOf(R.string.auth_gls_name_checking_info_title));
            afkwVar.setArguments(acnpVar.a);
            afkwVar.show(gY(), "dialog");
        }
        jzx.a(this).c(0, null, this);
    }

    @Override // defpackage.jzw
    public final void c(kaj kajVar) {
    }
}
