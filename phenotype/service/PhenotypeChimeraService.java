package com.google.android.gms.phenotype.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aupz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cymz;
import defpackage.cyni;
import defpackage.elgx;
import defpackage.fudt;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PhenotypeChimeraService extends bzot {
    private final cyni a;

    public PhenotypeChimeraService() {
        this(new cyni());
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new cymz(l(), getServiceRequest.f, this.a));
    }

    public PhenotypeChimeraService(cyni cyniVar) {
        super(new int[]{51}, new String[]{"com.google.android.gms.phenotype.service.START"}, Collections.EMPTY_SET, 3, new aupz((int) fudt.a.lK().a(), 9), (elgx) null);
        this.a = cyniVar;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
    }
}
