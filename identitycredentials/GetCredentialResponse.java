package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmmr;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmmr();
    public final Credential a;

    public GetCredentialResponse(Credential credential) {
        fvbo.f(credential, "credential");
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        Credential credential = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, credential, i, false);
        arxc.c(parcel, a);
    }
}
