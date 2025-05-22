package com.google.android.gms.significantplaces.api;

import android.os.Binder;
import android.os.Parcelable;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.bjis;
import defpackage.bsxe;
import defpackage.byyd;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.bzpx;
import defpackage.deqy;
import defpackage.deqz;
import defpackage.derf;
import defpackage.derx;
import defpackage.fxsw;
import defpackage.fxuv;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;
import defpackage.fyea;
import defpackage.fyeb;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignificantPlacesApiService extends bzot {
    public derf a;
    private final fyea b;

    public SignificantPlacesApiService() {
        super(396, "com.google.android.gms.significantplaces.api.START", fxsw.a, 0, 9, deqz.a);
        fxuv fxuvVar = bsxe.a;
        this.b = fyeb.b(bsxe.f);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        derf derfVar = this.a;
        if (derfVar == null) {
            fxxm.j("significantPlacesImpl");
            derfVar = null;
        }
        derf derfVar2 = derfVar;
        bzpa a = bzpx.a(this);
        bjis bjisVar = bzozVar.b;
        Parcelable.Creator creator = ClientIdentity.CREATOR;
        fxxm.e(bjisVar, "getClientType(...)");
        bzozVar.c(new derx(this, derfVar2, a, byyd.b(bjisVar, getServiceRequest, Binder.getCallingUid(), Binder.getCallingPid()), deqz.a));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        fxxm.f(fileDescriptor, "fd");
        fxxm.f(printWriter, "writer");
        fxxm.f(strArr, "args");
        fycs.a(fxuw.a, new deqy(this, printWriter, null));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.a = new derf(this, this.b);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        fyeb.e(this.b, null);
        super.onDestroy();
    }
}
