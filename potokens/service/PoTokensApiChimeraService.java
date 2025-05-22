package com.google.android.gms.potokens.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cyzb;
import defpackage.czak;
import defpackage.czal;
import defpackage.czbe;
import defpackage.czbu;
import defpackage.elpp;
import defpackage.fuji;
import defpackage.fujl;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PoTokensApiChimeraService extends bzot {
    private czak a;

    static {
        ausn.b("PoTokensApiChimeraService", auid.PO_TOKENS);
    }

    public PoTokensApiChimeraService() {
        this(new czal());
    }

    private final void c() {
        if (this.a != null) {
            return;
        }
        try {
            this.a = czak.a(this, 2);
        } catch (GeneralSecurityException unused) {
        }
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (!fuji.c()) {
            bzozVar.a(23, null);
            czak czakVar = this.a;
            if (czakVar != null) {
                czakVar.d.m(false);
                return;
            }
            return;
        }
        c();
        czak czakVar2 = this.a;
        if (czakVar2 == null) {
            bzozVar.a(8, null);
            return;
        }
        String str = getServiceRequest.f;
        String a = fujl.a.lK().a();
        if (!a.isEmpty() && a.equals(str)) {
            Iterator it = czakVar2.b.values().iterator();
            while (it.hasNext()) {
                czbe czbeVar = ((czbu) it.next()).a;
                synchronized (czbeVar.f) {
                    czbeVar.d = null;
                }
            }
            czakVar2.c.f();
        }
        czakVar2.d.m(true);
        bzozVar.c(new cyzb(l(), czakVar2, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        fuji.c();
    }

    PoTokensApiChimeraService(czak czakVar) {
        this();
        this.a = czakVar;
    }

    public PoTokensApiChimeraService(czal czalVar) {
        super(285, "com.google.android.gms.potokens.service.START", elpp.a, 1, 9);
    }
}
