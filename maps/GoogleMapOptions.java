package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cbzv;
import defpackage.ccaa;
import defpackage.ccam;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cbzv();
    private static final Integer i = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public int a;
    public CameraPosition b;
    public Float c;
    public Float d;
    public LatLngBounds e;
    public Integer f;
    public String g;
    public int h;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Boolean u;

    public GoogleMapOptions() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = ccaa.a;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.a = obtainAttributes.getInt(16, -1);
        }
        if (obtainAttributes.hasValue(26)) {
            googleMapOptions.j = Boolean.valueOf(obtainAttributes.getBoolean(26, false));
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.k = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.m = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.q = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.u = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.n = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.p = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.o = Boolean.valueOf(obtainAttributes.getBoolean(24, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.l = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.r = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.s = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.t = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.c = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.d = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.f = Integer.valueOf(obtainAttributes.getColor(1, i.intValue()));
        }
        if (obtainAttributes.hasValue(15) && (string = obtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.g = string;
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.h = obtainAttributes.getInt(14, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        Float valueOf = obtainAttributes2.hasValue(11) ? Float.valueOf(obtainAttributes2.getFloat(11, 0.0f)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(12) ? Float.valueOf(obtainAttributes2.getFloat(12, 0.0f)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(9) ? Float.valueOf(obtainAttributes2.getFloat(9, 0.0f)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(10) ? Float.valueOf(obtainAttributes2.getFloat(10, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
        }
        googleMapOptions.e = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(obtainAttributes3.hasValue(5) ? obtainAttributes3.getFloat(5, 0.0f) : 0.0f, obtainAttributes3.hasValue(6) ? obtainAttributes3.getFloat(6, 0.0f) : 0.0f);
        float f = obtainAttributes3.hasValue(8) ? obtainAttributes3.getFloat(8, 0.0f) : 0.0f;
        float f2 = obtainAttributes3.hasValue(2) ? obtainAttributes3.getFloat(2, 0.0f) : 0.0f;
        float f3 = obtainAttributes3.hasValue(7) ? obtainAttributes3.getFloat(7, 0.0f) : 0.0f;
        obtainAttributes3.recycle();
        googleMapOptions.b = new CameraPosition(latLng, f, f3, f2);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("MapType", Integer.valueOf(this.a), arrayList);
        arwa.b("LiteMode", this.r, arrayList);
        arwa.b("Camera", this.b, arrayList);
        arwa.b("CompassEnabled", this.m, arrayList);
        arwa.b("ZoomControlsEnabled", this.l, arrayList);
        arwa.b("ScrollGesturesEnabled", this.n, arrayList);
        arwa.b("ZoomGesturesEnabled", this.o, arrayList);
        arwa.b("TiltGesturesEnabled", this.p, arrayList);
        arwa.b("RotateGesturesEnabled", this.q, arrayList);
        arwa.b("ScrollGesturesEnabledDuringRotateOrZoom", this.u, arrayList);
        arwa.b("MapToolbarEnabled", this.s, arrayList);
        arwa.b("AmbientEnabled", this.t, arrayList);
        arwa.b("MinZoomPreference", this.c, arrayList);
        arwa.b("MaxZoomPreference", this.d, arrayList);
        arwa.b("BackgroundColor", this.f, arrayList);
        arwa.b("LatLngBoundsForCameraTarget", this.e, arrayList);
        arwa.b("ZOrderOnTop", this.j, arrayList);
        arwa.b("UseViewLifecycleInFragment", this.k, arrayList);
        arwa.b("mapColorScheme", Integer.valueOf(this.h), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = arxc.a(parcel);
        arxc.h(parcel, 2, ccam.a(this.j));
        arxc.h(parcel, 3, ccam.a(this.k));
        arxc.o(parcel, 4, this.a);
        arxc.t(parcel, 5, this.b, i2, false);
        arxc.h(parcel, 6, ccam.a(this.l));
        arxc.h(parcel, 7, ccam.a(this.m));
        arxc.h(parcel, 8, ccam.a(this.n));
        arxc.h(parcel, 9, ccam.a(this.o));
        arxc.h(parcel, 10, ccam.a(this.p));
        arxc.h(parcel, 11, ccam.a(this.q));
        arxc.h(parcel, 12, ccam.a(this.r));
        arxc.h(parcel, 14, ccam.a(this.s));
        arxc.h(parcel, 15, ccam.a(this.t));
        arxc.C(parcel, 16, this.c);
        arxc.C(parcel, 17, this.d);
        arxc.t(parcel, 18, this.e, i2, false);
        arxc.h(parcel, 19, ccam.a(this.u));
        arxc.F(parcel, 20, this.f);
        arxc.v(parcel, 21, this.g, false);
        arxc.o(parcel, 23, this.h);
        arxc.c(parcel, a);
    }

    public GoogleMapOptions(byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i3) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = ccam.b(b);
        this.k = ccam.b(b2);
        this.a = i2;
        this.b = cameraPosition;
        this.l = ccam.b(b3);
        this.m = ccam.b(b4);
        this.n = ccam.b(b5);
        this.o = ccam.b(b6);
        this.p = ccam.b(b7);
        this.q = ccam.b(b8);
        this.r = ccam.b(b9);
        this.s = ccam.b(b10);
        this.t = ccam.b(b11);
        this.c = f;
        this.d = f2;
        this.e = latLngBounds;
        this.u = ccam.b(b12);
        this.f = num;
        this.g = str;
        this.h = i3;
    }
}
