package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dawg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RequestIndexingCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dawg();
    public String a;
    public String b;
    public long c;

    public RequestIndexingCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public RequestIndexingCall$Request(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
