package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dauq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RequestAppIndexingUpdateIndexCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dauq();
    public final String a;

    public RequestAppIndexingUpdateIndexCall$Request(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
