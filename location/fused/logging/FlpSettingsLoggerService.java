package com.google.android.gms.location.fused.logging;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.location.fused.logging.FlpSettingsLoggerService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.brbz;
import defpackage.btzc;
import defpackage.bwth;
import defpackage.byln;
import defpackage.byzb;
import defpackage.eijr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class FlpSettingsLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private brbz b;
    private byzb c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!"SettingsLogging".equals(bylnVar.a)) {
            return 2;
        }
        if (bwth.a(this) == 0) {
            this.c.c(26);
        } else {
            this.c.c(25);
        }
        this.b.d(new eijr() { // from class: bzqm
            @Override // defpackage.eijr
            public final Object a() {
                fecj v = elfm.a.v();
                elfl elflVar = elfl.FLP_SETTINGS;
                if (!v.b.L()) {
                    v.U();
                }
                FlpSettingsLoggerService flpSettingsLoggerService = FlpSettingsLoggerService.this;
                elfm elfmVar = (elfm) v.b;
                elfmVar.c = elflVar.F;
                elfmVar.b |= 1;
                fecj v2 = bzql.a.v();
                fecj b = bzqj.b(flpSettingsLoggerService);
                if (!v2.b.L()) {
                    v2.U();
                }
                bzql bzqlVar = (bzql) v2.b;
                bzqb bzqbVar = (bzqb) b.Q();
                bzqbVar.getClass();
                bzqlVar.d = bzqbVar;
                bzqlVar.b |= 2;
                if (!v.b.L()) {
                    v.U();
                }
                elfm elfmVar2 = (elfm) v.b;
                bzql bzqlVar2 = (bzql) v2.Q();
                bzqlVar2.getClass();
                elfmVar2.t = bzqlVar2;
                elfmVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                return (elfm) v.Q();
            }
        });
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.b = btzc.v();
        this.c = byzb.a(this);
    }
}
