package com.google.android.gms.wallet.im;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dirn;
import defpackage.efdk;
import defpackage.eiea;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InstrumentManagerExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dirn();
    public final eiea a;

    public InstrumentManagerExtras(eiea eieaVar) {
        this.a = eieaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        efdk.o(this.a, parcel);
    }
}
