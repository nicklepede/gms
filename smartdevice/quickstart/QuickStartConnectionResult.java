package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ddvz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class QuickStartConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddvz();
    public final int a;

    public QuickStartConnectionResult(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.c(parcel, a);
    }
}
