package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atzr;
import defpackage.voo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Section extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new voo();
    public final String a;
    public final boolean b;
    public final int c;

    public Section(String str, boolean z, int i) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public static String a(String str, String str2) {
        return a.i(str2, str, "semantic#", ";");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public Section(String str) {
        this(str, false, 0);
    }
}
