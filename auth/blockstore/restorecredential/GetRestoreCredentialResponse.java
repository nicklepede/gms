package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aadb;
import defpackage.arxc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GetRestoreCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aadb();
    public final Bundle a;

    public GetRestoreCredentialResponse(Bundle bundle) {
        fvbo.f(bundle, "responseBundle");
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        Bundle bundle = this.a;
        int a = arxc.a(parcel);
        arxc.g(parcel, 1, bundle, false);
        arxc.c(parcel, a);
    }
}
