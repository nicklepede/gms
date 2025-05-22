package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bkrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bkrc();
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;
    public byte[] f;

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j, byte[] bArr) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
        this.d = z2;
        this.e = j;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.e(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.i(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L, null);
    }

    public GmsDeviceComplianceResponse(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        this(gmsDeviceComplianceResponse.a, gmsDeviceComplianceResponse.b, gmsDeviceComplianceResponse.c, gmsDeviceComplianceResponse.d, gmsDeviceComplianceResponse.e, gmsDeviceComplianceResponse.f);
    }
}
