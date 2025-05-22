package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.vnt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhraseAffinityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnt();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.p(parcel, 3, this.c, false);
        atzr.c(parcel, a);
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
        atzb.b(z);
    }
}
