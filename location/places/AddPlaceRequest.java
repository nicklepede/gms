package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.arwa;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cadp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cadp();
    public final String a;
    public final LatLng b;
    public final String c;
    public final List d;
    public final String e;
    public final Uri f;

    public AddPlaceRequest(String str, LatLng latLng, String str2, List list, String str3, Uri uri) {
        arwm.q(str);
        this.a = str;
        arwm.s(latLng);
        this.b = latLng;
        arwm.q(str2);
        this.c = str2;
        arwm.s(list);
        this.d = new ArrayList(list);
        boolean z = true;
        arwm.c(!r1.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        arwm.c(z, "One of phone number or URI should be provided.");
        this.e = str3;
        this.f = uri;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("name", this.a, arrayList);
        arwa.b("latLng", this.b, arrayList);
        arwa.b("address", this.c, arrayList);
        arwa.b("placeTypes", this.d, arrayList);
        arwa.b("phoneNumer", this.e, arrayList);
        arwa.b("websiteUri", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.E(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }
}
