package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.IntermediateAccountInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywb;
import defpackage.aywo;
import defpackage.aywp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetMatchingAccountInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aywb();
    public TokenWrapper a;
    public IntermediateAccountInfo b;
    public aywp c;

    private GetMatchingAccountInfoParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMatchingAccountInfoParams) {
            GetMatchingAccountInfoParams getMatchingAccountInfoParams = (GetMatchingAccountInfoParams) obj;
            if (arwb.b(this.a, getMatchingAccountInfoParams.a) && arwb.b(this.b, getMatchingAccountInfoParams.b) && arwb.b(this.c, getMatchingAccountInfoParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public GetMatchingAccountInfoParams(TokenWrapper tokenWrapper, IntermediateAccountInfo intermediateAccountInfo, IBinder iBinder) {
        aywp aywoVar;
        if (iBinder == null) {
            aywoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IGetMatchingAccountInfoStatusCallback");
            aywoVar = queryLocalInterface instanceof aywp ? (aywp) queryLocalInterface : new aywo(iBinder);
        }
        this.a = tokenWrapper;
        this.b = intermediateAccountInfo;
        this.c = aywoVar;
    }
}
