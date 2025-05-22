package com.google.android.gms.ads.nonagon.clearcut;

import android.content.Context;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.nonagon.signals.gmscore.ao;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.flnb;
import defpackage.flnf;
import defpackage.flni;
import defpackage.flnj;
import defpackage.uyw;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i implements flnb {
    private final flnj a;
    private final flnj b;
    private final flnj c;

    public i(flnj flnjVar, flnj flnjVar2, flnj flnjVar3) {
        this.a = flnjVar;
        this.b = flnjVar2;
        this.c = flnjVar3;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* bridge */ /* synthetic */ Object a() {
        Set set;
        final String a = ((ao) this.a).a();
        Context a2 = ((uyw) this.b).a();
        eqgo b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        Map a3 = ((flnf) this.c).a();
        if (((Boolean) p.aB.g()).booleanValue()) {
            com.google.android.gms.ads.internal.clearcut.b bVar = new com.google.android.gms.ads.internal.clearcut.b(new com.google.android.gms.ads.internal.clearcut.g(a2));
            bVar.a(new com.google.android.gms.ads.internal.clearcut.a() { // from class: com.google.android.gms.ads.nonagon.clearcut.j
                @Override // com.google.android.gms.ads.internal.clearcut.a
                public final void a(fgrc fgrcVar) {
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    String str = a;
                    com.google.android.gms.ads.internal.clearcut.i iVar = (com.google.android.gms.ads.internal.clearcut.i) fgrcVar.b;
                    com.google.android.gms.ads.internal.clearcut.i iVar2 = com.google.android.gms.ads.internal.clearcut.i.a;
                    iVar.b |= 2;
                    iVar.c = str;
                }
            });
            set = Collections.singleton(new com.google.android.gms.ads.nonagon.ad.event.d(new l(bVar, a3), b));
        } else {
            set = Collections.EMPTY_SET;
        }
        flni.e(set);
        return set;
    }
}
