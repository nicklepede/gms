package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bkea;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new bkea();
    public long a;
    public long b;

    @Deprecated
    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.a = -1L;
        this.b = -1L;
        this.a = parcel.readLong();
        this.b = Math.min(parcel.readLong(), this.a);
    }

    public final String toString() {
        return super.toString() + " period=" + this.a + " flex=" + this.b;
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
