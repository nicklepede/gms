package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhpq;
import defpackage.fhqd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CustomerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhpq();
    public final String a;
    public final String b;
    public final Integer c;

    public CustomerInfo(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.F(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public CustomerInfo(String str, String str2, fhqd fhqdVar) {
        this(str, str2, Integer.valueOf(fhqdVar.z));
    }
}
