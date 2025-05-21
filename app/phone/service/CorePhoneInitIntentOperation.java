package com.google.android.gms.app.phone.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqh;
import defpackage.fnex;
import defpackage.ips;
import defpackage.tqh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CorePhoneInitIntentOperation extends tqh {
    static final String[] a;

    static {
        asot.b("CorePhoneInitIntntOp", asej.CORE);
        a = new String[]{"com.google.android.gms.app.settings.SettingsSubPageActivity"};
    }

    private static final void l() {
        if (fnex.a.a().a()) {
            asng.M("com.google.android.gms.app.settings.GoogleSettingsIALink", 0);
            int i = ips.a;
        }
    }

    @Override // defpackage.anya
    public final void a(Intent intent, boolean z) {
        l();
        super.h();
        if (asqh.e()) {
            getBaseContext();
            super.g("com.google.android.gms.app.search.GmsSearchIndexablesProvider");
        }
        super.i();
    }

    @Override // defpackage.anya
    public final void c(Intent intent, boolean z) {
        l();
        super.h();
        super.i();
    }

    @Override // defpackage.anya
    public final void d(Intent intent) {
        l();
        super.i();
    }

    @Override // defpackage.tqh
    protected final void e(Context context) {
        asng.G(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsLink"));
        asng.G(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsIALink"));
    }

    @Override // defpackage.tqh
    protected final String[] f() {
        return a;
    }
}
