package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CloseConnectionParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazj();
    public TokenWrapper a;
    public atee b;
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
            if (atyq.b(this.a, closeConnectionParams.a) && atyq.b(this.b, closeConnectionParams.b) && atyq.b(this.c, closeConnectionParams.c) && atyq.b(this.d, closeConnectionParams.d) && atyq.b(this.e, closeConnectionParams.e)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public CloseConnectionParams(TokenWrapper tokenWrapper, IBinder iBinder, String str, String str2, ChannelInfo channelInfo) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = tokenWrapper;
        this.b = atecVar;
        this.c = str;
        this.d = str2;
        this.e = channelInfo;
    }
}
