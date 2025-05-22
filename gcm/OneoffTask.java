package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bkdy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new bkdy();
    public final long a;
    public final long b;

    @Deprecated
    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public final String toString() {
        return super.toString() + " windowStart=" + this.a + " windowEnd=" + this.b;
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
