package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tdl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class VideoOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bw();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public VideoOptionsParcel(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public VideoOptionsParcel(tdl tdlVar) {
        this(tdlVar.a, tdlVar.b, tdlVar.c);
    }
}
