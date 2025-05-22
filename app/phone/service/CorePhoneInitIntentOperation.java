package com.google.android.gms.app.phone.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.fpww;
import defpackage.iri;
import defpackage.vmh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CorePhoneInitIntentOperation extends vmh {
    static final String[] a;

    static {
        ausn.b("CorePhoneInitIntntOp", auid.CORE);
        a = new String[]{"com.google.android.gms.app.settings.SettingsSubPageActivity"};
    }

    private static final void l() {
        if (fpww.a.lK().a()) {
            aura.M("com.google.android.gms.app.settings.GoogleSettingsIALink", 0);
            int i = iri.a;
        }
    }

    @Override // defpackage.apzs
    public final void a(Intent intent, boolean z) {
        l();
        super.h();
        if (auub.e()) {
            getBaseContext();
            super.g("com.google.android.gms.app.search.GmsSearchIndexablesProvider");
        }
        super.i();
    }

    @Override // defpackage.apzs
    public final void c(Intent intent, boolean z) {
        l();
        super.h();
        super.i();
    }

    @Override // defpackage.apzs
    public final void d(Intent intent) {
        l();
        super.i();
    }

    @Override // defpackage.vmh
    protected final void e(Context context) {
        aura.G(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsLink"));
        aura.G(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsIALink"));
    }

    @Override // defpackage.vmh
    protected final String[] f() {
        return a;
    }
}
