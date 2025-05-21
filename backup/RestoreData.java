package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahld;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RestoreData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahld();
    public final long a;
    public final long b;

    public RestoreData(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
