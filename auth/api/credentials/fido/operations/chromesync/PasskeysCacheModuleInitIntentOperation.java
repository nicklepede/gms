package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auub;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.yzy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PasskeysCacheModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (auub.e() && yzy.f()) {
            catg catgVar = new catg();
            catgVar.w(PasskeysCacheUpdateService.class.getName());
            catgVar.v(2);
            catgVar.p = true;
            catgVar.t("PasskeysCacheUpdateTask");
            catgVar.a = catn.k;
            catgVar.l(true);
            casd.a(this).f(catgVar.b());
        }
    }
}
