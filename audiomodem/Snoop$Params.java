package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ulp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class Snoop$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ulp();
    public final Encoding[] a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public Snoop$Params(Encoding[] encodingArr, boolean z, boolean z2, long j) {
        this.a = encodingArr;
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Encoding[] encodingArr = this.a;
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, encodingArr, i);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.q(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
