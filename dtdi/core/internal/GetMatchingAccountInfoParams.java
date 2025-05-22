package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.IntermediateAccountInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazv;
import defpackage.bbai;
import defpackage.bbaj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetMatchingAccountInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazv();
    public TokenWrapper a;
    public IntermediateAccountInfo b;
    public bbaj c;

    private GetMatchingAccountInfoParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMatchingAccountInfoParams) {
            GetMatchingAccountInfoParams getMatchingAccountInfoParams = (GetMatchingAccountInfoParams) obj;
            if (atyq.b(this.a, getMatchingAccountInfoParams.a) && atyq.b(this.b, getMatchingAccountInfoParams.b) && atyq.b(this.c, getMatchingAccountInfoParams.c)) {
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
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public GetMatchingAccountInfoParams(TokenWrapper tokenWrapper, IntermediateAccountInfo intermediateAccountInfo, IBinder iBinder) {
        bbaj bbaiVar;
        if (iBinder == null) {
            bbaiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IGetMatchingAccountInfoStatusCallback");
            bbaiVar = queryLocalInterface instanceof bbaj ? (bbaj) queryLocalInterface : new bbai(iBinder);
        }
        this.a = tokenWrapper;
        this.b = intermediateAccountInfo;
        this.c = bbaiVar;
    }
}
