package com.google.android.gms.time.trustedtime.allusertestapi.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgdl;
import defpackage.dgds;
import defpackage.dggs;
import defpackage.dggu;
import defpackage.dgiy;
import defpackage.duut;
import defpackage.duuw;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.fsnk;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TrustedTimeAllUserTestChimeraService extends bxgd {
    public static final duut a = new duuw(TrustedTimeAllUserTestChimeraService.class);
    private final dggs b;

    public TrustedTimeAllUserTestChimeraService() {
        this(new dggu());
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (fsnk.c()) {
            bxgjVar.c(new dgds(l(), this.b, dgdl.a(getApplicationContext()), getServiceRequest.f, getServiceRequest.p));
        } else {
            ((ejhf) ((ejhf) dgiy.a.j()).ah(11403)).B("%s: TrustedTime is not enabled", a);
            bxgjVar.a(16, null);
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (printWriter == null) {
            return;
        }
        printWriter.println();
        printWriter.println(a);
    }

    public TrustedTimeAllUserTestChimeraService(dggs dggsVar) {
        super(326, "com.google.android.gms.time.trustedtime.allusertestapi.service.START", ejck.a, 1, 10);
        this.b = (dggs) Objects.requireNonNull(dggsVar);
    }
}
