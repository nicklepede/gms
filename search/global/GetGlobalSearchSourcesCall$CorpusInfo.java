package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cynh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetGlobalSearchSourcesCall$CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cynh();
    public String a;
    public Feature[] b;
    public boolean c;
    public Bundle d;

    public GetGlobalSearchSourcesCall$CorpusInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.e(parcel, 3, this.c);
        arxc.g(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$CorpusInfo(String str, Feature[] featureArr, boolean z, Bundle bundle) {
        this.a = str;
        this.b = featureArr;
        this.c = z;
        this.d = bundle;
    }
}
