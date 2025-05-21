package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkki;
import defpackage.dkkk;
import defpackage.dkmf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmf();
    final int a;
    public final dkkk b;

    public RemoveListenerRequest(dkkk dkkkVar) {
        this.a = 1;
        this.b = dkkkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        dkkk dkkkVar = this.b;
        arxc.D(parcel, 2, dkkkVar == null ? null : dkkkVar.asBinder());
        arxc.c(parcel, a);
    }

    public RemoveListenerRequest(int i, IBinder iBinder) {
        dkkk dkkkVar;
        this.a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            dkkkVar = queryLocalInterface instanceof dkkk ? (dkkk) queryLocalInterface : new dkki(iBinder);
        } else {
            dkkkVar = null;
        }
        this.b = dkkkVar;
    }
}
