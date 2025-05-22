package com.google.android.gms.auth.api.proxy;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abir;
import defpackage.abol;
import defpackage.atwh;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elqn;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthChimeraService extends bzot {
    public static final Map a;

    static {
        ausn.b("AuthChimeraService", auid.AUTH_PROXY);
        a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public AuthChimeraService() {
        super(16, "com.google.android.gms.auth.service.START", new elqn("android.permission.INTERNET"), 3, 10);
    }

    public static void b(atwh atwhVar, abir abirVar) {
        a.put(atwhVar, new WeakReference(abirVar));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        String string = getServiceRequest.i.getString("consumerPkg");
        atwh atwhVar = new atwh(Binder.getCallingUid(), getServiceRequest.j, getServiceRequest.a(), str, string == null ? str : string, null, null, getServiceRequest.i);
        bzpe l = l();
        b(atwhVar, new abir(this, l, atwhVar));
        l.c(new abol(bzozVar, Binder.getCallingUid(), getServiceRequest.i, atwhVar));
    }
}
