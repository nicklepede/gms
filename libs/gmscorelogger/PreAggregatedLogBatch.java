package com.google.android.gms.libs.gmscorelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.brho;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PreAggregatedLogBatch extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brho();
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public PreAggregatedLogBatch(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
