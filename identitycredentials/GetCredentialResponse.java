package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.botk;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new botk();
    public final Credential a;

    public GetCredentialResponse(Credential credential) {
        fxxm.f(credential, "credential");
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        Credential credential = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, credential, i, false);
        atzr.c(parcel, a);
    }
}
