package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhmv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class MessageContent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhmv();
    public final int a;
    public final String b;
    public final int c;
    public final long d;

    public MessageContent(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
