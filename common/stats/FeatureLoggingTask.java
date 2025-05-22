package com.google.android.gms.common.stats;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.aunz;
import defpackage.auob;
import defpackage.auoc;
import defpackage.auod;
import defpackage.auoe;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.btah;
import defpackage.cauf;
import defpackage.ekww;
import defpackage.fpmm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FeatureLoggingTask extends GmsTaskBoundService {
    static final String a;
    public static final /* synthetic */ int b = 0;
    private final auoe c;

    static {
        ausn.b("FeatureLoggingTask", auid.CORE);
        a = FeatureLoggingTask.class.getName();
    }

    public FeatureLoggingTask() {
        this(null);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        auoe aunzVar;
        auoe auoeVar = this.c;
        if (auoeVar == null) {
            if (fpmm.a.lK().f()) {
                int i = auob.b;
                aunzVar = new auob(new btah(this), bsup.b(this), new auod(new ekww() { // from class: auoa
                    @Override // defpackage.ekww
                    public final Object lK() {
                        return Double.valueOf(fpmm.b());
                    }
                }), new auoc());
            } else {
                int i2 = aunz.a;
                aunzVar = new aunz(new btah(this), bsup.b(this), new auod(new ekww() { // from class: auny
                    @Override // defpackage.ekww
                    public final Object lK() {
                        return Double.valueOf(fpmm.b());
                    }
                }), new auoc());
            }
            auoeVar = aunzVar;
        }
        auoeVar.a();
        return 0;
    }

    public FeatureLoggingTask(auoe auoeVar) {
        this.c = auoeVar;
    }
}
