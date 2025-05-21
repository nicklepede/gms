package com.google.android.gms.appinvite.service;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arts;
import defpackage.asqs;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.twt;
import defpackage.txd;
import defpackage.txi;
import defpackage.txj;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class AppInviteChimeraService extends bxgd {
    static final String[] a = {"com.google.android.gms.appinvite.service.START", "com.google.android.gms.appinvite.service.START_INTERNAL"};
    private txd b;
    private twt c;

    public AppInviteChimeraService() {
        super(new int[]{77, 106}, a, new HashSet(), 3, 9);
    }

    static void b() {
        if (Process.myUid() != Binder.getCallingUid()) {
            throw new SecurityException("Calling uid not permitted.");
        }
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (this.b == null) {
            this.b = txd.a(this);
        }
        if (this.c == null) {
            this.c = new twt(getApplicationContext());
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
            arts artsVar = new arts();
            artsVar.a = Binder.getCallingUid();
            artsVar.d = str;
            artsVar.e = getPackageName();
            bxgjVar.c(new txj(l(), artsVar, this.b, this.c));
            return;
        }
        if (i != 106) {
            bxgjVar.a(16, null);
            return;
        }
        b();
        arts artsVar2 = new arts();
        artsVar2.e = getPackageName();
        artsVar2.a = Binder.getCallingUid();
        artsVar2.c = getServiceRequest.j;
        artsVar2.b = getServiceRequest.a();
        String string2 = getServiceRequest.i.getString("realClientPackage");
        if (TextUtils.isEmpty(string2)) {
            string2 = getServiceRequest.f;
        }
        artsVar2.d = string2;
        Scope[] scopeArr = getServiceRequest.h;
        if (scopeArr != null) {
            artsVar2.o(asqs.d(scopeArr));
        }
        bxgjVar.c(new txi(l(), artsVar2, this.b));
    }
}
