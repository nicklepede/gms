package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayvp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CloseConnectionParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayvp();
    public TokenWrapper a;
    public arbp b;
    public String c;
    public String d;
    public ChannelInfo e;

    private CloseConnectionParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CloseConnectionParams) {
            CloseConnectionParams closeConnectionParams = (CloseConnectionParams) obj;
            if (arwb.b(this.a, closeConnectionParams.a) && arwb.b(this.b, closeConnectionParams.b) && arwb.b(this.c, closeConnectionParams.c) && arwb.b(this.d, closeConnectionParams.d) && arwb.b(this.e, closeConnectionParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }

    public CloseConnectionParams(TokenWrapper tokenWrapper, IBinder iBinder, String str, String str2, ChannelInfo channelInfo) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = tokenWrapper;
        this.b = arbnVar;
        this.c = str;
        this.d = str2;
        this.e = channelInfo;
    }
}
