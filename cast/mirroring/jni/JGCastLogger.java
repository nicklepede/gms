package com.google.android.gms.cast.mirroring.jni;

import android.content.Context;
import defpackage.ausq;
import defpackage.autr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class JGCastLogger extends com.google.android.cast.JGCastLogger {
    public JGCastLogger(Context context) {
        super(context);
    }

    @Override // com.google.android.cast.JGCastLogger
    public final boolean b(Context context) {
        int i = autr.a;
        return ausq.g(context, "jgcast_service_jni");
    }
}
