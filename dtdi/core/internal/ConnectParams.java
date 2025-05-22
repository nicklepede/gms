package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazl;
import defpackage.bazy;
import defpackage.bazz;
import defpackage.bbap;
import defpackage.bbas;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazl();
    public TokenWrapper a;
    public bazz b;
    public WakeUpRequest c;
    public atee d;
    public bbap e;
    public bbas f;

    private ConnectParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectParams) {
            ConnectParams connectParams = (ConnectParams) obj;
            if (atyq.b(this.a, connectParams.a) && atyq.b(this.e, connectParams.e) && atyq.b(this.b, connectParams.b) && atyq.b(this.c, connectParams.c) && atyq.b(this.f, connectParams.f) && atyq.b(this.d, connectParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.e, this.b, this.c, this.f, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        bbap bbapVar = this.e;
        atzr.D(parcel, 2, bbapVar == null ? null : bbapVar.a);
        bazz bazzVar = this.b;
        atzr.D(parcel, 3, bazzVar == null ? null : bazzVar.asBinder());
        atzr.t(parcel, 4, this.c, i, false);
        bbas bbasVar = this.f;
        atzr.D(parcel, 5, bbasVar == null ? null : bbasVar.a);
        atee ateeVar = this.d;
        atzr.D(parcel, 6, ateeVar != null ? ateeVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public ConnectParams(TokenWrapper tokenWrapper, IBinder iBinder, IBinder iBinder2, WakeUpRequest wakeUpRequest, IBinder iBinder3, IBinder iBinder4) {
        bbap bbapVar;
        bazz bazyVar;
        bbas bbasVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbapVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnPayloadReceivedCallback");
            bbapVar = queryLocalInterface instanceof bbap ? (bbap) queryLocalInterface : new bbap(iBinder);
        }
        if (iBinder2 == null) {
            bazyVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IChannelInfoStatusCallback");
            bazyVar = queryLocalInterface2 instanceof bazz ? (bazz) queryLocalInterface2 : new bazy(iBinder2);
        }
        if (iBinder3 == null) {
            bbasVar = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnWakeupCompletedListener");
            bbasVar = queryLocalInterface3 instanceof bbas ? (bbas) queryLocalInterface3 : new bbas(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface4 instanceof atee ? (atee) queryLocalInterface4 : new atec(iBinder4);
        }
        this.a = tokenWrapper;
        this.e = bbapVar;
        this.b = bazyVar;
        this.c = wakeUpRequest;
        this.f = bbasVar;
        this.d = ateeVar;
    }
}
