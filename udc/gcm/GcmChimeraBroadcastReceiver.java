package com.google.android.gms.udc.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver;
import defpackage.aupz;
import defpackage.djkv;
import defpackage.djlb;
import defpackage.djmq;
import defpackage.dpvo;
import defpackage.dpvs;
import defpackage.dtlr;
import defpackage.dtrf;
import defpackage.ekut;
import defpackage.eluq;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final eluq b = djlb.c();
    public final ekut c;
    public final ekut d;
    public final ekut e;
    public final ekut f;
    public final dpvo g;
    private final Executor h;

    GcmChimeraBroadcastReceiver(final dtrf dtrfVar, final djmq djmqVar, final djkv djkvVar, final dtlr dtlrVar, Executor executor, dpvo dpvoVar) {
        this.c = new ekut() { // from class: djit
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                eluq eluqVar = GcmChimeraBroadcastReceiver.b;
                return dtrf.this;
            }
        };
        this.d = new ekut() { // from class: djiu
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                eluq eluqVar = GcmChimeraBroadcastReceiver.b;
                return djmq.this;
            }
        };
        this.e = new ekut() { // from class: djiv
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                eluq eluqVar = GcmChimeraBroadcastReceiver.b;
                return djkv.this;
            }
        };
        this.f = new ekut() { // from class: djiw
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                eluq eluqVar = GcmChimeraBroadcastReceiver.b;
                return dtlr.this;
            }
        };
        this.h = executor;
        this.g = dpvoVar;
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        eluq eluqVar = b;
        eluqVar.h().ai(11811).x("Received GCM push notification.");
        if (intent == null || !intent.hasExtra("fsc_v1")) {
            eluqVar.h().ai(11812).x("Message not relevant for UDC, skipping push notification handling...");
        } else {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            this.h.execute(new Runnable() { // from class: djix
                /* JADX WARN: Removed duplicated region for block: B:19:0x0307 A[Catch: InterruptedException -> 0x04e8, InterruptedException | ExecutionException -> 0x04ea, TryCatch #4 {InterruptedException | ExecutionException -> 0x04ea, blocks: (B:17:0x02da, B:19:0x0307, B:62:0x0317), top: B:16:0x02da }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x033d  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x03f3  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0317 A[Catch: InterruptedException -> 0x04e8, InterruptedException | ExecutionException -> 0x04ea, TRY_LEAVE, TryCatch #4 {InterruptedException | ExecutionException -> 0x04ea, blocks: (B:17:0x02da, B:19:0x0307, B:62:0x0317), top: B:16:0x02da }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1282
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.djix.run():void");
                }
            });
        }
    }

    public GcmChimeraBroadcastReceiver() {
        this.c = new ekut() { // from class: djiy
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return djlr.d((Context) obj);
            }
        };
        this.d = new ekut() { // from class: djiz
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return new djnd((Context) obj);
            }
        };
        this.e = new ekut() { // from class: djja
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return djlr.a((Context) obj);
            }
        };
        this.f = new ekut() { // from class: djjb
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return djlr.g((Context) obj);
            }
        };
        this.h = new aupz(Integer.MAX_VALUE, 10);
        this.g = new dpvs();
    }
}
