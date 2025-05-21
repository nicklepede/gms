package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfbp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class MessageContent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfbp();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
