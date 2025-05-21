package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.vox;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vox();
    final int a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
