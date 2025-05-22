package com.google.android.gms.notifications.registration.service.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cukw;
import defpackage.cumy;
import defpackage.cunb;
import defpackage.cunf;
import defpackage.eluo;
import defpackage.ffja;
import defpackage.fgrt;
import defpackage.fthr;
import defpackage.fthx;
import defpackage.fxrb;
import defpackage.fxrc;
import defpackage.fxrq;
import defpackage.fxtb;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;
import defpackage.xgt;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AccountsChangeIntentOperation extends cunf {
    public static final ausn a = ausn.b("AccountsChangeIntentOperation", auid.NOTIFICATIONS_REGISTRATION);
    public cukw b;

    public final cukw a() {
        cukw cukwVar = this.b;
        if (cukwVar != null) {
            return cukwVar;
        }
        fxxm.j("chimeGmsAccountStorage");
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Object a2;
        if (fthx.a.lK().i()) {
            if (fxxm.n(intent != null ? intent.getAction() : null, "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                Map e = xgt.e(intent);
                fxxm.e(e, "getRenamedAccounts(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(fxtb.a(e.size()));
                for (Map.Entry entry : e.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((Account) entry.getValue()).name);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(fxtb.a(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Account) entry2.getKey()).name, entry2.getValue());
                }
                if (!linkedHashMap2.isEmpty()) {
                    try {
                        fycs.a(fxuw.a, new cunb(this, linkedHashMap2, null));
                        a2 = fxrq.a;
                    } catch (Throwable th) {
                        a2 = fxrc.a(th);
                    }
                    Throwable a3 = fxrb.a(a2);
                    if (a3 != null) {
                        ((eluo) ((eluo) a.j()).s(a3)).x("Failed to handle username change.");
                    }
                }
            }
        }
        if (new fgrt(fthx.b().c, fthr.a).contains(ffja.ACCOUNT_CHANGED)) {
            ausn ausnVar = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext = getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            fxxm.f(applicationContext, "context");
            cumy.a(applicationContext, "RE_REGISTER_ACCOUNTS_CHANGE");
        }
    }
}
