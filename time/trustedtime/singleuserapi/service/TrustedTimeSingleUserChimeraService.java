package com.google.android.gms.time.trustedtime.singleuserapi.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dirx;
import defpackage.dirz;
import defpackage.disb;
import defpackage.disw;
import defpackage.ditn;
import defpackage.dito;
import defpackage.diud;
import defpackage.diug;
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
public final class TrustedTimeSingleUserChimeraService extends bzot {
    public static final dxfp a = new dxfs(TrustedTimeSingleUserChimeraService.class);
    private final dirx b;
    private final dito c;

    public TrustedTimeSingleUserChimeraService() {
        this(new dirz(), ditn.a);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (diug.b() || fviu.c()) {
            bzozVar.c(new disb(l(), this.b, this.c, getServiceRequest.f, getServiceRequest.p));
        } else {
            ((eluo) ((eluo) diud.a.j()).ai(11423)).B("%s: TrustedTime or test mode is not enabled", a);
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
        disw.a.a(printWriter);
    }

    public TrustedTimeSingleUserChimeraService(dirx dirxVar, dito ditoVar) {
        super(326, "com.google.android.gms.time.trustedtime.singleuserapi.service.START", elpp.a, 0, 10);
        this.b = (dirx) Objects.requireNonNull(dirxVar);
        this.c = (dito) Objects.requireNonNull(ditoVar);
    }
}
