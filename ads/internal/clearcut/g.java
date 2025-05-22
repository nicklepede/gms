package com.google.android.gms.ads.internal.clearcut;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.l;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.qmr;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g {
    boolean a;
    public final ExecutorService b;
    com.google.android.gms.ads.clearcut.a c;

    public g() {
        this.b = com.google.android.gms.ads.internal.util.client.b.b;
    }

    public g(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.b.b;
        this.b = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.clearcut.c
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) p.aB.g()).booleanValue();
                g gVar = g.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        gVar.c = (com.google.android.gms.ads.clearcut.a) l.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.j() { // from class: com.google.android.gms.ads.internal.clearcut.d
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.internal.util.client.j
                            public final Object a(Object obj) {
                                if (obj == 0) {
                                    return null;
                                }
                                IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                return queryLocalInterface instanceof com.google.android.gms.ads.clearcut.a ? (com.google.android.gms.ads.clearcut.a) queryLocalInterface : new com.google.android.gms.ads.clearcut.a(obj);
                            }
                        });
                        ObjectWrapper objectWrapper = new ObjectWrapper(context2);
                        com.google.android.gms.ads.clearcut.a aVar = gVar.c;
                        Parcel fE = aVar.fE();
                        qmr.g(fE, objectWrapper);
                        fE.writeString("GMA_SDK");
                        aVar.fG(2, fE);
                        gVar.a = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.k | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.h.d("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
