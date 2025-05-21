package com.google.android.gms.fido.u2f.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asng;
import defpackage.bcsp;
import defpackage.bcsr;
import defpackage.bcst;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class U2fChimeraService extends bxgd {
    private static final eiuu b = eiuu.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");
    static final String[] a = {"com.google.android.gms.fido.u2f.zeroparty.START", "com.google.android.gms.fido.u2f.privileged.START", "com.google.android.gms.fido.u2f.thirdparty.START"};

    public U2fChimeraService() {
        super(new int[]{119, 118, 117}, a, b, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        String string = getServiceRequest.i.getString("ACTION_START_SERVICE");
        if ("com.google.android.gms.fido.u2f.zeroparty.START".equals(string)) {
            if (!asng.X(this)) {
                throw new SecurityException("0P only API being called from outside GMSCore!");
            }
            bxgjVar.c(new bcst(l(), str, str2));
        } else if ("com.google.android.gms.fido.u2f.privileged.START".equals(string)) {
            bxgjVar.c(new bcsp(l(), str, str2));
        } else if ("com.google.android.gms.fido.u2f.thirdparty.START".equals(string)) {
            bxgjVar.c(new bcsr(l(), str, str2));
        }
    }
}
