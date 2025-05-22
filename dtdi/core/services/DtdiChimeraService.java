package com.google.android.gms.dtdi.core.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ausn;
import defpackage.auub;
import defpackage.badw;
import defpackage.baey;
import defpackage.bbae;
import defpackage.bbes;
import defpackage.bbev;
import defpackage.bbgz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elpp;
import defpackage.fxxm;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DtdiChimeraService extends bzot {
    public static final ausn a = baey.a("DtdiService");
    public static final AtomicInteger b = new AtomicInteger(0);
    private final bzpe c;
    private bbgz d;
    private bbev m;

    public DtdiChimeraService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bbev bbevVar;
        fxxm.f(getServiceRequest, "request");
        if (!auub.c()) {
            bzozVar.a(16, null);
            return;
        }
        String str = getServiceRequest.f;
        fxxm.c(str);
        bbgz bbgzVar = this.d;
        bbev bbevVar2 = this.m;
        if (bbevVar2 == null) {
            fxxm.j("apiGatewayController");
            bbevVar = null;
        } else {
            bbevVar = bbevVar2;
        }
        bzpe bzpeVar = this.c;
        if (bzpeVar == null) {
            bzpeVar = l();
        }
        bzozVar.c(new bbae(this, str, bbgzVar, bbevVar, bzpeVar));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (auub.c()) {
            this.m = new bbev(bbes.b);
        }
        this.d = new bbgz(this, new badw(this));
    }

    public DtdiChimeraService(bzpe bzpeVar) {
        super(312, "com.google.android.gms.dtdi.services.START", elpp.a, 3, 10);
        this.c = bzpeVar;
    }

    public /* synthetic */ DtdiChimeraService(bzpe bzpeVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(1 == (i & 1) ? null : bzpeVar);
    }
}
