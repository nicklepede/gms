package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.thunderbird.state.DeviceState;
import defpackage.atzr;
import defpackage.bbpr;
import defpackage.bbpv;
import defpackage.dijo;
import defpackage.dijr;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.ekvm;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elja;
import defpackage.fgrc;
import defpackage.fvik;
import defpackage.rdk;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EmergencyInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dijr();
    public final ActivationInfo a;
    public final List b;
    public final AeiState c;

    public EmergencyInfo(ActivationInfo activationInfo, Iterable iterable, AeiState aeiState) {
        this.a = activationInfo;
        this.b = elgo.h(iterable);
        this.c = aeiState;
    }

    public final long a() {
        return this.a.f;
    }

    public final long b() {
        return this.a.e;
    }

    public final long c() {
        return this.a.h;
    }

    public final long d() {
        return this.a.i;
    }

    public final DeviceState e() {
        return (DeviceState) elja.o(this.b, null);
    }

    public final DeviceState f() {
        List list = this.b;
        ekvl.s(list.size() == 1, "getDeviceState: deviceStates.size() must be 1, but is %s", list.size());
        return (DeviceState) list.get(0);
    }

    public final EmergencyInfo g(ekvm ekvmVar) {
        return new EmergencyInfo(this.a, elja.d(this.b, ekvmVar), this.c);
    }

    public final EmergencyInfo h(rdk rdkVar) {
        ActivationInfo activationInfo = this.a;
        return new EmergencyInfo(new ActivationInfo(activationInfo.a, activationInfo.b, activationInfo.c, activationInfo.d, activationInfo.e, activationInfo.f, activationInfo.g, activationInfo.h, activationInfo.i, activationInfo.j, rdkVar.a(), activationInfo.l), this.b, this.c);
    }

    public final EmergencyInfo i(String str) {
        List list = this.b;
        if (list.size() == 1) {
            DeviceState deviceState = (DeviceState) list.get(0);
            if (deviceState.f == null) {
                int i = deviceState.a;
                int i2 = deviceState.b;
                String str2 = deviceState.c;
                String str3 = deviceState.d;
                String str4 = deviceState.e;
                boolean z = deviceState.g;
                DeviceState a = dijo.a(i, i2, str2, str3, str4, str, false, deviceState.h, deviceState.i, deviceState.j, deviceState.k, deviceState.l, deviceState.m, deviceState.n, deviceState.o, deviceState.p, ekvi.i(deviceState.q));
                if (!fvik.G()) {
                    a = a.a(TelephoneNumber.b(str));
                }
                return new EmergencyInfo(this.a, elgo.l(a), this.c);
            }
        }
        return this;
    }

    public final EmergencyInfo j(long j, long j2) {
        ActivationInfo activationInfo = this.a;
        return new EmergencyInfo(activationInfo.a(j, activationInfo.h, j2), this.b, this.c);
    }

    public final EmergencyInfo k(bbpr bbprVar) {
        bbpr a = this.c.a();
        fgrc fgrcVar = (fgrc) a.iQ(5, null);
        fgrcVar.X(a);
        bbpv bbpvVar = bbprVar.d;
        if (bbpvVar == null) {
            bbpvVar = bbpv.a;
        }
        if (bbpvVar.b.size() > 0) {
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            bbpr bbprVar2 = (bbpr) fgrcVar.b;
            bbprVar2.d = null;
            bbprVar2.b &= -3;
        }
        List list = this.b;
        ActivationInfo activationInfo = this.a;
        fgrcVar.X(bbprVar);
        return new EmergencyInfo(activationInfo, list, new AeiState(((bbpr) fgrcVar.Q()).r()));
    }

    public final EmergencyInfo l(int i, String str) {
        if (i == -1) {
            return this;
        }
        TelephoneNumber b = TelephoneNumber.b(str);
        List<DeviceState> list = this.b;
        elgj e = elgo.e(list.size());
        for (DeviceState deviceState : list) {
            if (deviceState.b == i) {
                e.i(deviceState.a(b));
            } else {
                e.i(deviceState);
            }
        }
        return new EmergencyInfo(this.a, e.g(), this.c);
    }

    public final String m() {
        return this.a.a;
    }

    public final String n() {
        return this.a.c;
    }

    public final boolean o() {
        return this.a.d;
    }

    public final boolean p() {
        return c() == 1 || d() == 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(n());
        if (o()) {
            sb.append(":MOCK");
        }
        sb.append(":");
        sb.append(m());
        sb.append(":");
        sb.append(elja.j(this.b, new ekut() { // from class: dijq
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ((DeviceState) obj).h();
            }
        }));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActivationInfo activationInfo = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 9, activationInfo, i, false);
        atzr.y(parcel, 10, this.b, false);
        atzr.t(parcel, 11, this.c, i, false);
        atzr.c(parcel, a);
    }
}
