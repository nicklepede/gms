package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wbs;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SearchAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbs();
    public final AppSearchAttributionSource a;
    public final String b;
    public final String c;
    public final SearchSpec d;
    public final UserHandle e;
    public final long f;

    public SearchAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, String str2, SearchSpec searchSpec, UserHandle userHandle, long j) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (String) Objects.requireNonNull(str2);
        this.d = (SearchSpec) Objects.requireNonNull(searchSpec);
        this.e = (UserHandle) Objects.requireNonNull(userHandle);
        this.f = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appSearchAttributionSource, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.q(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
