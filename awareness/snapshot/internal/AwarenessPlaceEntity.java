package com.google.android.gms.awareness.snapshot.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.ajgy;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccmw;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AwarenessPlaceEntity extends AbstractSafeParcelable implements ccmw {
    public static final Parcelable.Creator CREATOR = new ajgy();
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
        if (!(obj instanceof AwarenessPlaceEntity)) {
            return false;
        }
        AwarenessPlaceEntity awarenessPlaceEntity = (AwarenessPlaceEntity) obj;
        if (this.a.equals(awarenessPlaceEntity.a)) {
            Locale locale = awarenessPlaceEntity.p;
            if (atyq.b(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ccmw
    public final LatLngBounds f() {
        return this.d;
    }

    @Override // defpackage.ccmw
    public final /* synthetic */ CharSequence g() {
        return this.k;
    }

    @Override // defpackage.ccmw
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

    @Override // defpackage.ccmw
    public final /* synthetic */ CharSequence i() {
        return this.j;
    }

    @Override // defpackage.ccmw
    public final /* synthetic */ CharSequence j() {
        return this.l;
    }

    @Override // defpackage.ccmw
    public final String k() {
        return this.o;
    }

    @Override // defpackage.ccmw
    public final String m() {
        return this.a;
    }

    @Override // defpackage.ccmw
    public final List n() {
        return this.n;
    }

    @Override // defpackage.ccmw
    public final Locale o() {
        return Locale.ROOT;
    }

    @Override // defpackage.ccmw
    public final boolean p() {
        return this.g;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("id", this.a, arrayList);
        atyp.b("placeTypes", this.n, arrayList);
        atyp.b("locale", null, arrayList);
        atyp.b("name", this.j, arrayList);
        atyp.b("address", this.k, arrayList);
        atyp.b("phoneNumber", this.l, arrayList);
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
        atzr.v(parcel, 14, this.k, false);
        atzr.v(parcel, 15, this.l, false);
        atzr.x(parcel, 17, this.m, false);
        atzr.v(parcel, 19, this.j, false);
        atzr.E(parcel, 20, this.n);
        atzr.v(parcel, 23, this.o, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
