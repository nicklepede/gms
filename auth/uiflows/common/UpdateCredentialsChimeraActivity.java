package com.google.android.gms.auth.uiflows.common;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afkv;
import defpackage.afla;
import defpackage.atmt;
import defpackage.auad;
import defpackage.jzw;
import defpackage.jzx;
import defpackage.kaj;
import defpackage.wyw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateCredentialsChimeraActivity extends afkv implements jzw {
    private static final auad j = new auad("Auth", "UpdateCredentialsActivity");
    private static final acno k = new acno("account_type");
    private static final acno l = new acno("auth_code");
    public static final acno h = new acno("token_handle");
    public static final acno i = new acno("succeeded");

    public static Intent j(Context context, Account account, String str, boolean z, atmt atmtVar) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.UpdateCredentialsActivity");
        acnp x = afkv.x(atmtVar, z);
        x.d(k, account);
        x.d(l, str);
        return className.putExtras(x.a);
    }

    @Override // defpackage.jzw
    public final kaj a(int i2, Bundle bundle) {
        return new afla(this, (Account) s().a(k), (String) s().a(l), t().c);
    }

    @Override // defpackage.jzw
    public final /* bridge */ /* synthetic */ void b(kaj kajVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        Account account = (Account) s().a(k);
        if (bundle == null || !bundle.getBoolean(i.a)) {
            j.m("Failed to update credentials for account: ".concat(String.valueOf(auad.q(account))), new Object[0]);
            gT(0, null);
            return;
        }
        j.h("Updated credentials for account: ".concat(String.valueOf(auad.q(account))), new Object[0]);
        gT(-1, new Intent().putExtras(bundle));
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "UpdateCredentialsActivity";
    }

    @Override // defpackage.afkn
    protected final void gX() {
        if (wyw.a.a(this)) {
            setTheme(R.style.TvMinuteMaidOpaque);
        } else {
            super.gX();
        }
    }

    @Override // defpackage.afkv, defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (wyw.a.a(this)) {
            setContentView(LayoutInflater.from(this).inflate(R.layout.auth_tv_suw_glif_activity, (ViewGroup) null));
        }
        jzx.a(this).c(0, null, this);
    }

    @Override // defpackage.jzw
    public final void c(kaj kajVar) {
    }
}
