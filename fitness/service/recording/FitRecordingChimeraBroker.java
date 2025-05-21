package com.google.android.gms.fitness.service.recording;

import android.content.Context;
import android.content.Intent;
import defpackage.bgrt;
import defpackage.bgrz;
import defpackage.bgsb;
import defpackage.bguc;
import defpackage.bhaf;
import defpackage.bxhl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitRecordingChimeraBroker extends bgsb {
    public static final /* synthetic */ int i = 0;

    static {
        bhaf.a();
    }

    public FitRecordingChimeraBroker() {
        super("com.google.android.gms.fitness.service.recording.FitRecordingBroker");
    }

    private static boolean q(Intent intent, String str) {
        return intent != null && intent.getAction().equals(str);
    }

    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        return new bguc(this, str, this.f);
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 56, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.RecordingApi".equals(intent.getAction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001e A[SYNTHETIC] */
    @Override // defpackage.bgsb, defpackage.bgrv, android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.service.recording.FitRecordingChimeraBroker.handleMessage(android.os.Message):boolean");
    }

    @Override // defpackage.bgsb, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (q(intent, "com.google.android.gms.fitness.INITIALIZE")) {
            l();
            return 1;
        }
        if (q(intent, "com.google.android.gms.fitness.BLE_DEVICE_CLAIMED")) {
            m(3, intent);
            return 1;
        }
        if (q(intent, "com.google.android.gms.fitness.BLE_DEVICE_UNCLAIMED")) {
            m(4, intent);
            return 1;
        }
        if (q(intent, "com.google.android.gms.fitness.PACKAGE_CHANGED")) {
            m(5, intent);
            return 1;
        }
        super.onStartCommand(intent, i2, i3);
        return 1;
    }
}
