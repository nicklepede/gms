package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.asmd;
import defpackage.fjzz;
import defpackage.fkah;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d {
    public static final String a = new VersionInfoParcel(251661004, 251661004).a;

    public static void a(final Context context, final Bundle bundle) {
        new asmd(10, new Runnable() { // from class: com.google.android.gms.ads.identifier.settings.c
            @Override // java.lang.Runnable
            public final void run() {
                String str = d.a;
                Context context2 = context;
                Bundle bundle2 = bundle;
                try {
                    bundle2.putString("cl", "752466036");
                    bundle2.putString("r_cl", "HEAD");
                    com.google.android.gms.ads.internal.config.p.c(context2);
                    com.google.android.gms.ads.internal.c.e().l(context2, d.a, "event-attestation", bundle2);
                } catch (RuntimeException e) {
                    if (!fkah.c()) {
                        throw e;
                    }
                }
            }
        });
    }

    public static void b(Context context, String str, String str2) {
        if (fjzz.k()) {
            Bundle bundle = new Bundle();
            bundle.putString("error_type", str);
            bundle.putString("error_detail", str2);
            a(context, bundle);
        }
    }

    public static void c(Context context, String str, Throwable th) {
        if (fjzz.k()) {
            String stackTraceString = th == null ? "NULL_EXCEPTION" : Log.getStackTraceString(th);
            Bundle bundle = new Bundle();
            bundle.putString("error_type", str);
            bundle.putString("exception", stackTraceString);
            a(context, bundle);
        }
    }

    public static void d(Context context, String str, String str2) {
        if (fjzz.k()) {
            Bundle bundle = new Bundle();
            bundle.putString("info_type", str);
            bundle.putString("info_detail", str2);
            a(context, bundle);
        }
    }

    public static byte[] e(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
}
