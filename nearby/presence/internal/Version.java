package com.google.android.gms.nearby.presence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnbx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Version extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbx();
    public String a;
    public Integer b;
    public String c;
    public String d;
    public String e;

    public Version() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Version) {
            Version version = (Version) obj;
            if (atyq.b(this.a, version.a) && atyq.b(this.b, version.b) && atyq.b(this.c, version.c) && atyq.b(this.d, version.d) && atyq.b(this.e, version.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.F(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public Version(String str, Integer num, String str2, String str3, String str4) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
