package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmwb;
import defpackage.dmwd;
import defpackage.dmxy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmxy();
    final int a;
    public final dmwd b;

    public RemoveListenerRequest(dmwd dmwdVar) {
        this.a = 1;
        this.b = dmwdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        dmwd dmwdVar = this.b;
        atzr.D(parcel, 2, dmwdVar == null ? null : dmwdVar.asBinder());
        atzr.c(parcel, a);
    }

    public RemoveListenerRequest(int i, IBinder iBinder) {
        dmwd dmwdVar;
        this.a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            dmwdVar = queryLocalInterface instanceof dmwd ? (dmwd) queryLocalInterface : new dmwb(iBinder);
        } else {
            dmwdVar = null;
        }
        this.b = dmwdVar;
    }
}
