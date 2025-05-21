package com.google.android.gms.chimera.container;

import android.content.Context;
import defpackage.anxv;
import defpackage.eike;
import defpackage.pov;
import defpackage.puz;
import defpackage.pvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsModuleProvider extends anxv {
    @Override // defpackage.anxv, defpackage.ppm
    protected final boolean g() {
        Context context = getContext();
        eike.e(context);
        puz.c();
        pvi.d(this, this, new GmsModuleChimeraProvider(), puz.h(context, pov.b()));
        return true;
    }
}
