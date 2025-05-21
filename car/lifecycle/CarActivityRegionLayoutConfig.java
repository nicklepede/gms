package com.google.android.gms.car.lifecycle;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alag;
import defpackage.arxc;
import defpackage.eitj;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarActivityRegionLayoutConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alag();
    public final Intent a;
    public final Intent b;
    public final CarRegionId c;
    public final CarActivityLayoutParams d;
    public final CarRegionGroup e;
    private final List f;

    public CarActivityRegionLayoutConfig(Intent intent, Intent intent2, CarRegionId carRegionId, CarActivityLayoutParams carActivityLayoutParams, CarRegionGroup carRegionGroup, List list) {
        this.a = intent;
        this.b = intent2;
        this.c = carRegionId;
        this.d = carActivityLayoutParams;
        this.e = carRegionGroup;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarActivityRegionLayoutConfig)) {
            return false;
        }
        CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) obj;
        return this.a.filterEquals(carActivityRegionLayoutConfig.a) && this.b.filterEquals(carActivityRegionLayoutConfig.b) && Objects.equals(this.c, carActivityRegionLayoutConfig.c) && Objects.equals(this.d, carActivityRegionLayoutConfig.d) && Objects.equals(this.e, carActivityRegionLayoutConfig.e) && Objects.equals(this.f, carActivityRegionLayoutConfig.f);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final String toString() {
        List list = this.f;
        CarRegionGroup carRegionGroup = this.e;
        CarRegionId carRegionId = this.c;
        Intent intent = this.b;
        Intent intent2 = this.a;
        return "CarActivityRegionLayoutConfig{carActivityLayoutParams=" + String.valueOf(this.d) + ", initialIntent=" + String.valueOf(intent2) + ", fallbackIntent=" + String.valueOf(intent) + ", carRegionId=" + String.valueOf(carRegionId) + ", carRegionGroup=" + String.valueOf(carRegionGroup) + ", clientsToPreWarm=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.y(parcel, 6, eitj.i(this.f), false);
        arxc.c(parcel, a);
    }
}
