package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ceiv;
import defpackage.cejg;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ceiv();
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
        atyp.b("PanoramaId", this.b, arrayList);
        atyp.b("Position", this.c, arrayList);
        atyp.b("Radius", this.d, arrayList);
        atyp.b("Source", this.e, arrayList);
        atyp.b("StreetViewPanoramaCamera", this.a, arrayList);
        atyp.b("UserNavigationEnabled", this.f, arrayList);
        atyp.b("ZoomGesturesEnabled", this.g, arrayList);
        atyp.b("PanningGesturesEnabled", this.h, arrayList);
        atyp.b("StreetNamesEnabled", this.i, arrayList);
        atyp.b("UseViewLifecycleInFragment", this.j, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.F(parcel, 5, this.d);
        atzr.h(parcel, 6, cejg.a(this.f));
        atzr.h(parcel, 7, cejg.a(this.g));
        atzr.h(parcel, 8, cejg.a(this.h));
        atzr.h(parcel, 9, cejg.a(this.i));
        atzr.h(parcel, 10, cejg.a(this.j));
        atzr.t(parcel, 11, this.e, i, false);
        atzr.c(parcel, a);
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
        this.f = cejg.b(b);
        this.g = cejg.b(b2);
        this.h = cejg.b(b3);
        this.i = cejg.b(b4);
        this.j = cejg.b(b5);
        this.e = streetViewSource;
    }
}
