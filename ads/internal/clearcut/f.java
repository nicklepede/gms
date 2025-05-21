package com.google.android.gms.ads.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
                Parcel fr = aVar.fr();
                fr.writeByteArray(bArr);
                aVar.ft(5, fr);
                com.google.android.gms.ads.clearcut.a aVar2 = gVar.c;
                Parcel fr2 = aVar2.fr();
                fr2.writeInt(0);
                aVar2.ft(6, fr2);
                com.google.android.gms.ads.clearcut.a aVar3 = gVar.c;
                int i = this.a;
                Parcel fr3 = aVar3.fr();
                fr3.writeInt(i);
                aVar3.ft(7, fr3);
                com.google.android.gms.ads.clearcut.a aVar4 = gVar.c;
                Parcel fr4 = aVar4.fr();
                fr4.writeIntArray(null);
                aVar4.ft(4, fr4);
                com.google.android.gms.ads.clearcut.a aVar5 = gVar.c;
                aVar5.ft(3, aVar5.fr());
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
