package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cwsi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PresentUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwsi();
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public PresentUser(String str, long j, int i, int i2, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PresentUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PresentUser presentUser = (PresentUser) obj;
        return arwb.b(this.a, presentUser.a) && this.b == presentUser.b && this.c == presentUser.c && this.d == presentUser.d && arwb.b(this.e, presentUser.e) && arwb.b(this.f, presentUser.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
