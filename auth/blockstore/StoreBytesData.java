package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.zzi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zzi();
    public final byte[] a;
    public final boolean b;
    public final String c;

    public StoreBytesData(byte[] bArr, boolean z, String str) {
        this.a = bArr;
        this.b = z;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
