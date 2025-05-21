package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tru;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class PhraseAffinitySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tru();
    public final PhraseAffinityCorpusSpec[] a;

    public PhraseAffinitySpecification(PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr) {
        this.a = phraseAffinityCorpusSpecArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.c(parcel, a);
    }
}
