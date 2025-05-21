package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cdve;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class UploadBatchParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdve();
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public UploadBatchParcel(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.q(parcel, 6, this.f);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }
}
