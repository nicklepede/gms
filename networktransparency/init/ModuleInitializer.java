package com.google.android.gms.networktransparency.init;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.cubq;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ModuleInitializer extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        if (auub.a()) {
            boolean b = cubq.b();
            aura.K("com.google.android.gms.networktransparency.ui.NetworkTransparencyActivity", b);
            if (b) {
                ausn ausnVar = NetworkDataUpdateTaskBoundService.a;
                casd a = casd.a(this);
                catg catgVar = new catg();
                int i2 = fxya.a;
                catgVar.w(new fxxg(NetworkDataUpdateTaskBoundService.class).b());
                catgVar.l(false);
                catgVar.a = catn.l;
                catgVar.v(2);
                catgVar.t("NetworkDataUpdateTaskBoundService");
                a.f(catgVar.b());
            }
        }
    }
}
