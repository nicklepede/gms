package com.google.android.gms.autofill.events;

import com.google.android.gms.autofill.events.AutofillGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.adpr;
import defpackage.aekz;
import defpackage.aery;
import defpackage.aerz;
import defpackage.aesb;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.bywx;
import defpackage.byxs;
import defpackage.byym;
import defpackage.drbi;
import defpackage.drbl;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.fecu;
import defpackage.fuuq;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("AutofillGcmTaskChimeraService", asej.AUTOFILL);
    private eits c;
    private fuuq d;
    private fuuq e;
    private fuuq f;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        eits eitsVar = this.c;
        String str = bylnVar.a;
        final aekz aekzVar = (aekz) eitsVar.get(str);
        if (aekzVar == null) {
            ((ejhf) ((ejhf) b.j()).ah((char) 956)).B("No affiliated Task for Tag: %s", str);
            return 2;
        }
        drbi a2 = ((byym) this.d.a()).a(str);
        fecu fecuVar = a2.a;
        if (fecuVar == adpr.SYNC_ID_UNKNOWN) {
            ((ejhf) ((ejhf) b.j()).ah((char) 955)).B("Unknown syncId for tag: %s", str);
            return 2;
        }
        bywx l = ((byxs) this.e.a()).l((adpr) fecuVar);
        int i = a2.b;
        return l.a(l.b(new drbl() { // from class: aekn
            @Override // defpackage.drbl
            public final enss a() {
                int i2 = AutofillGcmTaskChimeraService.a;
                return aekz.this.a();
            }
        }, i, (Executor) this.f.a()), i);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        aerz a2 = aery.a(this);
        this.c = a2.u();
        aesb aesbVar = (aesb) a2;
        this.e = aesbVar.s;
        this.d = aesbVar.q;
        this.f = aesbVar.U;
    }
}
