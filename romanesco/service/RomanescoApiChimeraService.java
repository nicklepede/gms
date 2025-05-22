package com.google.android.gms.romanesco.service;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.romanesco.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzje;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czze;
import defpackage.elhz;
import defpackage.funa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RomanescoApiChimeraService extends bzot {
    private static final elhz a = elhz.L("android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RomanescoApiChimeraService() {
        /*
            r10 = this;
            r0 = 135(0x87, float:1.89E-43)
            int[] r2 = new int[]{r0}
            java.lang.String r0 = "com.google.android.gms.romanesco.service.START"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            elhz r4 = com.google.android.gms.romanesco.service.RomanescoApiChimeraService.a
            funa r0 = defpackage.funa.a
            funb r1 = r0.lK()
            long r5 = r1.b()
            int r7 = (int) r5
            funb r0 = r0.lK()
            fhbp r0 = r0.g()
            fgsa r0 = r0.b
            elhz r9 = defpackage.elhz.G(r0)
            r5 = 0
            r6 = 9
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.romanesco.service.RomanescoApiChimeraService.<init>():void");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (funa.a.lK().k()) {
            Context a2 = AppContextProvider.a();
            int a3 = bzje.a(a2, "android.permission.READ_CONTACTS", Binder.getCallingPid(), Binder.getCallingUid(), str);
            int a4 = bzje.a(a2, "android.permission.WRITE_CONTACTS", Binder.getCallingPid(), Binder.getCallingUid(), str);
            if (a3 != 0 || a4 != 0) {
                bzozVar.a(16, new Bundle());
                return;
            }
        }
        bzozVar.c(new czze(l(), str, getServiceRequest.p));
    }
}
