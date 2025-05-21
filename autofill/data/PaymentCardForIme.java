package com.google.android.gms.autofill.data;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adtk;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PaymentCardForIme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adtk();
    public final String a;
    public final PendingIntent b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Icon g;

    public PaymentCardForIme(String str, PendingIntent pendingIntent, String str2, String str3, String str4, String str5, Icon icon) {
        this.a = str;
        this.b = pendingIntent;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = icon;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }
}
