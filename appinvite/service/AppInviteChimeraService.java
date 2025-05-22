package com.google.android.gms.appinvite.service;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atwh;
import defpackage.auum;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.vst;
import defpackage.vtc;
import defpackage.vth;
import defpackage.vti;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class AppInviteChimeraService extends bzot {
    static final String[] a = {"com.google.android.gms.appinvite.service.START", "com.google.android.gms.appinvite.service.START_INTERNAL"};
    private vtc b;
    private vst c;

    public AppInviteChimeraService() {
        super(new int[]{77, 106}, a, new HashSet(), 3, 9);
    }

    static void b() {
        if (Process.myUid() != Binder.getCallingUid()) {
            throw new SecurityException("Calling uid not permitted.");
        }
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (this.b == null) {
            this.b = vtc.a(this);
        }
        if (this.c == null) {
            this.c = new vst(getApplicationContext());
        }
        int i = getServiceRequest.d;
        if (i == 77) {
            String str = getServiceRequest.f;
            String string = getServiceRequest.i.getString("authPackage");
            if (getPackageName().equals(string)) {
                b();
            } else if (!str.equals(string)) {
                throw new SecurityException("invalid authPackage");
            }
            atwh atwhVar = new atwh();
            atwhVar.a = Binder.getCallingUid();
            atwhVar.d = str;
            atwhVar.e = getPackageName();
            bzozVar.c(new vti(l(), atwhVar, this.b, this.c));
            return;
        }
        if (i != 106) {
            bzozVar.a(16, null);
            return;
        }
        b();
        atwh atwhVar2 = new atwh();
        atwhVar2.e = getPackageName();
        atwhVar2.a = Binder.getCallingUid();
        atwhVar2.c = getServiceRequest.j;
        atwhVar2.b = getServiceRequest.a();
        String string2 = getServiceRequest.i.getString("realClientPackage");
        if (TextUtils.isEmpty(string2)) {
            string2 = getServiceRequest.f;
        }
        atwhVar2.d = string2;
        Scope[] scopeArr = getServiceRequest.h;
        if (scopeArr != null) {
            atwhVar2.o(auum.d(scopeArr));
        }
        bzozVar.c(new vth(l(), atwhVar2, this.b));
    }
}
