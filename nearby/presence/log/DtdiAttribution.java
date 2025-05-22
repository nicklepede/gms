package com.google.android.gms.nearby.presence.log;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnmt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DtdiAttribution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnmt();
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
            if (Arrays.equals(this.a, dtdiAttribution.a) && Arrays.equals(this.b, dtdiAttribution.b) && Arrays.equals(this.c, dtdiAttribution.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(dtdiAttribution.d)) && atyq.b(Long.valueOf(this.e), Long.valueOf(dtdiAttribution.e))) {
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
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }

    public DtdiAttribution(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = i;
        this.e = j;
    }
}
