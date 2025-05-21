package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ddev;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class VerificationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddev();
    public String a;
    public final int b;
    public boolean c;

    public VerificationInfo(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.o(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public VerificationInfo(String str, int i) {
        this(str, i, false);
    }
}
