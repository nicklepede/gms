package com.google.android.gms.thunderbird.state;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfyf;
import defpackage.dfyg;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.pkg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ActivationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfyg();
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
        eiig.x(str);
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

    public final eiid b() {
        dfyf dfyfVar;
        eiid c = c();
        if (!c.h()) {
            return eigb.a;
        }
        switch (((pkg) c.c()).ordinal()) {
            case 1:
                dfyfVar = dfyf.EMERGENCY_DIALPAD;
                break;
            case 2:
                dfyfVar = dfyf.EMERGENCY_DIALPAD_SHORTCUT;
                break;
            case 3:
            case 4:
                dfyfVar = dfyf.SAFETY_CHECK;
                break;
            case 5:
                dfyfVar = dfyf.CAR_CRASH_DETECTION;
                break;
            case 6:
            default:
                dfyfVar = dfyf.UNKNOWN;
                break;
            case 7:
                dfyfVar = dfyf.EMERGENCY_SOS;
                break;
            case 8:
                dfyfVar = dfyf.SAFETY_HOME_BUTTON;
                break;
        }
        return eiid.j(dfyfVar);
    }

    public final eiid c() {
        int i = this.k;
        return i == -1 ? eigb.a : eiid.i(pkg.b(i));
    }

    public final eiid d() {
        return eiid.i(this.j);
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.e(parcel, 3, this.d);
        arxc.q(parcel, 4, this.e);
        arxc.q(parcel, 5, this.f);
        arxc.t(parcel, 6, this.g, i, false);
        arxc.o(parcel, 7, this.b);
        arxc.q(parcel, 8, this.h);
        arxc.q(parcel, 9, this.i);
        arxc.v(parcel, 10, this.j, false);
        arxc.o(parcel, 11, this.k);
        arxc.o(parcel, 12, this.l);
        arxc.c(parcel, a);
    }
}
