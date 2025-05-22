package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wan;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SearchSuggestionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wan();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
