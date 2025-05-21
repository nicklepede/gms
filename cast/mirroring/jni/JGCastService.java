package com.google.android.gms.cast.mirroring.jni;

import android.content.Context;
import android.content.Intent;
import defpackage.asow;
import defpackage.aspx;
import defpackage.pne;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class JGCastService extends com.google.android.cast.JGCastService {
    public JGCastService(Context context, pne pneVar, Intent intent) {
        super(context, pneVar, intent);
    }

    @Override // com.google.android.cast.JGCastService
    public final boolean a(Context context) {
        int i = aspx.a;
        return asow.g(context, "jgcast_service_jni");
    }

    public final void b(String str, String str2, int i) {
        if (this.mDidLoadLibrary) {
            super.native_createSourceOrSink(true, "0.0.0.0", str, str2, null, i);
        }
    }
}
