package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adai;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adai();
    private static final String g = "[AppDescription]";
    final int a;
    public int b;
    String c;
    String d;
    public String e;
    boolean f;

    public AppDescription(int i, int i2, String str, String str2, String str3, boolean z) {
        getClass().getSimpleName();
        this.a = i;
        this.c = str;
        this.d = str2;
        atzb.r(str3, String.valueOf(g).concat(" callingPkg cannot be null or empty!"));
        this.e = str3;
        atzb.c(i2 != 0, "Invalid callingUid! Cannot be 0!");
        this.b = i2;
        this.f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public AppDescription(String str, int i) {
        this(str, i, null, null);
    }

    public AppDescription(String str, int i, String str2, String str3) {
        this(1, i, str2, str3, str, false);
    }
}
