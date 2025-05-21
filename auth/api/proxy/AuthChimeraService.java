package com.google.android.gms.auth.api.proxy;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arts;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejdg;
import defpackage.zir;
import defpackage.zol;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthChimeraService extends bxgd {
    public static final Map a;

    static {
        asot.b("AuthChimeraService", asej.AUTH_PROXY);
        a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public AuthChimeraService() {
        super(16, "com.google.android.gms.auth.service.START", new ejdg("android.permission.INTERNET"), 3, 10);
    }

    public static void b(arts artsVar, zir zirVar) {
        a.put(artsVar, new WeakReference(zirVar));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        String string = getServiceRequest.i.getString("consumerPkg");
        arts artsVar = new arts(Binder.getCallingUid(), getServiceRequest.j, getServiceRequest.a(), str, string == null ? str : string, null, null, getServiceRequest.i);
        bxgo l = l();
        b(artsVar, new zir(this, l, artsVar));
        l.c(new zol(bxgjVar, Binder.getCallingUid(), getServiceRequest.i, artsVar));
    }
}
