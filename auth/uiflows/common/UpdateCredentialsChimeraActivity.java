package com.google.android.gms.auth.uiflows.common;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import defpackage.aano;
import defpackage.aanp;
import defpackage.adko;
import defpackage.adkt;
import defpackage.arke;
import defpackage.arxo;
import defpackage.jth;
import defpackage.jti;
import defpackage.jtu;
import defpackage.vcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UpdateCredentialsChimeraActivity extends adko implements jth {
    private static final arxo j = new arxo("Auth", "UpdateCredentialsActivity");
    private static final aano k = new aano("account_type");
    private static final aano l = new aano("auth_code");
    public static final aano h = new aano("token_handle");
    public static final aano i = new aano("succeeded");

    public static Intent j(Context context, Account account, String str, boolean z, arke arkeVar) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.UpdateCredentialsActivity");
        aanp x = adko.x(arkeVar, z);
        x.d(k, account);
        x.d(l, str);
        return className.putExtras(x.a);
    }

    @Override // defpackage.jth
    public final jtu a(int i2, Bundle bundle) {
        return new adkt(this, (Account) s().a(k), (String) s().a(l), t().c);
    }

    @Override // defpackage.jth
    public final /* bridge */ /* synthetic */ void b(jtu jtuVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        Account account = (Account) s().a(k);
        if (bundle == null || !bundle.getBoolean(i.a)) {
            j.m("Failed to update credentials for account: ".concat(String.valueOf(arxo.q(account))), new Object[0]);
            gD(0, null);
            return;
        }
        j.h("Updated credentials for account: ".concat(String.valueOf(arxo.q(account))), new Object[0]);
        gD(-1, new Intent().putExtras(bundle));
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "UpdateCredentialsActivity";
    }

    @Override // defpackage.adkg
    protected final void gH() {
        if (vcw.a.a(this)) {
            setTheme(R.style.TvMinuteMaidOpaque);
        } else {
            super.gH();
        }
    }

    @Override // defpackage.adko, defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (vcw.a.a(this)) {
            setContentView(LayoutInflater.from(this).inflate(R.layout.auth_tv_suw_glif_activity, (ViewGroup) null));
        }
        jti.a(this).c(0, null, this);
    }

    @Override // defpackage.jth
    public final void c(jtu jtuVar) {
    }
}
