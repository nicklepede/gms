package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.asfh;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SamplerDecisionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asfh();
    public final boolean a;
    public final long b;

    public SamplerDecisionParcelable(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
