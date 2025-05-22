package com.google.android.gms.personalsafety.detection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cxsf;
import defpackage.ekti;
import defpackage.ekus;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FinderTagInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cxsf();
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
            if (ekti.e(this.a, finderTagInfo.a) && ekus.a(this.b, finderTagInfo.b) && ekus.a(this.c, finderTagInfo.c) && ekus.a(this.d, finderTagInfo.d) && ekus.a(this.e, finderTagInfo.e) && ekus.a(this.f, finderTagInfo.f) && ekus.a(this.g, finderTagInfo.g) && ekus.a(this.h, finderTagInfo.h) && ekus.a(this.i, finderTagInfo.i) && ekus.a(this.j, finderTagInfo.j) && ekus.a(this.k, finderTagInfo.k)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.z(parcel, 6, this.f);
        atzr.x(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.x(parcel, 11, this.k, false);
        atzr.z(parcel, 12, this.l);
        atzr.c(parcel, a);
    }
}
