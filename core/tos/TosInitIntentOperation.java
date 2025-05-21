package com.google.android.gms.core.tos;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqh;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class TosInitIntentOperation extends anya {
    private static final asot a = asot.b("TosInit", asej.CORE);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (asqh.g()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 3316)).x("disabling AutomotiveWebViewActivity activity in GSF");
            try {
                asng.I(this, new ComponentName("com.google.android.gsf", "com.google.android.gsf.settings.common.AutomotiveWebViewActivity"), 2);
            } catch (IllegalArgumentException e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 3317)).x("auto setComponentEnabled failed");
            }
            getPackageManager();
        }
    }
}
