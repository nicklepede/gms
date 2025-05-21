package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.audd;
import defpackage.auxo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CredentialManagerAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auxo();
    public final String a;

    public CredentialManagerAccount(String str) {
        this.a = str;
    }

    public static CredentialManagerAccount a(String str) {
        arwm.r(str, "accountName must not be empty nor null");
        return new CredentialManagerAccount(str);
    }

    public final boolean b() {
        return audd.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CredentialManagerAccount) {
            return ((CredentialManagerAccount) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a);
    }
}
