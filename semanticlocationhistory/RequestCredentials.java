package com.google.android.gms.semanticlocationhistory;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dacu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RequestCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dacu();
    public final Account a;
    public final String b;
    public final String c;

    public RequestCredentials(Account account, String str, String str2) {
        this.a = account;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestCredentials)) {
            return false;
        }
        RequestCredentials requestCredentials = (RequestCredentials) obj;
        return arwb.b(this.a, requestCredentials.a) && arwb.b(this.b, requestCredentials.b) && arwb.b(this.c, requestCredentials.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
