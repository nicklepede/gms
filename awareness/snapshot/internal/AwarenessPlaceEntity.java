package com.google.android.gms.awareness.snapshot.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.ahgi;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.caef;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AwarenessPlaceEntity extends AbstractSafeParcelable implements caef {
    public static final Parcelable.Creator CREATOR = new ahgi();
    public final String a;
    public final LatLng b;
    public final float c;
    public final LatLngBounds d;
    public final String e;
    public final Uri f;
    public final boolean g;
    public final float h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final List n;
    public final String o;
    private final Locale p;

    public AwarenessPlaceEntity(String str, List list, String str2, String str3, String str4, List list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, String str6) {
        this.a = str;
        this.n = DesugarCollections.unmodifiableList(list);
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = list2 == null ? Collections.EMPTY_LIST : list2;
        this.b = latLng;
        this.c = f;
        this.d = latLngBounds;
        this.e = str5 == null ? "UTC" : str5;
        this.f = uri;
        this.g = z;
        this.h = f2;
        this.i = i;
        this.p = null;
        this.o = str6;
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
        if (!(obj instanceof AwarenessPlaceEntity)) {
            return false;
        }
        AwarenessPlaceEntity awarenessPlaceEntity = (AwarenessPlaceEntity) obj;
        if (this.a.equals(awarenessPlaceEntity.a)) {
            Locale locale = awarenessPlaceEntity.p;
            if (arwb.b(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.caef
    public final LatLngBounds f() {
        return this.d;
    }

    @Override // defpackage.caef
    public final /* synthetic */ CharSequence g() {
        return this.k;
    }

    @Override // defpackage.caef
    public final CharSequence h() {
        List list = this.m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    @Override // defpackage.caef
    public final /* synthetic */ CharSequence i() {
        return this.j;
    }

    @Override // defpackage.caef
    public final /* synthetic */ CharSequence j() {
        return this.l;
    }

    @Override // defpackage.caef
    public final String k() {
        return this.o;
    }

    @Override // defpackage.caef
    public final String m() {
        return this.a;
    }

    @Override // defpackage.caef
    public final List n() {
        return this.n;
    }

    @Override // defpackage.caef
    public final Locale o() {
        return Locale.ROOT;
    }

    @Override // defpackage.caef
    public final boolean p() {
        return this.g;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("id", this.a, arrayList);
        arwa.b("placeTypes", this.n, arrayList);
        arwa.b("locale", null, arrayList);
        arwa.b("name", this.j, arrayList);
        arwa.b("address", this.k, arrayList);
        arwa.b("phoneNumber", this.l, arrayList);
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
        arxc.v(parcel, 14, this.k, false);
        arxc.v(parcel, 15, this.l, false);
        arxc.x(parcel, 17, this.m, false);
        arxc.v(parcel, 19, this.j, false);
        arxc.E(parcel, 20, this.n);
        arxc.v(parcel, 23, this.o, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
