package com.google.android.gms.appset.service;

import android.adservices.cobalt.AdServicesCobaltUploadService;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.epit;
import defpackage.fgrc;
import defpackage.fmse;
import defpackage.weh;
import defpackage.weo;
import defpackage.wep;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdServicesCobaltUploadBoundService extends BoundService {
    private final wep c = new wep();
    private static final String b = "AdServicesCobaltUploadBoundService";
    public static final ausn a = ausn.b(b, auid.APP_SET_ID);

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        AdServicesCobaltUploadService adServicesCobaltUploadService;
        long currentTimeMillis = System.currentTimeMillis();
        wep wepVar = this.c;
        if (wepVar.a() && fmse.d()) {
            try {
                if (!wepVar.a() || (adServicesCobaltUploadService = wepVar.a) == null) {
                    return null;
                }
                return adServicesCobaltUploadService.onBind(intent);
            } catch (RuntimeException unused) {
                fgrc v = epit.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                epit epitVar = (epit) v.b;
                epitVar.c = 3;
                epitVar.b |= 1;
                weh.c(currentTimeMillis, 3, (epit) v.Q());
            }
        } else {
            weh.a(currentTimeMillis);
        }
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (fmse.d()) {
            this.c.a = new weo();
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.c.a = null;
    }
}
