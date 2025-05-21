package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.blzp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new blzp();
    public final String a;
    public final String b;

    public AccountData(String str, String str2) {
        arwm.r(str, "Account name must not be empty.");
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
