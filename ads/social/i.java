package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.presencemanager.ActiveUser;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auqx;
import defpackage.bsup;
import defpackage.czca;
import defpackage.czcd;
import defpackage.czce;
import defpackage.czee;
import defpackage.czek;
import defpackage.dhlv;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dqmr;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqgb;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.wjw;
import defpackage.wjx;
import defpackage.wkg;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class i {
    public final Context a;
    public final bsup b;
    public final czce c;
    private final czcd d;

    public i(Context context, bsup bsupVar) {
        czee czeeVar = new czee(context);
        czek czekVar = new czek(context);
        this.a = context;
        this.b = bsupVar;
        this.d = czeeVar;
        this.c = czekVar;
    }

    static i a(Context context) {
        return new i(context, bsup.b(context));
    }

    final eqgl b() {
        atfn atfnVar = new atfn();
        atfnVar.c = new Feature[]{czca.c};
        atfnVar.a = new atfd() { // from class: czeb
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                czel czelVar = (czel) obj;
                int i = czee.a;
                ((czdp) czelVar.H()).a(new czed((dhma) obj2), bsxa.a(czelVar.r));
            }
        };
        atfnVar.d = 25803;
        eqgb h = eqgb.h(dqmr.b(((atad) this.d).ji(atfnVar.a()).f(new dhlv() { // from class: com.google.android.gms.ads.social.f
            @Override // defpackage.dhlv
            public final dhlw a(Object obj) {
                ActiveUser activeUser = (ActiveUser) obj;
                return activeUser == null ? dhmr.d("") : i.this.c.a(activeUser);
            }
        })));
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.social.g
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Context context;
                String str;
                String str2 = (String) obj;
                String str3 = "";
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                i iVar = i.this;
                for (Account account : iVar.d()) {
                    try {
                        context = iVar.a;
                        str = account.name;
                        String str4 = wjx.a;
                    } catch (IOException | wjw unused) {
                    }
                    if (str2.equals(wkg.e(context, str))) {
                        str3 = account.name;
                        break;
                    }
                    continue;
                }
                return str3;
            }
        };
        eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.a;
        return eqcq.f(eqdl.f(h, ekutVar, eqgoVar), Throwable.class, new ekut() { // from class: com.google.android.gms.ads.social.h
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ((Throwable) obj).getMessage();
                return "";
            }
        }, eqgoVar);
    }

    final String c(String str) {
        Account c = auqx.c(this.a, str);
        if (c == null) {
            return null;
        }
        return c.name;
    }

    final Account[] d() {
        Account[] p = this.b.p("com.google");
        return p != null ? p : new Account[0];
    }
}
