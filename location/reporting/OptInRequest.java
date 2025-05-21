package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cakx;
import defpackage.caky;
import defpackage.calo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caky();
    public final Account a;
    public final String b;
    public final String c;
    private final boolean d;

    public OptInRequest(Account account, String str, String str2, boolean z) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final Boolean a() {
        return Boolean.valueOf(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptInRequest)) {
            return false;
        }
        OptInRequest optInRequest = (OptInRequest) obj;
        return this.a.equals(optInRequest.a) && arwb.b(this.b, optInRequest.b) && arwb.b(this.c, optInRequest.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(optInRequest.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UploadRequest{, account=" + calo.a(this.a) + ", tag='" + this.b + ", auditToken=" + this.c + ", enableAdsSubconsent=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, account, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.e(parcel, 5, a().booleanValue());
        arxc.c(parcel, a);
    }

    public OptInRequest(cakx cakxVar) {
        this.a = cakxVar.a;
        this.b = cakxVar.b;
        this.c = cakxVar.c;
        this.d = false;
    }
}
