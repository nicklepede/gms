package com.google.android.gms.api.compatibility;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.anzs;
import defpackage.azht;
import defpackage.azit;
import defpackage.azix;
import defpackage.ton;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DynamiteModuleLoadProxy extends ton {
    static {
        int i = anzs.a;
    }

    @Override // defpackage.too
    public IBinder load(azht azhtVar, String str) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            return null;
        }
        try {
            return azix.f(context, azix.a, str).e("com.google.android.gms.api.compatibility.DynamiteModuleLoadImpl");
        } catch (azit e) {
            throw new IllegalStateException(e);
        }
    }
}
