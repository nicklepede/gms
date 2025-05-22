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
import defpackage.atql;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.ccmw;
import defpackage.ccoq;
import defpackage.ccpn;
import defpackage.ccpu;
import defpackage.ecpv;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, ccmw {
    public static final Parcelable.Creator CREATOR = new ccpn();
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

    public static ccmw r(Parcelable parcelable, Context context) {
        if (parcelable == null) {
            return null;
        }
        atzb.t(context, "context must not be null");
        try {
            return (PlaceEntity) parcelable;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Parcelable is not a Place", e);
        }
    }

    @Override // defpackage.ccmw
    public final float a() {
        return this.c;
    }

    @Override // defpackage.ccmw
    public final float b() {
        return this.h;
    }

    @Override // defpackage.ccmw
    public final int c() {
        return this.i;
    }

    @Override // defpackage.ccmw
    public final Uri d() {
        return this.f;
    }

    @Override // defpackage.ccmw
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
        return this.a.equals(placeEntity.a) && atyq.b(this.r, placeEntity.r);
    }

    @Override // defpackage.ccmw
    public final LatLngBounds f() {
        return this.d;
    }

    @Override // defpackage.ccmw
    public final /* synthetic */ CharSequence g() {
        return this.l;
    }

    @Override // defpackage.ccmw
    public final /* bridge */ /* synthetic */ CharSequence h() {
        return ccoq.b(this.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.r});
    }

    @Override // defpackage.ccmw
    public final /* synthetic */ CharSequence i() {
        return this.k;
    }

    @Override // defpackage.ccmw
    public final /* synthetic */ CharSequence j() {
        return this.m;
    }

    @Override // defpackage.ccmw
    public final String k() {
        return this.q;
    }

    @Override // defpackage.ccmw
    public final String m() {
        return this.a;
    }

    @Override // defpackage.ccmw
    public final List n() {
        return this.j;
    }

    @Override // defpackage.ccmw
    public final Locale o() {
        throw null;
    }

    @Override // defpackage.ccmw
    public final boolean p() {
        return this.g;
    }

    public final ContentValues q() {
        String[] strArr = ccpu.a;
        ContentValues contentValues = new ContentValues(21);
        contentValues.put("place_id", this.a);
        contentValues.put("place_types", atql.D(this.j));
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
            fgrc v = ecpv.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ecpv ecpvVar = (ecpv) v.b;
            fgsa fgsaVar = ecpvVar.b;
            if (!fgsaVar.c()) {
                ecpvVar.b = fgri.E(fgsaVar);
            }
            fgou.E(list, ecpvVar.b);
            bArr = ((ecpv) v.Q()).r();
        }
        contentValues.put("place_attributions", bArr);
        LatLng latLng = this.b;
        if (latLng != null) {
            contentValues.put("place_lat_lng", atzs.n(latLng));
        }
        contentValues.put("place_level_number", Float.valueOf(this.c));
        LatLngBounds latLngBounds = this.d;
        if (latLngBounds != null) {
            contentValues.put("place_viewport", atzs.n(latLngBounds));
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
            contentValues.put("place_opening_hours", atzs.n(placeOpeningHoursEntity));
        }
        contentValues.put("place_adr_address", this.q);
        return contentValues;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("id", this.a, arrayList);
        atyp.b("placeTypes", this.j, arrayList);
        atyp.b("locale", this.r, arrayList);
        atyp.b("name", this.k, arrayList);
        atyp.b("address", this.l, arrayList);
        atyp.b("phoneNumber", this.m, arrayList);
        atyp.b("latlng", this.b, arrayList);
        atyp.b("viewport", this.d, arrayList);
        atyp.b("websiteUri", this.f, arrayList);
        atyp.b("isPermanentlyClosed", Boolean.valueOf(this.g), arrayList);
        atyp.b("priceLevel", Integer.valueOf(this.i), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 4, this.b, i, false);
        atzr.l(parcel, 5, this.c);
        atzr.t(parcel, 6, this.d, i, false);
        atzr.v(parcel, 7, this.e, false);
        atzr.t(parcel, 8, this.f, i, false);
        atzr.e(parcel, 9, this.g);
        atzr.l(parcel, 10, this.h);
        atzr.o(parcel, 11, this.i);
        atzr.v(parcel, 14, this.l, false);
        atzr.v(parcel, 15, this.m, false);
        atzr.x(parcel, 17, this.n, false);
        atzr.v(parcel, 19, this.k, false);
        atzr.E(parcel, 20, this.j);
        atzr.t(parcel, 21, this.o, i, false);
        atzr.t(parcel, 22, this.p, i, false);
        atzr.v(parcel, 23, this.q, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
