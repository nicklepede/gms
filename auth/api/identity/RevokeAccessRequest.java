package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.eitj;
import defpackage.zdg;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zdg();
    public final eitj a;
    public final Account b;
    public final String c;

    public RevokeAccessRequest(List list, Account account, String str) {
        this.a = eitj.i(list);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            eitj eitjVar = this.a;
            int size = eitjVar.size();
            eitj eitjVar2 = revokeAccessRequest.a;
            if (size == eitjVar2.size() && eitjVar.containsAll(eitjVar2) && arwb.b(this.b, revokeAccessRequest.b) && arwb.b(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eitj eitjVar = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, eitjVar, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
