package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cyph;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetPhraseAffinityCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyph();
    public String[] a;
    public PhraseAffinityCorpusSpec[] b;
    public Bundle c;

    public GetPhraseAffinityCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.w(parcel, 1, this.a, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.g(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public GetPhraseAffinityCall$Request(String[] strArr, PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr, Bundle bundle) {
        this.a = strArr;
        this.b = phraseAffinityCorpusSpecArr;
        this.c = bundle;
    }
}
