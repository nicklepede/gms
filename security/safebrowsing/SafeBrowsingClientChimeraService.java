package com.google.android.gms.security.safebrowsing;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dagu;
import defpackage.daia;
import defpackage.elgx;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingClientChimeraService extends bzot {
    public static final String a = "SafeBrowsingClientChimeraService";
    private daia b;

    public SafeBrowsingClientChimeraService() {
        super(new int[]{354}, new String[]{"com.google.android.gms.safebrowsing.SafeBrowsingService.START"}, elpp.a, 3, 9, 5, (elgx) null);
    }

    private final synchronized daia c() {
        if (this.b == null) {
            this.b = new daia(getApplicationContext());
        }
        return this.b;
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dagu(l(), c(), getServiceRequest.f));
    }
}
