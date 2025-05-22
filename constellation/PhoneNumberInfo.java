package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avab;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhoneNumberInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avab();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.I(parcel, 3, this.c);
        atzr.g(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public PhoneNumberInfo(String str, Long l, Bundle bundle) {
        this.a = 1;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }
}
