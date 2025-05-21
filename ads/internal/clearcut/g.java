package com.google.android.gms.ads.internal.clearcut;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.l;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oto;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
                boolean booleanValue = ((Boolean) p.aA.g()).booleanValue();
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
                        Parcel fr = aVar.fr();
                        oto.g(fr, objectWrapper);
                        fr.writeString("GMA_SDK");
                        aVar.ft(2, fr);
                        gVar.a = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.k | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.h.d("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
