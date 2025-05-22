package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.dauh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new dauh();
    public final Status a;
    public final CorpusConfigParcelable[] b;
    public final long c;
    public final AppIndexingErrorInfo[] d;
    public final AppIndexingUserActionInfo[] e;
    public final boolean f;
    public final boolean g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.a = status;
        this.b = corpusConfigParcelableArr;
        this.c = j;
        this.d = appIndexingErrorInfoArr;
        this.e = appIndexingUserActionInfoArr;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, status, i, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.q(parcel, 3, this.c);
        atzr.J(parcel, 4, this.d, i);
        atzr.J(parcel, 5, this.e, i);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
