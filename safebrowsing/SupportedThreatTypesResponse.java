package com.google.android.gms.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dags;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SupportedThreatTypesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dags();
    public final int[] a;

    public SupportedThreatTypesResponse(int[] iArr) {
        this.a = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, iArr, false);
        atzr.c(parcel, a);
    }
}
