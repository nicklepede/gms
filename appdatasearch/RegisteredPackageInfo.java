package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tsd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RegisteredPackageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tsd();
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;

    public RegisteredPackageInfo(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
