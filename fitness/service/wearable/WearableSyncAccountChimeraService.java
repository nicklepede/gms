package com.google.android.gms.fitness.service.wearable;

import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.bidm;
import defpackage.bikw;
import defpackage.dlvs;
import defpackage.dmmv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class WearableSyncAccountChimeraService extends dmmv {
    private bidm a;

    @Override // defpackage.dmmv
    public final void c(NodeParcelable nodeParcelable) {
        this.a.m(nodeParcelable);
    }

    @Override // defpackage.dmmv
    public final void d(NodeParcelable nodeParcelable) {
        this.a.n(nodeParcelable);
    }

    @Override // defpackage.dmmv, defpackage.dlvp
    public final void gA(dlvs dlvsVar) {
        this.a.o();
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = bikw.a(this).e();
    }
}
