package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.ektc;
import defpackage.fmqe;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class v implements Closeable {
    final String b;
    final Context c;
    final long a = ektc.a.a();
    String d = "pending";

    public v(String str, Context context) {
        this.b = str;
        this.c = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long a = ektc.a.a() - this.a;
        String str = this.d;
        String str2 = d.a;
        if (fmqe.k()) {
            String str3 = this.b;
            Bundle bundle = new Bundle();
            bundle.putString("operation", str3);
            bundle.putString("latency", Long.toString(a));
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("status", str);
            }
            d.a(this.c, bundle);
        }
    }
}
