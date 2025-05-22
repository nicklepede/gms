package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dazf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetPhraseAffinityCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dazf();
    public String[] a;
    public PhraseAffinityCorpusSpec[] b;
    public Bundle c;

    public GetPhraseAffinityCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.w(parcel, 1, this.a, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public GetPhraseAffinityCall$Request(String[] strArr, PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr, Bundle bundle) {
        this.a = strArr;
        this.b = phraseAffinityCorpusSpecArr;
        this.c = bundle;
    }
}
