package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aswc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhoneNumberInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aswc();
    public final int a;
    public final String b;
    public final Long c;
    public final Bundle d;

    public PhoneNumberInfo(int i, String str, Long l, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.I(parcel, 3, this.c);
        arxc.g(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public PhoneNumberInfo(String str, Long l, Bundle bundle) {
        this.a = 1;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }
}
