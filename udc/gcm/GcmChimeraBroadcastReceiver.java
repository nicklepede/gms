package com.google.android.gms.udc.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver;
import defpackage.asmf;
import defpackage.dgzp;
import defpackage.dgzv;
import defpackage.dhbk;
import defpackage.dnlf;
import defpackage.dnlj;
import defpackage.drbj;
import defpackage.drgx;
import defpackage.eiho;
import defpackage.ejhh;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final ejhh b = dgzv.c();
    public final eiho c;
    public final eiho d;
    public final eiho e;
    public final eiho f;
    public final dnlf g;
    private final Executor h;

    GcmChimeraBroadcastReceiver(final drgx drgxVar, final dhbk dhbkVar, final dgzp dgzpVar, final drbj drbjVar, Executor executor, dnlf dnlfVar) {
        this.c = new eiho() { // from class: dgxn
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ejhh ejhhVar = GcmChimeraBroadcastReceiver.b;
                return drgx.this;
            }
        };
        this.d = new eiho() { // from class: dgxo
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ejhh ejhhVar = GcmChimeraBroadcastReceiver.b;
                return dhbk.this;
            }
        };
        this.e = new eiho() { // from class: dgxp
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ejhh ejhhVar = GcmChimeraBroadcastReceiver.b;
                return dgzp.this;
            }
        };
        this.f = new eiho() { // from class: dgxq
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ejhh ejhhVar = GcmChimeraBroadcastReceiver.b;
                return drbj.this;
            }
        };
        this.h = executor;
        this.g = dnlfVar;
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ejhh ejhhVar = b;
        ejhhVar.h().ah(11808).x("Received GCM push notification.");
        if (intent == null || !intent.hasExtra("fsc_v1")) {
            ejhhVar.h().ah(11809).x("Message not relevant for UDC, skipping push notification handling...");
        } else {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            this.h.execute(new Runnable() { // from class: dgxr
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxr.run():void");
                }
            });
        }
    }

    public GcmChimeraBroadcastReceiver() {
        this.c = new eiho() { // from class: dgxs
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return dhal.d((Context) obj);
            }
        };
        this.d = new eiho() { // from class: dgxt
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return new dhbx((Context) obj);
            }
        };
        this.e = new eiho() { // from class: dgxu
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return dhal.a((Context) obj);
            }
        };
        this.f = new eiho() { // from class: dgxv
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return dhal.g((Context) obj);
            }
        };
        this.h = new asmf(Integer.MAX_VALUE, 10);
        this.g = new dnlj();
    }
}
