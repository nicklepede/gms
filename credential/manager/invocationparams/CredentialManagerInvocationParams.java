package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.auxp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CredentialManagerInvocationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auxp();
    public final CredentialManagerAccount a;
    public final CallerInfo b;

    public CredentialManagerInvocationParams(CredentialManagerAccount credentialManagerAccount, CallerInfo callerInfo) {
        arwm.s(credentialManagerAccount);
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, credentialManagerAccount, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
