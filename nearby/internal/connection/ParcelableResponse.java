package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cllh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ParcelableResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllh();
    public boolean a;
    public long b;
    public String c;
    public byte[][] d;
    public ParcelableFileWithMetaData[] e;
    public boolean f;

    public ParcelableResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableResponse) {
            ParcelableResponse parcelableResponse = (ParcelableResponse) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(parcelableResponse.a)) && atyq.b(Long.valueOf(this.b), Long.valueOf(parcelableResponse.b)) && atyq.b(this.c, parcelableResponse.c) && Arrays.equals(this.d, parcelableResponse.d) && Arrays.equals(this.e, parcelableResponse.e) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(parcelableResponse.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(Arrays.deepHashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Boolean.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.q(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.A(parcel, 4, this.d);
        atzr.J(parcel, 5, this.e, i);
        atzr.e(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public ParcelableResponse(boolean z, long j, String str, byte[][] bArr, ParcelableFileWithMetaData[] parcelableFileWithMetaDataArr, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = str;
        this.d = bArr;
        this.e = parcelableFileWithMetaDataArr;
        this.f = z2;
    }
}
