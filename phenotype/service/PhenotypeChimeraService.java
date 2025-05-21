package com.google.android.gms.phenotype.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asmf;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cwdc;
import defpackage.cwdl;
import defpackage.eits;
import defpackage.frjv;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PhenotypeChimeraService extends bxgd {
    private final cwdl a;

    public PhenotypeChimeraService() {
        this(new cwdl());
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cwdc(l(), getServiceRequest.f, this.a));
    }

    public PhenotypeChimeraService(cwdl cwdlVar) {
        super(new int[]{51}, new String[]{"com.google.android.gms.phenotype.service.START"}, Collections.EMPTY_SET, 3, new asmf((int) frjv.a.a().a(), 9), (eits) null);
        this.a = cwdlVar;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
    }
}
