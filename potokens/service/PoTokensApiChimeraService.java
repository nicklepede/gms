package com.google.android.gms.potokens.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cwpe;
import defpackage.cwqn;
import defpackage.cwqo;
import defpackage.cwrh;
import defpackage.cwrx;
import defpackage.ejck;
import defpackage.frpd;
import defpackage.frpg;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PoTokensApiChimeraService extends bxgd {
    private cwqn a;

    static {
        asot.b("PoTokensApiChimeraService", asej.PO_TOKENS);
    }

    public PoTokensApiChimeraService() {
        this(new cwqo());
    }

    private final void c() {
        if (this.a != null) {
            return;
        }
        try {
            this.a = cwqn.a(this, 2);
        } catch (GeneralSecurityException unused) {
        }
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (!frpd.c()) {
            bxgjVar.a(23, null);
            cwqn cwqnVar = this.a;
            if (cwqnVar != null) {
                cwqnVar.d.m(false);
                return;
            }
            return;
        }
        c();
        cwqn cwqnVar2 = this.a;
        if (cwqnVar2 == null) {
            bxgjVar.a(8, null);
            return;
        }
        String str = getServiceRequest.f;
        String a = frpg.a.a().a();
        if (!a.isEmpty() && a.equals(str)) {
            Iterator it = cwqnVar2.b.values().iterator();
            while (it.hasNext()) {
                cwrh cwrhVar = ((cwrx) it.next()).a;
                synchronized (cwrhVar.f) {
                    cwrhVar.d = null;
                }
            }
            cwqnVar2.c.f();
        }
        cwqnVar2.d.m(true);
        bxgjVar.c(new cwpe(l(), cwqnVar2, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        frpd.c();
    }

    PoTokensApiChimeraService(cwqn cwqnVar) {
        this();
        this.a = cwqnVar;
    }

    public PoTokensApiChimeraService(cwqo cwqoVar) {
        super(285, "com.google.android.gms.potokens.service.START", ejck.a, 1, 9);
    }
}
