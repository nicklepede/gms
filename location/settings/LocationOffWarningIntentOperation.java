package com.google.android.gms.location.settings;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.atzb;
import defpackage.aury;
import defpackage.ausb;
import defpackage.ausn;
import defpackage.ccvv;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.fsmk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationOffWarningIntentOperation extends IntentOperation {
    static final ausn a = ausn.a("LOWD");
    public static final /* synthetic */ int b = 0;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        Bundle applicationRestrictions;
        boolean isRunningInUserTestHarness;
        long currentTimeMillis = System.currentTimeMillis();
        ccvv c = ccvv.c();
        long longValue = ((Long) c.g(c.d(new ekut() { // from class: ccvo
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return Long.valueOf(((ccvy) obj).f);
            }
        }, 0L), 0L)).longValue();
        if (currentTimeMillis < longValue) {
            ccvv.c().e(0L);
            if (longValue - currentTimeMillis <= fsmk.b()) {
                return;
            }
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.location.settings.SHOW_LOWD") && !aury.d(this)) {
            boolean z = ausb.a;
            Object systemService = getSystemService("audio");
            atzb.s(systemService);
            if (((AudioManager) systemService).getMode() != 2) {
                fsmk fsmkVar = fsmk.a;
                if (!fsmkVar.lK().f()) {
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
                if ((restrictionsManager == null || (applicationRestrictions = restrictionsManager.getApplicationRestrictions()) == null || !applicationRestrictions.getBoolean("suppressLocationDialog", false)) && ausb.a(this) >= fsmkVar.lK().a() && ausb.g(this) && (intExtra = intent.getIntExtra("EXTRA_OLD_LOCATION_MODE", 0)) != 0) {
                    long a2 = ccvv.c().a();
                    if (System.currentTimeMillis() - ccvv.c().b() >= a2) {
                        long min = Math.min(Math.max(a2 * fsmkVar.lK().b(), fsmkVar.lK().e()), fsmkVar.lK().d());
                        ccvv c2 = ccvv.c();
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        c2.f(new ekut() { // from class: ccve
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                ccvw ccvwVar = (ccvw) obj;
                                ausn ausnVar = ccvv.a;
                                if (!ccvwVar.b.L()) {
                                    ccvwVar.U();
                                }
                                long j = currentTimeMillis2;
                                ccvy ccvyVar = (ccvy) ccvwVar.b;
                                ccvy ccvyVar2 = ccvy.a;
                                ccvyVar.b |= 2;
                                ccvyVar.d = j;
                                return ccvwVar;
                            }
                        });
                        ccvv.c().h(min);
                        try {
                            Intent intent2 = new Intent();
                            intent2.setComponent(new ComponentName(this, "com.google.android.gms.location.settings.LocationOffWarningActivity"));
                            intent2.putExtra("previousMode", intExtra);
                            intent2.setFlags(268435456);
                            startActivity(intent2);
                        } catch (SecurityException e) {
                            ((eluo) ((eluo) a.i()).s(e)).x("failed to start LOWD");
                        }
                    }
                }
            }
        }
    }
}
