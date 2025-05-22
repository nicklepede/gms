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
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afeg;
import defpackage.afeh;
import defpackage.afiz;
import defpackage.afja;
import defpackage.afjb;
import defpackage.afjc;
import defpackage.afjd;
import defpackage.afje;
import defpackage.afjf;
import defpackage.afjg;
import defpackage.afkv;
import defpackage.atmp;
import defpackage.atmt;
import defpackage.atzb;
import defpackage.emlc;
import defpackage.emlk;
import defpackage.emll;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmua;
import defpackage.fmyt;
import defpackage.wyw;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AddAccountChimeraActivity extends afkv implements afeg {
    public static final acno h = new acno("account");
    public static final acno i = new acno("offers_intent");
    public static final acno j = new acno("dm_status");
    public static final acno k = new acno("is_eligible_for_unmanaged_work_profile");
    public static final acno l = new acno("is_unicorn_account");
    private static final acno m = new acno("token_handle");
    private afiz n;

    public static Intent b(Context context, String str, boolean z, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, atmt atmtVar, boolean z6) {
        int i2 = true != fmyt.c() ? -1 : R.drawable.ic_logo_google;
        afjg afjgVar = afjg.c;
        if (!fmua.j()) {
            atzb.s(str3);
        }
        return afjgVar.a(context, new afiz(z4, atmtVar, R.string.auth_signing_in_title, i2, str, z, str2, str3, str4, z2, z3, z5, z6));
    }

    public static void o(Context context, fgrc fgrcVar, boolean z, String str, boolean z2, boolean z3) {
        emlc emlcVar = ((emll) fgrcVar.b).v;
        if (emlcVar == null) {
            emlcVar = emlc.a;
        }
        fgrc fgrcVar2 = (fgrc) emlcVar.iQ(5, null);
        fgrcVar2.X(emlcVar);
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        int i2 = true == z2 ? 4 : 5;
        fgri fgriVar = fgrcVar2.b;
        emlc emlcVar2 = (emlc) fgriVar;
        emlcVar2.c = i2 - 1;
        emlcVar2.b |= 1;
        if (z) {
            if (!fgriVar.L()) {
                fgrcVar2.U();
            }
            emlc emlcVar3 = (emlc) fgrcVar2.b;
            emlcVar3.d = 1;
            emlcVar3.b |= 2;
        }
        if (atmp.f(str)) {
            int i3 = ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) == 0 ? 2 : 3;
            if (!fgrcVar2.b.L()) {
                fgrcVar2.U();
            }
            fgri fgriVar2 = fgrcVar2.b;
            emlc emlcVar4 = (emlc) fgriVar2;
            emlcVar4.e = i3 - 1;
            emlcVar4.b |= 4;
            int i4 = true == z3 ? 3 : 2;
            if (!fgriVar2.L()) {
                fgrcVar2.U();
            }
            emlc emlcVar5 = (emlc) fgrcVar2.b;
            emlcVar5.f = i4 - 1;
            emlcVar5.b |= 8;
        }
        emlc emlcVar6 = (emlc) fgrcVar2.Q();
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emll emllVar = (emll) fgrcVar.b;
        emlcVar6.getClass();
        emllVar.v = emlcVar6;
        emllVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
    }

    private final void p(afjf afjfVar) {
        gT(afjfVar.b, afjfVar.c);
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "AddAccountActivity";
    }

    @Override // defpackage.afkn
    protected final void gX() {
        if (wyw.a.a(this)) {
            wyw.c(this, null);
        } else {
            super.gX();
        }
    }

    @Override // defpackage.afeg
    public final void j(Account account, String str, boolean z, Intent intent, boolean z2, String str2, boolean z3) {
        o(this, w(), this.n.f, str, z2, z);
        boolean z4 = this.n.m;
        acnp acnpVar = new acnp();
        acnpVar.d(h, account);
        acnpVar.d(j, str);
        acnpVar.d(l, Boolean.valueOf(z));
        acnpVar.d(i, intent);
        acnpVar.d(m, str2);
        acnpVar.d(k, Boolean.valueOf(z3));
        Intent putExtras = new Intent().putExtras(acnpVar.a);
        if (z2 && z4) {
            p(new afjd(putExtras));
        } else {
            p(new afje(putExtras));
        }
    }

    @Override // defpackage.afeg
    public final void k() {
        Log.w("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] Failed to add account.", new Object[0]));
        boolean z = this.n.f;
        emlc emlcVar = ((emll) w().b).v;
        if (emlcVar == null) {
            emlcVar = emlc.a;
        }
        fgrc fgrcVar = (fgrc) emlcVar.iQ(5, null);
        fgrcVar.X(emlcVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fgri fgriVar = fgrcVar.b;
        emlc emlcVar2 = (emlc) fgriVar;
        emlcVar2.c = 5;
        emlcVar2.b |= 1;
        if (z) {
            if (!fgriVar.L()) {
                fgrcVar.U();
            }
            emlc emlcVar3 = (emlc) fgrcVar.b;
            emlcVar3.d = 1;
            emlcVar3.b |= 2;
        }
        fgrc w = w();
        emlc emlcVar4 = (emlc) fgrcVar.Q();
        if (!w.b.L()) {
            w.U();
        }
        emll emllVar = (emll) w.b;
        emlcVar4.getClass();
        emllVar.v = emlcVar4;
        emllVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        p(afja.a);
    }

    @Override // defpackage.afeg
    public final void l(int i2) {
        int i3;
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] FRP still locked, error = %d", Integer.valueOf(i2)));
        emlc emlcVar = ((emll) w().b).v;
        if (emlcVar == null) {
            emlcVar = emlc.a;
        }
        fgrc fgrcVar = (fgrc) emlcVar.iQ(5, null);
        fgrcVar.X(emlcVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emlc emlcVar2 = (emlc) fgrcVar.b;
        emlcVar2.c = 1;
        emlcVar2.b |= 1;
        emlc emlcVar3 = (emlc) fgrcVar.Q();
        fgrc w = w();
        if (!w.b.L()) {
            w.U();
        }
        emll emllVar = (emll) w.b;
        emlcVar3.getClass();
        emllVar.v = emlcVar3;
        emllVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
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
        p(afjb.a);
    }

    @Override // defpackage.afeg
    public final void n() {
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] FRP unlocked.", new Object[0]));
        emlc emlcVar = ((emll) w().b).v;
        if (emlcVar == null) {
            emlcVar = emlc.a;
        }
        fgrc fgrcVar = (fgrc) emlcVar.iQ(5, null);
        fgrcVar.X(emlcVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emlc emlcVar2 = (emlc) fgrcVar.b;
        emlcVar2.c = 2;
        emlcVar2.b |= 1;
        emlc emlcVar3 = (emlc) fgrcVar.Q();
        fgrc w = w();
        if (!w.b.L()) {
            w.U();
        }
        emll emllVar = (emll) w.b;
        emlcVar3.getClass();
        emllVar.v = emlcVar3;
        emllVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        p(afjc.a);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        Log.i("Auth", String.format(Locale.US, "[AddAccount, AddAccountActivity] onBackPressed. Ignore.", new Object[0]));
    }

    @Override // defpackage.afkv, defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = (afiz) afjg.c.j(getIntent());
        if (wyw.a.a(this)) {
            wyw.b(this);
        }
        afiz afizVar = this.n;
        boolean z = afizVar.f;
        afeh.x(this, true, afizVar.l, afizVar.e, afizVar.g, afizVar.h, afizVar.i, afizVar.j, afizVar.k, afizVar.b.c);
        if ((((emll) w().b).b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            return;
        }
        fgrc w = w();
        emlk emlkVar = emlk.ADD_ACCOUNT_EVENT;
        if (!w.b.L()) {
            w.U();
        }
        emll emllVar = (emll) w.b;
        emllVar.e = emlkVar.ar;
        emllVar.b |= 1;
        emlc emlcVar = emlc.a;
        if (!w.b.L()) {
            w.U();
        }
        emll emllVar2 = (emll) w.b;
        emlcVar.getClass();
        emllVar2.v = emlcVar;
        emllVar2.b = 524288 | emllVar2.b;
    }
}
