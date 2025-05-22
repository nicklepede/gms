package com.google.android.gms.ads.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f {
    public int a;
    final /* synthetic */ g b;
    private final byte[] c;

    public f(g gVar, byte[] bArr) {
        this.b = gVar;
        this.c = bArr;
    }

    public final synchronized void a() {
        try {
            g gVar = this.b;
            if (gVar.a) {
                com.google.android.gms.ads.clearcut.a aVar = gVar.c;
                byte[] bArr = this.c;
                Parcel fE = aVar.fE();
                fE.writeByteArray(bArr);
                aVar.fG(5, fE);
                com.google.android.gms.ads.clearcut.a aVar2 = gVar.c;
                Parcel fE2 = aVar2.fE();
                fE2.writeInt(0);
                aVar2.fG(6, fE2);
                com.google.android.gms.ads.clearcut.a aVar3 = gVar.c;
                int i = this.a;
                Parcel fE3 = aVar3.fE();
                fE3.writeInt(i);
                aVar3.fG(7, fE3);
                com.google.android.gms.ads.clearcut.a aVar4 = gVar.c;
                Parcel fE4 = aVar4.fE();
                fE4.writeIntArray(null);
                aVar4.fG(4, fE4);
                com.google.android.gms.ads.clearcut.a aVar5 = gVar.c;
                aVar5.fG(3, aVar5.fE());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.e("Clearcut log failed", e);
        }
    }

    public final synchronized void b() {
        this.b.b.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.clearcut.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.a();
            }
        });
    }
}
