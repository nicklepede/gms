package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import android.content.Intent;
import defpackage.anya;
import defpackage.asqh;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.xde;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PasskeysCacheModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (asqh.e() && xde.f()) {
            byko bykoVar = new byko();
            bykoVar.w(PasskeysCacheUpdateService.class.getName());
            bykoVar.v(2);
            bykoVar.p = true;
            bykoVar.t("PasskeysCacheUpdateTask");
            bykoVar.a = bykv.k;
            bykoVar.l(true);
            byjl.a(this).f(bykoVar.b());
        }
    }
}
