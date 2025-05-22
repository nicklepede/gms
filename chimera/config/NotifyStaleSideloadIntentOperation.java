package com.google.android.gms.chimera.config;

import android.R;
import android.app.NotificationChannel;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import defpackage.a;
import defpackage.apzy;
import defpackage.aued;
import defpackage.auid;
import defpackage.aury;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bsl;
import defpackage.dhpk;
import defpackage.ekwo;
import defpackage.eluo;
import defpackage.fpio;
import defpackage.ilr;
import defpackage.ilt;
import defpackage.ril;
import defpackage.ror;
import defpackage.rot;
import defpackage.rou;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class NotifyStaleSideloadIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("MODULE_CONFIGURATION", auid.CHIMERA);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpio.a.lK().o()) {
            String action = intent.getAction();
            if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED")) {
                ((eluo) a.j()).B("Wrong intent action: %s", action);
                return;
            }
            if (aury.o()) {
                return;
            }
            bsl bslVar = new bsl();
            String str = (String) apzy.g.i();
            bsl bslVar2 = new bsl();
            if (!str.isEmpty()) {
                bslVar2.addAll(ekwo.e(',').i().d().n(str));
            }
            try {
                rot j = ril.f().j();
                bsl bslVar3 = new bsl();
                rou rouVar = new rou();
                int e = j.e();
                for (int i = 0; i < e; i++) {
                    j.k(rouVar, i);
                    bslVar3.add(Integer.valueOf(rouVar.at()));
                }
                ror rorVar = new ror();
                int a2 = j.a();
                for (int i2 = 0; i2 < a2; i2++) {
                    j.h(rorVar, i2);
                    if (!bslVar3.contains(Integer.valueOf(i2)) && bslVar2.contains(rorVar.k())) {
                        ((eluo) a.j()).B("No Modules accepted for %s", rorVar.k());
                        bslVar.add(rorVar.k());
                    }
                }
            } catch (InvalidConfigException e2) {
                ((eluo) a.i()).B("InvalidConfigException thrown with: %s", e2.getMessage());
            }
            if (bslVar.isEmpty()) {
                aued f = aued.f(this);
                if (f == null) {
                    ((eluo) a.j()).x("notificationManager is null");
                    return;
                } else {
                    f.l(dhpk.CHIMERA_CONFIG_CHANGE);
                    return;
                }
            }
            aued f2 = aued.f(this);
            if (f2 == null) {
                ((eluo) a.j()).x("notificationManager is null");
                return;
            }
            String b = a.b(bslVar, "Modules ", " need to be sideloaded again due to change in GMSCore APK. See go/gmscore-sideload to sideload modules again. Consider syncing your workspace before sideloading the modules.");
            ilt iltVar = new ilt(this, "module_config_changed_alert");
            iltVar.r("Previous sideloaded module invalidated.");
            iltVar.j(b);
            iltVar.n(R.drawable.stat_sys_warning);
            ilr ilrVar = new ilr();
            ilrVar.d(b);
            iltVar.o(ilrVar);
            iltVar.x = true;
            iltVar.v(true);
            iltVar.i(false);
            iltVar.l = 1;
            if (auub.c()) {
                f2.p(new NotificationChannel("module_config_changed_alert", "Module Config Changed", 4));
            }
            f2.t(dhpk.CHIMERA_CONFIG_CHANGE, iltVar.b());
        }
    }
}
