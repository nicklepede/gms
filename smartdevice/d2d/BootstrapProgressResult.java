package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dfhr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BootstrapProgressResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfhr();
    public final int a;
    public final Bundle b;

    public BootstrapProgressResult(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.g(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
