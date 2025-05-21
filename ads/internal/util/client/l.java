package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.azix;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class l {
    public static int a(Context context) {
        return azix.b(context, ModuleDescriptor.MODULE_ID);
    }

    public static Object b(Context context, String str, j jVar) {
        try {
            try {
                return jVar.a(azix.f(context, azix.a, ModuleDescriptor.MODULE_ID).e(str));
            } catch (Exception e) {
                throw new k(e);
            }
        } catch (Exception e2) {
            throw new k(e2);
        }
    }
}
