package com.google.android.gms.ads.play;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ eqgl a;
    final /* synthetic */ GmsCachingPlayStoreParentalControlProvider b;

    public a(GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider, eqgl eqglVar) {
        this.a = eqglVar;
        this.b = gmsCachingPlayStoreParentalControlProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            eqgl eqglVar = this.a;
            if (((Bundle) eqglVar.get()).getBoolean("is_cacheable")) {
                GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider = this.b;
                synchronized (gmsCachingPlayStoreParentalControlProvider.a) {
                    gmsCachingPlayStoreParentalControlProvider.c = false;
                    gmsCachingPlayStoreParentalControlProvider.b = eqglVar;
                }
            }
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            h.i("Error waiting for future result.");
        }
    }
}
