package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cali;
import defpackage.calj;
import defpackage.calo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new calj();
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
        return this.a.equals(uploadRequest.a) && this.b.equals(uploadRequest.b) && arwb.b(Long.valueOf(this.c), Long.valueOf(uploadRequest.c)) && this.d == uploadRequest.d && this.e == uploadRequest.e && arwb.b(this.f, uploadRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f});
    }

    public final String toString() {
        return "UploadRequest{, mAccount=" + calo.a(this.a) + ", mReason='" + this.b + "', mDurationMillis=" + this.c + ", mMovingLatencyMillis=" + this.d + ", mStationaryLatencyMillis=" + this.e + ", mAppSpecificKey='" + this.f + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, account, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.q(parcel, 4, this.c);
        arxc.q(parcel, 5, this.d);
        arxc.q(parcel, 6, this.e);
        arxc.v(parcel, 7, this.f, false);
        arxc.c(parcel, a);
    }

    public UploadRequest(cali caliVar) {
        this.a = caliVar.a;
        this.b = caliVar.b;
        this.c = caliVar.c;
        this.d = caliVar.d;
        this.e = caliVar.e;
        this.f = caliVar.f;
    }
}
