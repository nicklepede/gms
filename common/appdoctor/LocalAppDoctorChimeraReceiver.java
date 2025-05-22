package com.google.android.gms.common.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.common.appdoctor.LocalAppDoctorChimeraReceiver;
import defpackage.atkz;
import defpackage.dpgx;
import defpackage.dpgy;
import defpackage.dphd;
import defpackage.dphg;
import defpackage.dphx;
import defpackage.ekww;
import defpackage.elgx;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.vpx;
import defpackage.vqb;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class LocalAppDoctorChimeraReceiver extends BroadcastReceiver {
    public static final elgx b = elgx.l(vqb.EMERGENCY_PLAY_STORE_INSTALL, atkz.class);

    public static /* synthetic */ void a(eqgl eqglVar, BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                eqglVar.get(8L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                Log.w("GmsAppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            Log.i("GmsAppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("GmsAppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            Log.w("GmsAppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        dpgx dpgxVar = new dpgx(new dphx());
        dpgxVar.b = new ekww() { // from class: atjx
            @Override // defpackage.ekww
            public final Object lK() {
                return LocalAppDoctorChimeraReceiver.b;
            }
        };
        dpgxVar.d = new ekww() { // from class: atjy
            @Override // defpackage.ekww
            public final Object lK() {
                return new atjz();
            }
        };
        final dpgy a = dpgxVar.a();
        ekww ekwwVar = a.c;
        final vpx vpxVar = vpx.TELEDOCTOR;
        final eqgl i = !((dphd) ekwwVar.lK()).b(context) ? eqgc.i(false) : dphg.a(new Callable() { // from class: dpgv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(dpgy.this.g(context, vpxVar));
            }
        });
        setResultCode(-1);
        if (i.isDone()) {
            Log.i("GmsAppDoctorReceiver", "Fix has already been completed.");
        } else {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            dphg.a(new Callable() { // from class: atjw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LocalAppDoctorChimeraReceiver.a(eqgl.this, goAsync);
                    return null;
                }
            });
        }
    }
}
