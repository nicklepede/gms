package com.google.android.gms.common.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.common.appdoctor.LocalAppDoctorChimeraReceiver;
import defpackage.arik;
import defpackage.dmvj;
import defpackage.dmvk;
import defpackage.dmvp;
import defpackage.dmvs;
import defpackage.dmwj;
import defpackage.eijr;
import defpackage.eits;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ttx;
import defpackage.tub;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class LocalAppDoctorChimeraReceiver extends BroadcastReceiver {
    public static final eits b = eits.l(tub.EMERGENCY_PLAY_STORE_INSTALL, arik.class);

    public static /* synthetic */ void a(enss enssVar, BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                enssVar.get(8L, TimeUnit.SECONDS);
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
        dmvj dmvjVar = new dmvj(new dmwj());
        dmvjVar.b = new eijr() { // from class: arhi
            @Override // defpackage.eijr
            public final Object a() {
                return LocalAppDoctorChimeraReceiver.b;
            }
        };
        dmvjVar.d = new eijr() { // from class: arhj
            @Override // defpackage.eijr
            public final Object a() {
                return new arhk();
            }
        };
        final dmvk a = dmvjVar.a();
        eijr eijrVar = a.c;
        final ttx ttxVar = ttx.TELEDOCTOR;
        final enss i = !((dmvp) eijrVar.a()).b(context) ? ensj.i(false) : dmvs.a(new Callable() { // from class: dmvh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(dmvk.this.g(context, ttxVar));
            }
        });
        setResultCode(-1);
        if (i.isDone()) {
            Log.i("GmsAppDoctorReceiver", "Fix has already been completed.");
        } else {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            dmvs.a(new Callable() { // from class: arhh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LocalAppDoctorChimeraReceiver.a(enss.this, goAsync);
                    return null;
                }
            });
        }
    }
}
