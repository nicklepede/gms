package com.google.android.gms.semanticlocation.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dcal;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcal();
    public final Account a;
    public final String b;
    public final String c;

    public SemanticLocationParameters(Account account, String str, String str2) {
        this.a = account;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticLocationParameters)) {
            return false;
        }
        SemanticLocationParameters semanticLocationParameters = (SemanticLocationParameters) obj;
        return atyq.b(this.a, semanticLocationParameters.a) && atyq.b(this.b, semanticLocationParameters.b) && atyq.b(this.c, semanticLocationParameters.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
