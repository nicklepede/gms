package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.trt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhraseAffinityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trt();
    public final String a;
    final CorpusId[] b;
    final int[] c;

    public PhraseAffinityResponse(String str, CorpusId[] corpusIdArr, int[] iArr) {
        this.a = str;
        this.b = corpusIdArr;
        this.c = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.p(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public PhraseAffinityResponse(String str) {
        this(str, null, null);
    }

    public PhraseAffinityResponse(CorpusId[] corpusIdArr, int[] iArr) {
        this(null, corpusIdArr, iArr);
        int length = corpusIdArr.length;
        boolean z = true;
        if (length != 0 && iArr.length % length != 0) {
            z = false;
        }
        arwm.b(z);
    }
}
