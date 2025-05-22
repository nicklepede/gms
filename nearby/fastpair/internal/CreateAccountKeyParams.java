package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckna;
import defpackage.cknq;
import defpackage.ckns;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CreateAccountKeyParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckna();
    public String a;
    public String b;
    public ckns c;

    private CreateAccountKeyParams() {
    }

    public final IBinder a() {
        return this.c.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateAccountKeyParams) {
            CreateAccountKeyParams createAccountKeyParams = (CreateAccountKeyParams) obj;
            if (atyq.b(this.a, createAccountKeyParams.a) && atyq.b(this.b, createAccountKeyParams.b) && atyq.b(this.c, createAccountKeyParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.D(parcel, 3, a());
        atzr.c(parcel, a);
    }

    public CreateAccountKeyParams(String str, String str2, IBinder iBinder) {
        ckns cknqVar;
        if (iBinder == null) {
            cknqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairCreateAccountKeyCallback");
            cknqVar = queryLocalInterface instanceof ckns ? (ckns) queryLocalInterface : new cknq(iBinder);
        }
        this.a = str;
        this.b = str2;
        this.c = cknqVar;
    }
}
