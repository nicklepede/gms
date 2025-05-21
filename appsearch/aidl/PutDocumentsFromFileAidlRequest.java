package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.appsearch.stats.SchemaMigrationStats;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufq;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PutDocumentsFromFileAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufq();
    public final AppSearchAttributionSource a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final UserHandle d;
    public final SchemaMigrationStats e;
    public final long f;
    public final long g;

    public PutDocumentsFromFileAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, ParcelFileDescriptor parcelFileDescriptor, UserHandle userHandle, SchemaMigrationStats schemaMigrationStats, long j, long j2) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (ParcelFileDescriptor) Objects.requireNonNull(parcelFileDescriptor);
        this.d = (UserHandle) Objects.requireNonNull(userHandle);
        this.e = (SchemaMigrationStats) Objects.requireNonNull(schemaMigrationStats);
        this.f = j;
        this.g = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.q(parcel, 6, this.f);
        arxc.q(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
