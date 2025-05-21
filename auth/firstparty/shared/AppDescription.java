package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abai;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abai();
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
        arwm.r(str3, String.valueOf(g).concat(" callingPkg cannot be null or empty!"));
        this.e = str3;
        arwm.c(i2 != 0, "Invalid callingUid! Cannot be 0!");
        this.b = i2;
        this.f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public AppDescription(String str, int i) {
        this(str, i, null, null);
    }

    public AppDescription(String str, int i, String str2, String str3) {
        this(1, i, str2, str3, str, false);
    }
}
