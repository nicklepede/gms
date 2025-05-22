package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.dazd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetDocumentsCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new dazd();
    public Status a;
    public DocumentResults b;
    public Bundle c;

    public GetDocumentsCall$Response() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public GetDocumentsCall$Response(Status status, DocumentResults documentResults, Bundle bundle) {
        this.a = status;
        this.b = documentResults;
        this.c = bundle;
    }
}
