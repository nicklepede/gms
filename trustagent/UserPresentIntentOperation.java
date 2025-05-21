package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.dgld;
import defpackage.dgmw;
import defpackage.dgmy;
import defpackage.dgnc;
import defpackage.dgpq;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.ekhb;
import defpackage.ekhf;
import defpackage.ekhg;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UserPresentIntentOperation extends IntentOperation {
    private SharedPreferences a;
    private bqqa b;

    static {
        asot.b("TrustAgent", asej.TRUSTAGENT);
    }

    private final void a(boolean z, long j, boolean z2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean("coffee_last_known_is_keyguard_secure", z);
        edit.putLong("coffee_last_is_keyguard_secure_set_timestamp_seconds", j);
        edit.putBoolean("coffee_last_is_keyguard_secure_set_timestamp_confirmed", z2);
        if (!z) {
            edit.remove("screen_lock_set_from");
        }
        edit.apply();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ekhg ekhgVar;
        Context a = AppContextProvider.a();
        eijr eijrVar = bqqe.a;
        this.b = new bqqa();
        if (asqh.a()) {
            dgpq e = dgpq.e();
            fecj v = ekhg.a.v();
            this.a = dgnc.a(a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.a.getLong("coffee_last_log_trustlet_configuration_key", 0L) >= 28800000) {
                synchronized (e.a) {
                    ekhgVar = e.c;
                }
                fecj fecjVar = (fecj) ekhgVar.iB(5, null);
                fecjVar.X(ekhgVar);
                this.a.edit().putLong("coffee_last_log_trustlet_configuration_key", currentTimeMillis).apply();
                v = fecjVar;
            }
            boolean isKeyguardSecure = ((KeyguardManager) a.getSystemService("keyguard")).isKeyguardSecure();
            ekhf ekhfVar = ekhf.USER_PRESENT_UNLOCK;
            if (!v.b.L()) {
                v.U();
            }
            ekhg ekhgVar2 = (ekhg) v.b;
            ekhgVar2.c = ekhfVar.g;
            ekhgVar2.b |= 1;
            boolean g = e.g();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            ekhg ekhgVar3 = (ekhg) fecpVar;
            ekhgVar3.b |= 4;
            ekhgVar3.e = g;
            if (!fecpVar.L()) {
                v.U();
            }
            ekhg ekhgVar4 = (ekhg) v.b;
            ekhgVar4.b |= 8;
            ekhgVar4.f = isKeyguardSecure;
            boolean i = e.i();
            if (!v.b.L()) {
                v.U();
            }
            ekhg ekhgVar5 = (ekhg) v.b;
            ekhgVar5.b |= 16;
            ekhgVar5.g = i;
            boolean h = e.h();
            if (!v.b.L()) {
                v.U();
            }
            ekhg ekhgVar6 = (ekhg) v.b;
            ekhgVar6.b |= 64;
            ekhgVar6.h = h;
            if (!this.a.contains("coffee_last_known_is_keyguard_secure")) {
                a(isKeyguardSecure, System.currentTimeMillis() / 1000, false);
            } else if (isKeyguardSecure != this.a.getBoolean("coffee_last_known_is_keyguard_secure", false)) {
                long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - this.a.getLong("coffee_last_is_keyguard_secure_set_timestamp_seconds", 0L);
                boolean z = this.a.getBoolean("coffee_last_is_keyguard_secure_set_timestamp_confirmed", false);
                fecj v2 = ekhb.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar2 = v2.b;
                ekhb ekhbVar = (ekhb) fecpVar2;
                ekhbVar.b |= 1;
                ekhbVar.c = isKeyguardSecure;
                if (!fecpVar2.L()) {
                    v2.U();
                }
                fecp fecpVar3 = v2.b;
                ekhb ekhbVar2 = (ekhb) fecpVar3;
                ekhbVar2.b |= 2;
                ekhbVar2.d = currentTimeMillis2;
                if (!fecpVar3.L()) {
                    v2.U();
                }
                ekhb ekhbVar3 = (ekhb) v2.b;
                ekhbVar3.b |= 4;
                ekhbVar3.e = z;
                if (!v.b.L()) {
                    v.U();
                }
                ekhg ekhgVar7 = (ekhg) v.b;
                ekhb ekhbVar4 = (ekhb) v2.Q();
                ekhbVar4.getClass();
                ekhgVar7.j = ekhbVar4;
                ekhgVar7.b |= 256;
                a(isKeyguardSecure, System.currentTimeMillis() / 1000, true);
            }
            dgmy.a((ekhg) v.Q());
            boolean i2 = e.i();
            boolean h2 = e.h();
            if (isKeyguardSecure && i2 && h2) {
                eiig.x(this.b);
                aseu aseuVar = aseu.TRUSTAGENT_SERVICE_USER_PRESENT_WHILE_TRUSTED;
                int i3 = dgmw.a;
                bqqa.a(aseuVar);
            }
        }
        dgld a2 = dgld.a();
        synchronized (a2.c) {
            if (a2.b) {
                a2.b();
            }
        }
    }
}
