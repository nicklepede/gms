package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.arnw;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.caef;
import defpackage.cafz;
import defpackage.cagw;
import defpackage.cahd;
import defpackage.eadj;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, caef {
    public static final Parcelable.Creator CREATOR = new cagw();
    public final String a;
    public final LatLng b;
    public final float c;
    public final LatLngBounds d;
    public final String e;
    public final Uri f;
    public final boolean g;
    public final float h;
    public final int i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final PlaceOpeningHoursEntity o;
    public final PlaceExtendedDetailsEntity p;
    public final String q;
    public Locale r;

    public PlaceEntity(String str, List list, String str2, String str3, String str4, List list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, PlaceOpeningHoursEntity placeOpeningHoursEntity, PlaceExtendedDetailsEntity placeExtendedDetailsEntity, String str6) {
        this.a = str;
        this.j = DesugarCollections.unmodifiableList(list);
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = list2 == null ? Collections.EMPTY_LIST : list2;
        this.b = latLng;
        this.c = f;
        this.d = latLngBounds;
        this.e = str5 == null ? "UTC" : str5;
        this.f = uri;
        this.g = z;
        this.h = f2;
        this.i = i;
        this.r = null;
        this.o = placeOpeningHoursEntity;
        this.p = placeExtendedDetailsEntity;
        this.q = str6;
    }

    public static caef r(Parcelable parcelable, Context context) {
        if (parcelable == null) {
            return null;
        }
        arwm.t(context, "context must not be null");
        try {
            return (PlaceEntity) parcelable;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Parcelable is not a Place", e);
        }
    }

    @Override // defpackage.caef
    public final float a() {
        return this.c;
    }

    @Override // defpackage.caef
    public final float b() {
        return this.h;
    }

    @Override // defpackage.caef
    public final int c() {
        return this.i;
    }

    @Override // defpackage.caef
    public final Uri d() {
        return this.f;
    }

    @Override // defpackage.caef
    public final LatLng e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.a.equals(placeEntity.a) && arwb.b(this.r, placeEntity.r);
    }

    @Override // defpackage.caef
    public final LatLngBounds f() {
        return this.d;
    }

    @Override // defpackage.caef
    public final /* synthetic */ CharSequence g() {
        return this.l;
    }

    @Override // defpackage.caef
    public final /* bridge */ /* synthetic */ CharSequence h() {
        return cafz.b(this.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.r});
    }

    @Override // defpackage.caef
    public final /* synthetic */ CharSequence i() {
        return this.k;
    }

    @Override // defpackage.caef
    public final /* synthetic */ CharSequence j() {
        return this.m;
    }

    @Override // defpackage.caef
    public final String k() {
        return this.q;
    }

    @Override // defpackage.caef
    public final String m() {
        return this.a;
    }

    @Override // defpackage.caef
    public final List n() {
        return this.j;
    }

    @Override // defpackage.caef
    public final Locale o() {
        throw null;
    }

    @Override // defpackage.caef
    public final boolean p() {
        return this.g;
    }

    public final ContentValues q() {
        String[] strArr = cahd.a;
        ContentValues contentValues = new ContentValues(21);
        contentValues.put("place_id", this.a);
        contentValues.put("place_types", arnw.D(this.j));
        contentValues.put("place_name", this.k);
        contentValues.put("place_address", this.l);
        Locale locale = this.r;
        if (locale != null) {
            contentValues.put("place_locale", locale.getLanguage());
            contentValues.put("place_locale_language", this.r.getLanguage());
            contentValues.put("place_locale_country", this.r.getCountry());
        }
        contentValues.put("place_phone_number", this.m);
        List list = this.n;
        byte[] bArr = null;
        if (list != null && !list.isEmpty()) {
            fecj v = eadj.a.v();
            if (!v.b.L()) {
                v.U();
            }
            eadj eadjVar = (eadj) v.b;
            fedh fedhVar = eadjVar.b;
            if (!fedhVar.c()) {
                eadjVar.b = fecp.E(fedhVar);
            }
            feab.E(list, eadjVar.b);
            bArr = ((eadj) v.Q()).r();
        }
        contentValues.put("place_attributions", bArr);
        LatLng latLng = this.b;
        if (latLng != null) {
            contentValues.put("place_lat_lng", arxd.n(latLng));
        }
        contentValues.put("place_level_number", Float.valueOf(this.c));
        LatLngBounds latLngBounds = this.d;
        if (latLngBounds != null) {
            contentValues.put("place_viewport", arxd.n(latLngBounds));
        }
        Uri uri = this.f;
        if (uri != null) {
            contentValues.put("place_website_uri", uri.toString());
        }
        contentValues.put("place_is_permanently_closed", Boolean.valueOf(this.g));
        contentValues.put("place_rating", Float.valueOf(this.h));
        contentValues.put("place_price_level", Integer.valueOf(this.i));
        PlaceOpeningHoursEntity placeOpeningHoursEntity = this.o;
        if (placeOpeningHoursEntity != null) {
            contentValues.put("place_opening_hours", arxd.n(placeOpeningHoursEntity));
        }
        contentValues.put("place_adr_address", this.q);
        return contentValues;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("id", this.a, arrayList);
        arwa.b("placeTypes", this.j, arrayList);
        arwa.b("locale", this.r, arrayList);
        arwa.b("name", this.k, arrayList);
        arwa.b("address", this.l, arrayList);
        arwa.b("phoneNumber", this.m, arrayList);
        arwa.b("latlng", this.b, arrayList);
        arwa.b("viewport", this.d, arrayList);
        arwa.b("websiteUri", this.f, arrayList);
        arwa.b("isPermanentlyClosed", Boolean.valueOf(this.g), arrayList);
        arwa.b("priceLevel", Integer.valueOf(this.i), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 4, this.b, i, false);
        arxc.l(parcel, 5, this.c);
        arxc.t(parcel, 6, this.d, i, false);
        arxc.v(parcel, 7, this.e, false);
        arxc.t(parcel, 8, this.f, i, false);
        arxc.e(parcel, 9, this.g);
        arxc.l(parcel, 10, this.h);
        arxc.o(parcel, 11, this.i);
        arxc.v(parcel, 14, this.l, false);
        arxc.v(parcel, 15, this.m, false);
        arxc.x(parcel, 17, this.n, false);
        arxc.v(parcel, 19, this.k, false);
        arxc.E(parcel, 20, this.j);
        arxc.t(parcel, 21, this.o, i, false);
        arxc.t(parcel, 22, this.p, i, false);
        arxc.v(parcel, 23, this.q, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
