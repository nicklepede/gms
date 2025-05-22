package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.daxf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetGlobalSearchSourcesCall$CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new daxf();
    public String a;
    public Feature[] b;
    public boolean c;
    public Bundle d;

    public GetGlobalSearchSourcesCall$CorpusInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.e(parcel, 3, this.c);
        atzr.g(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$CorpusInfo(String str, Feature[] featureArr, boolean z, Bundle bundle) {
        this.a = str;
        this.b = featureArr;
        this.c = z;
        this.d = bundle;
    }
}
