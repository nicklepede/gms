package com.google.android.gms.common.net;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.anzs;
import defpackage.asal;
import defpackage.asam;
import defpackage.azht;
import defpackage.azit;
import defpackage.cyqx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SocketFactoryCreatorImpl extends asal {
    private final Object a = new Object();
    private asam b = null;

    static {
        int i = anzs.a;
    }

    private final asam a(Context context) {
        asam asamVar;
        synchronized (this.a) {
            if (this.b == null) {
                try {
                    this.b = asal.asInterface(cyqx.a(context).e("com.google.android.gms.providerinstaller.SocketFactoryCreatorImpl"));
                } catch (azit unused) {
                    this.b = new com.google.android.gms.providerinstaller.SocketFactoryCreatorImpl();
                }
            }
            asamVar = this.b;
        }
        return asamVar;
    }

    @Override // defpackage.asam
    public azht newSocketFactory(azht azhtVar, azht azhtVar2, azht azhtVar3, boolean z) {
        return a((Context) ObjectWrapper.a(azhtVar)).newSocketFactory(azhtVar, azhtVar2, azhtVar3, z);
    }

    @Override // defpackage.asam
    public azht newSocketFactoryWithCacheDir(azht azhtVar, azht azhtVar2, azht azhtVar3, String str) {
        return a((Context) ObjectWrapper.a(azhtVar)).newSocketFactoryWithCacheDir(azhtVar, azhtVar2, azhtVar3, str);
    }
}
