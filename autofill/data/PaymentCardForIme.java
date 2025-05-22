package com.google.android.gms.autofill.data;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aftr;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PaymentCardForIme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aftr();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }
}
