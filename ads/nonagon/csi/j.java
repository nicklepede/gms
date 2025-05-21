package com.google.android.gms.ads.nonagon.csi;

import com.google.android.gms.ads.internal.util.client.m;
import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class j implements fixe {
    private final fixm a;
    private final fixm b;
    private final fixm c;

    public j(fixm fixmVar, fixm fixmVar2, fixm fixmVar3) {
        this.a = fixmVar;
        this.b = fixmVar2;
        this.c = fixmVar3;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* bridge */ /* synthetic */ Object a() {
        return new f(com.google.android.gms.ads.nonagon.util.concurrent.b.b(), (m) this.a.a(), ((com.google.android.gms.ads.nonagon.util.logging.csi.b) this.b).a(), new com.google.android.gms.ads.nonagon.util.logging.csi.c(), ((tcw) this.c).a());
    }
}
