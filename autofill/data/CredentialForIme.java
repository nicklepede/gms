package com.google.android.gms.autofill.data;

import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.afsx;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CredentialForIme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afsx();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
