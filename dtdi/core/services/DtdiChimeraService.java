package com.google.android.gms.dtdi.core.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asot;
import defpackage.asqh;
import defpackage.axzw;
import defpackage.ayay;
import defpackage.aywk;
import defpackage.azap;
import defpackage.azas;
import defpackage.azcx;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;
import defpackage.fvbo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DtdiChimeraService extends bxgd {
    public static final asot a = ayay.a("DtdiService");
    public static final AtomicInteger b = new AtomicInteger(0);
    private final bxgo c;
    private azcx d;
    private azas m;

    public DtdiChimeraService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        azas azasVar;
        fvbo.f(getServiceRequest, "request");
        if (!asqh.c()) {
            bxgjVar.a(16, null);
            return;
        }
        String str = getServiceRequest.f;
        fvbo.c(str);
        azcx azcxVar = this.d;
        azas azasVar2 = this.m;
        if (azasVar2 == null) {
            fvbo.j("apiGatewayController");
            azasVar = null;
        } else {
            azasVar = azasVar2;
        }
        bxgo bxgoVar = this.c;
        if (bxgoVar == null) {
            bxgoVar = l();
        }
        bxgjVar.c(new aywk(this, str, azcxVar, azasVar, bxgoVar));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (asqh.c()) {
            this.m = new azas(azap.b);
        }
        this.d = new azcx(this, new axzw(this));
    }

    public DtdiChimeraService(bxgo bxgoVar) {
        super(312, "com.google.android.gms.dtdi.services.START", ejck.a, 3, 10);
        this.c = bxgoVar;
    }

    public /* synthetic */ DtdiChimeraService(bxgo bxgoVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(1 == (i & 1) ? null : bxgoVar);
    }
}
