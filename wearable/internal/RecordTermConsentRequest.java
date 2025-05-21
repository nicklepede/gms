package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkmd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RecordTermConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmd();
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public RecordTermConsentRequest(int i, int i2, boolean z, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
