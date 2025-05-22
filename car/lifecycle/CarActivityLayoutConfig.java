package com.google.android.gms.car.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.anbq;
import defpackage.atzr;
import defpackage.elgo;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarActivityLayoutConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anbq();
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
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, elgo.i(list), false);
        atzr.c(parcel, a);
    }
}
