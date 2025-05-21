package com.google.android.gms.ads.play;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ enss a;
    final /* synthetic */ GmsCachingPlayStoreParentalControlProvider b;

    public a(GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider, enss enssVar) {
        this.a = enssVar;
        this.b = gmsCachingPlayStoreParentalControlProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            enss enssVar = this.a;
            if (((Bundle) enssVar.get()).getBoolean("is_cacheable")) {
                GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider = this.b;
                synchronized (gmsCachingPlayStoreParentalControlProvider.a) {
                    gmsCachingPlayStoreParentalControlProvider.c = false;
                    gmsCachingPlayStoreParentalControlProvider.b = enssVar;
                }
            }
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            h.i("Error waiting for future result.");
        }
    }
}
