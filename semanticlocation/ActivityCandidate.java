package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ActivityCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czfg();
    public final int a;
    public final float b;

    @Deprecated
    public final float c;

    public ActivityCandidate(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.l(parcel, 2, this.b);
        arxc.l(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
