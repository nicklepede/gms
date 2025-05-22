package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.uzl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public VideoOptionsParcel(uzl uzlVar) {
        this(uzlVar.a, uzlVar.b, uzlVar.c);
    }
}
