package com.google.android.gms.time.trustedtime.alluserapi.service;

import android.content.Context;
import com.google.android.gms.chimera.modules.time.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgdl;
import defpackage.dgdm;
import defpackage.dgfb;
import defpackage.dggs;
import defpackage.dggu;
import defpackage.dgiv;
import defpackage.dgiy;
import defpackage.dgjb;
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
public final class TrustedTimeAllUserChimeraService extends bxgd {
    public static final duut a = new duuw(TrustedTimeAllUserChimeraService.class);
    private final dggs b;

    public TrustedTimeAllUserChimeraService() {
        this(new dggu());
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        boolean i;
        if (dgjb.b()) {
            Context a2 = AppContextProvider.a();
            if (dgiv.c(a2)) {
                i = fsnk.a.a().g();
            } else if (dgiv.b(a2)) {
                i = fsnk.a.a().e();
            } else if (dgiv.e(a2)) {
                i = fsnk.a.a().k();
            } else if (dgiv.a(a2)) {
                i = fsnk.a.a().m();
            } else if (dgiv.d(a2)) {
                i = fsnk.a.a().i();
            }
            if (i) {
                bxgjVar.c(new dgfb(l(), this.b, dgdl.a(getApplicationContext()), getServiceRequest.f, getServiceRequest.p));
                return;
            }
        }
        ((ejhf) ((ejhf) dgiy.a.j()).ah(11391)).B("%s: TrustedTime is not enabled", a);
        bxgjVar.a(16, null);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (printWriter == null) {
            return;
        }
        printWriter.println();
        printWriter.println(a);
        dgdm.a.a(printWriter);
    }

    public TrustedTimeAllUserChimeraService(dggs dggsVar) {
        super(326, "com.google.android.gms.time.trustedtime.service.START", ejck.a, true == dgjb.a() ? 3 : 1, 10);
        this.b = (dggs) Objects.requireNonNull(dggsVar);
    }
}
