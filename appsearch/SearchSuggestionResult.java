package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ueo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SearchSuggestionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ueo();
    public final String a;
    private Integer b;

    public SearchSuggestionResult(String str) {
        this.a = (String) Objects.requireNonNull(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchSuggestionResult) {
            return this.a.equals(((SearchSuggestionResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == null) {
            this.b = Integer.valueOf(this.a.hashCode());
        }
        return this.b.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a);
    }
}
