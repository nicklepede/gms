package com.google.android.gms.common.systemhealthutils.restart;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.argg;
import defpackage.arpo;
import defpackage.arpu;
import defpackage.asqj;
import defpackage.byln;
import defpackage.emyr;
import defpackage.fmzj;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class GmsRestartChimeraService extends GmsTaskChimeraService {
    private final arpu a;

    public GmsRestartChimeraService() {
        this(new arpu());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (TimeUnit.MILLISECONDS.toSeconds(asqj.a()) < fmzj.b()) {
            argg.a(this);
            return 0;
        }
        if (fmzj.g() && d()) {
            arpu arpuVar = this.a;
            emyr emyrVar = emyr.SCHEDULED_IDLE;
            if (fmzj.g()) {
                arpo arpoVar = new arpo();
                arpoVar.b = this;
                arpoVar.a = emyrVar;
                arpuVar.b(arpoVar.a());
            }
        }
        return 0;
    }

    public abstract boolean d();

    public GmsRestartChimeraService(arpu arpuVar) {
        this.a = arpuVar;
    }
}
