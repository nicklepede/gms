package com.google.android.gms.ads.nonagon.clearcut;

import android.content.Context;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.nonagon.signals.gmscore.ao;
import defpackage.ensv;
import defpackage.fecj;
import defpackage.fixe;
import defpackage.fixi;
import defpackage.fixl;
import defpackage.fixm;
import defpackage.tcw;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i implements fixe {
    private final fixm a;
    private final fixm b;
    private final fixm c;

    public i(fixm fixmVar, fixm fixmVar2, fixm fixmVar3) {
        this.a = fixmVar;
        this.b = fixmVar2;
        this.c = fixmVar3;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* bridge */ /* synthetic */ Object a() {
        Set set;
        final String a = ((ao) this.a).a();
        Context a2 = ((tcw) this.b).a();
        ensv b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        Map a3 = ((fixi) this.c).a();
        if (((Boolean) p.aA.g()).booleanValue()) {
            com.google.android.gms.ads.internal.clearcut.b bVar = new com.google.android.gms.ads.internal.clearcut.b(new com.google.android.gms.ads.internal.clearcut.g(a2));
            bVar.a(new com.google.android.gms.ads.internal.clearcut.a() { // from class: com.google.android.gms.ads.nonagon.clearcut.j
                @Override // com.google.android.gms.ads.internal.clearcut.a
                public final void a(fecj fecjVar) {
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    String str = a;
                    com.google.android.gms.ads.internal.clearcut.i iVar = (com.google.android.gms.ads.internal.clearcut.i) fecjVar.b;
                    com.google.android.gms.ads.internal.clearcut.i iVar2 = com.google.android.gms.ads.internal.clearcut.i.a;
                    iVar.b |= 2;
                    iVar.c = str;
                }
            });
            set = Collections.singleton(new com.google.android.gms.ads.nonagon.ad.event.d(new l(bVar, a3), b));
        } else {
            set = Collections.EMPTY_SET;
        }
        fixl.e(set);
        return set;
    }
}
