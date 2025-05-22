package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.daur;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RequestAppIndexingUpdateIndexCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new daur();
    public final Status a;
    public final long b;

    public RequestAppIndexingUpdateIndexCall$Response(Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
