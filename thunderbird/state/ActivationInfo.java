package com.google.android.gms.thunderbird.state;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dijk;
import defpackage.dijl;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.rdk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ActivationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dijl();
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final Location g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;
    public final int l;

    public ActivationInfo(String str, int i, String str2, boolean z, long j, long j2, Location location, long j3, long j4, String str3, int i2, int i3) {
        ekvl.y(str);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = location != null ? new Location(location) : null;
        this.h = j3;
        this.i = j4;
        this.j = str3;
        this.k = i2;
        this.l = i3;
    }

    public final ActivationInfo a(long j, long j2, long j3) {
        String str = this.j;
        int i = this.k;
        int i2 = this.l;
        return new ActivationInfo(this.a, this.b, this.c, this.d, j, this.f, this.g, j2, j3, str, i, i2);
    }

    public final ekvi b() {
        dijk dijkVar;
        ekvi c = c();
        if (!c.h()) {
            return ektg.a;
        }
        switch (((rdk) c.c()).ordinal()) {
            case 1:
                dijkVar = dijk.EMERGENCY_DIALPAD;
                break;
            case 2:
                dijkVar = dijk.EMERGENCY_DIALPAD_SHORTCUT;
                break;
            case 3:
            case 4:
                dijkVar = dijk.SAFETY_CHECK;
                break;
            case 5:
                dijkVar = dijk.CAR_CRASH_DETECTION;
                break;
            case 6:
            default:
                dijkVar = dijk.UNKNOWN;
                break;
            case 7:
                dijkVar = dijk.EMERGENCY_SOS;
                break;
            case 8:
                dijkVar = dijk.SAFETY_HOME_BUTTON;
                break;
        }
        return ekvi.j(dijkVar);
    }

    public final ekvi c() {
        int i = this.k;
        return i == -1 ? ektg.a : ekvi.i(rdk.b(i));
    }

    public final ekvi d() {
        return ekvi.i(this.j);
    }

    public final int e() {
        return new int[]{1, 2, 3}[this.b];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        if (this.d) {
            sb.append(":MOCK");
        }
        sb.append(":");
        sb.append(this.a);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.e(parcel, 3, this.d);
        atzr.q(parcel, 4, this.e);
        atzr.q(parcel, 5, this.f);
        atzr.t(parcel, 6, this.g, i, false);
        atzr.o(parcel, 7, this.b);
        atzr.q(parcel, 8, this.h);
        atzr.q(parcel, 9, this.i);
        atzr.v(parcel, 10, this.j, false);
        atzr.o(parcel, 11, this.k);
        atzr.o(parcel, 12, this.l);
        atzr.c(parcel, a);
    }
}
