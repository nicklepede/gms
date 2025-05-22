package com.google.android.gms.ads.nonagon.util.logging.cui;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.flnb;
import defpackage.flnj;
import defpackage.uyw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c implements flnb {
    private final flnj a;
    private final flnj b;

    public c(flnj flnjVar, flnj flnjVar2) {
        this.a = flnjVar;
        this.b = flnjVar2;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* synthetic */ Object a() {
        return new n(((uyw) this.a).a(), new VersionInfoParcel(251864004, 251864004), (com.google.android.gms.ads.nonagon.adapter.b) this.b.a());
    }
}
