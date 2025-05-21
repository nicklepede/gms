package com.google.android.gms.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxwv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SupportedThreatTypesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxwv();
    public final int[] a;

    public SupportedThreatTypesResponse(int[] iArr) {
        this.a = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = arxc.a(parcel);
        arxc.p(parcel, 1, iArr, false);
        arxc.c(parcel, a);
    }
}
