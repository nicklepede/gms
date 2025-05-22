package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class OwnersLocationReportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexo();
    public Account a;
    public ScanResult b;

    private OwnersLocationReportRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OwnersLocationReportRequest) {
            OwnersLocationReportRequest ownersLocationReportRequest = (OwnersLocationReportRequest) obj;
            if (atyq.b(this.a, ownersLocationReportRequest.a) && atyq.b(this.b, ownersLocationReportRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public OwnersLocationReportRequest(Account account, ScanResult scanResult) {
        this.a = account;
        this.b = scanResult;
    }
}
