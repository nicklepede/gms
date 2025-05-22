package com.google.android.gms.auth.api.credentials.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.zsf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class InternalCredentialWrapper extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zsf();
    public final Credential a;
    public final Account b;

    public InternalCredentialWrapper(Credential credential, Account account) {
        atzb.s(credential);
        this.a = credential;
        this.b = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalCredentialWrapper)) {
            return false;
        }
        InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) obj;
        return atyq.b(this.a, internalCredentialWrapper.a) && atyq.b(this.b, internalCredentialWrapper.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Credential credential = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, credential, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
