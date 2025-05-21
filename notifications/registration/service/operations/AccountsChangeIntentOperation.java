package com.google.android.gms.notifications.registration.service.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.csbr;
import defpackage.csdt;
import defpackage.csdw;
import defpackage.csea;
import defpackage.ejhf;
import defpackage.fcuj;
import defpackage.feda;
import defpackage.fqnv;
import defpackage.fqob;
import defpackage.fuvd;
import defpackage.fuve;
import defpackage.fuvs;
import defpackage.fuxd;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;
import defpackage.vks;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AccountsChangeIntentOperation extends csea {
    public static final asot a = asot.b("AccountsChangeIntentOperation", asej.NOTIFICATIONS_REGISTRATION);
    public csbr b;

    public final csbr a() {
        csbr csbrVar = this.b;
        if (csbrVar != null) {
            return csbrVar;
        }
        fvbo.j("chimeGmsAccountStorage");
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Object a2;
        if (fqob.a.a().i()) {
            if (fvbo.n(intent != null ? intent.getAction() : null, "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                Map e = vks.e(intent);
                fvbo.e(e, "getRenamedAccounts(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(fuxd.a(e.size()));
                for (Map.Entry entry : e.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((Account) entry.getValue()).name);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(fuxd.a(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Account) entry2.getKey()).name, entry2.getValue());
                }
                if (!linkedHashMap2.isEmpty()) {
                    try {
                        fvgu.a(fuyy.a, new csdw(this, linkedHashMap2, null));
                        a2 = fuvs.a;
                    } catch (Throwable th) {
                        a2 = fuve.a(th);
                    }
                    Throwable a3 = fuvd.a(a2);
                    if (a3 != null) {
                        ((ejhf) ((ejhf) a.j()).s(a3)).x("Failed to handle username change.");
                    }
                }
            }
        }
        if (new feda(fqob.b().c, fqnv.a).contains(fcuj.ACCOUNT_CHANGED)) {
            asot asotVar = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext = getApplicationContext();
            fvbo.e(applicationContext, "getApplicationContext(...)");
            fvbo.f(applicationContext, "context");
            csdt.a(applicationContext, "RE_REGISTER_ACCOUNTS_CHANGE");
        }
    }
}
