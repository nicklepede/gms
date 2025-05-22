package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wag;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SearchResultPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wag();
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.y(parcel, 2, a(), false);
        atzr.c(parcel, a);
    }

    public SearchResultPage() {
        this.a = 0L;
        this.b = Collections.EMPTY_LIST;
    }
}
