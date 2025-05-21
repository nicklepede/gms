package com.google.android.gms.ads.identifier.service;

import com.google.android.gms.ads.eventattestation.internal.ClickAttestationTokenRequestParcel;
import com.google.android.gms.common.api.Status;
import defpackage.bxgi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g extends bxgi {
    private final ClickAttestationTokenRequestParcel a;
    private final int b;
    private final com.google.android.gms.ads.eventattestation.internal.k c;

    public g(ClickAttestationTokenRequestParcel clickAttestationTokenRequestParcel, int i, com.google.android.gms.ads.eventattestation.internal.k kVar) {
        super(216, "FetchClickAttestationToken");
        this.a = clickAttestationTokenRequestParcel;
        this.b = i;
        this.c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[Catch: t -> 0x0108, GeneralSecurityException -> 0x0114, IOException -> 0x0116, TRY_LEAVE, TryCatch #2 {t -> 0x0108, IOException -> 0x0116, GeneralSecurityException -> 0x0114, blocks: (B:3:0x000e, B:7:0x001d, B:9:0x0023, B:10:0x003b, B:12:0x0048, B:14:0x0072, B:16:0x007e, B:19:0x008e, B:20:0x0095, B:22:0x0096, B:25:0x00a2, B:28:0x00af, B:31:0x00cd, B:32:0x00e8, B:34:0x00ef, B:35:0x00d7, B:36:0x00de, B:37:0x00df), top: B:2:0x000e }] */
    @Override // defpackage.bxgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.service.g.f(android.content.Context):void");
    }

    @Override // defpackage.bxgi
    public final void j(Status status) {
        this.c.a(1, status.j);
    }
}
