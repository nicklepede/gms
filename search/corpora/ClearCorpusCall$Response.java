package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.davs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ClearCorpusCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new davs();
    public Status a;

    public ClearCorpusCall$Response() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }

    public ClearCorpusCall$Response(Status status) {
        this.a = status;
    }
}
