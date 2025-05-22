package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhms;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CallSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhms();
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;

    public CallSpamOptions(int i, String str, long j, int i2, long j2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
