package com.google.android.gms.common.net;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.aqbk;
import defpackage.auda;
import defpackage.audb;
import defpackage.bblp;
import defpackage.bbmp;
import defpackage.dbav;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SocketFactoryCreatorImpl extends auda {
    private final Object a = new Object();
    private audb b = null;

    static {
        int i = aqbk.a;
    }

    private final audb a(Context context) {
        audb audbVar;
        synchronized (this.a) {
            if (this.b == null) {
                try {
                    this.b = auda.asInterface(dbav.a(context).e("com.google.android.gms.providerinstaller.SocketFactoryCreatorImpl"));
                } catch (bbmp unused) {
                    this.b = new com.google.android.gms.providerinstaller.SocketFactoryCreatorImpl();
                }
            }
            audbVar = this.b;
        }
        return audbVar;
    }

    @Override // defpackage.audb
    public bblp newSocketFactory(bblp bblpVar, bblp bblpVar2, bblp bblpVar3, boolean z) {
        return a((Context) ObjectWrapper.a(bblpVar)).newSocketFactory(bblpVar, bblpVar2, bblpVar3, z);
    }

    @Override // defpackage.audb
    public bblp newSocketFactoryWithCacheDir(bblp bblpVar, bblp bblpVar2, bblp bblpVar3, String str) {
        return a((Context) ObjectWrapper.a(bblpVar)).newSocketFactoryWithCacheDir(bblpVar, bblpVar2, bblpVar3, str);
    }
}
