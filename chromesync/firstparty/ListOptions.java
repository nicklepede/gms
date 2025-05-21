package com.google.android.gms.chromesync.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.apep;
import defpackage.arwb;
import defpackage.arxc;
import java.util.Arrays;
import java.util.Date;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ListOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apep();
    public String a;
    public int b;
    public int c;
    public Date d;
    public Date e;

    public ListOptions() {
    }

    static Date a(Long l) {
        if (l == null) {
            return null;
        }
        return new Date(l.longValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListOptions) {
            ListOptions listOptions = (ListOptions) obj;
            if (arwb.b(this.a, listOptions.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(listOptions.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(listOptions.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        Date date = this.d;
        arxc.I(parcel, 4, date == null ? null : Long.valueOf(date.getTime()));
        Date date2 = this.e;
        arxc.I(parcel, 5, date2 != null ? Long.valueOf(date2.getTime()) : null);
        arxc.c(parcel, a);
    }

    public ListOptions(String str, int i, int i2, Long l, Long l2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = a(l);
        this.e = a(l2);
    }
}
