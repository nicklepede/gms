package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cypb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AnnotateCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cypb();
    public final String a;
    public final String b;
    public final int[] c;
    public final Bundle d;

    public AnnotateCall$Request(String str, String str2, int[] iArr, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = iArr;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.p(parcel, 3, this.c, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
