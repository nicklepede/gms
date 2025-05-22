package com.google.android.gms.chimera.container;

import android.content.Context;
import defpackage.apzn;
import defpackage.ekxj;
import defpackage.rhz;
import defpackage.rod;
import defpackage.rom;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsModuleProvider extends apzn {
    @Override // defpackage.apzn, defpackage.riq
    protected final boolean g() {
        Context context = getContext();
        ekxj.e(context);
        rod.c();
        rom.d(this, this, new GmsModuleChimeraProvider(), rod.h(context, rhz.b()));
        return true;
    }
}
