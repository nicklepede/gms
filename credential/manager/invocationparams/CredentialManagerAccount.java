package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.awhi;
import defpackage.axbn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CredentialManagerAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axbn();
    public final String a;

    public CredentialManagerAccount(String str) {
        this.a = str;
    }

    public static CredentialManagerAccount a(String str) {
        atzb.r(str, "accountName must not be empty nor null");
        return new CredentialManagerAccount(str);
    }

    public final boolean b() {
        return awhi.a(this.a);
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
