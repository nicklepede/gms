package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.atyp;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.ccmg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccmg();
    public final String a;
    public final LatLng b;
    public final String c;
    public final List d;
    public final String e;
    public final Uri f;

    public AddPlaceRequest(String str, LatLng latLng, String str2, List list, String str3, Uri uri) {
        atzb.q(str);
        this.a = str;
        atzb.s(latLng);
        this.b = latLng;
        atzb.q(str2);
        this.c = str2;
        atzb.s(list);
        this.d = new ArrayList(list);
        boolean z = true;
        atzb.c(!r1.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        atzb.c(z, "One of phone number or URI should be provided.");
        this.e = str3;
        this.f = uri;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("name", this.a, arrayList);
        atyp.b("latLng", this.b, arrayList);
        atyp.b("address", this.c, arrayList);
        atyp.b("placeTypes", this.d, arrayList);
        atyp.b("phoneNumer", this.e, arrayList);
        atyp.b("websiteUri", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.E(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }
}
