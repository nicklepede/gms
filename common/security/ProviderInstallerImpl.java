package com.google.android.gms.common.security;

import android.content.Context;
import android.util.Log;
import defpackage.anzs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ProviderInstallerImpl {
    static {
        int i = anzs.a;
    }

    private ProviderInstallerImpl() {
    }

    public static void insertProvider(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.providerinstaller.ProviderInstallerImpl").getMethod("insertProvider", Context.class).invoke(null, context);
        } catch (Exception e) {
            Log.e("ProviderInstallerImpl", "Failed to call insertProvider of ProviderInstallerImpl stub via reflection!");
            throw new SecurityException(e);
        }
    }

    public static void reportRequestStats2(Context context, long j, long j2) {
    }
}
