package com.google.android.gms.personalsafety.detection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cvip;
import defpackage.eigd;
import defpackage.eihn;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FinderTagInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cvip();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final Boolean l;

    public FinderTagInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, List list, String str6, String str7, String str8, List list2, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = list;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = list2;
        this.l = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FinderTagInfo) {
            FinderTagInfo finderTagInfo = (FinderTagInfo) obj;
            if (eigd.e(this.a, finderTagInfo.a) && eihn.a(this.b, finderTagInfo.b) && eihn.a(this.c, finderTagInfo.c) && eihn.a(this.d, finderTagInfo.d) && eihn.a(this.e, finderTagInfo.e) && eihn.a(this.f, finderTagInfo.f) && eihn.a(this.g, finderTagInfo.g) && eihn.a(this.h, finderTagInfo.h) && eihn.a(this.i, finderTagInfo.i) && eihn.a(this.j, finderTagInfo.j) && eihn.a(this.k, finderTagInfo.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("FinderTagInfo:<MAC: %s, Model name: %s, Manufacturer name: %s, Image URL: %s, Ring key: %s, Owned By Caller: %s, Temporarily Disabled: %B>", this.a, this.b, this.h, this.c, this.d, this.f, this.l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.z(parcel, 6, this.f);
        arxc.x(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.x(parcel, 11, this.k, false);
        arxc.z(parcel, 12, this.l);
        arxc.c(parcel, a);
    }
}
