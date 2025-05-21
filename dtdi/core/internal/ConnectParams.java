package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayvr;
import defpackage.aywe;
import defpackage.aywf;
import defpackage.aywv;
import defpackage.aywy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayvr();
    public TokenWrapper a;
    public aywf b;
    public WakeUpRequest c;
    public arbp d;
    public aywv e;
    public aywy f;

    private ConnectParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectParams) {
            ConnectParams connectParams = (ConnectParams) obj;
            if (arwb.b(this.a, connectParams.a) && arwb.b(this.e, connectParams.e) && arwb.b(this.b, connectParams.b) && arwb.b(this.c, connectParams.c) && arwb.b(this.f, connectParams.f) && arwb.b(this.d, connectParams.d)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        aywv aywvVar = this.e;
        arxc.D(parcel, 2, aywvVar == null ? null : aywvVar.a);
        aywf aywfVar = this.b;
        arxc.D(parcel, 3, aywfVar == null ? null : aywfVar.asBinder());
        arxc.t(parcel, 4, this.c, i, false);
        aywy aywyVar = this.f;
        arxc.D(parcel, 5, aywyVar == null ? null : aywyVar.a);
        arbp arbpVar = this.d;
        arxc.D(parcel, 6, arbpVar != null ? arbpVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public ConnectParams(TokenWrapper tokenWrapper, IBinder iBinder, IBinder iBinder2, WakeUpRequest wakeUpRequest, IBinder iBinder3, IBinder iBinder4) {
        aywv aywvVar;
        aywf ayweVar;
        aywy aywyVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnPayloadReceivedCallback");
            aywvVar = queryLocalInterface instanceof aywv ? (aywv) queryLocalInterface : new aywv(iBinder);
        }
        if (iBinder2 == null) {
            ayweVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IChannelInfoStatusCallback");
            ayweVar = queryLocalInterface2 instanceof aywf ? (aywf) queryLocalInterface2 : new aywe(iBinder2);
        }
        if (iBinder3 == null) {
            aywyVar = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnWakeupCompletedListener");
            aywyVar = queryLocalInterface3 instanceof aywy ? (aywy) queryLocalInterface3 : new aywy(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface4 instanceof arbp ? (arbp) queryLocalInterface4 : new arbn(iBinder4);
        }
        this.a = tokenWrapper;
        this.e = aywvVar;
        this.b = ayweVar;
        this.c = wakeUpRequest;
        this.f = aywyVar;
        this.d = arbpVar;
    }
}
