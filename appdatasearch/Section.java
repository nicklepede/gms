package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arxc;
import defpackage.tso;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class Section extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tso();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public Section(String str) {
        this(str, false, 0);
    }
}
