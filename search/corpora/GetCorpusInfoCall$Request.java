package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.davx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetCorpusInfoCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new davx();
    public String a;
    public String b;

    public GetCorpusInfoCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public GetCorpusInfoCall$Request(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
