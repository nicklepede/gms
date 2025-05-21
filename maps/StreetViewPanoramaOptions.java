package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.ccab;
import defpackage.ccam;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ccab();
    public StreetViewPanoramaCamera a;
    public String b;
    public LatLng c;
    public Integer d;
    public StreetViewSource e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions() {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("PanoramaId", this.b, arrayList);
        arwa.b("Position", this.c, arrayList);
        arwa.b("Radius", this.d, arrayList);
        arwa.b("Source", this.e, arrayList);
        arwa.b("StreetViewPanoramaCamera", this.a, arrayList);
        arwa.b("UserNavigationEnabled", this.f, arrayList);
        arwa.b("ZoomGesturesEnabled", this.g, arrayList);
        arwa.b("PanningGesturesEnabled", this.h, arrayList);
        arwa.b("StreetNamesEnabled", this.i, arrayList);
        arwa.b("UseViewLifecycleInFragment", this.j, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.F(parcel, 5, this.d);
        arxc.h(parcel, 6, ccam.a(this.f));
        arxc.h(parcel, 7, ccam.a(this.g));
        arxc.h(parcel, 8, ccam.a(this.h));
        arxc.h(parcel, 9, ccam.a(this.i));
        arxc.h(parcel, 10, ccam.a(this.j));
        arxc.t(parcel, 11, this.e, i, false);
        arxc.c(parcel, a);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.e = StreetViewSource.a;
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.f = ccam.b(b);
        this.g = ccam.b(b2);
        this.h = ccam.b(b3);
        this.i = ccam.b(b4);
        this.j = ccam.b(b5);
        this.e = streetViewSource;
    }
}
