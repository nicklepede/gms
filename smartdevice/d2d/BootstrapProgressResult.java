package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dcwm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BootstrapProgressResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcwm();
    public final int a;
    public final Bundle b;

    public BootstrapProgressResult(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.g(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
