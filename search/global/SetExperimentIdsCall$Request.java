package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cynr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cynr();
    public byte[] a;
    public boolean b;

    public SetExperimentIdsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}
