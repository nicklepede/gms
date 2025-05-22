package com.google.android.gms.common.systemhealthutils.restart;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ativ;
import defpackage.atsd;
import defpackage.atsj;
import defpackage.auud;
import defpackage.cauf;
import defpackage.epmi;
import defpackage.fpri;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class GmsRestartChimeraService extends GmsTaskChimeraService {
    private final atsj a;

    public GmsRestartChimeraService() {
        this(new atsj());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (TimeUnit.MILLISECONDS.toSeconds(auud.a()) < fpri.b()) {
            ativ.a(this);
            return 0;
        }
        if (fpri.g() && d()) {
            atsj atsjVar = this.a;
            epmi epmiVar = epmi.SCHEDULED_IDLE;
            if (fpri.g()) {
                atsd atsdVar = new atsd();
                atsdVar.b = this;
                atsdVar.a = epmiVar;
                atsjVar.b(atsdVar.a());
            }
        }
        return 0;
    }

    public abstract boolean d();

    public GmsRestartChimeraService(atsj atsjVar) {
        this.a = atsjVar;
    }
}
