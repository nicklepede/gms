package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cylt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ClearCorpusCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cylt();
    public String a;
    public String b;

    public ClearCorpusCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public ClearCorpusCall$Request(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
