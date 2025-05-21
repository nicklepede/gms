package com.google.android.gms.autofill.data;

import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adsq;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialForIme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adsq();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Icon e;

    public CredentialForIme(String str, String str2, String str3, String str4, Icon icon) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = icon;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}
