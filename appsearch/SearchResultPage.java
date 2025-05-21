package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ueh;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SearchResultPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ueh();
    public final long a;
    private final List b;

    public SearchResultPage(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final List a() {
        List list = this.b;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.y(parcel, 2, a(), false);
        arxc.c(parcel, a);
    }

    public SearchResultPage() {
        this.a = 0L;
        this.b = Collections.EMPTY_LIST;
    }
}
