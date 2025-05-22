package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.axbo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CredentialManagerInvocationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axbo();
    public final CredentialManagerAccount a;
    public final CallerInfo b;

    public CredentialManagerInvocationParams(CredentialManagerAccount credentialManagerAccount, CallerInfo callerInfo) {
        atzb.s(credentialManagerAccount);
        this.a = credentialManagerAccount;
        this.b = callerInfo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CredentialManagerInvocationParams)) {
            return false;
        }
        CredentialManagerInvocationParams credentialManagerInvocationParams = (CredentialManagerInvocationParams) obj;
        CallerInfo callerInfo = credentialManagerInvocationParams.b;
        return ((callerInfo == null && this.b == null) || (callerInfo != null && callerInfo.equals(this.b))) && credentialManagerInvocationParams.a.equals(this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CredentialManagerAccount credentialManagerAccount = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, credentialManagerAccount, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
