package com.google.android.gms.analytics.internal;

import android.content.Context;
import defpackage.tlb;
import defpackage.tlc;
import defpackage.tmb;
import defpackage.tnw;
import defpackage.tnx;
import defpackage.toa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ModuleAnalyticsFactory extends tlc {
    public ModuleAnalyticsFactory(Context context) {
        super(context);
    }

    @Override // defpackage.tlc
    public final tmb a(tlb tlbVar) {
        return new tnw(tlbVar);
    }

    @Override // defpackage.tlc
    public final toa b(tlb tlbVar) {
        return new tnx(tlbVar);
    }
}
