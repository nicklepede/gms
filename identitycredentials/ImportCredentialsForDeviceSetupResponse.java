package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.botp;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImportCredentialsForDeviceSetupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new botp();
    public final Bundle a;

    public ImportCredentialsForDeviceSetupResponse(Bundle bundle) {
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
