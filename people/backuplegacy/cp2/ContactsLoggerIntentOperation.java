package com.google.android.gms.people.backuplegacy.cp2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.cvts;
import defpackage.cvwv;
import defpackage.cwof;
import defpackage.cwow;
import defpackage.enjv;
import defpackage.enjw;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fubp;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsLoggerIntentOperation extends IntentOperation {
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ba, code lost:
    
        if (r5 != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(android.content.Context r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.backuplegacy.cp2.ContactsLoggerIntentOperation.a(android.content.Context, boolean):void");
    }

    private final void b() {
        cvwv.a(getApplicationContext()).edit().putLong("intent-received-timestamp", System.currentTimeMillis()).apply();
    }

    private final boolean c(Intent intent) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - cvwv.a(getApplicationContext()).getLong("intent-received-timestamp", 0L);
        String action = intent.getAction();
        if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            long C = fubp.a.lK().C();
            Long.valueOf(C).getClass();
            j = timeUnit.toMillis(C);
        } else if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            long F = fubp.a.lK().F();
            Long.valueOf(F).getClass();
            j = timeUnit2.toMillis(F);
        } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            TimeUnit timeUnit3 = TimeUnit.HOURS;
            long E = fubp.a.lK().E();
            Long.valueOf(E).getClass();
            j = timeUnit3.toMillis(E);
        } else {
            j = 0;
        }
        if (currentTimeMillis <= 0 || currentTimeMillis >= j) {
            return false;
        }
        TimeUnit.MILLISECONDS.toMinutes(j);
        return true;
    }

    private static boolean d() {
        Boolean valueOf;
        valueOf = Boolean.valueOf(fubp.a.lK().ak());
        return (valueOf.booleanValue() || cwow.a().booleanValue()) ? false : true;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean valueOf;
        try {
            cwow.N();
            valueOf = Boolean.valueOf(fubp.a.lK().aq());
            if (valueOf.booleanValue()) {
                String action = intent.getAction();
                boolean z = false;
                if (!"com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                    if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
                        return;
                    }
                    if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        cwof.n("CBR_ContactsLoggerIntentOperation", "Received unexpected broadcast: %s", action);
                        return;
                    }
                    if (d()) {
                        return;
                    }
                    Context applicationContext = getApplicationContext();
                    cvts a = cvts.a();
                    if (cvts.a.nextDouble() < 1.0E-4d) {
                        fgrc v = enjw.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        enjw enjwVar = (enjw) v.b;
                        enjwVar.b |= 32768;
                        enjwVar.k = true;
                        a.b((enjw) v.Q());
                    }
                    if (c(intent)) {
                        return;
                    }
                    b();
                    cvts a2 = cvts.a();
                    fgrc v2 = enjw.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    enjw enjwVar2 = (enjw) v2.b;
                    enjwVar2.b |= 4096;
                    enjwVar2.i = true;
                    a2.b((enjw) v2.Q());
                    a(applicationContext, true);
                    return;
                }
                if (d()) {
                    return;
                }
                Context applicationContext2 = getApplicationContext();
                cvts a3 = cvts.a();
                if (cvts.a.nextDouble() < 1.0E-4d) {
                    fgrc v3 = enjw.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    enjw enjwVar3 = (enjw) v3.b;
                    enjwVar3.b |= 8192;
                    enjwVar3.j = true;
                    a3.b((enjw) v3.Q());
                }
                boolean z2 = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                if (c(intent)) {
                    SharedPreferences a4 = cvwv.a(applicationContext2);
                    boolean z3 = a4.getBoolean("contacts-logger-pending-significant-update", false);
                    if (!z2 || z3) {
                        return;
                    }
                    a4.edit().putBoolean("contacts-logger-pending-significant-update", true).apply();
                    return;
                }
                b();
                cvts a5 = cvts.a();
                fgrc v4 = enjw.a.v();
                if (!v4.b.L()) {
                    v4.U();
                }
                fgri fgriVar = v4.b;
                enjw enjwVar4 = (enjw) fgriVar;
                enjwVar4.b |= 8;
                enjwVar4.c = true;
                if (z2) {
                    if (!fgriVar.L()) {
                        v4.U();
                    }
                    enjw enjwVar5 = (enjw) v4.b;
                    enjwVar5.b |= 16;
                    enjwVar5.d = true;
                    z = true;
                }
                a5.b((enjw) v4.Q());
                a(applicationContext2, z);
            }
        } catch (Exception unused) {
            cvts a6 = cvts.a();
            fgrc v5 = enjv.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            enjv enjvVar = (enjv) v5.b;
            enjvVar.b |= 256;
            enjvVar.h = true;
            enjv enjvVar2 = (enjv) v5.Q();
            fgrc v6 = enjw.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            enjw enjwVar6 = (enjw) v6.b;
            enjvVar2.getClass();
            enjwVar6.m = enjvVar2;
            enjwVar6.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            a6.b((enjw) v6.Q());
        }
    }
}
