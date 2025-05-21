package com.google.android.gms.nearby.presence.log;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cleo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DtdiAttribution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cleo();
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public int d;
    public long e;

    private DtdiAttribution() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DtdiAttribution) {
            DtdiAttribution dtdiAttribution = (DtdiAttribution) obj;
            if (Arrays.equals(this.a, dtdiAttribution.a) && Arrays.equals(this.b, dtdiAttribution.b) && Arrays.equals(this.c, dtdiAttribution.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(dtdiAttribution.d)) && arwb.b(Long.valueOf(this.e), Long.valueOf(dtdiAttribution.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }

    public DtdiAttribution(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = i;
        this.e = j;
    }
}
