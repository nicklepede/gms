package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.trd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trd();
    public final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.g(parcel, 3, this.c, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public DocumentResults(String str) {
        this(str, null, null, null);
    }
}
