package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.bbmt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class l {
    public static int a(Context context) {
        return bbmt.b(context, ModuleDescriptor.MODULE_ID);
    }

    public static Object b(Context context, String str, j jVar) {
        try {
            try {
                return jVar.a(bbmt.f(context, bbmt.a, ModuleDescriptor.MODULE_ID).e(str));
            } catch (Exception e) {
                throw new k(e);
            }
        } catch (Exception e2) {
            throw new k(e2);
        }
    }
}
