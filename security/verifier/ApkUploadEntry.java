package com.google.android.gms.security.verifier;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.czem;
import defpackage.czfe;
import defpackage.frtq;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ApkUploadEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new czem();
    public final long a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final byte[] e;
    public final long f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;

    public ApkUploadEntry(long j, String str, int i, byte[] bArr, byte[] bArr2, long j2, int i2, long j3, int i3, int i4) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = bArr;
        if (bArr2 == null || bArr2.length != 256) {
            this.e = czfe.c();
        } else {
            this.e = bArr2;
        }
        this.f = j2;
        this.g = i2;
        this.h = j3;
        this.i = i3;
        this.j = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "id: %d, package_name=%s, version_code=%d, state=%d", Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByteArray(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
    }

    public ApkUploadEntry(String str, int i, byte[] bArr, byte[] bArr2, long j, int i2) {
        this.a = -1L;
        this.b = str;
        this.c = i;
        this.d = bArr;
        if (bArr2 == null) {
            this.e = czfe.c();
        } else {
            this.e = bArr2;
        }
        this.f = j;
        this.g = 0;
        this.h = -1L;
        this.i = 0;
        this.j = true != frtq.v() ? 0 : i2;
    }
}
