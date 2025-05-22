package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class AncsNotificationParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmsi();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final String k;
    private final String l;

    public AncsNotificationParcelable(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.l = str6;
        this.g = b;
        this.h = b2;
        this.i = b3;
        this.j = b4;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.a != ancsNotificationParcelable.a || this.g != ancsNotificationParcelable.g || this.h != ancsNotificationParcelable.h || this.i != ancsNotificationParcelable.i || this.j != ancsNotificationParcelable.j || !this.b.equals(ancsNotificationParcelable.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? ancsNotificationParcelable.c != null : !str.equals(ancsNotificationParcelable.c)) {
            return false;
        }
        if (!this.d.equals(ancsNotificationParcelable.d) || !this.e.equals(ancsNotificationParcelable.e) || !this.f.equals(ancsNotificationParcelable.f)) {
            return false;
        }
        String str2 = this.l;
        if (str2 == null ? ancsNotificationParcelable.l != null : !str2.equals(ancsNotificationParcelable.l)) {
            return false;
        }
        String str3 = this.k;
        return str3 != null ? str3.equals(ancsNotificationParcelable.k) : ancsNotificationParcelable.k == null;
    }

    public final int hashCode() {
        int hashCode = ((this.a + 31) * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((((((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str2 = this.l;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str3 = this.k;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AncsNotificationParcelable{, id=" + this.a + ", appId='" + this.b + "', dateTime='" + this.c + "', eventId=" + ((int) this.g) + ", eventFlags=" + ((int) this.h) + ", categoryId=" + ((int) this.i) + ", categoryCount=" + ((int) this.j) + ", packageName='" + this.k + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        String str = this.b;
        atzr.v(parcel, 3, str, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        String str2 = this.l;
        if (str2 != null) {
            str = str2;
        }
        atzr.v(parcel, 8, str, false);
        atzr.h(parcel, 9, this.g);
        atzr.h(parcel, 10, this.h);
        atzr.h(parcel, 11, this.i);
        atzr.h(parcel, 12, this.j);
        atzr.v(parcel, 13, this.k, false);
        atzr.c(parcel, a);
    }
}
