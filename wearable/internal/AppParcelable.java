package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkgq;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AppParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgq();
    public final String a;
    public final String b;
    public final WebIconParcelable c;
    public final String d;
    public final String e;
    public final Float f;
    public final AppWearDetailsParcelable g;

    public AppParcelable(String str, String str2, WebIconParcelable webIconParcelable, String str3, String str4, Float f, AppWearDetailsParcelable appWearDetailsParcelable) {
        this.a = str;
        this.b = str2;
        this.c = webIconParcelable;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = appWearDetailsParcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppParcelable appParcelable = (AppParcelable) obj;
            if (Objects.equals(this.a, appParcelable.a) && Objects.equals(this.b, appParcelable.b) && Objects.equals(this.c, appParcelable.c) && Objects.equals(this.d, appParcelable.d) && Objects.equals(this.e, appParcelable.e) && Objects.equals(this.f, appParcelable.f) && Objects.equals(this.g, appParcelable.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        WebIconParcelable webIconParcelable = this.c;
        return "AppParcelable{title='" + this.b + "', developerName='" + this.d + "', formattedPrice='" + this.e + "', starRating=" + this.f + ", wearDetails=" + String.valueOf(this.g) + ", deepLinkUri='" + this.a + "', icon=" + String.valueOf(webIconParcelable) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.C(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }
}
