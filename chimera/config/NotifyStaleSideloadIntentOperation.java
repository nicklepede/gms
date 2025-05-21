package com.google.android.gms.chimera.config;

import android.R;
import android.app.NotificationChannel;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import defpackage.a;
import defpackage.anyg;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asoe;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bsa;
import defpackage.dfee;
import defpackage.eijj;
import defpackage.ejhf;
import defpackage.fmqq;
import defpackage.ikb;
import defpackage.ikd;
import defpackage.pph;
import defpackage.pvn;
import defpackage.pvp;
import defpackage.pvq;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class NotifyStaleSideloadIntentOperation extends IntentOperation {
    private static final asot a = asot.b("MODULE_CONFIGURATION", asej.CHIMERA);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fmqq.a.a().o()) {
            String action = intent.getAction();
            if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED")) {
                ((ejhf) a.j()).B("Wrong intent action: %s", action);
                return;
            }
            if (asoe.o()) {
                return;
            }
            bsa bsaVar = new bsa();
            String str = (String) anyg.g.i();
            bsa bsaVar2 = new bsa();
            if (!str.isEmpty()) {
                bsaVar2.addAll(eijj.e(',').i().d().n(str));
            }
            try {
                pvp j = pph.f().j();
                bsa bsaVar3 = new bsa();
                pvq pvqVar = new pvq();
                int e = j.e();
                for (int i = 0; i < e; i++) {
                    j.k(pvqVar, i);
                    bsaVar3.add(Integer.valueOf(pvqVar.at()));
                }
                pvn pvnVar = new pvn();
                int a2 = j.a();
                for (int i2 = 0; i2 < a2; i2++) {
                    j.h(pvnVar, i2);
                    if (!bsaVar3.contains(Integer.valueOf(i2)) && bsaVar2.contains(pvnVar.k())) {
                        ((ejhf) a.j()).B("No Modules accepted for %s", pvnVar.k());
                        bsaVar.add(pvnVar.k());
                    }
                }
            } catch (InvalidConfigException e2) {
                ((ejhf) a.i()).B("InvalidConfigException thrown with: %s", e2.getMessage());
            }
            if (bsaVar.isEmpty()) {
                asbo f = asbo.f(this);
                if (f == null) {
                    ((ejhf) a.j()).x("notificationManager is null");
                    return;
                } else {
                    f.l(dfee.CHIMERA_CONFIG_CHANGE);
                    return;
                }
            }
            asbo f2 = asbo.f(this);
            if (f2 == null) {
                ((ejhf) a.j()).x("notificationManager is null");
                return;
            }
            String b = a.b(bsaVar, "Modules ", " need to be sideloaded again due to change in GMSCore APK. See go/gmscore-sideload to sideload modules again. Consider syncing your workspace before sideloading the modules.");
            ikd ikdVar = new ikd(this, "module_config_changed_alert");
            ikdVar.m("Previous sideloaded module invalidated.");
            ikdVar.l(b);
            ikdVar.g(R.drawable.stat_sys_warning);
            ikb ikbVar = new ikb();
            ikbVar.d(b);
            ikdVar.v(ikbVar);
            ikdVar.x = true;
            ikdVar.r(true);
            ikdVar.k(false);
            ikdVar.l = 1;
            if (asqh.c()) {
                f2.p(new NotificationChannel("module_config_changed_alert", "Module Config Changed", 4));
            }
            f2.t(dfee.CHIMERA_CONFIG_CHANGE, ikdVar.b());
        }
    }
}
