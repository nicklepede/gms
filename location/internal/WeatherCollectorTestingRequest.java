package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cacq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class WeatherCollectorTestingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cacq();
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.c(parcel, a);
    }
}
