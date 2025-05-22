package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdco;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class StartLocationReportingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdco();
    public final int a;
    public final int b;
    public final LocationShare c;
    public final long d;
    public final NoticeAckedUpdateRequest e;

    public StartLocationReportingRequest(int i, int i2, LocationShare locationShare, long j, NoticeAckedUpdateRequest noticeAckedUpdateRequest) {
        this.a = i;
        this.b = i2;
        this.d = j;
        this.c = locationShare;
        this.e = noticeAckedUpdateRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
