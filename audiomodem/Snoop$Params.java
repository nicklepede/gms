package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.who;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Snoop$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new who();
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, encodingArr, i);
        atzr.e(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.q(parcel, 5, this.d);
        atzr.c(parcel, a);
    }
}
