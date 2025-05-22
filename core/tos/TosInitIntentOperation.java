package com.google.android.gms.core.tos;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class TosInitIntentOperation extends apzs {
    private static final ausn a = ausn.b("TosInit", auid.CORE);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (auub.g()) {
            ((eluo) ((eluo) a.h()).ai((char) 3320)).x("disabling AutomotiveWebViewActivity activity in GSF");
            try {
                aura.I(this, new ComponentName("com.google.android.gsf", "com.google.android.gsf.settings.common.AutomotiveWebViewActivity"), 2);
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 3321)).x("auto setComponentEnabled failed");
            }
            getPackageManager();
        }
    }
}
