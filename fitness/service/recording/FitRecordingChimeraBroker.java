package com.google.android.gms.fitness.service.recording;

import android.content.Context;
import android.content.Intent;
import defpackage.biwj;
import defpackage.biwp;
import defpackage.biwr;
import defpackage.biys;
import defpackage.bjev;
import defpackage.bzqb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitRecordingChimeraBroker extends biwr {
    public static final /* synthetic */ int i = 0;

    static {
        bjev.a();
    }

    public FitRecordingChimeraBroker() {
        super("com.google.android.gms.fitness.service.recording.FitRecordingBroker");
    }

    private static boolean q(Intent intent, String str) {
        return intent != null && intent.getAction().equals(str);
    }

    @Override // defpackage.biwl
    public final /* bridge */ /* synthetic */ biwj b(String str) {
        return new biys(this, str, this.f);
    }

    @Override // defpackage.biwl
    protected final bzqb c(Context context, biwp biwpVar) {
        return new bzqb(context, 56, d(), 3, biwpVar);
    }

    @Override // defpackage.biwl
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.RecordingApi".equals(intent.getAction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001e A[SYNTHETIC] */
    @Override // defpackage.biwr, defpackage.biwl, android.os.Handler.Callback
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

    @Override // defpackage.biwr, com.google.android.chimera.Service
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
