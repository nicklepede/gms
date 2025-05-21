package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.upi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GetTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new upi();
    public final String a;
    public final Oauth2TokenMetadata b;

    public GetTokenResponse(String str, Oauth2TokenMetadata oauth2TokenMetadata) {
        this.a = str;
        this.b = oauth2TokenMetadata;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
