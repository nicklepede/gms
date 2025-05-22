package com.google.android.gms.chimera.container.boundservice;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.container.router.BoundServiceRouter;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import defpackage.aqen;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsBoundServiceRouter extends BoundServiceRouter implements ILifecycleSynchronizerRequired {
    public static final /* synthetic */ int a = 0;
    private final aqen b;

    public GmsBoundServiceRouter(Context context, String str, String str2, Bundle bundle, aqen aqenVar) {
        super(context, str, str2, bundle);
        this.b = aqenVar;
    }

    @Override // com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired
    public final void setLifecycleSynchronizer(LifecycleSynchronizer lifecycleSynchronizer) {
        this.b.a = lifecycleSynchronizer;
    }
}
