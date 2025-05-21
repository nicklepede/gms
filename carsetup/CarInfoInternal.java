package com.google.android.gms.carsetup;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alov;
import defpackage.arwm;
import defpackage.arxc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarInfoInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alov();
    public final CarInfo a;

    @Deprecated
    public String b;
    public boolean c;
    public long d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public String s;
    public int t;
    public String u;

    public CarInfoInternal() {
        this.a = new CarInfo();
    }

    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarInfoInternal)) {
            return false;
        }
        CarInfoInternal carInfoInternal = (CarInfoInternal) obj;
        return Objects.equals(this.a, carInfoInternal.a) && Objects.equals(this.b, carInfoInternal.b) && this.c == carInfoInternal.c && this.d == carInfoInternal.d && this.e == carInfoInternal.e && Objects.equals(this.f, carInfoInternal.f) && Objects.equals(this.g, carInfoInternal.g) && Objects.equals(this.h, carInfoInternal.h) && Objects.equals(this.i, carInfoInternal.i) && this.j == carInfoInternal.j && Objects.equals(this.k, carInfoInternal.k) && this.l == carInfoInternal.l && this.m == carInfoInternal.m && this.n == carInfoInternal.n && this.o == carInfoInternal.o && this.p == carInfoInternal.p && this.q == carInfoInternal.q && this.r == carInfoInternal.r && Objects.equals(this.s, carInfoInternal.s) && this.t == carInfoInternal.t && Objects.equals(this.u, carInfoInternal.u);
    }

    public final int hashCode() {
        return TextUtils.isEmpty(this.u) ? Objects.hash(this.a, this.b) : Objects.hash(this.a, this.u);
    }

    public final String toString() {
        CarInfo carInfo = this.a;
        return getClass().getName() + "[dbId=" + this.d + ",manufacturer=" + carInfo.a + ",model=" + carInfo.b + ",headUnitProtocolVersion=" + carInfo.e + "." + carInfo.f + ",modelYear=" + carInfo.c + ",vehicleId=" + carInfo.d + ",bluetoothAllowed=" + this.c + ",hideProjectedClock=" + carInfo.g + ",driverPosition=" + carInfo.h + ",headUnitMake=" + carInfo.i + ",headUnitModel=" + carInfo.j + ",headUnitSoftwareBuild=" + carInfo.k + ",headUnitSoftwareVersion=" + carInfo.l + ",canPlayNativeMediaDuringVr=" + carInfo.m + ",hidePhoneSignal=" + carInfo.n + ",hideBatteryLevel=" + carInfo.o + ",bluetoothaddress=" + this.f + ",wifiSsid=" + this.g + ",wifiBssid=" + this.h + ",wifiSecurityMode=" + this.j + ",sslSubjectName=" + this.k + ",wifiVersionMajor=" + this.l + ",wifiVersionMinor=" + this.m + ",wifiFrequencyMHz=" + this.n + ",known=" + this.o + ",projectionAllowed=" + this.p + ",sslSerialNumber=" + this.q + ",wifiProjectionProtocolOnTcp=" + this.r + ",wifiProjectionProtocolIpAddress=" + this.s + ",wifiProjectionProtocolTcpPort=" + this.t + ",hashedVehicleId=[REDACTED]]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.o(parcel, 10, this.j);
        arxc.v(parcel, 11, this.k, false);
        arxc.o(parcel, 12, this.l);
        arxc.o(parcel, 13, this.m);
        arxc.o(parcel, 14, this.n);
        arxc.e(parcel, 15, this.o);
        arxc.e(parcel, 16, this.p);
        arxc.q(parcel, 17, this.q);
        arxc.e(parcel, 18, this.r);
        arxc.v(parcel, 19, this.s, false);
        arxc.o(parcel, 20, this.t);
        arxc.v(parcel, 21, this.u, false);
        arxc.c(parcel, a);
    }

    public CarInfoInternal(CarInfo carInfo, String str, boolean z, long j, long j2, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4, boolean z2, boolean z3, long j3, boolean z4, String str7, int i5, String str8) {
        arwm.s(carInfo);
        this.a = carInfo;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i;
        this.k = str6;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z2;
        this.p = z3;
        this.q = j3;
        this.r = z4;
        this.s = str7;
        this.t = i5;
        this.u = str8;
    }
}
