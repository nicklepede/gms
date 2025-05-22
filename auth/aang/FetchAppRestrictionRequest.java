package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wla;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FetchAppRestrictionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wla();
    public final GoogleAccount a;
    public final String b;

    public FetchAppRestrictionRequest(GoogleAccount googleAccount, String str) {
        this.a = googleAccount;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, googleAccount, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
