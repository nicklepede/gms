package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.fjou;
import defpackage.uka;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetAsterismConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uka();
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public GetAsterismConsentResponse(int i, int i2, String str, String str2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    public static boolean a(fjou fjouVar) {
        return fjouVar == fjou.CONSENTED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
