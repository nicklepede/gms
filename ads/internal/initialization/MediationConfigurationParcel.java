package com.google.android.gms.ads.internal.initialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MediationConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final String a;
    public final Bundle b;

    public MediationConfigurationParcel(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
