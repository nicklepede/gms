package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.boub;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SignalCredentialStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new boub();
    public final String a;
    public final String b;
    public final Bundle c;

    public SignalCredentialStateRequest(String str, String str2, Bundle bundle) {
        fxxm.f(str, "type");
        fxxm.f(bundle, "requestData");
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
