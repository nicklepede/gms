package com.google.android.gms.time.trustedtime.alluserapi.service;

import android.content.Context;
import com.google.android.gms.chimera.modules.time.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dioq;
import defpackage.dior;
import defpackage.diqg;
import defpackage.dirx;
import defpackage.dirz;
import defpackage.diua;
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
public final class TrustedTimeAllUserChimeraService extends bzot {
    public static final dxfp a = new dxfs(TrustedTimeAllUserChimeraService.class);
    private final dirx b;

    public TrustedTimeAllUserChimeraService() {
        this(new dirz());
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        boolean i;
        if (diug.b()) {
            Context a2 = AppContextProvider.a();
            if (diua.c(a2)) {
                i = fviu.a.lK().g();
            } else if (diua.b(a2)) {
                i = fviu.a.lK().e();
            } else if (diua.e(a2)) {
                i = fviu.a.lK().k();
            } else if (diua.a(a2)) {
                i = fviu.a.lK().m();
            } else if (diua.d(a2)) {
                i = fviu.a.lK().i();
            }
            if (i) {
                bzozVar.c(new diqg(l(), this.b, dioq.a(getApplicationContext()), getServiceRequest.f, getServiceRequest.p));
                return;
            }
        }
        ((eluo) ((eluo) diud.a.j()).ai(11394)).B("%s: TrustedTime is not enabled", a);
        bzozVar.a(16, null);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (printWriter == null) {
            return;
        }
        printWriter.println();
        printWriter.println(a);
        dior.a.a(printWriter);
    }

    public TrustedTimeAllUserChimeraService(dirx dirxVar) {
        super(326, "com.google.android.gms.time.trustedtime.service.START", elpp.a, true == diug.a() ? 3 : 1, 10);
        this.b = (dirx) Objects.requireNonNull(dirxVar);
    }
}
