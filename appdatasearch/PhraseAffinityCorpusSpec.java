package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.trs;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhraseAffinityCorpusSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trs();
    public final CorpusId a;
    final Bundle b;

    public PhraseAffinityCorpusSpec(CorpusId corpusId, Bundle bundle) {
        this.a = corpusId;
        this.b = bundle;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            hashMap.put(str, Integer.valueOf(bundle.getInt(str)));
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
