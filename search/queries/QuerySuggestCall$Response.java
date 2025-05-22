package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.dazq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class QuerySuggestCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new dazq();
    public Status a;
    public SuggestionResults b;
    public Bundle c;

    public QuerySuggestCall$Response() {
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

    public QuerySuggestCall$Response(Status status, SuggestionResults suggestionResults, Bundle bundle) {
        this.a = status;
        this.b = suggestionResults;
        this.c = bundle;
    }
}
