package com.google.android.gms.fonts.service;

import defpackage.bjhn;
import defpackage.bjif;
import defpackage.fqxr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FontsChimeraProvider extends bjhn {
    @Override // defpackage.bjhn
    protected final long a() {
        return fqxr.b();
    }

    @Override // defpackage.bjhn
    protected final boolean b() {
        return fqxr.a.lK().g();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        bjif.a.g(getContext());
        return true;
    }
}
