package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazz;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetGooglePasskeyForExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazz();
    public final Account a;
    public final String b;

    public GetGooglePasskeyForExportRequest(Account account, String str) {
        this.a = account;
        atzb.r(str, "sessionId cannot be empty or null.");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetGooglePasskeyForExportRequest) {
            GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest = (GetGooglePasskeyForExportRequest) obj;
            if (atyq.b(this.a, getGooglePasskeyForExportRequest.a) && atyq.b(this.b, getGooglePasskeyForExportRequest.b)) {
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
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, account, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
