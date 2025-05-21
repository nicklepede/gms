package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmni;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SignalCredentialStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmni();
    public final String a;
    public final String b;
    public final Bundle c;

    public SignalCredentialStateRequest(String str, String str2, Bundle bundle) {
        fvbo.f(str, "type");
        fvbo.f(bundle, "requestData");
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.g(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
