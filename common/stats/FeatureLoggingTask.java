package com.google.android.gms.common.stats;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.askf;
import defpackage.askh;
import defpackage.aski;
import defpackage.askj;
import defpackage.askk;
import defpackage.asot;
import defpackage.bqna;
import defpackage.bqsq;
import defpackage.byln;
import defpackage.eijr;
import defpackage.fmuo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FeatureLoggingTask extends GmsTaskBoundService {
    static final String a;
    public static final /* synthetic */ int b = 0;
    private final askk c;

    static {
        asot.b("FeatureLoggingTask", asej.CORE);
        a = FeatureLoggingTask.class.getName();
    }

    public FeatureLoggingTask() {
        this(null);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        askk askfVar;
        askk askkVar = this.c;
        if (askkVar == null) {
            if (fmuo.a.a().f()) {
                int i = askh.b;
                askfVar = new askh(new bqsq(this), bqna.b(this), new askj(new eijr() { // from class: askg
                    @Override // defpackage.eijr
                    public final Object a() {
                        return Double.valueOf(fmuo.b());
                    }
                }), new aski());
            } else {
                int i2 = askf.a;
                askfVar = new askf(new bqsq(this), bqna.b(this), new askj(new eijr() { // from class: aske
                    @Override // defpackage.eijr
                    public final Object a() {
                        return Double.valueOf(fmuo.b());
                    }
                }), new aski());
            }
            askkVar = askfVar;
        }
        askkVar.a();
        return 0;
    }

    public FeatureLoggingTask(askk askkVar) {
        this.c = askkVar;
    }
}
