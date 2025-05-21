package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.thunderbird.state.DeviceState;
import defpackage.arxc;
import defpackage.azlv;
import defpackage.azlz;
import defpackage.dfyj;
import defpackage.dfym;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eiih;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eivv;
import defpackage.fecj;
import defpackage.fsnb;
import defpackage.pkg;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmergencyInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfym();
    public final ActivationInfo a;
    public final List b;
    public final AeiState c;

    public EmergencyInfo(ActivationInfo activationInfo, Iterable iterable, AeiState aeiState) {
        this.a = activationInfo;
        this.b = eitj.h(iterable);
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
        return (DeviceState) eivv.o(this.b, null);
    }

    public final DeviceState f() {
        List list = this.b;
        eiig.r(list.size() == 1, "getDeviceState: deviceStates.size() must be 1, but is %s", list.size());
        return (DeviceState) list.get(0);
    }

    public final EmergencyInfo g(eiih eiihVar) {
        return new EmergencyInfo(this.a, eivv.d(this.b, eiihVar), this.c);
    }

    public final EmergencyInfo h(pkg pkgVar) {
        ActivationInfo activationInfo = this.a;
        return new EmergencyInfo(new ActivationInfo(activationInfo.a, activationInfo.b, activationInfo.c, activationInfo.d, activationInfo.e, activationInfo.f, activationInfo.g, activationInfo.h, activationInfo.i, activationInfo.j, pkgVar.a(), activationInfo.l), this.b, this.c);
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
                DeviceState a = dfyj.a(i, i2, str2, str3, str4, str, false, deviceState.h, deviceState.i, deviceState.j, deviceState.k, deviceState.l, deviceState.m, deviceState.n, deviceState.o, deviceState.p, eiid.i(deviceState.q));
                if (!fsnb.G()) {
                    a = a.a(TelephoneNumber.b(str));
                }
                return new EmergencyInfo(this.a, eitj.l(a), this.c);
            }
        }
        return this;
    }

    public final EmergencyInfo j(long j, long j2) {
        ActivationInfo activationInfo = this.a;
        return new EmergencyInfo(activationInfo.a(j, activationInfo.h, j2), this.b, this.c);
    }

    public final EmergencyInfo k(azlv azlvVar) {
        azlv a = this.c.a();
        fecj fecjVar = (fecj) a.iB(5, null);
        fecjVar.X(a);
        azlz azlzVar = azlvVar.d;
        if (azlzVar == null) {
            azlzVar = azlz.a;
        }
        if (azlzVar.b.size() > 0) {
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            azlv azlvVar2 = (azlv) fecjVar.b;
            azlvVar2.d = null;
            azlvVar2.b &= -3;
        }
        List list = this.b;
        ActivationInfo activationInfo = this.a;
        fecjVar.X(azlvVar);
        return new EmergencyInfo(activationInfo, list, new AeiState(((azlv) fecjVar.Q()).r()));
    }

    public final EmergencyInfo l(int i, String str) {
        if (i == -1) {
            return this;
        }
        TelephoneNumber b = TelephoneNumber.b(str);
        List<DeviceState> list = this.b;
        eite e = eitj.e(list.size());
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
        sb.append(eivv.j(this.b, new eiho() { // from class: dfyl
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return ((DeviceState) obj).h();
            }
        }));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActivationInfo activationInfo = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 9, activationInfo, i, false);
        arxc.y(parcel, 10, this.b, false);
        arxc.t(parcel, 11, this.c, i, false);
        arxc.c(parcel, a);
    }
}
