package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wbu;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WriteSearchResultsToFileAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbu();
    public final AppSearchAttributionSource a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final String d;
    public final SearchSpec e;
    public final UserHandle f;
    public final long g;

    public WriteSearchResultsToFileAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, ParcelFileDescriptor parcelFileDescriptor, String str2, SearchSpec searchSpec, UserHandle userHandle, long j) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (ParcelFileDescriptor) Objects.requireNonNull(parcelFileDescriptor);
        this.d = (String) Objects.requireNonNull(str2);
        this.e = (SearchSpec) Objects.requireNonNull(searchSpec);
        this.f = (UserHandle) Objects.requireNonNull(userHandle);
        this.g = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appSearchAttributionSource, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.q(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
