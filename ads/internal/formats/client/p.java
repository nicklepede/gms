package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class p extends otn implements IInterface {
    final /* synthetic */ v a;

    public p() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        l lVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(readStrongBinder);
        }
        String readString = parcel.readString();
        fq(parcel);
        v vVar = this.a;
        com.google.ads.mediation.c cVar = vVar.b;
        if (cVar != null) {
            cVar.b.r(vVar.a(lVar), readString);
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.a = vVar;
    }
}
