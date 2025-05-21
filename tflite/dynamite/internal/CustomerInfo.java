package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfek;
import defpackage.ffbf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CustomerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfek();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.F(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public CustomerInfo(String str, String str2, ffbf ffbfVar) {
        this(str, str2, Integer.valueOf(ffbfVar.z));
    }
}
