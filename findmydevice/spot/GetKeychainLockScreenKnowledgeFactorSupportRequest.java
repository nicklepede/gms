package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bewz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetKeychainLockScreenKnowledgeFactorSupportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewz();
    public Account a;
    public boolean b;

    public GetKeychainLockScreenKnowledgeFactorSupportRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetKeychainLockScreenKnowledgeFactorSupportRequest) {
            GetKeychainLockScreenKnowledgeFactorSupportRequest getKeychainLockScreenKnowledgeFactorSupportRequest = (GetKeychainLockScreenKnowledgeFactorSupportRequest) obj;
            if (atyq.b(this.a, getKeychainLockScreenKnowledgeFactorSupportRequest.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public GetKeychainLockScreenKnowledgeFactorSupportRequest(Account account, boolean z) {
        this.a = account;
        this.b = z;
    }
}
