package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cymd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetCorpusStatusCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cymd();
    public Status a;
    public CorpusStatus b;

    public GetCorpusStatusCall$Response() {
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public GetCorpusStatusCall$Response(Status status, CorpusStatus corpusStatus) {
        this.a = status;
        this.b = corpusStatus;
    }
}
