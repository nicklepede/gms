package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cllf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ParcelablePayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllf();
    public long a;
    public int b;
    public byte[] c;
    public ParcelFileDescriptor d;
    public String e;
    public long f;
    public ParcelFileDescriptor g;
    public Uri h;
    public long i;
    public boolean j;
    public ParcelByteArray k;
    public long l;
    public String m;
    public String n;
    public ParcelableRequest o;
    public ParcelableResponse p;
    public int q;

    public ParcelablePayload() {
        this.f = -1L;
        this.i = 0L;
        this.j = false;
        this.l = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelablePayload) {
            ParcelablePayload parcelablePayload = (ParcelablePayload) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(parcelablePayload.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(parcelablePayload.b)) && Arrays.equals(this.c, parcelablePayload.c) && atyq.b(this.d, parcelablePayload.d) && atyq.b(this.e, parcelablePayload.e) && atyq.b(Long.valueOf(this.f), Long.valueOf(parcelablePayload.f)) && atyq.b(this.g, parcelablePayload.g) && atyq.b(this.h, parcelablePayload.h) && atyq.b(Long.valueOf(this.i), Long.valueOf(parcelablePayload.i)) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(parcelablePayload.j)) && atyq.b(this.k, parcelablePayload.k) && atyq.b(Long.valueOf(this.l), Long.valueOf(parcelablePayload.l)) && atyq.b(this.m, parcelablePayload.m) && atyq.b(this.n, parcelablePayload.n) && atyq.b(this.o, parcelablePayload.o) && atyq.b(this.p, parcelablePayload.p) && atyq.b(Integer.valueOf(this.q), Integer.valueOf(parcelablePayload.q))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, Long.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), Boolean.valueOf(this.j), this.k, Long.valueOf(this.l), this.m, this.n, this.o, this.p, Integer.valueOf(this.q)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.q(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.q(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.t(parcel, 11, this.k, i, false);
        atzr.q(parcel, 12, this.l);
        atzr.v(parcel, 13, this.m, false);
        atzr.v(parcel, 14, this.n, false);
        atzr.t(parcel, 15, this.o, i, false);
        atzr.t(parcel, 16, this.p, i, false);
        atzr.o(parcel, 17, this.q);
        atzr.c(parcel, a);
    }

    public ParcelablePayload(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri, long j3, boolean z, ParcelByteArray parcelByteArray, long j4, String str2, String str3, ParcelableRequest parcelableRequest, ParcelableResponse parcelableResponse, int i2) {
        this.a = j;
        this.b = i;
        this.c = bArr;
        this.d = parcelFileDescriptor;
        this.e = str;
        this.f = j2;
        this.g = parcelFileDescriptor2;
        this.h = uri;
        this.i = j3;
        this.j = z;
        this.k = parcelByteArray;
        this.l = j4;
        this.m = str2;
        this.n = str3;
        this.o = parcelableRequest;
        this.p = parcelableResponse;
        this.q = i2;
    }
}
