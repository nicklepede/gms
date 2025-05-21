package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.amaq;
import defpackage.amar;
import defpackage.amxg;
import defpackage.amxr;
import defpackage.arxc;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new amar();
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
    private final List r;
    private final amxg s;
    private final CastEurekaInfo t;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, CastEurekaInfo castEurekaInfo, Integer num, Boolean bool) {
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
        this.r = list == null ? new ArrayList() : list;
        this.h = i3;
        this.i = t(str6);
        this.j = str7;
        this.k = i4;
        this.l = str8;
        this.m = bArr;
        this.n = str9;
        this.o = z;
        this.t = castEurekaInfo;
        this.p = num;
        this.q = bool;
        this.s = new amxg(i2, castEurekaInfo);
    }

    public static CastDevice b(JSONObject jSONObject) {
        String j;
        String j2;
        String j3;
        try {
            String j4 = amxr.j(jSONObject, "deviceId");
            if (j4 == null || (j = amxr.j(jSONObject, "hostAddress")) == null || (j2 = amxr.j(jSONObject, "friendlyName")) == null || (j3 = amxr.j(jSONObject, "modelName")) == null) {
                return null;
            }
            amaq amaqVar = new amaq(j4, InetAddress.getByName(j));
            amaqVar.c = j2;
            amaqVar.d = j3;
            String j5 = amxr.j(jSONObject, "deviceVersion");
            if (j5 != null) {
                amaqVar.e = j5;
            }
            if (jSONObject.has("servicePort")) {
                amaqVar.f = jSONObject.getInt("servicePort");
            }
            if (jSONObject.has("capabilities")) {
                amaqVar.i = jSONObject.getInt("capabilities");
            }
            if (jSONObject.has("deviceStatus")) {
                amaqVar.j = jSONObject.getInt("deviceStatus");
            }
            String j6 = amxr.j(jSONObject, "serviceInstanceName");
            if (j6 != null) {
                amaqVar.l = j6;
            }
            String j7 = amxr.j(jSONObject, "receiverMetricsId");
            if (j7 != null) {
                amaqVar.m = j7;
            }
            if (jSONObject.has("rcnEnabledStatus")) {
                amaqVar.n = jSONObject.getInt("rcnEnabledStatus");
            }
            String j8 = amxr.j(jSONObject, "hotspotBssid");
            if (j8 != null) {
                amaqVar.o = j8;
            }
            if (jSONObject.has("ipLowestTwoBytes")) {
                int i = jSONObject.getInt("ipLowestTwoBytes");
                amaqVar.p = new byte[]{(byte) (i >> 8), (byte) i};
            }
            String j9 = amxr.j(jSONObject, "cloudDeviceId");
            if (j9 != null) {
                amaqVar.q = j9;
            }
            if (jSONObject.has("isCloudOnlyDevice")) {
                amaqVar.r = jSONObject.getBoolean("isCloudOnlyDevice");
            }
            if (jSONObject.has("WAKEUP_SERVICE_PORT")) {
                amaqVar.g = Integer.valueOf(jSONObject.getInt("WAKEUP_SERVICE_PORT"));
            }
            Boolean f = amxr.f(jSONObject, "isSelfDevice");
            if (f != null) {
                amaqVar.k = f;
            }
            return amaqVar.a();
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
        return this.s.a;
    }

    public final CastEurekaInfo d() {
        CastEurekaInfo castEurekaInfo = this.t;
        return (castEurekaInfo == null && n()) ? new CastEurekaInfo(1, false, false, null, null, null, null, null, false) : castEurekaInfo;
    }

    public final String e() {
        return amxr.g(this.d);
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
        if (amxr.u(this.a, castDevice.a) && amxr.u(this.c, castDevice.c) && amxr.u(this.e, castDevice.e) && amxr.u(this.d, castDevice.d)) {
            String str = this.f;
            String str2 = castDevice.f;
            if (amxr.u(str, str2) && (i = this.g) == (i2 = castDevice.g) && amxr.u(this.r, castDevice.r) && a() == castDevice.a() && this.h == castDevice.h && amxr.u(this.i, castDevice.i) && amxr.u(Integer.valueOf(this.k), Integer.valueOf(castDevice.k)) && amxr.u(this.l, castDevice.l) && amxr.u(this.j, castDevice.j) && amxr.u(str, str2) && i == i2 && ((((bArr = this.m) == null && castDevice.m == null) || Arrays.equals(bArr, castDevice.m)) && amxr.u(this.n, castDevice.n) && this.o == castDevice.o && amxr.u(d(), castDevice.d()) && amxr.u(Boolean.valueOf(r()), Boolean.valueOf(castDevice.r())))) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        String str = this.a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    public final List g() {
        return DesugarCollections.unmodifiableList(this.r);
    }

    public final void h(Bundle bundle) {
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i(int i) {
        return this.s.a(i);
    }

    public final boolean j() {
        return this.c instanceof Inet6Address;
    }

    public final boolean k() {
        return this.s.b();
    }

    public final boolean l() {
        return this.s.c();
    }

    public final boolean m() {
        return this.s.d();
    }

    public final boolean n() {
        return this.s.e();
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
            return amxr.u(f(), castDevice.f());
        }
        String str = this.l;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = castDevice.l;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return amxr.u(str, str2);
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
        CastEurekaInfo castEurekaInfo = this.t;
        return castEurekaInfo != null && castEurekaInfo.c;
    }

    public final String toString() {
        String str = k() ? "[dynamic group]" : m() ? "[static group]" : n() ? "[speaker pair]" : "";
        if (this.s.a(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE)) {
            str = str.concat("[cast connect]");
        }
        return String.format(Locale.ROOT, "\"%s\" (%s) %s", e(), this.a, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.y(parcel, 8, g(), false);
        arxc.o(parcel, 9, a());
        arxc.o(parcel, 10, this.h);
        arxc.v(parcel, 11, this.i, false);
        arxc.v(parcel, 12, this.j, false);
        arxc.o(parcel, 13, this.k);
        arxc.v(parcel, 14, this.l, false);
        arxc.i(parcel, 15, this.m, false);
        arxc.v(parcel, 16, this.n, false);
        arxc.e(parcel, 17, this.o);
        arxc.t(parcel, 18, d(), i, false);
        arxc.F(parcel, 19, this.p);
        arxc.z(parcel, 20, Boolean.valueOf(r()));
        arxc.c(parcel, a);
    }
}
