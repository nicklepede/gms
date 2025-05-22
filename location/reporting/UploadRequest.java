package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccty;
import defpackage.cctz;
import defpackage.ccue;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cctz();
    public final Account a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public UploadRequest(Account account, String str, long j, long j2, long j3, String str2) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadRequest)) {
            return false;
        }
        UploadRequest uploadRequest = (UploadRequest) obj;
        return this.a.equals(uploadRequest.a) && this.b.equals(uploadRequest.b) && atyq.b(Long.valueOf(this.c), Long.valueOf(uploadRequest.c)) && this.d == uploadRequest.d && this.e == uploadRequest.e && atyq.b(this.f, uploadRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f});
    }

    public final String toString() {
        return "UploadRequest{, mAccount=" + ccue.a(this.a) + ", mReason='" + this.b + "', mDurationMillis=" + this.c + ", mMovingLatencyMillis=" + this.d + ", mStationaryLatencyMillis=" + this.e + ", mAppSpecificKey='" + this.f + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, account, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.q(parcel, 4, this.c);
        atzr.q(parcel, 5, this.d);
        atzr.q(parcel, 6, this.e);
        atzr.v(parcel, 7, this.f, false);
        atzr.c(parcel, a);
    }

    public UploadRequest(ccty cctyVar) {
        this.a = cctyVar.a;
        this.b = cctyVar.b;
        this.c = cctyVar.c;
        this.d = cctyVar.d;
        this.e = cctyVar.e;
        this.f = cctyVar.f;
    }
}
