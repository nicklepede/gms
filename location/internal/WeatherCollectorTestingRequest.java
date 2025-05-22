package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cclh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WeatherCollectorTestingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cclh();
    public final long a;

    public WeatherCollectorTestingRequest(long j) {
        this.a = j;
    }

    public final boolean a(long j) {
        return (j & this.a) > 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.c(parcel, a);
    }
}
