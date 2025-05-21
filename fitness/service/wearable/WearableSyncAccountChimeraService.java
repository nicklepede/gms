package com.google.android.gms.fitness.service.wearable;

import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.bfyw;
import defpackage.bggg;
import defpackage.djjz;
import defpackage.dkbc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WearableSyncAccountChimeraService extends dkbc {
    private bfyw a;

    @Override // defpackage.dkbc
    public final void c(NodeParcelable nodeParcelable) {
        this.a.m(nodeParcelable);
    }

    @Override // defpackage.dkbc
    public final void d(NodeParcelable nodeParcelable) {
        this.a.n(nodeParcelable);
    }

    @Override // defpackage.dkbc, defpackage.djjw
    public final void gl(djjz djjzVar) {
        this.a.o();
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = bggg.a(this).e();
    }
}
