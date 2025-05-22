package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aswd;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccpv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PlacesParams extends AbstractSafeParcelable {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public static final PlacesParams a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public static final Parcelable.Creator CREATOR = new ccpv();

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
            if (this.f == placesParams.f && this.g == placesParams.g && this.c.equals(placesParams.c) && this.b.equals(placesParams.b) && atyq.b(this.d, placesParams.d) && atyq.b(this.e, placesParams.e)) {
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
        atyp.b("clientPackageName", this.b, arrayList);
        atyp.b("locale", this.c, arrayList);
        atyp.b("accountName", this.d, arrayList);
        atyp.b("gCoreClientName", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.v(parcel, 4, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.c(parcel, a2);
    }

    public PlacesParams(String str, Locale locale, String str2) {
        this(str, locale.toLanguageTag(), str2, null, aswd.b, 0);
    }

    public PlacesParams(String str, Locale locale, String str2, String str3, int i) {
        this(str, locale.toLanguageTag(), str2, str3, aswd.b, i);
    }
}
