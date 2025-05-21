package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.aano;
import defpackage.aanp;
import defpackage.adee;
import defpackage.adef;
import defpackage.adit;
import defpackage.adiu;
import defpackage.adiv;
import defpackage.adiw;
import defpackage.adix;
import defpackage.adiy;
import defpackage.adiz;
import defpackage.adja;
import defpackage.adko;
import defpackage.arka;
import defpackage.arke;
import defpackage.arwm;
import defpackage.ejxr;
import defpackage.ejxz;
import defpackage.ejya;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkdo;
import defpackage.fkie;
import defpackage.vcw;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AddAccountChimeraActivity extends adko implements adee {
    public static final aano h = new aano("account");
    public static final aano i = new aano("offers_intent");
    public static final aano j = new aano("dm_status");
    public static final aano k = new aano("is_eligible_for_unmanaged_work_profile");
    public static final aano l = new aano("is_unicorn_account");
    private static final aano m = new aano("token_handle");
    private adit n;

    public static Intent b(Context context, String str, boolean z, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, arke arkeVar, boolean z6) {
        int i2 = true != fkie.c() ? -1 : R.drawable.ic_logo_google;
        adja adjaVar = adja.c;
        if (!fkdo.j()) {
            arwm.s(str3);
        }
        return adjaVar.a(context, new adit(z4, arkeVar, R.string.auth_signing_in_title, i2, str, z, str2, str3, str4, z2, z3, z5, z6));
    }

    public static void o(Context context, fecj fecjVar, boolean z, String str, boolean z2, boolean z3) {
        ejxr ejxrVar = ((ejya) fecjVar.b).v;
        if (ejxrVar == null) {
            ejxrVar = ejxr.a;
        }
        fecj fecjVar2 = (fecj) ejxrVar.iB(5, null);
        fecjVar2.X(ejxrVar);
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        int i2 = true == z2 ? 4 : 5;
        fecp fecpVar = fecjVar2.b;
        ejxr ejxrVar2 = (ejxr) fecpVar;
        ejxrVar2.c = i2 - 1;
        ejxrVar2.b |= 1;
        if (z) {
            if (!fecpVar.L()) {
                fecjVar2.U();
            }
            ejxr ejxrVar3 = (ejxr) fecjVar2.b;
            ejxrVar3.d = 1;
            ejxrVar3.b |= 2;
        }
        if (arka.f(str)) {
            int i3 = ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) == 0 ? 2 : 3;
            if (!fecjVar2.b.L()) {
                fecjVar2.U();
            }
            fecp fecpVar2 = fecjVar2.b;
            ejxr ejxrVar4 = (ejxr) fecpVar2;
            ejxrVar4.e = i3 - 1;
            ejxrVar4.b |= 4;
            int i4 = true == z3 ? 3 : 2;
            if (!fecpVar2.L()) {
                fecjVar2.U();
            }
            ejxr ejxrVar5 = (ejxr) fecjVar2.b;
            ejxrVar5.f = i4 - 1;
            ejxrVar5.b |= 8;
        }
        ejxr ejxrVar6 = (ejxr) fecjVar2.Q();
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ejya ejyaVar = (ejya) fecjVar.b;
        ejxrVar6.getClass();
        ejyaVar.v = ejxrVar6;
        ejyaVar.b |= 2097152;
    }

    private final void p(adiz adizVar) {
        gD(adizVar.b, adizVar.c);
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "AddAccountActivity";
    }

    @Override // defpackage.adkg
    protected final void gH() {
        if (vcw.a.a(this)) {
            vcw.c(this, null);
        } else {
            super.gH();
        }
    }

    @Override // defpackage.adee
    public final void j(Account account, String str, boolean z, Intent intent, boolean z2, String str2, boolean z3) {
        o(this, w(), this.n.f, str, z2, z);
        boolean z4 = this.n.m;
        aanp aanpVar = new aanp();
        aanpVar.d(h, account);
        aanpVar.d(j, str);
        aanpVar.d(l, Boolean.valueOf(z));
        aanpVar.d(i, intent);
        aanpVar.d(m, str2);
        aanpVar.d(k, Boolean.valueOf(z3));
        Intent putExtras = new Intent().putExtras(aanpVar.a);
        if (z2 && z4) {
            p(new adix(putExtras));
        } else {
            p(new adiy(putExtras));
        }
    }

    @Override // defpackage.adee
    public final void k() {
        Log.w("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] Failed to add account.", new Object[0]));
        boolean z = this.n.f;
        ejxr ejxrVar = ((ejya) w().b).v;
        if (ejxrVar == null) {
            ejxrVar = ejxr.a;
        }
        fecj fecjVar = (fecj) ejxrVar.iB(5, null);
        fecjVar.X(ejxrVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fecp fecpVar = fecjVar.b;
        ejxr ejxrVar2 = (ejxr) fecpVar;
        ejxrVar2.c = 5;
        ejxrVar2.b |= 1;
        if (z) {
            if (!fecpVar.L()) {
                fecjVar.U();
            }
            ejxr ejxrVar3 = (ejxr) fecjVar.b;
            ejxrVar3.d = 1;
            ejxrVar3.b |= 2;
        }
        fecj w = w();
        ejxr ejxrVar4 = (ejxr) fecjVar.Q();
        if (!w.b.L()) {
            w.U();
        }
        ejya ejyaVar = (ejya) w.b;
        ejxrVar4.getClass();
        ejyaVar.v = ejxrVar4;
        ejyaVar.b |= 2097152;
        p(adiu.a);
    }

    @Override // defpackage.adee
    public final void l(int i2) {
        int i3;
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] FRP still locked, error = %d", Integer.valueOf(i2)));
        ejxr ejxrVar = ((ejya) w().b).v;
        if (ejxrVar == null) {
            ejxrVar = ejxr.a;
        }
        fecj fecjVar = (fecj) ejxrVar.iB(5, null);
        fecjVar.X(ejxrVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ejxr ejxrVar2 = (ejxr) fecjVar.b;
        ejxrVar2.c = 1;
        ejxrVar2.b |= 1;
        ejxr ejxrVar3 = (ejxr) fecjVar.Q();
        fecj w = w();
        if (!w.b.L()) {
            w.U();
        }
        ejya ejyaVar = (ejya) w.b;
        ejxrVar3.getClass();
        ejyaVar.v = ejxrVar3;
        ejyaVar.b |= 2097152;
        if (i2 == 3) {
            Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] Password recently changed", new Object[0]));
            i3 = R.string.auth_factory_reset_protection_recent_password_change_toast;
        } else if (i2 == 5) {
            Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] Wrong account used.", new Object[0]));
            i3 = R.string.auth_factory_reset_protection_wrong_account_toast;
        } else {
            Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] Unknown error happened on server side.", new Object[0]));
            i3 = R.string.auth_factory_reset_protection_unknown_error_toast;
        }
        Toast.makeText(this, i3, 1).show();
        p(adiv.a);
    }

    @Override // defpackage.adee
    public final void n() {
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] FRP unlocked.", new Object[0]));
        ejxr ejxrVar = ((ejya) w().b).v;
        if (ejxrVar == null) {
            ejxrVar = ejxr.a;
        }
        fecj fecjVar = (fecj) ejxrVar.iB(5, null);
        fecjVar.X(ejxrVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ejxr ejxrVar2 = (ejxr) fecjVar.b;
        ejxrVar2.c = 2;
        ejxrVar2.b |= 1;
        ejxr ejxrVar3 = (ejxr) fecjVar.Q();
        fecj w = w();
        if (!w.b.L()) {
            w.U();
        }
        ejya ejyaVar = (ejya) w.b;
        ejxrVar3.getClass();
        ejyaVar.v = ejxrVar3;
        ejyaVar.b |= 2097152;
        p(adiw.a);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] onBackPressed. Ignore.", new Object[0]));
    }

    @Override // defpackage.adko, defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = (adit) adja.c.j(getIntent());
        if (vcw.a.a(this)) {
            vcw.b(this);
        }
        adit aditVar = this.n;
        boolean z = aditVar.f;
        adef.x(this, true, aditVar.l, aditVar.e, aditVar.g, aditVar.h, aditVar.i, aditVar.j, aditVar.k, aditVar.b.c);
        if ((((ejya) w().b).b & 2097152) != 0) {
            return;
        }
        fecj w = w();
        ejxz ejxzVar = ejxz.ADD_ACCOUNT_EVENT;
        if (!w.b.L()) {
            w.U();
        }
        ejya ejyaVar = (ejya) w.b;
        ejyaVar.e = ejxzVar.aw;
        ejyaVar.b |= 1;
        ejxr ejxrVar = ejxr.a;
        if (!w.b.L()) {
            w.U();
        }
        ejya ejyaVar2 = (ejya) w.b;
        ejxrVar.getClass();
        ejyaVar2.v = ejxrVar;
        ejyaVar2.b = 2097152 | ejyaVar2.b;
    }
}
