package com.google.android.gms.appset.service;

import android.adservices.cobalt.AdServicesCobaltUploadService;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.emvd;
import defpackage.fecj;
import defpackage.fkbt;
import defpackage.uii;
import defpackage.uip;
import defpackage.uiq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdServicesCobaltUploadBoundService extends BoundService {
    private final uiq c = new uiq();
    private static final String b = "AdServicesCobaltUploadBoundService";
    public static final asot a = asot.b(b, asej.APP_SET_ID);

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        AdServicesCobaltUploadService adServicesCobaltUploadService;
        long currentTimeMillis = System.currentTimeMillis();
        uiq uiqVar = this.c;
        if (uiqVar.a() && fkbt.d()) {
            try {
                if (!uiqVar.a() || (adServicesCobaltUploadService = uiqVar.a) == null) {
                    return null;
                }
                return adServicesCobaltUploadService.onBind(intent);
            } catch (RuntimeException unused) {
                fecj v = emvd.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                emvd emvdVar = (emvd) v.b;
                emvdVar.c = 3;
                emvdVar.b |= 1;
                uii.c(currentTimeMillis, 3, (emvd) v.Q());
            }
        } else {
            uii.a(currentTimeMillis);
        }
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (fkbt.d()) {
            this.c.a = new uip();
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.c.a = null;
    }
}
