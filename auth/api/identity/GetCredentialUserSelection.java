package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zcs;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetCredentialUserSelection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcs();
    public final int a;
    public final InternalSignInCredentialWrapper b;
    public final FidoCredentialDetails c;
    public final byte[] d;

    public GetCredentialUserSelection(int i, InternalSignInCredentialWrapper internalSignInCredentialWrapper, FidoCredentialDetails fidoCredentialDetails, byte[] bArr) {
        if (i != 1) {
            if (i == 2) {
                arwm.s(fidoCredentialDetails);
                arwm.b(internalSignInCredentialWrapper == null);
                this.a = i;
                this.b = internalSignInCredentialWrapper;
                this.c = fidoCredentialDetails;
                this.d = bArr;
            }
            if (i != 3) {
                throw new IllegalArgumentException(a.j(i, "Invalid credential type: "));
            }
        }
        arwm.b(fidoCredentialDetails == null);
        this.a = i;
        this.b = internalSignInCredentialWrapper;
        this.c = fidoCredentialDetails;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCredentialUserSelection)) {
            return false;
        }
        GetCredentialUserSelection getCredentialUserSelection = (GetCredentialUserSelection) obj;
        return this.a == getCredentialUserSelection.a && Objects.equals(this.b, getCredentialUserSelection.b) && Objects.equals(this.c, getCredentialUserSelection.c) && Arrays.equals(this.d, getCredentialUserSelection.d);
    }

    public final int hashCode() {
        return (Objects.hash(Integer.valueOf(this.a), this.b, this.c) * 31) + Arrays.hashCode(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
