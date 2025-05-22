package com.google.android.gms.firebase.fpnv.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bhlc;
import defpackage.bhlh;
import defpackage.bhlk;
import defpackage.bhlp;
import defpackage.bhlr;
import defpackage.bhmj;
import defpackage.bhmm;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.bzpx;
import defpackage.fxxm;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FpnvApiService extends bhlr {
    public bhlk a;
    public bhlc b;
    public bhlh c;
    public bhmm d;

    public FpnvApiService() {
        super(429, "com.google.android.gms.firebase.fpnv.service.START", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bhlk bhlkVar;
        bhlc bhlcVar;
        bhlh bhlhVar;
        fxxm.f(getServiceRequest, "request");
        bzpa a = bzpx.a(this);
        if (this.d == null) {
            fxxm.j("fpnvImpl");
        }
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        bhlk bhlkVar2 = this.a;
        if (bhlkVar2 == null) {
            fxxm.j("fpnvGrpcClient");
            bhlkVar = null;
        } else {
            bhlkVar = bhlkVar2;
        }
        bhlc bhlcVar2 = this.b;
        if (bhlcVar2 == null) {
            fxxm.j("timeClient");
            bhlcVar = null;
        } else {
            bhlcVar = bhlcVar2;
        }
        bhlh bhlhVar2 = this.c;
        if (bhlhVar2 == null) {
            fxxm.j("tokenManager");
            bhlhVar = null;
        } else {
            bhlhVar = bhlhVar2;
        }
        bhmj bhmjVar = new bhmj(str, this, bhlkVar, bhlcVar, bhlhVar);
        String str2 = getServiceRequest.f;
        fxxm.e(str2, "getCallingPackage(...)");
        bzozVar.c(new bhlp(a, bhmjVar, str2, getServiceRequest.p));
    }
}
