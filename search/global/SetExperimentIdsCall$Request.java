package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.daxp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SetExperimentIdsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new daxp();
    public byte[] a;
    public boolean b;

    public SetExperimentIdsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public SetExperimentIdsCall$Request(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}
