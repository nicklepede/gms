package com.google.android.gms.location.fused.logging;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.location.fused.logging.FlpSettingsLoggerService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.btjq;
import defpackage.bwhe;
import defpackage.bzbx;
import defpackage.cauf;
import defpackage.cbhs;
import defpackage.ekww;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class FlpSettingsLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private btjq b;
    private cbhs c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!"SettingsLogging".equals(caufVar.a)) {
            return 2;
        }
        if (bzbx.a(this) == 0) {
            this.c.c(26);
        } else {
            this.c.c(25);
        }
        this.b.d(new ekww() { // from class: cbzd
            @Override // defpackage.ekww
            public final Object lK() {
                fgrc v = ensz.a.v();
                ensy ensyVar = ensy.FLP_SETTINGS;
                if (!v.b.L()) {
                    v.U();
                }
                FlpSettingsLoggerService flpSettingsLoggerService = FlpSettingsLoggerService.this;
                ensz enszVar = (ensz) v.b;
                enszVar.c = ensyVar.F;
                enszVar.b |= 1;
                fgrc v2 = cbzc.a.v();
                fgrc b = cbza.b(flpSettingsLoggerService);
                if (!v2.b.L()) {
                    v2.U();
                }
                cbzc cbzcVar = (cbzc) v2.b;
                cbys cbysVar = (cbys) b.Q();
                cbysVar.getClass();
                cbzcVar.d = cbysVar;
                cbzcVar.b |= 2;
                if (!v.b.L()) {
                    v.U();
                }
                ensz enszVar2 = (ensz) v.b;
                cbzc cbzcVar2 = (cbzc) v2.Q();
                cbzcVar2.getClass();
                enszVar2.t = cbzcVar2;
                enszVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                return (ensz) v.Q();
            }
        });
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.b = bwhe.v();
        this.c = cbhs.a(this);
    }
}
