package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.atzr;
import defpackage.ceuq;
import defpackage.ceyr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceyr();
    public final ceuq a;
    public final byte[] b;
    public final SyncOptions c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        ceuq b = ceuq.b(i);
        this.a = b == null ? ceuq.UNKNOWN : b;
        this.b = bArr;
        this.c = syncOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a.f);
        atzr.i(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
