package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abao;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abao();
    final int a;
    public final FACLConfig b;
    public final String c;
    public final boolean d;
    final String e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.a = i;
        this.b = fACLConfig;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public FACLData(FACLConfig fACLConfig, String str, String str2, boolean z) {
        this.a = 1;
        this.b = fACLConfig;
        this.c = str;
        this.e = str2;
        this.d = z;
    }
}
