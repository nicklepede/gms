package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqto;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cahe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlacesParams extends AbstractSafeParcelable {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public static final PlacesParams a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public static final Parcelable.Creator CREATOR = new cahe();

    public PlacesParams(String str, String str2, String str3, String str4, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof PlacesParams)) {
            PlacesParams placesParams = (PlacesParams) obj;
            if (this.f == placesParams.f && this.g == placesParams.g && this.c.equals(placesParams.c) && this.b.equals(placesParams.b) && arwb.b(this.d, placesParams.d) && arwb.b(this.e, placesParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("clientPackageName", this.b, arrayList);
        arwa.b("locale", this.c, arrayList);
        arwa.b("accountName", this.d, arrayList);
        arwa.b("gCoreClientName", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.v(parcel, 4, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.c(parcel, a2);
    }

    public PlacesParams(String str, Locale locale, String str2) {
        this(str, locale.toLanguageTag(), str2, null, aqto.b, 0);
    }

    public PlacesParams(String str, Locale locale, String str2, String str3, int i) {
        this(str, locale.toLanguageTag(), str2, str3, aqto.b, i);
    }
}
