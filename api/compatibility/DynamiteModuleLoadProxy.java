package com.google.android.gms.api.compatibility;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.aqbk;
import defpackage.bblp;
import defpackage.bbmp;
import defpackage.bbmt;
import defpackage.vkn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DynamiteModuleLoadProxy extends vkn {
    static {
        int i = aqbk.a;
    }

    @Override // defpackage.vko
    public IBinder load(bblp bblpVar, String str) {
        Context context = (Context) ObjectWrapper.a(bblpVar);
        if (context == null) {
            return null;
        }
        try {
            return bbmt.f(context, bbmt.a, str).e("com.google.android.gms.api.compatibility.DynamiteModuleLoadImpl");
        } catch (bbmp e) {
            throw new IllegalStateException(e);
        }
    }
}
