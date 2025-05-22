package com.google.android.gms.libs.gmscorelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.btpf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PreAggregatedLogBatch extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btpf();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.i(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
