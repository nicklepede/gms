package com.google.android.gms.security.safebrowsing;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cxwx;
import defpackage.cxyd;
import defpackage.eits;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SafeBrowsingClientChimeraService extends bxgd {
    public static final String a = "SafeBrowsingClientChimeraService";
    private cxyd b;

    public SafeBrowsingClientChimeraService() {
        super(new int[]{354}, new String[]{"com.google.android.gms.safebrowsing.SafeBrowsingService.START"}, ejck.a, 3, 9, 5, (eits) null);
    }

    private final synchronized cxyd c() {
        if (this.b == null) {
            this.b = new cxyd(getApplicationContext());
        }
        return this.b;
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cxwx(l(), c(), getServiceRequest.f));
    }
}
