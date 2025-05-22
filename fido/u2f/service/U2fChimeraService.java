package com.google.android.gms.fido.u2f.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aura;
import defpackage.beuc;
import defpackage.beue;
import defpackage.beug;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class U2fChimeraService extends bzot {
    private static final elhz b = elhz.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");
    static final String[] a = {"com.google.android.gms.fido.u2f.zeroparty.START", "com.google.android.gms.fido.u2f.privileged.START", "com.google.android.gms.fido.u2f.thirdparty.START"};

    public U2fChimeraService() {
        super(new int[]{119, 118, 117}, a, b, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        String string = getServiceRequest.i.getString("ACTION_START_SERVICE");
        if ("com.google.android.gms.fido.u2f.zeroparty.START".equals(string)) {
            if (!aura.X(this)) {
                throw new SecurityException("0P only API being called from outside GMSCore!");
            }
            bzozVar.c(new beug(l(), str, str2));
        } else if ("com.google.android.gms.fido.u2f.privileged.START".equals(string)) {
            bzozVar.c(new beuc(l(), str, str2));
        } else if ("com.google.android.gms.fido.u2f.thirdparty.START".equals(string)) {
            bzozVar.c(new beue(l(), str, str2));
        }
    }
}
