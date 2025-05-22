package com.google.android.gms.wallet.im;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlcy;
import defpackage.ehqn;
import defpackage.ekrg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstrumentManagerExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlcy();
    public final ekrg a;

    public InstrumentManagerExtras(ekrg ekrgVar) {
        this.a = ekrgVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ehqn.o(this.a, parcel);
    }
}
