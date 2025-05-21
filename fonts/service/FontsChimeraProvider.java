package com.google.android.gms.fonts.service;

import defpackage.bhcx;
import defpackage.bhdp;
import defpackage.fofh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FontsChimeraProvider extends bhcx {
    @Override // defpackage.bhcx
    protected final long a() {
        return fofh.b();
    }

    @Override // defpackage.bhcx
    protected final boolean b() {
        return fofh.a.a().g();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        bhdp.a.g(getContext());
        return true;
    }
}
