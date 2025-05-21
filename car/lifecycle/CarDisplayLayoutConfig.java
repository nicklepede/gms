package com.google.android.gms.car.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alah;
import defpackage.arxc;
import defpackage.eitj;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarDisplayLayoutConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alah();
    public final CarDisplayId a;
    public final String b;
    private final List c;

    public CarDisplayLayoutConfig(CarDisplayId carDisplayId, List list, String str) {
        this.a = carDisplayId;
        this.c = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarDisplayLayoutConfig)) {
            return false;
        }
        CarDisplayLayoutConfig carDisplayLayoutConfig = (CarDisplayLayoutConfig) obj;
        return Objects.equals(this.a, carDisplayLayoutConfig.a) && Objects.equals(this.c, carDisplayLayoutConfig.c) && Objects.equals(this.b, carDisplayLayoutConfig.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b);
    }

    public final String toString() {
        List list = this.c;
        return "CarDisplayLayoutConfig{carDisplayId=" + String.valueOf(this.a) + ", carActivityRegionConfigs=" + String.valueOf(list) + ", carDisplayConfigurationId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.y(parcel, 2, eitj.i(this.c), false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
