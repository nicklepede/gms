package com.google.android.gms.enterprise.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbrm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MpCompleteResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbrm();
    public final int a;

    public MpCompleteResult(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.c(parcel, a);
    }
}
