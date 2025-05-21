package com.google.android.gms.cast.mirroring.jni;

import android.content.Context;
import defpackage.asow;
import defpackage.aspx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class JGCastLogger extends com.google.android.cast.JGCastLogger {
    public JGCastLogger(Context context) {
        super(context);
    }

    @Override // com.google.android.cast.JGCastLogger
    public final boolean b(Context context) {
        int i = aspx.a;
        return asow.g(context, "jgcast_service_jni");
    }
}
