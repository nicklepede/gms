package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cynt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SetIncludeInGlobalSearchCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cynt();
    public String a;
    public String b;
    public boolean c;

    public SetIncludeInGlobalSearchCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.e(parcel, 2, this.c);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public SetIncludeInGlobalSearchCall$Request(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
