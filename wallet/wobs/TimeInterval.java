package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.djjd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djjd();
    public long a;
    public long b;

    TimeInterval() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 2, this.a);
        arxc.q(parcel, 3, this.b);
        arxc.c(parcel, a);
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
