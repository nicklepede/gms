package com.google.android.gms.time.trustedtime.allusertestapi.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dioq;
import defpackage.diox;
import defpackage.dirx;
import defpackage.dirz;
import defpackage.diud;
import defpackage.dxfp;
import defpackage.dxfs;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.fviu;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TrustedTimeAllUserTestChimeraService extends bzot {
    public static final dxfp a = new dxfs(TrustedTimeAllUserTestChimeraService.class);
    private final dirx b;

    public TrustedTimeAllUserTestChimeraService() {
        this(new dirz());
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (fviu.c()) {
            bzozVar.c(new diox(l(), this.b, dioq.a(getApplicationContext()), getServiceRequest.f, getServiceRequest.p));
        } else {
            ((eluo) ((eluo) diud.a.j()).ai(11406)).B("%s: TrustedTime is not enabled", a);
            bzozVar.a(16, null);
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (printWriter == null) {
            return;
        }
        printWriter.println();
        printWriter.println(a);
    }

    public TrustedTimeAllUserTestChimeraService(dirx dirxVar) {
        super(326, "com.google.android.gms.time.trustedtime.allusertestapi.service.START", elpp.a, 1, 10);
        this.b = (dirx) Objects.requireNonNull(dirxVar);
    }
}
