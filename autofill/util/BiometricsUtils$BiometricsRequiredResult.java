package com.google.android.gms.autofill.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajfe;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BiometricsUtils$BiometricsRequiredResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajfe();
    public final boolean a;
    public final int b;
    public final boolean c;

    public BiometricsUtils$BiometricsRequiredResult(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public final boolean a() {
        return this.b != 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
