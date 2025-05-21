package com.google.android.gms.location.settings;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.arwm;
import defpackage.asoe;
import defpackage.asoh;
import defpackage.asot;
import defpackage.canf;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.fpss;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationOffWarningIntentOperation extends IntentOperation {
    static final asot a = asot.a("LOWD");
    public static final /* synthetic */ int b = 0;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        Bundle applicationRestrictions;
        boolean isRunningInUserTestHarness;
        long currentTimeMillis = System.currentTimeMillis();
        canf c = canf.c();
        long longValue = ((Long) c.g(c.d(new eiho() { // from class: camy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return Long.valueOf(((cani) obj).f);
            }
        }, 0L), 0L)).longValue();
        if (currentTimeMillis < longValue) {
            canf.c().e(0L);
            if (longValue - currentTimeMillis <= fpss.b()) {
                return;
            }
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.location.settings.SHOW_LOWD") && !asoe.d(this)) {
            boolean z = asoh.a;
            Object systemService = getSystemService("audio");
            arwm.s(systemService);
            if (((AudioManager) systemService).getMode() != 2) {
                fpss fpssVar = fpss.a;
                if (!fpssVar.a().f()) {
                    if (ActivityManager.isRunningInTestHarness()) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        isRunningInUserTestHarness = ActivityManager.isRunningInUserTestHarness();
                        if (isRunningInUserTestHarness) {
                            return;
                        }
                    }
                }
                RestrictionsManager restrictionsManager = (RestrictionsManager) getSystemService("restrictions");
                if (restrictionsManager == null || (applicationRestrictions = restrictionsManager.getApplicationRestrictions()) == null || !applicationRestrictions.getBoolean("suppressLocationDialog", false)) {
                    double a2 = asoh.a(this);
                    fpss fpssVar2 = fpss.a;
                    if (a2 < fpssVar2.a().a() || !asoh.g(this) || (intExtra = intent.getIntExtra("EXTRA_OLD_LOCATION_MODE", 0)) == 0) {
                        return;
                    }
                    long a3 = canf.c().a();
                    if (System.currentTimeMillis() - canf.c().b() >= a3) {
                        long min = Math.min(Math.max(a3 * fpssVar.a().b(), fpssVar2.a().e()), fpssVar2.a().d());
                        canf c2 = canf.c();
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        c2.f(new eiho() { // from class: camo
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                cang cangVar = (cang) obj;
                                asot asotVar = canf.a;
                                if (!cangVar.b.L()) {
                                    cangVar.U();
                                }
                                long j = currentTimeMillis2;
                                cani caniVar = (cani) cangVar.b;
                                cani caniVar2 = cani.a;
                                caniVar.b |= 2;
                                caniVar.d = j;
                                return cangVar;
                            }
                        });
                        canf.c().h(min);
                        try {
                            Intent intent2 = new Intent();
                            intent2.setComponent(new ComponentName(this, "com.google.android.gms.location.settings.LocationOffWarningActivity"));
                            intent2.putExtra("previousMode", intExtra);
                            intent2.setFlags(268435456);
                            startActivity(intent2);
                        } catch (SecurityException e) {
                            ((ejhf) ((ejhf) a.i()).s(e)).x("failed to start LOWD");
                        }
                    }
                }
            }
        }
    }
}
