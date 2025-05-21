package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.presencemanager.ActiveUser;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asnd;
import defpackage.bqna;
import defpackage.cwsd;
import defpackage.cwsg;
import defpackage.cwsh;
import defpackage.cwuh;
import defpackage.cwun;
import defpackage.dfap;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.doci;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.ensi;
import defpackage.enss;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class i {
    public final Context a;
    public final bqna b;
    public final cwsh c;
    private final cwsg d;

    public i(Context context, bqna bqnaVar) {
        cwuh cwuhVar = new cwuh(context);
        cwun cwunVar = new cwun(context);
        this.a = context;
        this.b = bqnaVar;
        this.d = cwuhVar;
        this.c = cwunVar;
    }

    static i a(Context context) {
        return new i(context, bqna.b(context));
    }

    final enss b() {
        arcy arcyVar = new arcy();
        arcyVar.c = new Feature[]{cwsd.c};
        arcyVar.a = new arco() { // from class: cwue
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                cwuo cwuoVar = (cwuo) obj;
                int i = cwuh.a;
                cwug cwugVar = new cwug((dfau) obj2);
                Context context = cwuoVar.r;
                ((cwts) cwuoVar.H()).a(cwugVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        arcyVar.d = 25803;
        return enox.f(enps.f(ensi.h(doci.b(((aqxo) this.d).iT(arcyVar.a()).f(new dfap() { // from class: com.google.android.gms.ads.social.f
            @Override // defpackage.dfap
            public final dfaq a(Object obj) {
                ActiveUser activeUser = (ActiveUser) obj;
                return activeUser == null ? dfbl.d("") : i.this.c.a(activeUser);
            }
        }))), new eiho() { // from class: com.google.android.gms.ads.social.g
            @Override // defpackage.eiho
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
                        String str4 = uny.a;
                    } catch (IOException | unx unused) {
                    }
                    if (str2.equals(uoh.e(context, str))) {
                        str3 = account.name;
                        break;
                    }
                    continue;
                }
                return str3;
            }
        }, com.google.android.gms.ads.internal.util.future.e.a), Throwable.class, new eiho() { // from class: com.google.android.gms.ads.social.h
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ((Throwable) obj).getMessage();
                return "";
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }

    final String c(String str) {
        Account c = asnd.c(this.a, str);
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
