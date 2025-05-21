package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwt;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ActionPreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwt();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public ActionPreference(String str, int i, int i2, String str2, String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionPreference)) {
            return false;
        }
        ActionPreference actionPreference = (ActionPreference) obj;
        return this.b == actionPreference.b && this.c == actionPreference.c && eihn.a(this.d, actionPreference.d) && eihn.a(this.a, actionPreference.a) && eihn.a(this.e, actionPreference.e) && this.f == actionPreference.f && this.g == actionPreference.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.q(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
