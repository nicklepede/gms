package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.diwi;
import defpackage.diyb;
import defpackage.diyd;
import defpackage.diyh;
import defpackage.djav;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.emun;
import defpackage.emur;
import defpackage.emus;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UserPresentIntentOperation extends IntentOperation {
    private SharedPreferences a;
    private bsxr b;

    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT);
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
        emus emusVar;
        Context a = AppContextProvider.a();
        ekww ekwwVar = bsxv.a;
        this.b = new bsxr();
        if (auub.a()) {
            djav e = djav.e();
            fgrc v = emus.a.v();
            this.a = diyh.a(a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.a.getLong("coffee_last_log_trustlet_configuration_key", 0L) >= 28800000) {
                synchronized (e.a) {
                    emusVar = e.c;
                }
                fgrc fgrcVar = (fgrc) emusVar.iQ(5, null);
                fgrcVar.X(emusVar);
                this.a.edit().putLong("coffee_last_log_trustlet_configuration_key", currentTimeMillis).apply();
                v = fgrcVar;
            }
            boolean isKeyguardSecure = ((KeyguardManager) a.getSystemService("keyguard")).isKeyguardSecure();
            emur emurVar = emur.USER_PRESENT_UNLOCK;
            if (!v.b.L()) {
                v.U();
            }
            emus emusVar2 = (emus) v.b;
            emusVar2.c = emurVar.g;
            emusVar2.b |= 1;
            boolean g = e.g();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            emus emusVar3 = (emus) fgriVar;
            emusVar3.b |= 4;
            emusVar3.e = g;
            if (!fgriVar.L()) {
                v.U();
            }
            emus emusVar4 = (emus) v.b;
            emusVar4.b |= 8;
            emusVar4.f = isKeyguardSecure;
            boolean i = e.i();
            if (!v.b.L()) {
                v.U();
            }
            emus emusVar5 = (emus) v.b;
            emusVar5.b |= 16;
            emusVar5.g = i;
            boolean h = e.h();
            if (!v.b.L()) {
                v.U();
            }
            emus emusVar6 = (emus) v.b;
            emusVar6.b |= 64;
            emusVar6.h = h;
            if (!this.a.contains("coffee_last_known_is_keyguard_secure")) {
                a(isKeyguardSecure, System.currentTimeMillis() / 1000, false);
            } else if (isKeyguardSecure != this.a.getBoolean("coffee_last_known_is_keyguard_secure", false)) {
                long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - this.a.getLong("coffee_last_is_keyguard_secure_set_timestamp_seconds", 0L);
                boolean z = this.a.getBoolean("coffee_last_is_keyguard_secure_set_timestamp_confirmed", false);
                fgrc v2 = emun.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar2 = v2.b;
                emun emunVar = (emun) fgriVar2;
                emunVar.b |= 1;
                emunVar.c = isKeyguardSecure;
                if (!fgriVar2.L()) {
                    v2.U();
                }
                fgri fgriVar3 = v2.b;
                emun emunVar2 = (emun) fgriVar3;
                emunVar2.b |= 2;
                emunVar2.d = currentTimeMillis2;
                if (!fgriVar3.L()) {
                    v2.U();
                }
                emun emunVar3 = (emun) v2.b;
                emunVar3.b |= 4;
                emunVar3.e = z;
                if (!v.b.L()) {
                    v.U();
                }
                emus emusVar7 = (emus) v.b;
                emun emunVar4 = (emun) v2.Q();
                emunVar4.getClass();
                emusVar7.j = emunVar4;
                emusVar7.b |= 256;
                a(isKeyguardSecure, System.currentTimeMillis() / 1000, true);
            }
            diyd.a((emus) v.Q());
            boolean i2 = e.i();
            boolean h2 = e.h();
            if (isKeyguardSecure && i2 && h2) {
                ekvl.y(this.b);
                auio auioVar = auio.TRUSTAGENT_SERVICE_USER_PRESENT_WHILE_TRUSTED;
                int i3 = diyb.a;
                bsxr.a(auioVar);
            }
        }
        diwi a2 = diwi.a();
        synchronized (a2.c) {
            if (a2.b) {
                a2.b();
            }
        }
    }
}
