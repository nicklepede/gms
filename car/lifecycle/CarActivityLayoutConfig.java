package com.google.android.gms.car.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alaf;
import defpackage.arxc;
import defpackage.eitj;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarActivityLayoutConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alaf();
    private final List a;

    public CarActivityLayoutConfig(List list) {
        this.a = list;
    }

    public final String toString() {
        return "CarActivityLayoutConfig{carDisplayLayoutConfigs=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, eitj.i(list), false);
        arxc.c(parcel, a);
    }
}
