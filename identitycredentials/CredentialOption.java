package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bote;
import defpackage.fxxm;
import defpackage.fybh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bote();
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        fxxm.f(str, "type");
        fxxm.f(bundle, "credentialRetrievalData");
        fxxm.f(bundle2, "candidateQueryData");
        fxxm.f(str2, "requestMatcher");
        fxxm.f(str3, "requestType");
        fxxm.f(str4, "protocolType");
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        boolean z = (fybh.y(str3) || fybh.y(str4)) ? false : true;
        boolean z2 = !fybh.y(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + str + ", or requestType: " + str3 + " and protocolType: " + str4 + " must be specified, but at least one contains an invalid blank value.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}
