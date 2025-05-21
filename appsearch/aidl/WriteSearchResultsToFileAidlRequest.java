package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufv;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WriteSearchResultsToFileAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufv();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.q(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
