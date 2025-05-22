package com.google.android.gms.measurement.internal;

import android.content.Context;
import defpackage.cfxg;
import defpackage.cfxh;
import defpackage.cfxi;
import defpackage.cfxj;
import defpackage.cfxs;
import defpackage.cfxv;
import defpackage.cgbp;
import defpackage.cgdd;
import defpackage.cgea;
import defpackage.cgev;
import defpackage.cgew;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ModuleUploadFactory extends cgew {
    public ModuleUploadFactory(Context context) {
        super(context);
    }

    @Override // defpackage.cgew
    public final cfxs a(cgev cgevVar) {
        return new cfxg(cgevVar);
    }

    @Override // defpackage.cgew
    public final cgbp b(cgev cgevVar) {
        return new cfxh(cgevVar);
    }

    @Override // defpackage.cgew
    public final cgdd c(cgev cgevVar) {
        return new cfxi(cgevVar);
    }

    @Override // defpackage.cgew
    public final cgea d(cgev cgevVar) {
        return new cfxv(cgevVar);
    }

    @Override // defpackage.cgew
    public final cgev e() {
        return new cfxj(this);
    }
}
