package com.google.android.gms.search.administration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.datt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BundleResponse extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new datt();
    public Status a;
    public Bundle b;

    public BundleResponse() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public BundleResponse(Status status, Bundle bundle) {
        this.a = status;
        this.b = bundle;
    }
}
