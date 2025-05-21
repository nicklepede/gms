package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetKeychainLockScreenKnowledgeFactorSupportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvn();
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
            if (arwb.b(this.a, getKeychainLockScreenKnowledgeFactorSupportRequest.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportRequest.b))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public GetKeychainLockScreenKnowledgeFactorSupportRequest(Account account, boolean z) {
        this.a = account;
        this.b = z;
    }
}
