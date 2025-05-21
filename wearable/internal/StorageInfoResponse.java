package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkmo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmo();
    public final int a;
    public final long b;
    public final List c;

    public StorageInfoResponse(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.q(parcel, 3, this.b);
        arxc.y(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
