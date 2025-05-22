package com.google.android.gms.cast.mirroring.jni;

import android.content.Context;
import android.content.Intent;
import defpackage.ausq;
import defpackage.autr;
import defpackage.rgi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class JGCastService extends com.google.android.cast.JGCastService {
    public JGCastService(Context context, rgi rgiVar, Intent intent) {
        super(context, rgiVar, intent);
    }

    @Override // com.google.android.cast.JGCastService
    public final boolean a(Context context) {
        int i = autr.a;
        return ausq.g(context, "jgcast_service_jni");
    }

    public final void b(String str, String str2, int i) {
        if (this.mDidLoadLibrary) {
            super.native_createSourceOrSink(true, "0.0.0.0", str, str2, null, i);
        }
    }
}
