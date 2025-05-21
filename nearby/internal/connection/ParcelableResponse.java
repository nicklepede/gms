package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjdc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ParcelableResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdc();
    public boolean a;
    public long b;
    public String c;
    public byte[][] d;
    public ParcelableFileWithMetaData[] e;

    public ParcelableResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableResponse) {
            ParcelableResponse parcelableResponse = (ParcelableResponse) obj;
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(parcelableResponse.a)) && arwb.b(Long.valueOf(this.b), Long.valueOf(parcelableResponse.b)) && arwb.b(this.c, parcelableResponse.c) && Arrays.equals(this.d, parcelableResponse.d) && Arrays.equals(this.e, parcelableResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(Arrays.deepHashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.A(parcel, 4, this.d);
        arxc.J(parcel, 5, this.e, i);
        arxc.c(parcel, a);
    }

    public ParcelableResponse(boolean z, long j, String str, byte[][] bArr, ParcelableFileWithMetaData[] parcelableFileWithMetaDataArr) {
        this.a = z;
        this.b = j;
        this.c = str;
        this.d = bArr;
        this.e = parcelableFileWithMetaDataArr;
    }
}
