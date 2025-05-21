package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmml;
import defpackage.fvbo;
import defpackage.fvfj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CredentialOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmml();
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        fvbo.f(str, "type");
        fvbo.f(bundle, "credentialRetrievalData");
        fvbo.f(bundle2, "candidateQueryData");
        fvbo.f(str2, "requestMatcher");
        fvbo.f(str3, "requestType");
        fvbo.f(str4, "protocolType");
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        boolean z = (fvfj.y(str3) || fvfj.y(str4)) ? false : true;
        boolean z2 = !fvfj.y(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + str + ", or requestType: " + str3 + " and protocolType: " + str4 + " must be specified, but at least one contains an invalid blank value.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.g(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
