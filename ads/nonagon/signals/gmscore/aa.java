package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.social.GmsDoritosProvider;
import defpackage.flnb;
import defpackage.flnj;
import defpackage.uyx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class aa implements flnb {
    private final flnj a;
    private final flnj b;

    public aa(flnj flnjVar, flnj flnjVar2) {
        this.a = flnjVar;
        this.b = flnjVar2;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* bridge */ /* synthetic */ Object a() {
        GmsDoritosProvider a = ((uyx) this.a).a();
        com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        return new y(a, ((aj) this.b).a());
    }
}
