package com.google.android.gms.networktransparency.init;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqh;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.crsl;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ModuleInitializer extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        if (asqh.a()) {
            boolean b = crsl.b();
            asng.K("com.google.android.gms.networktransparency.ui.NetworkTransparencyActivity", b);
            if (b) {
                asot asotVar = NetworkDataUpdateTaskBoundService.a;
                byjl a = byjl.a(this);
                byko bykoVar = new byko();
                int i2 = fvcc.a;
                bykoVar.w(new fvbi(NetworkDataUpdateTaskBoundService.class).b());
                bykoVar.l(false);
                bykoVar.a = bykv.l;
                bykoVar.v(2);
                bykoVar.t("NetworkDataUpdateTaskBoundService");
                a.f(bykoVar.b());
            }
        }
    }
}
