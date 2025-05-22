package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czcf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresentUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czcf();
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
        return atyq.b(this.a, presentUser.a) && this.b == presentUser.b && this.c == presentUser.c && this.d == presentUser.d && atyq.b(this.e, presentUser.e) && atyq.b(this.f, presentUser.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}
