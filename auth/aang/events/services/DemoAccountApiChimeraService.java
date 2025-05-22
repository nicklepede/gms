package com.google.android.gms.auth.aang.events.services;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.eluo;
import defpackage.fmvg;
import defpackage.xet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DemoAccountApiChimeraService extends bzot {
    private final ausn a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DemoAccountApiChimeraService() {
        /*
            r7 = this;
            r5 = 9
            elpp r3 = defpackage.elpp.a
            r1 = 426(0x1aa, float:5.97E-43)
            java.lang.String r2 = "com.google.android.gms.auth.account.demoaccount.service.START"
            r4 = 3
            r6 = r3
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "DemoAccountApiChimeraService"
            ausn r1 = defpackage.wxb.a(r1)
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.aang.events.services.DemoAccountApiChimeraService.<init>():void");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (!fmvg.a.lK().j()) {
            ((eluo) ((eluo) this.a.j()).ai((char) 482)).x("API is disabled.");
            bzozVar.a(16, new Bundle());
        } else {
            ((eluo) ((eluo) this.a.j()).ai((char) 481)).x("API is only available on Android S+");
            bzozVar.a(16, new Bundle());
            String str = getServiceRequest.f;
            bzozVar.c(new xet(l(), getServiceRequest.f, getServiceRequest.p));
        }
    }
}
