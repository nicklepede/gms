package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acdb;
import defpackage.atzr;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetRestoreCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acdb();
    public final Bundle a;

    public GetRestoreCredentialResponse(Bundle bundle) {
        fxxm.f(bundle, "responseBundle");
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        Bundle bundle = this.a;
        int a = atzr.a(parcel);
        atzr.g(parcel, 1, bundle, false);
        atzr.c(parcel, a);
    }
}
