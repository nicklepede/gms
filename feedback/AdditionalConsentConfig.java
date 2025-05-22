package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bcjb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AdditionalConsentConfig extends AbstractSafeParcelable {
    public static final bcjb CREATOR = new bcjb();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Bundle f;

    public AdditionalConsentConfig(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.g(parcel, 7, this.f, false);
        atzr.c(parcel, a);
    }
}
