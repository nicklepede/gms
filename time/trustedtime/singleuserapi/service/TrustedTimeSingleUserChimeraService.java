package com.google.android.gms.time.trustedtime.singleuserapi.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dggs;
import defpackage.dggu;
import defpackage.dggw;
import defpackage.dghr;
import defpackage.dgii;
import defpackage.dgij;
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
public final class TrustedTimeSingleUserChimeraService extends bxgd {
    public static final duut a = new duuw(TrustedTimeSingleUserChimeraService.class);
    private final dggs b;
    private final dgij c;

    public TrustedTimeSingleUserChimeraService() {
        this(new dggu(), dgii.a);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (dgjb.b() || fsnk.c()) {
            bxgjVar.c(new dggw(l(), this.b, this.c, getServiceRequest.f, getServiceRequest.p));
        } else {
            ((ejhf) ((ejhf) dgiy.a.j()).ah(11420)).B("%s: TrustedTime or test mode is not enabled", a);
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
        dghr.a.a(printWriter);
    }

    public TrustedTimeSingleUserChimeraService(dggs dggsVar, dgij dgijVar) {
        super(326, "com.google.android.gms.time.trustedtime.singleuserapi.service.START", ejck.a, 0, 10);
        this.b = (dggs) Objects.requireNonNull(dggsVar);
        this.c = (dgij) Objects.requireNonNull(dgijVar);
    }
}
