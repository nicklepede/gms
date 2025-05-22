package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aocb;
import defpackage.aocc;
import defpackage.aoyr;
import defpackage.aozc;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aocc();
    public final String a;
    public final String b;
    public InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final byte[] m;
    public final String n;
    public final boolean o;
    public final Integer p;
    public final Boolean q;
    public final Network r;
    private final List s;
    private final aoyr t;
    private final CastEurekaInfo u;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, CastEurekaInfo castEurekaInfo, Integer num, Boolean bool, Network network) {
        this.a = t(str);
        String t = t(str2);
        this.b = t;
        if (!TextUtils.isEmpty(t)) {
            try {
                this.c = InetAddress.getByName(t);
            } catch (UnknownHostException e) {
                Log.i("CastDevice", "Unable to convert host address (" + this.b + ") to ipaddress: " + e.getMessage());
            }
        }
        this.d = t(str3);
        this.e = t(str4);
        this.f = t(str5);
        this.g = i;
        this.s = list == null ? new ArrayList() : list;
        this.h = i3;
        this.i = t(str6);
        this.j = str7;
        this.k = i4;
        this.l = str8;
        this.m = bArr;
        this.n = str9;
        this.o = z;
        this.u = castEurekaInfo;
        this.p = num;
        this.q = bool;
        this.r = network;
        this.t = new aoyr(i2, castEurekaInfo);
    }

    public static CastDevice b(JSONObject jSONObject) {
        String j;
        String j2;
        String j3;
        try {
            String j4 = aozc.j(jSONObject, "deviceId");
            if (j4 == null || (j = aozc.j(jSONObject, "hostAddress")) == null || (j2 = aozc.j(jSONObject, "friendlyName")) == null || (j3 = aozc.j(jSONObject, "modelName")) == null) {
                return null;
            }
            aocb aocbVar = new aocb(j4, InetAddress.getByName(j));
            aocbVar.c = j2;
            aocbVar.d = j3;
            String j5 = aozc.j(jSONObject, "deviceVersion");
            if (j5 != null) {
                aocbVar.e = j5;
            }
            if (jSONObject.has("servicePort")) {
                aocbVar.f = jSONObject.getInt("servicePort");
            }
            if (jSONObject.has("capabilities")) {
                aocbVar.i = jSONObject.getInt("capabilities");
            }
            if (jSONObject.has("deviceStatus")) {
                aocbVar.j = jSONObject.getInt("deviceStatus");
            }
            String j6 = aozc.j(jSONObject, "serviceInstanceName");
            if (j6 != null) {
                aocbVar.l = j6;
            }
            String j7 = aozc.j(jSONObject, "receiverMetricsId");
            if (j7 != null) {
                aocbVar.m = j7;
            }
            if (jSONObject.has("rcnEnabledStatus")) {
                aocbVar.n = jSONObject.getInt("rcnEnabledStatus");
            }
            String j8 = aozc.j(jSONObject, "hotspotBssid");
            if (j8 != null) {
                aocbVar.o = j8;
            }
            if (jSONObject.has("ipLowestTwoBytes")) {
                int i = jSONObject.getInt("ipLowestTwoBytes");
                aocbVar.p = new byte[]{(byte) (i >> 8), (byte) i};
            }
            String j9 = aozc.j(jSONObject, "cloudDeviceId");
            if (j9 != null) {
                aocbVar.q = j9;
            }
            if (jSONObject.has("isCloudOnlyDevice")) {
                aocbVar.r = jSONObject.getBoolean("isCloudOnlyDevice");
            }
            if (jSONObject.has("WAKEUP_SERVICE_PORT")) {
                aocbVar.g = Integer.valueOf(jSONObject.getInt("WAKEUP_SERVICE_PORT"));
            }
            Boolean f = aozc.f(jSONObject, "isSelfDevice");
            if (f != null) {
                aocbVar.k = f;
            }
            return aocbVar.a();
        } catch (UnknownHostException | JSONException unused) {
            return null;
        }
    }

    public static CastDevice c(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String t(String str) {
        return str == null ? "" : str;
    }

    public final int a() {
        return this.t.a;
    }

    public final CastEurekaInfo d() {
        CastEurekaInfo castEurekaInfo = this.u;
        return (castEurekaInfo == null && n()) ? new CastEurekaInfo(1, false, false, null, null, null, null, null, false) : castEurekaInfo;
    }

    public final String e() {
        return aozc.g(this.d);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        if (aozc.u(this.a, castDevice.a) && aozc.u(this.c, castDevice.c) && aozc.u(this.e, castDevice.e) && aozc.u(this.d, castDevice.d)) {
            String str = this.f;
            String str2 = castDevice.f;
            if (aozc.u(str, str2) && (i = this.g) == (i2 = castDevice.g) && aozc.u(this.s, castDevice.s) && a() == castDevice.a() && this.h == castDevice.h && aozc.u(this.i, castDevice.i) && aozc.u(Integer.valueOf(this.k), Integer.valueOf(castDevice.k)) && aozc.u(this.l, castDevice.l) && aozc.u(this.j, castDevice.j) && aozc.u(str, str2) && i == i2 && ((((bArr = this.m) == null && castDevice.m == null) || Arrays.equals(bArr, castDevice.m)) && aozc.u(this.n, castDevice.n) && this.o == castDevice.o && aozc.u(d(), castDevice.d()))) {
                if (aozc.u(Boolean.valueOf(r()), Boolean.valueOf(castDevice.r() && aozc.u(this.r, castDevice.r)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        String str = this.a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    public final List g() {
        return DesugarCollections.unmodifiableList(this.s);
    }

    public final void h(Bundle bundle) {
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i(int i) {
        return this.t.a(i);
    }

    public final boolean j() {
        return this.c instanceof Inet6Address;
    }

    public final boolean k() {
        return this.t.b();
    }

    public final boolean l() {
        return this.t.c();
    }

    public final boolean m() {
        return this.t.d();
    }

    public final boolean n() {
        return this.t.e();
    }

    public final boolean o() {
        return this.a.startsWith("__cast_nearby__");
    }

    public final boolean p() {
        return (o() || this.o) ? false : true;
    }

    public final boolean q(CastDevice castDevice) {
        if (castDevice == null) {
            return false;
        }
        if (!TextUtils.isEmpty(f()) && !f().startsWith("__cast_ble__") && !TextUtils.isEmpty(castDevice.f()) && !castDevice.f().startsWith("__cast_ble__")) {
            return aozc.u(f(), castDevice.f());
        }
        String str = this.l;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = castDevice.l;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return aozc.u(str, str2);
    }

    public final boolean r() {
        Boolean bool = this.q;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.h;
        return i != -1 && (i & 2) > 0;
    }

    public final boolean s() {
        CastEurekaInfo castEurekaInfo = this.u;
        return castEurekaInfo != null && castEurekaInfo.c;
    }

    public final String toString() {
        String str = k() ? "[dynamic group]" : m() ? "[static group]" : n() ? "[speaker pair]" : "";
        if (this.t.a(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE)) {
            str = str.concat("[cast connect]");
        }
        return String.format(Locale.ROOT, "\"%s\" (%s) %s", e(), this.a, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.y(parcel, 8, g(), false);
        atzr.o(parcel, 9, a());
        atzr.o(parcel, 10, this.h);
        atzr.v(parcel, 11, this.i, false);
        atzr.v(parcel, 12, this.j, false);
        atzr.o(parcel, 13, this.k);
        atzr.v(parcel, 14, this.l, false);
        atzr.i(parcel, 15, this.m, false);
        atzr.v(parcel, 16, this.n, false);
        atzr.e(parcel, 17, this.o);
        atzr.t(parcel, 18, d(), i, false);
        atzr.F(parcel, 19, this.p);
        atzr.z(parcel, 20, Boolean.valueOf(r()));
        atzr.t(parcel, 21, this.r, i, false);
        atzr.c(parcel, a);
    }
}
