package com.google.android.gms.significantplaces.api;

import android.os.Binder;
import android.os.Parcelable;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.bhec;
import defpackage.bqpn;
import defpackage.bwpq;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgk;
import defpackage.bxhh;
import defpackage.dcgs;
import defpackage.dcgt;
import defpackage.dcgz;
import defpackage.dchr;
import defpackage.fuwy;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;
import defpackage.fvic;
import defpackage.fvid;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignificantPlacesApiService extends bxgd {
    public dcgz a;
    private final fvic b;

    public SignificantPlacesApiService() {
        super(396, "com.google.android.gms.significantplaces.api.START", fuwy.a, 0, 9, dcgt.a);
        fuyx fuyxVar = bqpn.a;
        this.b = fvid.b(bqpn.f);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        dcgz dcgzVar = this.a;
        if (dcgzVar == null) {
            fvbo.j("significantPlacesImpl");
            dcgzVar = null;
        }
        dcgz dcgzVar2 = dcgzVar;
        bxgk a = bxhh.a(this);
        bhec bhecVar = bxgjVar.b;
        Parcelable.Creator creator = ClientIdentity.CREATOR;
        fvbo.e(bhecVar, "getClientType(...)");
        bxgjVar.c(new dchr(this, dcgzVar2, a, bwpq.b(bhecVar, getServiceRequest, Binder.getCallingUid(), Binder.getCallingPid()), dcgt.a));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        fvbo.f(fileDescriptor, "fd");
        fvbo.f(printWriter, "writer");
        fvbo.f(strArr, "args");
        fvgu.a(fuyy.a, new dcgs(this, printWriter, null));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.a = new dcgz(this, this.b);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        fvid.e(this.b, null);
        super.onDestroy();
    }
}
