package com.google.android.gms.people.backuplegacy.cp2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ctkm;
import defpackage.ctnp;
import defpackage.cuey;
import defpackage.cufp;
import defpackage.ekwj;
import defpackage.ekwk;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.frhu;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        ctnp.a(getApplicationContext()).edit().putLong("intent-received-timestamp", System.currentTimeMillis()).apply();
    }

    private final boolean c(Intent intent) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - ctnp.a(getApplicationContext()).getLong("intent-received-timestamp", 0L);
        String action = intent.getAction();
        if ("com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            long C = frhu.a.a().C();
            Long.valueOf(C).getClass();
            j = timeUnit.toMillis(C);
        } else if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            long F = frhu.a.a().F();
            Long.valueOf(F).getClass();
            j = timeUnit2.toMillis(F);
        } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            TimeUnit timeUnit3 = TimeUnit.HOURS;
            long E = frhu.a.a().E();
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
        valueOf = Boolean.valueOf(frhu.a.a().ak());
        return (valueOf.booleanValue() || cufp.a().booleanValue()) ? false : true;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean valueOf;
        try {
            cufp.O();
            valueOf = Boolean.valueOf(frhu.a.a().aq());
            if (valueOf.booleanValue()) {
                String action = intent.getAction();
                boolean z = false;
                if (!"com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                    if ("com.google.android.gms.udc.action.SETTING_CHANGED".equals(action)) {
                        return;
                    }
                    if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        cuey.n("ContactsLoggerIntentOperation", "Received unexpected broadcast: %s", action);
                        return;
                    }
                    if (d()) {
                        return;
                    }
                    Context applicationContext = getApplicationContext();
                    ctkm a = ctkm.a();
                    if (ctkm.a.nextDouble() < 1.0E-4d) {
                        fecj v = ekwk.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekwk ekwkVar = (ekwk) v.b;
                        ekwkVar.b |= 32768;
                        ekwkVar.k = true;
                        a.b((ekwk) v.Q());
                    }
                    if (c(intent)) {
                        return;
                    }
                    b();
                    ctkm a2 = ctkm.a();
                    fecj v2 = ekwk.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ekwk ekwkVar2 = (ekwk) v2.b;
                    ekwkVar2.b |= 4096;
                    ekwkVar2.i = true;
                    a2.b((ekwk) v2.Q());
                    a(applicationContext, true);
                    return;
                }
                if (d()) {
                    return;
                }
                Context applicationContext2 = getApplicationContext();
                ctkm a3 = ctkm.a();
                if (ctkm.a.nextDouble() < 1.0E-4d) {
                    fecj v3 = ekwk.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    ekwk ekwkVar3 = (ekwk) v3.b;
                    ekwkVar3.b |= 8192;
                    ekwkVar3.j = true;
                    a3.b((ekwk) v3.Q());
                }
                boolean z2 = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                if (c(intent)) {
                    SharedPreferences a4 = ctnp.a(applicationContext2);
                    boolean z3 = a4.getBoolean("contacts-logger-pending-significant-update", false);
                    if (!z2 || z3) {
                        return;
                    }
                    a4.edit().putBoolean("contacts-logger-pending-significant-update", true).apply();
                    return;
                }
                b();
                ctkm a5 = ctkm.a();
                fecj v4 = ekwk.a.v();
                if (!v4.b.L()) {
                    v4.U();
                }
                fecp fecpVar = v4.b;
                ekwk ekwkVar4 = (ekwk) fecpVar;
                ekwkVar4.b |= 8;
                ekwkVar4.c = true;
                if (z2) {
                    if (!fecpVar.L()) {
                        v4.U();
                    }
                    ekwk ekwkVar5 = (ekwk) v4.b;
                    ekwkVar5.b |= 16;
                    ekwkVar5.d = true;
                    z = true;
                }
                a5.b((ekwk) v4.Q());
                a(applicationContext2, z);
            }
        } catch (Exception unused) {
            ctkm a6 = ctkm.a();
            fecj v5 = ekwj.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            ekwj ekwjVar = (ekwj) v5.b;
            ekwjVar.b |= 256;
            ekwjVar.k = true;
            ekwj ekwjVar2 = (ekwj) v5.Q();
            fecj v6 = ekwk.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            ekwk ekwkVar6 = (ekwk) v6.b;
            ekwjVar2.getClass();
            ekwkVar6.m = ekwjVar2;
            ekwkVar6.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            a6.b((ekwk) v6.Q());
        }
    }
}
