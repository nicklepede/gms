package com.google.android.gms.autofill.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aheo;
import defpackage.arxc;
import defpackage.flek;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BiometricsUtils$BiometricsRequiredResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aheo();
    public final boolean a;
    public final int b;
    public final boolean c;

    public BiometricsUtils$BiometricsRequiredResult(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public final boolean a() {
        return (flek.a.a().M() || this.b != 0) && this.b != 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
