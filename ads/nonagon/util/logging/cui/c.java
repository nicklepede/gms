package com.google.android.gms.ads.nonagon.util.logging.cui;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c implements fixe {
    private final fixm a;
    private final fixm b;

    public c(fixm fixmVar, fixm fixmVar2) {
        this.a = fixmVar;
        this.b = fixmVar2;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* synthetic */ Object a() {
        return new n(((tcw) this.a).a(), new VersionInfoParcel(251661004, 251661004), (com.google.android.gms.ads.nonagon.adapter.b) this.b.a());
    }
}
